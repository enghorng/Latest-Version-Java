/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class clCon {

    /**
     * @return the st
     */
    public static Statement getSt() {
        return st;
    }

    /**
     * @param aSt the st to set
     */
    public static void setSt(Statement aSt) {
        st = aSt;
    }

    /**
     * @return the r
     */
    public static ResultSet getR() {
        return r;
    }

    /**
     * @param aR the r to set
     */
    public static void setR(ResultSet aR) {
        r = aR;
    }

    /**
     * @return the con
     */
    private static Statement st;
    private static ResultSet r;
    public static Connection getCon() {
        return con;
    }

    /**
     * @param aCon the con to set
     */
    public static void setCon(Connection aCon) {
        con = aCon;
    }

    /**
     * @return the stmt
     */
    
    public static String getFileName() {
        return fileName;
    }

    /**
     * @param aFileName the fileName to set
     */
    public static void setFileName(String aFileName) {
        fileName = aFileName;
    }
    private static Connection con;
    private static String fileName;
    public static void inti(){
        try {
           // setFileName("D:\\Study\\IT\\Y3\\Java\\Timetable\\Time_Table\\Course_Timetable");
           setFileName("C:\\Users\\DELL\\Desktop\\TimeTable\\Timetable2");
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            setCon(DriverManager.getConnection("jdbc:ucanaccess://" + getFileName() + "/Course_Timetable.accdb"));  
            setSt(getCon().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE));
            
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void GetData(JTextField txt,String st){
        try {
            txt.setText(clCon.getR().getString(st));
        } catch (SQLException ex) {            
        }
    }
    public static void clear(JTextField txt){
        txt.setText("");
    }

    static Object setR() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
