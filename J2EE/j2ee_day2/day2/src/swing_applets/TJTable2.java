package swing_applets;

// Demonstrates how to create a simple table with the
// specified row data and column data.


import javax.swing.*;

public class TJTable2 extends JApplet {
    // Create an array of names to be displayed in the table
    // header.
    String[] columnNames = {"Name", "Size (Bytes)", "Date", "Directory"};

    // Create an array of row data (each row is an array) to be
    // displayed in the rows of the table.
    Object[][] rowData = {
        {"startup.BAT", "149", "09-11-09",false},
        {"REAL", "DIR", "12-11-08",true},
        {"WINDOWS", "DIR", "03-24-02",true},
        {"emps.ser", "92879", "07-11-05",false}};

    @Override
    public void init() {
        // 1. Create a table by using the row and column data.
        JTable table = new JTable(rowData, columnNames);

        // 2. Add the table column header and the
        // table to the content pane of the applet.
        JScrollPane js=new JScrollPane(table);
        add(js);
    }
}

