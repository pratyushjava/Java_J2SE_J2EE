/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package blob_handling;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 *
 * @author Administrator
 *
 */
//create table my_images(id number(2),name varchar2(30),snap blob);
public class WriteImageBLOB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
         Connection cn=null;
          FileInputStream fin=null;
        try {
             //load & register Type IV JDBC drvr.
         
            Class.forName("oracle.jdbc.OracleDriver");
            //obtain DB conn.
            cn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.72.3:1521:orcl","scott","tiger");
            System.out.println("Conn succ. via Type IV");
            //create Statement object to hold/contain query.
            String sql="insert into my_images values(?,?,?)";
           fin=new FileInputStream("d:/images/redflowers2.png");
            PreparedStatement pst=cn.prepareStatement(sql);
            pst.setInt(1,1);
            pst.setString(2,"red_flowers");
            pst.setBinaryStream(3,fin,fin.available());
            System.out.println("Inserted rows "+pst.executeUpdate());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            if (cn != null)
            cn.close();
            if (fin != null)
                fin.close();
        }
    }

}
