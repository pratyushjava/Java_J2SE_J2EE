/**
   This program shows how to display the result of a 
   database query in a table.
 */
package jdbc_jtable;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

/**
 * This frame contains a combo box to select a database table and a table to
 * show the data stored in the table
 */
class ResultSetFrame extends JFrame implements ActionListener {
	private ResultSet rs;

	private JScrollPane jsp;
	private ResultSetTableModel model;
	private JComboBox<String> tableNames;
	private Connection conn;
	private Statement stat;
	private JTable table;

	public static void main(String[] args) {
		try {
			new ResultSetFrame("JDBC+JTable");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ResultSetFrame(String title) throws Exception {
		setTitle(title);
		setSize(500, 300);
		setLocationRelativeTo(null);

		/*
		 * find all tables in the database and add them to a combo box
		 */
		tableNames = new JComboBox<String>();
		tableNames.addActionListener(this);
		JPanel p = new JPanel();
		p.add(tableNames);
		add(p, BorderLayout.NORTH);
		table = new JTable();
		table.setFont(new Font("verdana", Font.BOLD, 14));
		jsp = new JScrollPane(table);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				try {
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.exit(0);
			}
		});

		// Have to contact DB, get cn, populate all table names into JComboBox
		// ---so calling the same
		// before setVisible(true)
		initDB();

		add(jsp, BorderLayout.CENTER);

		setVisible(true);

	}

	private void initDB() throws Exception {

		conn = getConnection();
		DatabaseMetaData meta = conn.getMetaData();
		if (meta.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {

			stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
		} else {
			System.out
					.println("Can't continue ---- Scrollable RSTs not supported by database");
		}
		// ResultSet tables = meta.getTables("SCOTT","SCOTT", null, new
		// String[] { "TABLE" });
		/*
		 * java.sql.DatabaseMetaData API ResultSet getTables(String catalog,
		 * String schemaPattern, String tableNamePattern, String[] types) throws
		 * SQLException
		 * 
		 * Returns a description of the tables available in the given catalog.
		 * Only table descriptions matching the catalog, schema, table name and
		 * type criteria are returned. 3rd column returns table name
		 */
		ResultSet tables = meta.getTables(null, null, null,
				new String[] { "TABLE" });
		while (tables.next())
			tableNames.addItem(tables.getString(3));
		tables.close();
	}

	/**
	 * Gets a connection from the properties specified in the file
	 * database.properties.
	 * 
	 * @return the database connection
	 */

	private Connection getConnection() throws Exception {
		/*
		 * java.util.Properties<K,V> --- class represents set of properties. The
		 * Properties can be saved to a stream or loaded from a stream. Each key
		 * & value pair is string.
		 */

		Properties props = new Properties();
		// FileInputStream in = new FileInputStream("database.properties");
		FileInputStream in = new FileInputStream("database_mysql.properties");
		props.load(in);
		in.close();

		String drivers = props.getProperty("jdbc.drivers");
		Class.forName(drivers);
		String url = props.getProperty("jdbc.url");
		String username = props.getProperty("jdbc.username");
		String password = props.getProperty("jdbc.password");

		return DriverManager.getConnection(url, username, password);
	}

	public void actionPerformed(ActionEvent event) {
		try {
			String tableName = (String) tableNames.getSelectedItem();
			if (rs != null)
				rs.close();
			String query = "SELECT * FROM " + tableName;
			rs = stat.executeQuery(query);

			model = new ResultSetTableModel(rs);
			table.setModel(model);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
