/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blob_handling;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Administrator
 *
 */
//create table my_images(id number(2),name varchar2(30),snap blob);
public class ReadImageBLOB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Connection cn = null;
        FileOutputStream fout =null;
        try {
            //load & register Type IV JDBC drvr.
              Class.forName("oracle.jdbc.OracleDriver");
           
            //obtain DB conn.
            cn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.72.3:1521:orcl", "scott", "tiger");
            System.out.println("Conn succ. via Type IV");
            //create Statement object to hold/contail query.
            String sql = "select snap from my_images where id=?";
            fout= new FileOutputStream("G:/images/redflowers2_tmp.png");
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, 1);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                //extract Blob
               Blob img=rst.getBlob(1);
               byte[] buf=img.getBytes(1,(int) img.length());
               fout.write(buf);

                System.out.println("Retrived img successfully!");
            } else {
                System.out.println("No images found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null)
            cn.close();
            if (fout != null)
                fout.close();
        }
    }
}
