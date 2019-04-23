/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.awt.Checkbox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class dlgChooseTeacher extends javax.swing.JDialog {

    /**
     * Creates new form dlgChooseTeacher
     */
    public dlgChooseTeacher(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        clsCon.inti();
        clear();
        getCboTeacher();
        ShowTeacherTOLabel();        
        jPanel3.setSize(550, 209);
        lblCourse.setVisible(false);
        lblSubject.setVisible(false);
        lblTeacherID.setVisible(false);
        lblSemester.setVisible(false);
        lblTeacherName.setVisible(false);
        
      
//            chkbxMorning.setEnabled(false);
//            chkbxAfternoon.setEnabled(false);
//            chkbxEvening.setEnabled(false);
//        
//            chkbxmMonday.setEnabled(false);    chkbxmMondayS1.setVisible(false);    chkbxmMondayS2.setVisible(false);
//            chkbxmTuesday.setEnabled(false);   chkbxmTuesdayS1.setVisible(false);   chkbxmTuesdayS2.setVisible(false);
//            chkbxmWednesday.setEnabled(false); chkbxmWednesdayS1.setVisible(false); chkbxmWednesdayS2.setVisible(false);
//            chkbxmThursday.setEnabled(false);  chkbxmThursdayS1.setVisible(false);  chkbxmThursdayS2.setVisible(false);
//            chkbxmFriday.setEnabled(false);    chkbxmFridayS1.setVisible(false);    chkbxmFridayS2.setVisible(false);
//            chkbxmSaturday.setEnabled(false);  chkbxmSaturdayS1.setVisible(false);  chkbxmSaturdayS2.setVisible(false);
//      
//            chkbxaMonday.setEnabled(false);    chkbxaMondayS1.setVisible(false);    chkbxaMondayS2.setVisible(false);
//            chkbxaTuesday.setEnabled(false);   chkbxaTuesdayS1.setVisible(false);   chkbxaTuesdayS2.setVisible(false);
//            chkbxaWednesday.setEnabled(false); chkbxaWednesdayS1.setVisible(false); chkbxaWednesdayS2.setVisible(false);
//            chkbxaThursday.setEnabled(false);  chkbxaThursdayS1.setVisible(false);  chkbxaThursdayS2.setVisible(false);
//            chkbxaFriday.setEnabled(false);    chkbxaFridayS1.setVisible(false);    chkbxaFridayS2.setVisible(false);
//            chkbxaSaturday.setEnabled(false);  chkbxaSaturdayS1.setVisible(false);  chkbxaSaturdayS2.setVisible(false);
//            
//            chkbxeMonday.setEnabled(false);    chkbxeMondayS1.setVisible(false);    chkbxeMondayS2.setVisible(false);
//            chkbxeTuesday.setEnabled(false);   chkbxeTuesdayS1.setVisible(false);   chkbxeTuesdayS2.setVisible(false);
//            chkbxeWednesday.setEnabled(false); chkbxeWednesdayS1.setVisible(false); chkbxeWednesdayS2.setVisible(false);
//            chkbxeThursday.setEnabled(false);  chkbxeThursdayS1.setVisible(false);  chkbxeThursdayS2.setVisible(false);
//            chkbxeFriday.setEnabled(false);    chkbxeFridayS1.setVisible(false);    chkbxeFridayS2.setVisible(false);
//            chkbxeSaturday.setEnabled(false);  chkbxeSaturdayS1.setVisible(false);  chkbxeSaturdayS2.setVisible(false);
//            cheMorAll.setEnabled(false);
//            cheEveAll.setEnabled(false);
//            cheAftAll.setEnabled(false);
//           
//      
    }
    @SuppressWarnings("empty-statement")
//    void EnableCheckBox(){
//        Checkbox chk = new Checkbox();
//        chk[] = {};
//        String[] chk1={"chkbxeSaturday"};
//        chk.setEnabled(false);
//    }
   void semster5to8(){
        for(int k=5; k<9; k++)
            if(lblSemester.getText().equals("Se00"+k)){
                chkbxmSaturday.setEnabled(false);
                chkbxaSaturday.setEnabled(false);
                chkbxeSaturday.setEnabled(false);
                chkbxmSaturday.setSelected(false);
                chkbxaSaturday.setSelected(false);
                chkbxeSaturday.setSelected(false);    
                chkbxmSaturdayS1.setVisible(false);
                chkbxmSaturdayS2.setVisible(false);
                chkbxaSaturdayS1.setVisible(false);
                chkbxaSaturdayS2.setVisible(false);
                chkbxeSaturdayS1.setVisible(false);
                chkbxeSaturdayS2.setVisible(false);
            }
    }
    void clear(){
        chkbxMorning.setEnabled(false);                    
        chkbxAfternoon.setEnabled(false);
        chkbxEvening.setEnabled(false);
        chkbxAfternoon.setSelected(false);
        chkbxMorning.setSelected(false);
        chkbxEvening.setSelected(false);
        
        chkbxmMonday.setSelected(false);
        chkbxmTuesday.setSelected(false);
        chkbxmWednesday.setSelected(false);
        chkbxmThursday.setSelected(false);
        chkbxmFriday.setSelected(false);
        chkbxmSaturday.setSelected(false);

        chkbxaMonday.setSelected(false);
        chkbxaTuesday.setSelected(false);
        chkbxaWednesday.setSelected(false);
        chkbxaThursday.setSelected(false);
        chkbxaFriday.setSelected(false);
        chkbxaSaturday.setSelected(false);

        chkbxeMonday.setSelected(false);
        chkbxeTuesday.setSelected(false);
        chkbxeWednesday.setSelected(false);
        chkbxeThursday.setSelected(false);
        chkbxeFriday.setSelected(false);
        chkbxeSaturday.setSelected(false);
        
        cheMorAll.setSelected(false);
        cheEveAll.setSelected(false);
        cheAftAll.setSelected(false);
        
        chkbxmMonday.setEnabled(false);
        chkbxmTuesday.setEnabled(false);
        chkbxmWednesday.setEnabled(false);
        chkbxmThursday.setEnabled(false);
        chkbxmFriday.setEnabled(false);
        chkbxmSaturday.setEnabled(false);

        chkbxaMonday.setEnabled(false);
        chkbxaTuesday.setEnabled(false);
        chkbxaWednesday.setEnabled(false);
        chkbxaThursday.setEnabled(false);
        chkbxaFriday.setEnabled(false);
        chkbxaSaturday.setEnabled(false);

        chkbxeMonday.setEnabled(false);
        chkbxeTuesday.setEnabled(false);
        chkbxeWednesday.setEnabled(false);
        chkbxeThursday.setEnabled(false);
        chkbxeFriday.setEnabled(false);
        chkbxeSaturday.setEnabled(false);
        cheMorAll.setEnabled(false);
        cheEveAll.setEnabled(false);
        cheAftAll.setEnabled(false);
        
        chkbxmMondayS1.setVisible(false);   chkbxmMondayS2.setVisible(false);      
        chkbxmTuesdayS1.setVisible(false);  chkbxmTuesdayS2.setVisible(false);
        chkbxmWednesdayS1.setVisible(false);chkbxmWednesdayS2.setVisible(false);
        chkbxmThursdayS1.setVisible(false); chkbxmThursdayS2.setVisible(false);
        chkbxmFridayS1.setVisible(false);   chkbxmFridayS2.setVisible(false);
        chkbxmSaturdayS1.setVisible(false); chkbxmSaturdayS2.setVisible(false);
      
        chkbxaMondayS1.setVisible(false);   chkbxaMondayS2.setVisible(false);
        chkbxaTuesdayS1.setVisible(false);  chkbxaTuesdayS2.setVisible(false);
        chkbxaWednesdayS1.setVisible(false);chkbxaWednesdayS2.setVisible(false);
        chkbxaThursdayS1.setVisible(false); chkbxaThursdayS2.setVisible(false);
        chkbxaFridayS1.setVisible(false);   chkbxaFridayS2.setVisible(false);
        chkbxaSaturdayS1.setVisible(false); chkbxaSaturdayS2.setVisible(false);
            
        chkbxeMondayS1.setVisible(false);   chkbxeMondayS2.setVisible(false);
        chkbxeTuesdayS1.setVisible(false);  chkbxeTuesdayS2.setVisible(false);
        chkbxeWednesdayS1.setVisible(false);chkbxeWednesdayS2.setVisible(false);
        chkbxeThursdayS1.setVisible(false); chkbxeThursdayS2.setVisible(false);
        chkbxeFridayS1.setVisible(false);   chkbxeFridayS2.setVisible(false);
        chkbxeSaturdayS1.setVisible(false); chkbxeSaturdayS2.setVisible(false);
        
        chkbxmMondayS1.setSelected(false);      chkbxmMondayS2.setSelected(false);
        chkbxmTuesdayS1.setSelected(false);     chkbxmTuesdayS2.setSelected(false);
        chkbxmWednesdayS1.setSelected(false);   chkbxmWednesdayS2.setSelected(false);
        chkbxmThursdayS1.setSelected(false);    chkbxmThursdayS2.setSelected(false);
        chkbxmFridayS1.setSelected(false);      chkbxmFridayS2.setSelected(false);
        chkbxmSaturdayS1.setSelected(false);    chkbxmSaturdayS2.setSelected(false);
        
        chkbxaMondayS1.setSelected(false);      chkbxaMondayS2.setSelected(false);
        chkbxaTuesdayS1.setSelected(false);     chkbxaTuesdayS2.setSelected(false);
        chkbxaWednesdayS1.setSelected(false);   chkbxaWednesdayS2.setSelected(false);
        chkbxaThursdayS1.setSelected(false);    chkbxaThursdayS2.setSelected(false);
        chkbxaFridayS1.setSelected(false);      chkbxaFridayS2.setSelected(false);
        chkbxaSaturdayS1.setSelected(false);    chkbxaSaturdayS2.setSelected(false);
        
        chkbxeMondayS1.setSelected(false);      chkbxeMondayS2.setSelected(false);
        chkbxeTuesdayS1.setSelected(false);     chkbxeTuesdayS2.setSelected(false);
        chkbxeWednesdayS1.setSelected(false);   chkbxeWednesdayS2.setSelected(false);
        chkbxeThursdayS1.setSelected(false);    chkbxeThursdayS2.setSelected(false);
        chkbxeFridayS1.setSelected(false);      chkbxeFridayS2.setSelected(false);
        chkbxeSaturdayS1.setSelected(false);    chkbxeSaturdayS2.setSelected(false);
    }
    void getCboTeacher(){        
        cboTeacherName.removeAllItems();
        cboTeacherName.addItem("--- Select ---");
        try {    
                clsCon.setRs(clsCon.getStmt().executeQuery("select * from qTeacher"));
                clsCon.getRs().first();
                 lblTeacherID.setText(clsCon.getRs().getString("TeacherID"));
                 lblCourse.setText(clsCon.getRs().getString("CourseName"));
                 lblSubject.setText(clsCon.getRs().getString("SubjectName"));
                if(clsCon.getRs().first())
                    do{
                        cboTeacherName.addItem(clsCon.getRs().getString("Name"));                       
                    }while(clsCon.getRs().next());
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    int a=0;
    void ShowTeacherTOLabel(){
        cboTeacherName.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                clear();
                a=0;
                lblTeacherID.setText("0");
                if(cboTeacherName.getSelectedItem().equals("--- Select ---")){
                    lblCourse.setVisible(false);
                    lblSubject.setVisible(false);
                    return;
                }

                lblCourse.setVisible(true);
                lblSubject.setVisible(true);
                
                
               String c=(String) cboTeacherName.getSelectedItem();
               lblTeacherName.setText(c);
               try {
                    clsCon.setRs(clsCon.getStmt().executeQuery("Select * from qTeacherCourseShift where Name='"+lblTeacherName.getText()+"'"));
                    clsCon.getRs().first();
                    lblTeacherID.setText(clsCon.getRs().getString("TeacherID"));
                    lblCourse.setText(clsCon.getRs().getString("CourseName"));
                    lblSubject.setText(clsCon.getRs().getString("SubjectName"));
                    lblSemester.setText(clsCon.getRs().getString("SemesterID"));

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            clear();
            String name=(String) cboTeacherName.getSelectedItem();
            try{
                clsCon.setRs(clsCon.getStmt().executeQuery("select count(TeacherID) AS A from qTeacherTime where Name = '"+name+"'"));
                clsCon.getRs().first();
                a =Integer.parseInt((String) clsCon.getRs().getString("A"));
                
                if(a>0){
                    try {
                    clsCon.setRs(clsCon.getStmt().executeQuery("Select * from qTeacherTime where Name='"+name+"' and (Active=1 or Active = 2)"));
                    clsCon.getRs().first();
                    chkbxMorning.setEnabled(true);
                    chkbxAfternoon.setEnabled(true);
                    chkbxEvening.setEnabled(true);
                    if(clsCon.getRs().first())
                    
                    do{ 
                        /////////////////////////// Morning ////////////////////////
                        if(clsCon.getRs().getString("ShiftName").equals("Morning")){
                            chkbxMorning.setSelected(true);     cheMorAll.setEnabled(true);
                            chkbxmMonday.setEnabled(true);      chkbxmTuesday.setEnabled(true);     
                            chkbxmWednesday.setEnabled(true);   chkbxmThursday.setEnabled(true);    
                            chkbxmFriday.setEnabled(true);      chkbxmSaturday.setEnabled(true);
                            if(clsCon.getRs().getString("Day").equals("Monday")){                                
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxmMonday.setSelected(true);
                                    chkbxmMondayS1.setVisible(true);
                                    chkbxmMondayS2.setVisible(true);
                                    chkbxmMondayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxmMonday.setSelected(true);
                                    chkbxmMondayS1.setVisible(true);
                                    chkbxmMondayS2.setVisible(true);
                                    chkbxmMondayS2.setSelected(true);
                                }
                            } 
                            if(clsCon.getRs().getString("Day").equals("Tuesday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxmTuesday.setSelected(true);
                                    chkbxmTuesdayS1.setVisible(true);
                                    chkbxmTuesdayS2.setVisible(true);
                                    chkbxmTuesdayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxmTuesday.setSelected(true);
                                    chkbxmTuesdayS1.setVisible(true);
                                    chkbxmTuesdayS2.setVisible(true);
                                    chkbxmTuesdayS2.setSelected(true);
                                }
                            } 
                            if(clsCon.getRs().getString("Day").equals("Wednesday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxmWednesday.setSelected(true);
                                    chkbxmWednesdayS1.setVisible(true);
                                    chkbxmWednesdayS2.setVisible(true);
                                    chkbxmWednesdayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxmWednesday.setSelected(true);
                                    chkbxmWednesdayS1.setVisible(true);
                                    chkbxmWednesdayS2.setVisible(true);
                                    chkbxmWednesdayS2.setSelected(true);
                                }
                            } 
                            if(clsCon.getRs().getString("Day").equals("Thursday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxmThursday.setSelected(true);
                                    chkbxmThursdayS1.setVisible(true);
                                    chkbxmThursdayS2.setVisible(true);
                                    chkbxmThursdayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxmThursday.setSelected(true);
                                    chkbxmThursdayS1.setVisible(true);
                                    chkbxmThursdayS2.setVisible(true);
                                    chkbxmThursdayS2.setSelected(true);
                                }
                            }
                            if(clsCon.getRs().getString("Day").equals("Friday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxmFriday.setSelected(true);
                                    chkbxmFridayS1.setVisible(true);
                                    chkbxmFridayS2.setVisible(true);
                                    chkbxmFridayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxmFriday.setSelected(true);
                                    chkbxmFridayS1.setVisible(true);
                                    chkbxmFridayS2.setVisible(true);
                                    chkbxmFridayS2.setSelected(true);
                                }
                            } 
                            if(clsCon.getRs().getString("Day").equals("Saturday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxmSaturday.setSelected(true);
                                    chkbxmSaturdayS1.setVisible(true);
                                    chkbxmSaturdayS2.setVisible(true);
                                    chkbxmSaturdayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxmSaturday.setSelected(true);
                                    chkbxmSaturdayS1.setVisible(true);
                                    chkbxmSaturdayS2.setVisible(true);
                                    chkbxmSaturdayS2.setSelected(true);
                                } 
                        }
                        }
                        /////////////////////////// Afternoon ////////////////////////
                        if(clsCon.getRs().getString("ShiftName").equals("Afternoon")){
                            chkbxAfternoon.setSelected(true);     cheAftAll.setEnabled(true);
                            chkbxaMonday.setEnabled(true);      chkbxaTuesday.setEnabled(true);     
                            chkbxaWednesday.setEnabled(true);   chkbxaThursday.setEnabled(true);    
                            chkbxaFriday.setEnabled(true);      chkbxaSaturday.setEnabled(true);
                            if(clsCon.getRs().getString("Day").equals("Monday")){                                
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxaMonday.setSelected(true);
                                    chkbxaMondayS1.setVisible(true);
                                    chkbxaMondayS2.setVisible(true);
                                    chkbxaMondayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxaMonday.setSelected(true);
                                    chkbxaMondayS1.setVisible(true);
                                    chkbxaMondayS2.setVisible(true);
                                    chkbxaMondayS2.setSelected(true);
                                }
                            } 
                            if(clsCon.getRs().getString("Day").equals("Tuesday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxaTuesday.setSelected(true);
                                    chkbxaTuesdayS1.setVisible(true);
                                    chkbxaTuesdayS2.setVisible(true);
                                    chkbxaTuesdayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxaTuesday.setSelected(true);
                                    chkbxaTuesdayS1.setVisible(true);
                                    chkbxaTuesdayS2.setVisible(true);
                                    chkbxaTuesdayS2.setSelected(true);
                                }
                            } 
                            if(clsCon.getRs().getString("Day").equals("Wednesday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxaWednesday.setSelected(true);
                                    chkbxaWednesdayS1.setVisible(true);
                                    chkbxaWednesdayS2.setVisible(true);
                                    chkbxaWednesdayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxaWednesday.setSelected(true);
                                    chkbxaWednesdayS1.setVisible(true);
                                    chkbxaWednesdayS2.setVisible(true);
                                    chkbxaWednesdayS2.setSelected(true);
                                }
                            } 
                            if(clsCon.getRs().getString("Day").equals("Thursday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxaThursday.setSelected(true);
                                    chkbxaThursdayS1.setVisible(true);
                                    chkbxaThursdayS2.setVisible(true);
                                    chkbxaThursdayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxaThursday.setSelected(true);
                                    chkbxaThursdayS1.setVisible(true);
                                    chkbxaThursdayS2.setVisible(true);
                                    chkbxaThursdayS2.setSelected(true);
                                }
                            }
//                            if(clsCon.getRs().getString("Day").equals("Friday")){
//                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
//                                    chkbxaFriday.setSelected(true);
//                                    chkbxaFridayS1.setVisible(true);
//                                    chkbxaFridayS2.setVisible(true);
//                                    chkbxaFridayS1.setSelected(true);
//                                }
//                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
//                                    chkbxaFriday.setSelected(true);
//                                    chkbxaFridayS1.setVisible(true);
//                                    chkbxaFridayS2.setVisible(true);
//                                    chkbxaFridayS2.setSelected(true);
//                                }
//                            } 
                            if(clsCon.getRs().getString("Day").equals("Saturday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxaSaturday.setSelected(true);
                                    chkbxaSaturdayS1.setVisible(true);
                                    chkbxaSaturdayS2.setVisible(true);
                                    chkbxaSaturdayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxaSaturday.setSelected(true);
                                    chkbxaSaturdayS1.setVisible(true);
                                    chkbxaSaturdayS2.setVisible(true);
                                    chkbxaSaturdayS2.setSelected(true);
                                } 
                            }
                        }   
//                        if(clsCon.getRs().getString("ShiftName").equals("Afternoon")){
//                            chkbxAfternoon.setSelected(true);   cheAftAll.setEnabled(true);  
//                            chkbxaMonday.setEnabled(true);      chkbxaTuesday.setEnabled(true);     
//                            chkbxaWednesday.setEnabled(true);   chkbxaThursday.setEnabled(true);    
//                            chkbxaFriday.setEnabled(true);      chkbxaSaturday.setEnabled(true);
//                            if(clsCon.getRs().getString("Day").equals("Monday")){                                
//                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
//                                    chkbxaMonday.setSelected(true);
//                                    chkbxaMondayS1.setVisible(true);
//                                    chkbxaMondayS2.setVisible(true);
//                                    chkbxaMondayS1.setSelected(true);
//                                }
//                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
//                                    chkbxaMonday.setSelected(true);
//                                    chkbxaMondayS1.setVisible(true);
//                                    chkbxaMondayS2.setVisible(true);
//                                    chkbxaMondayS2.setSelected(true);
//                                }
//                            } 
//                            if(clsCon.getRs().getString("Day").equals("Tuesday")){
//                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
//                                    chkbxaTuesday.setSelected(true);
//                                    chkbxaTuesdayS1.setVisible(true);
//                                    chkbxaTuesdayS2.setVisible(true);
//                                    chkbxaTuesdayS1.setSelected(true);
//                                }
//                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
//                                    chkbxaTuesday.setSelected(true);
//                                    chkbxaTuesdayS1.setVisible(true);
//                                    chkbxaTuesdayS2.setVisible(true);
//                                    chkbxaTuesdayS2.setSelected(true);
//                                }
//                            } 
//                            if(clsCon.getRs().getString("Day").equals("Wednesday")){
//                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
//                                    chkbxaWednesday.setSelected(true);
//                                    chkbxaWednesdayS1.setVisible(true);
//                                    chkbxaWednesdayS2.setVisible(true);
//                                    chkbxaWednesdayS1.setSelected(true);
//                                }
//                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
//                                    chkbxaWednesday.setSelected(true);
//                                    chkbxaWednesdayS1.setVisible(true);
//                                    chkbxaWednesdayS2.setVisible(true);
//                                    chkbxaWednesdayS2.setSelected(true);
//                                }
//                            } 
//                            if(clsCon.getRs().getString("Day").equals("Thursday")){
//                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
//                                    chkbxaThursday.setSelected(true);
//                                    chkbxaThursdayS1.setVisible(true);
//                                    chkbxaThursdayS2.setVisible(true);
//                                    chkbxaThursdayS1.setSelected(true);
//                                }
//                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
//                                    chkbxaThursday.setSelected(true);
//                                    chkbxaThursdayS1.setVisible(true);
//                                    chkbxaThursdayS2.setVisible(true);
//                                    chkbxaThursdayS2.setSelected(true);
//                                }
//                            }
//                            if(clsCon.getRs().getString("Day").equals("Friday")){
//                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
//                                    chkbxaFriday.setSelected(true);
//                                    chkbxaFridayS1.setVisible(true);
//                                    chkbxaFridayS2.setVisible(true);
//                                    chkbxaFridayS1.setSelected(true);
//                                }
//                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
//                                    chkbxaFriday.setSelected(true);
//                                    chkbxaFridayS1.setVisible(true);
//                                    chkbxaFridayS2.setVisible(true);
//                                    chkbxaFridayS2.setSelected(true);
//                                }
//                            } 
//                            if(clsCon.getRs().getString("Day").equals("Saturday")){
//                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
//                                    chkbxaSaturday.setSelected(true);
//                                    chkbxaSaturdayS1.setVisible(true);
//                                    chkbxaSaturdayS2.setVisible(true);
//                                    chkbxaSaturdayS1.setSelected(true);
//                                }
//                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
//                                    chkbxaSaturday.setSelected(true);
//                                    chkbxaSaturdayS1.setVisible(true);
//                                    chkbxaSaturdayS2.setVisible(true);
//                                    chkbxaSaturdayS2.setSelected(true);
//                                } 
//                            }                       
//                        }                     
                        /////////////////////////// Evening ////////////////////////
                        if(clsCon.getRs().getString("ShiftName").equals("Evening")){
                            chkbxEvening.setSelected(true);     cheEveAll.setEnabled(true);
                            chkbxeMonday.setEnabled(true);      chkbxeTuesday.setEnabled(true);     
                            chkbxeWednesday.setEnabled(true);   chkbxeThursday.setEnabled(true);    
                            chkbxeFriday.setEnabled(true);      chkbxeSaturday.setEnabled(true);
                            if(clsCon.getRs().getString("Day").equals("Monday")){                                
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxeMonday.setSelected(true);
                                    chkbxeMondayS1.setVisible(true);
                                    chkbxeMondayS2.setVisible(true);
                                    chkbxeMondayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxeMonday.setSelected(true);
                                    chkbxeMondayS1.setVisible(true);
                                    chkbxeMondayS2.setVisible(true);
                                    chkbxeMondayS2.setSelected(true);
                                }
                            } 
                            if(clsCon.getRs().getString("Day").equals("Tuesday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxeTuesday.setSelected(true);
                                    chkbxeTuesdayS1.setVisible(true);
                                    chkbxeTuesdayS2.setVisible(true);
                                    chkbxeTuesdayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxeTuesday.setSelected(true);
                                    chkbxeTuesdayS1.setVisible(true);
                                    chkbxeTuesdayS2.setVisible(true);
                                    chkbxeTuesdayS2.setSelected(true);
                                }
                            } 
                            if(clsCon.getRs().getString("Day").equals("Wednesday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxeWednesday.setSelected(true);
                                    chkbxeWednesdayS1.setVisible(true);
                                    chkbxeWednesdayS2.setVisible(true);
                                    chkbxeWednesdayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxeWednesday.setSelected(true);
                                    chkbxeWednesdayS1.setVisible(true);
                                    chkbxeWednesdayS2.setVisible(true);
                                    chkbxeWednesdayS2.setSelected(true);
                                }
                            } 
                            if(clsCon.getRs().getString("Day").equals("Thursday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxeThursday.setSelected(true);
                                    chkbxeThursdayS1.setVisible(true);
                                    chkbxeThursdayS2.setVisible(true);
                                    chkbxeThursdayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxeThursday.setSelected(true);
                                    chkbxeThursdayS1.setVisible(true);
                                    chkbxeThursdayS2.setVisible(true);
                                    chkbxeThursdayS2.setSelected(true);
                                }
                            }
                            if(clsCon.getRs().getString("Day").equals("Friday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxeFriday.setSelected(true);
                                    chkbxeFridayS1.setVisible(true);
                                    chkbxeFridayS2.setVisible(true);
                                    chkbxeFridayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxeFriday.setSelected(true);
                                    chkbxeFridayS1.setVisible(true);
                                    chkbxeFridayS2.setVisible(true);
                                    chkbxeFridayS2.setSelected(true);
                                }
                            } 
                            if(clsCon.getRs().getString("Day").equals("Saturday")){
                                if(clsCon.getRs().getString("SessionName").equals("Session1")){
                                    chkbxeSaturday.setSelected(true);
                                    chkbxeSaturdayS1.setVisible(true);
                                    chkbxeSaturdayS2.setVisible(true);
                                    chkbxeSaturdayS1.setSelected(true);
                                }
                                if(clsCon.getRs().getString("SessionName").equals("Session2")){
                                    chkbxeSaturday.setSelected(true);
                                    chkbxeSaturdayS1.setVisible(true);
                                    chkbxeSaturdayS2.setVisible(true);
                                    chkbxeSaturdayS2.setSelected(true);
                                } 
                            }   
                        }
                    }while(clsCon.getRs().next());
                    
                } catch (SQLException ex) {
                }
                } 
            }
            catch(Exception t){                
            }               
                semster5to8();
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cboTeacherName = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        lblSubject = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        chkbxMorning = new javax.swing.JCheckBox();
        chkbxAfternoon = new javax.swing.JCheckBox();
        chkbxEvening = new javax.swing.JCheckBox();
        plAfternon = new javax.swing.JPanel();
        chkbxaMonday = new javax.swing.JCheckBox();
        chkbxaTuesday = new javax.swing.JCheckBox();
        chkbxaWednesday = new javax.swing.JCheckBox();
        chkbxaThursday = new javax.swing.JCheckBox();
        chkbxaFriday = new javax.swing.JCheckBox();
        chkbxaSaturday = new javax.swing.JCheckBox();
        cheAftAll = new javax.swing.JCheckBox();
        chkbxaMondayS1 = new javax.swing.JCheckBox();
        chkbxaMondayS2 = new javax.swing.JCheckBox();
        chkbxaTuesdayS1 = new javax.swing.JCheckBox();
        chkbxaTuesdayS2 = new javax.swing.JCheckBox();
        chkbxaWednesdayS1 = new javax.swing.JCheckBox();
        chkbxaWednesdayS2 = new javax.swing.JCheckBox();
        chkbxaThursdayS1 = new javax.swing.JCheckBox();
        chkbxaThursdayS2 = new javax.swing.JCheckBox();
        chkbxaFridayS1 = new javax.swing.JCheckBox();
        chkbxaFridayS2 = new javax.swing.JCheckBox();
        chkbxaSaturdayS1 = new javax.swing.JCheckBox();
        chkbxaSaturdayS2 = new javax.swing.JCheckBox();
        btnNew = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        plMoring = new javax.swing.JPanel();
        chkbxmMonday = new javax.swing.JCheckBox();
        chkbxmTuesday = new javax.swing.JCheckBox();
        chkbxmWednesday = new javax.swing.JCheckBox();
        chkbxmThursday = new javax.swing.JCheckBox();
        chkbxmFriday = new javax.swing.JCheckBox();
        chkbxmSaturday = new javax.swing.JCheckBox();
        cheMorAll = new javax.swing.JCheckBox();
        chkbxmMondayS1 = new javax.swing.JCheckBox();
        chkbxmMondayS2 = new javax.swing.JCheckBox();
        chkbxmTuesdayS1 = new javax.swing.JCheckBox();
        chkbxmTuesdayS2 = new javax.swing.JCheckBox();
        chkbxmWednesdayS1 = new javax.swing.JCheckBox();
        chkbxmWednesdayS2 = new javax.swing.JCheckBox();
        chkbxmThursdayS1 = new javax.swing.JCheckBox();
        chkbxmThursdayS2 = new javax.swing.JCheckBox();
        chkbxmFridayS1 = new javax.swing.JCheckBox();
        chkbxmFridayS2 = new javax.swing.JCheckBox();
        chkbxmSaturdayS1 = new javax.swing.JCheckBox();
        chkbxmSaturdayS2 = new javax.swing.JCheckBox();
        plEvening = new javax.swing.JPanel();
        chkbxeMonday = new javax.swing.JCheckBox();
        chkbxeTuesday = new javax.swing.JCheckBox();
        chkbxeWednesday = new javax.swing.JCheckBox();
        chkbxeThursday = new javax.swing.JCheckBox();
        chkbxeFriday = new javax.swing.JCheckBox();
        chkbxeSaturday = new javax.swing.JCheckBox();
        cheEveAll = new javax.swing.JCheckBox();
        chkbxeMondayS1 = new javax.swing.JCheckBox();
        chkbxeMondayS2 = new javax.swing.JCheckBox();
        chkbxeTuesdayS1 = new javax.swing.JCheckBox();
        chkbxeTuesdayS2 = new javax.swing.JCheckBox();
        chkbxeWednesdayS1 = new javax.swing.JCheckBox();
        chkbxeWednesdayS2 = new javax.swing.JCheckBox();
        chkbxeThursdayS1 = new javax.swing.JCheckBox();
        chkbxeThursdayS2 = new javax.swing.JCheckBox();
        chkbxeFridayS1 = new javax.swing.JCheckBox();
        chkbxeFridayS2 = new javax.swing.JCheckBox();
        chkbxeSaturdayS1 = new javax.swing.JCheckBox();
        chkbxeSaturdayS2 = new javax.swing.JCheckBox();
        lblTeacherID = new javax.swing.JLabel();
        lblSemester = new javax.swing.JLabel();
        lblTeacherName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Charlemagne Std", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Time OF Teacher");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1291, 705));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Teacher", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AKbalthom Freehand", 0, 20), new java.awt.Color(255, 0, 51))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(550, 209));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Search Name");

        cboTeacherName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cboTeacherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTeacherNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Course            :");

        lblCourse.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblCourse.setForeground(new java.awt.Color(0, 0, 255));
        lblCourse.setText("Name");

        lblSubject.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblSubject.setForeground(new java.awt.Color(0, 0, 255));
        lblSubject.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Subject           :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)
                        .addGap(40, 40, 40)
                        .addComponent(cboTeacherName, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(419, 419, 419))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTeacherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblSubject))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Shift", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AKbalthom Freehand", 0, 20), new java.awt.Color(255, 0, 51))); // NOI18N

        chkbxMorning.setBackground(new java.awt.Color(204, 255, 255));
        chkbxMorning.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxMorning.setText("Morning");
        chkbxMorning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxMorningActionPerformed(evt);
            }
        });

        chkbxAfternoon.setBackground(new java.awt.Color(204, 255, 255));
        chkbxAfternoon.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxAfternoon.setText("Afternoon");
        chkbxAfternoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxAfternoonActionPerformed(evt);
            }
        });

        chkbxEvening.setBackground(new java.awt.Color(204, 255, 255));
        chkbxEvening.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxEvening.setText("Evening");
        chkbxEvening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxEveningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkbxMorning, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbxEvening)
                    .addComponent(chkbxAfternoon))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkbxMorning)
                .addGap(18, 18, 18)
                .addComponent(chkbxAfternoon)
                .addGap(18, 18, 18)
                .addComponent(chkbxEvening)
                .addGap(22, 22, 22))
        );

        plAfternon.setBackground(new java.awt.Color(204, 255, 255));
        plAfternon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Afternoon", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AKbalthom Freehand", 0, 20), new java.awt.Color(255, 0, 51))); // NOI18N
        plAfternon.setPreferredSize(new java.awt.Dimension(277, 487));

        chkbxaMonday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaMonday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxaMonday.setText("Monday");
        chkbxaMonday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxaMondayActionPerformed(evt);
            }
        });

        chkbxaTuesday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaTuesday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxaTuesday.setText("Tuesday");
        chkbxaTuesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxaTuesdayActionPerformed(evt);
            }
        });

        chkbxaWednesday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaWednesday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxaWednesday.setText("Wednesday");
        chkbxaWednesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxaWednesdayActionPerformed(evt);
            }
        });

        chkbxaThursday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaThursday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxaThursday.setText("Thursday");
        chkbxaThursday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxaThursdayActionPerformed(evt);
            }
        });

        chkbxaFriday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaFriday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxaFriday.setText("Friday");
        chkbxaFriday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxaFridayActionPerformed(evt);
            }
        });

        chkbxaSaturday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaSaturday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxaSaturday.setText("Saturday");
        chkbxaSaturday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxaSaturdayActionPerformed(evt);
            }
        });

        cheAftAll.setBackground(new java.awt.Color(204, 255, 255));
        cheAftAll.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cheAftAll.setText("All");
        cheAftAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheAftAllActionPerformed(evt);
            }
        });

        chkbxaMondayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaMondayS1.setText("Sesion1");
        chkbxaMondayS1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkbxaMondayS1StateChanged(evt);
            }
        });

        chkbxaMondayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaMondayS2.setText("Sesion2");

        chkbxaTuesdayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaTuesdayS1.setText("Sesion1");

        chkbxaTuesdayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaTuesdayS2.setText("Sesion2");

        chkbxaWednesdayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaWednesdayS1.setText("Sesion1");

        chkbxaWednesdayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaWednesdayS2.setText("Sesion2");

        chkbxaThursdayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaThursdayS1.setText("Sesion1");

        chkbxaThursdayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaThursdayS2.setText("Sesion2");

        chkbxaFridayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaFridayS1.setText("Sesion1");

        chkbxaFridayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaFridayS2.setText("Sesion2");

        chkbxaSaturdayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaSaturdayS1.setText("Sesion1");

        chkbxaSaturdayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxaSaturdayS2.setText("Sesion2");

        javax.swing.GroupLayout plAfternonLayout = new javax.swing.GroupLayout(plAfternon);
        plAfternon.setLayout(plAfternonLayout);
        plAfternonLayout.setHorizontalGroup(
            plAfternonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plAfternonLayout.createSequentialGroup()
                .addGroup(plAfternonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plAfternonLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(plAfternonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cheAftAll)
                            .addComponent(chkbxaWednesday)
                            .addComponent(chkbxaTuesday)
                            .addGroup(plAfternonLayout.createSequentialGroup()
                                .addGroup(plAfternonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkbxaMonday)
                                    .addGroup(plAfternonLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(chkbxaMondayS1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkbxaMondayS2))
                            .addGroup(plAfternonLayout.createSequentialGroup()
                                .addGroup(plAfternonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chkbxaThursday)
                                    .addComponent(chkbxaThursdayS1)
                                    .addComponent(chkbxaWednesdayS1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(plAfternonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkbxaThursdayS2)
                                    .addComponent(chkbxaWednesdayS2)))
                            .addGroup(plAfternonLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(chkbxaTuesdayS1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkbxaTuesdayS2))
                            .addComponent(chkbxaFriday)
                            .addComponent(chkbxaSaturday)))
                    .addGroup(plAfternonLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(chkbxaFridayS1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkbxaFridayS2))
                    .addGroup(plAfternonLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(chkbxaSaturdayS1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkbxaSaturdayS2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        plAfternonLayout.setVerticalGroup(
            plAfternonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plAfternonLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(cheAftAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkbxaMonday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plAfternonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxaMondayS1)
                    .addComponent(chkbxaMondayS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbxaTuesday)
                .addGap(0, 0, 0)
                .addGroup(plAfternonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxaTuesdayS1)
                    .addComponent(chkbxaTuesdayS2))
                .addGap(0, 0, 0)
                .addComponent(chkbxaWednesday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plAfternonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxaWednesdayS1)
                    .addComponent(chkbxaWednesdayS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbxaThursday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plAfternonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxaThursdayS1)
                    .addComponent(chkbxaThursdayS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbxaFriday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plAfternonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxaFridayS1)
                    .addComponent(chkbxaFridayS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbxaSaturday)
                .addGap(0, 0, 0)
                .addGroup(plAfternonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxaSaturdayS1)
                    .addComponent(chkbxaSaturdayS2))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        plMoring.setBackground(new java.awt.Color(204, 255, 255));
        plMoring.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Morning", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AKbalthom Freehand", 0, 20), new java.awt.Color(255, 0, 51))); // NOI18N
        plMoring.setPreferredSize(new java.awt.Dimension(277, 487));

        chkbxmMonday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmMonday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxmMonday.setText("Monday");
        chkbxmMonday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxmMondayActionPerformed(evt);
            }
        });

        chkbxmTuesday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmTuesday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxmTuesday.setText("Tuesday");
        chkbxmTuesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxmTuesdayActionPerformed(evt);
            }
        });

        chkbxmWednesday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmWednesday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxmWednesday.setText("Wednesday");
        chkbxmWednesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxmWednesdayActionPerformed(evt);
            }
        });

        chkbxmThursday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmThursday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxmThursday.setText("Thursday");
        chkbxmThursday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxmThursdayActionPerformed(evt);
            }
        });

        chkbxmFriday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmFriday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxmFriday.setText("Friday");
        chkbxmFriday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxmFridayActionPerformed(evt);
            }
        });

        chkbxmSaturday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmSaturday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxmSaturday.setText("Saturday");
        chkbxmSaturday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxmSaturdayActionPerformed(evt);
            }
        });

        cheMorAll.setBackground(new java.awt.Color(204, 255, 255));
        cheMorAll.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cheMorAll.setText("All");
        cheMorAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheMorAllActionPerformed(evt);
            }
        });

        chkbxmMondayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmMondayS1.setText("Sesion1");

        chkbxmMondayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmMondayS2.setText("Sesion2");

        chkbxmTuesdayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmTuesdayS1.setText("Sesion1");

        chkbxmTuesdayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmTuesdayS2.setText("Sesion2");

        chkbxmWednesdayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmWednesdayS1.setText("Sesion1");

        chkbxmWednesdayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmWednesdayS2.setText("Sesion2");

        chkbxmThursdayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmThursdayS1.setText("Sesion1");

        chkbxmThursdayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmThursdayS2.setText("Sesion2");

        chkbxmFridayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmFridayS1.setText("Sesion1");

        chkbxmFridayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmFridayS2.setText("Sesion2");

        chkbxmSaturdayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmSaturdayS1.setText("Sesion1");

        chkbxmSaturdayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxmSaturdayS2.setText("Sesion2");

        javax.swing.GroupLayout plMoringLayout = new javax.swing.GroupLayout(plMoring);
        plMoring.setLayout(plMoringLayout);
        plMoringLayout.setHorizontalGroup(
            plMoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMoringLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(plMoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkbxmThursday)
                    .addGroup(plMoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chkbxmFriday)
                        .addComponent(chkbxmWednesday)
                        .addComponent(cheMorAll)
                        .addComponent(chkbxmTuesday)
                        .addComponent(chkbxmMonday)
                        .addGroup(plMoringLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(plMoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(plMoringLayout.createSequentialGroup()
                                    .addComponent(chkbxmSaturdayS1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkbxmSaturdayS2))
                                .addGroup(plMoringLayout.createSequentialGroup()
                                    .addComponent(chkbxmFridayS1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkbxmFridayS2))
                                .addGroup(plMoringLayout.createSequentialGroup()
                                    .addComponent(chkbxmThursdayS1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkbxmThursdayS2))
                                .addGroup(plMoringLayout.createSequentialGroup()
                                    .addComponent(chkbxmWednesdayS1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkbxmWednesdayS2))
                                .addGroup(plMoringLayout.createSequentialGroup()
                                    .addComponent(chkbxmTuesdayS1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkbxmTuesdayS2))
                                .addGroup(plMoringLayout.createSequentialGroup()
                                    .addComponent(chkbxmMondayS1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(chkbxmMondayS2))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plMoringLayout.createSequentialGroup()
                            .addComponent(chkbxmSaturday)
                            .addGap(88, 88, 88))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        plMoringLayout.setVerticalGroup(
            plMoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMoringLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(cheMorAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkbxmMonday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plMoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxmMondayS1)
                    .addComponent(chkbxmMondayS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbxmTuesday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plMoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxmTuesdayS1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkbxmTuesdayS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbxmWednesday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plMoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxmWednesdayS1)
                    .addComponent(chkbxmWednesdayS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbxmThursday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plMoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxmThursdayS1)
                    .addComponent(chkbxmThursdayS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbxmFriday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plMoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxmFridayS1)
                    .addComponent(chkbxmFridayS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbxmSaturday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plMoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxmSaturdayS1)
                    .addComponent(chkbxmSaturdayS2))
                .addGap(17, 17, 17))
        );

        plEvening.setBackground(new java.awt.Color(204, 255, 255));
        plEvening.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Evening", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AKbalthom Freehand", 0, 20), new java.awt.Color(255, 0, 51))); // NOI18N
        plEvening.setPreferredSize(new java.awt.Dimension(277, 487));

        chkbxeMonday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeMonday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxeMonday.setText("Monday");
        chkbxeMonday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxeMondayActionPerformed(evt);
            }
        });

        chkbxeTuesday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeTuesday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxeTuesday.setText("Tuesday");
        chkbxeTuesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxeTuesdayActionPerformed(evt);
            }
        });

        chkbxeWednesday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeWednesday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxeWednesday.setText("Wednesday");
        chkbxeWednesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxeWednesdayActionPerformed(evt);
            }
        });

        chkbxeThursday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeThursday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxeThursday.setText("Thursday");
        chkbxeThursday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxeThursdayActionPerformed(evt);
            }
        });

        chkbxeFriday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeFriday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxeFriday.setText("Friday");
        chkbxeFriday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxeFridayActionPerformed(evt);
            }
        });

        chkbxeSaturday.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeSaturday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkbxeSaturday.setText("Saturday");
        chkbxeSaturday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxeSaturdayActionPerformed(evt);
            }
        });

        cheEveAll.setBackground(new java.awt.Color(204, 255, 255));
        cheEveAll.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cheEveAll.setText("All");
        cheEveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheEveAllActionPerformed(evt);
            }
        });

        chkbxeMondayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeMondayS1.setText("Sesion1");
        chkbxeMondayS1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkbxeMondayS1StateChanged(evt);
            }
        });

        chkbxeMondayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeMondayS2.setText("Sesion2");

        chkbxeTuesdayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeTuesdayS1.setText("Sesion1");

        chkbxeTuesdayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeTuesdayS2.setText("Sesion2");

        chkbxeWednesdayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeWednesdayS1.setText("Sesion1");

        chkbxeWednesdayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeWednesdayS2.setText("Sesion2");

        chkbxeThursdayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeThursdayS1.setText("Sesion1");

        chkbxeThursdayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeThursdayS2.setText("Sesion2");

        chkbxeFridayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeFridayS1.setText("Sesion1");

        chkbxeFridayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeFridayS2.setText("Sesion2");

        chkbxeSaturdayS1.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeSaturdayS1.setText("Sesion1");

        chkbxeSaturdayS2.setBackground(new java.awt.Color(204, 255, 255));
        chkbxeSaturdayS2.setText("Sesion2");

        javax.swing.GroupLayout plEveningLayout = new javax.swing.GroupLayout(plEvening);
        plEvening.setLayout(plEveningLayout);
        plEveningLayout.setHorizontalGroup(
            plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plEveningLayout.createSequentialGroup()
                .addGroup(plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plEveningLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cheEveAll)
                            .addComponent(chkbxeWednesday)
                            .addComponent(chkbxeTuesday)
                            .addGroup(plEveningLayout.createSequentialGroup()
                                .addGroup(plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkbxeMonday)
                                    .addGroup(plEveningLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(chkbxeMondayS1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkbxeMondayS2))
                            .addGroup(plEveningLayout.createSequentialGroup()
                                .addGroup(plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chkbxeThursday)
                                    .addComponent(chkbxeThursdayS1)
                                    .addComponent(chkbxeWednesdayS1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkbxeThursdayS2)
                                    .addComponent(chkbxeWednesdayS2)))
                            .addGroup(plEveningLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(chkbxeTuesdayS1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkbxeTuesdayS2))
                            .addComponent(chkbxeFriday)
                            .addGroup(plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(chkbxeSaturdayS1)
                                .addComponent(chkbxeSaturday))))
                    .addGroup(plEveningLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(chkbxeFridayS1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkbxeFridayS2))
                    .addGroup(plEveningLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(chkbxeSaturdayS2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        plEveningLayout.setVerticalGroup(
            plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plEveningLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(cheEveAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkbxeMonday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxeMondayS1)
                    .addComponent(chkbxeMondayS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbxeTuesday)
                .addGap(0, 0, 0)
                .addGroup(plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxeTuesdayS1)
                    .addComponent(chkbxeTuesdayS2))
                .addGap(0, 0, 0)
                .addComponent(chkbxeWednesday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxeWednesdayS1)
                    .addComponent(chkbxeWednesdayS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbxeThursday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxeThursdayS1)
                    .addComponent(chkbxeThursdayS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbxeFriday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxeFridayS1)
                    .addComponent(chkbxeFridayS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkbxeSaturday)
                .addGap(0, 0, 0)
                .addGroup(plEveningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxeSaturdayS1)
                    .addComponent(chkbxeSaturdayS2))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addComponent(plMoring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(plAfternon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(plEvening, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plEvening, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plAfternon, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plMoring, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnNew)
                                .addGap(30, 30, 30)
                                .addComponent(btnAdd)))))
                .addGap(38, 38, 38))
        );

        lblTeacherID.setText("TeacherName");

        lblSemester.setText("Semster");

        lblTeacherName.setText("TeacherName");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTeacherID)
                .addGap(18, 18, 18)
                .addComponent(lblSemester)
                .addGap(18, 18, 18)
                .addComponent(lblTeacherName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTeacherID)
                        .addComponent(lblSemester)
                        .addComponent(lblTeacherName)))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboTeacherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTeacherNameActionPerformed
   
    }//GEN-LAST:event_cboTeacherNameActionPerformed

    private void chkbxMorningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxMorningActionPerformed
        //Morning shift
        if(chkbxMorning.isSelected())
        {
            cheMorAll.setEnabled(true);
            chkbxmMonday.setEnabled(true); 
            chkbxmTuesday.setEnabled(true);
            chkbxmWednesday.setEnabled(true);
            chkbxmThursday.setEnabled(true);
            chkbxmFriday.setEnabled(true);
            chkbxmSaturday.setEnabled(true);
        }else{
            cheMorAll.setEnabled(false);
            chkbxmMonday.setEnabled(false);
            chkbxmTuesday.setEnabled(false);
            chkbxmWednesday.setEnabled(false);
            chkbxmThursday.setEnabled(false);
            chkbxmFriday.setEnabled(false);
            chkbxmSaturday.setEnabled(false);
            cheMorAll.setSelected(false);
            chkbxmMonday.setSelected(false);
            chkbxmTuesday.setSelected(false);
            chkbxmWednesday.setSelected(false);
            chkbxmThursday.setSelected(false);
            chkbxmFriday.setSelected(false);
            chkbxmSaturday.setSelected(false);
        }
        semster5to8();
    }//GEN-LAST:event_chkbxMorningActionPerformed

    private void chkbxAfternoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxAfternoonActionPerformed
        
        //Afternoon shift
        if(chkbxAfternoon.isSelected())
        {
            cheAftAll.setEnabled(true);
            chkbxaMonday.setEnabled(true);
            chkbxaTuesday.setEnabled(true);
            chkbxaWednesday.setEnabled(true);
            chkbxaThursday.setEnabled(true);
            chkbxaFriday.setEnabled(true);
            chkbxaSaturday.setEnabled(true);
        }else
        {
            cheAftAll.setEnabled(false);
            chkbxaMonday.setEnabled(false);
            chkbxaTuesday.setEnabled(false);
            chkbxaWednesday.setEnabled(false);
            chkbxaThursday.setEnabled(false);
            chkbxaFriday.setEnabled(false);
            chkbxaSaturday.setEnabled(false);
            cheAftAll.setSelected(false);
            chkbxaMonday.setSelected(false);
            chkbxaTuesday.setSelected(false);
            chkbxaWednesday.setSelected(false);
            chkbxaThursday.setSelected(false);
            chkbxaFriday.setSelected(false);
            chkbxaSaturday.setSelected(false);
        }
        semster5to8();
    }//GEN-LAST:event_chkbxAfternoonActionPerformed

    private void chkbxEveningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxEveningActionPerformed
        
        //Evening Shift
        if(chkbxEvening.isSelected())
        {
            cheEveAll.setEnabled(true);
            chkbxeMonday.setEnabled(true);
            chkbxeTuesday.setEnabled(true);
            chkbxeWednesday.setEnabled(true);
            chkbxeThursday.setEnabled(true);
            chkbxeFriday.setEnabled(true);
            chkbxeSaturday.setEnabled(true);
        }else
        {
            cheEveAll.setEnabled(false);
            chkbxeMonday.setEnabled(false);
            chkbxeTuesday.setEnabled(false);
            chkbxeWednesday.setEnabled(false);
            chkbxeThursday.setEnabled(false);
            chkbxeFriday.setEnabled(false);
            chkbxeSaturday.setEnabled(false);
            cheEveAll.setSelected(false);
            chkbxeMonday.setSelected(false);
            chkbxeTuesday.setSelected(false);
            chkbxeWednesday.setSelected(false);
            chkbxeThursday.setSelected(false);
            chkbxeFriday.setSelected(false);
            chkbxeSaturday.setSelected(false);
        }
        semster5to8();
    }//GEN-LAST:event_chkbxEveningActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            clsCon.getCon().close(); 
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            clsCon.getCon().close(); 
        } catch (SQLException ex) {
            Logger.getLogger(dlgCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    void Insert(String s){
        try {
            String sql = s;
            clsCon.getStmt().executeUpdate(sql);
        } catch (Exception e) {
        }
    }
    void Update(String s){
        try {
                String sql = s;
                clsCon.getStmt().executeUpdate(sql);
            } catch (Exception e) {
            }
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(cboTeacherName.getSelectedItem().equals("--- Select ---"))
            return;
        //////////////////////////////// Add Morning ////////////////////////////
        if(chkbxMorning.isSelected()){
            if(chkbxmMonday.isSelected()){
                if(chkbxmMondayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh001','Da001','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da001' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da001' and SessionID='Ses01'");
                if(chkbxmMondayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh001','Da001','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da001' and SessionID='Ses02'");
                }
                else
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da001' and SessionID='Ses02'");
            }
            if(chkbxmTuesday.isSelected()){
                if(chkbxmTuesdayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh001','Da002','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da002' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da002' and SessionID='Ses01'");
                if(chkbxmTuesdayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh001','Da002','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da002' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da002' and SessionID='Ses02'");
            }
            if(chkbxmWednesday.isSelected()){
                if(chkbxmWednesdayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh001','Da003','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da003' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da003' and SessionID='Ses01'");
                if(chkbxmWednesdayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh001','Da003','Ses02',1)");
                     Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da003' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da003' and SessionID='Ses02'");
            }
            if(chkbxmThursday.isSelected()){
                if(chkbxmThursdayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh001','Da004','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da004' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da004' and SessionID='Ses01'");
                if(chkbxmThursdayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh001','Da004','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da004' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da004' and SessionID='Ses02'");
            }
            if(chkbxmFriday.isSelected()){
                if(chkbxmFridayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh001','Da005','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da005' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da005' and SessionID='Ses01'");
                if(chkbxmFridayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh001','Da005','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da005' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da005' and SessionID='Ses02'");
            }
            if(chkbxmSaturday.isSelected()){
                if(chkbxmSaturdayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh001','Da006','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da006' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da006' and SessionID='Ses01'");
                if(chkbxmSaturdayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh001','Da006','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da006' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh001' and DayID='Da006' and SessionID='Ses02'");
            }
        }
        //////////////////////////////// Add Afternoon ////////////////////////////
        if(chkbxAfternoon.isSelected()){
            if(chkbxaMonday.isSelected()){
                if(chkbxaMondayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh002','Da001','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da001' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da001' and SessionID='Ses01'");
                if(chkbxaMondayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh002','Da001','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da001' and SessionID='Ses02'");
                }
                else
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da001' and SessionID='Ses02'");
            }
            if(chkbxaTuesday.isSelected()){
                if(chkbxaTuesdayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh002','Da002','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da002' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da002' and SessionID='Ses01'");
                if(chkbxaTuesdayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh002','Da002','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da002' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da002' and SessionID='Ses02'");
            }
            if(chkbxaWednesday.isSelected()){
                if(chkbxaWednesdayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh002','Da003','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da003' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da003' and SessionID='Ses01'");
                if(chkbxaWednesdayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh002','Da003','Ses02',1)");
                     Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da003' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da003' and SessionID='Ses02'");
            }
            if(chkbxaThursday.isSelected()){
                if(chkbxaThursdayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh002','Da004','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da004' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da004' and SessionID='Ses01'");
                if(chkbxaThursdayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh002','Da004','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da004' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da004' and SessionID='Ses02'");
            }
            if(chkbxaFriday.isSelected()){
                if(chkbxaFridayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh002','Da005','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da005' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da005' and SessionID='Ses01'");
                if(chkbxaFridayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh002','Da005','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da005' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da005' and SessionID='Ses02'");
            }
            if(chkbxaSaturday.isSelected()){
                if(chkbxaSaturdayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh002','Da006','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da006' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da006' and SessionID='Ses01'");
                if(chkbxaSaturdayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh002','Da006','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da006' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh002' and DayID='Da006' and SessionID='Ses02'");
            }
        }
        //////////////////////////////// Add Evening ////////////////////////////
        if(chkbxEvening.isSelected()){
            if(chkbxeMonday.isSelected()){
                if(chkbxeMondayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh003','Da001','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da001' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da001' and SessionID='Ses01'");
                if(chkbxeMondayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh003','Da001','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da001' and SessionID='Ses02'");
                }
                else
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da001' and SessionID='Ses02'");
            }
            if(chkbxeTuesday.isSelected()){
                if(chkbxeTuesdayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh003','Da002','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da002' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da002' and SessionID='Ses01'");
                if(chkbxeTuesdayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh003','Da002','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da002' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da002' and SessionID='Ses02'");
            }
            if(chkbxeWednesday.isSelected()){
                if(chkbxeWednesdayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh003','Da003','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da003' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da003' and SessionID='Ses01'");
                if(chkbxeWednesdayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh003','Da003','Ses02',1)");
                     Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da003' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da003' and SessionID='Ses02'");
            }
            if(chkbxeThursday.isSelected()){
                if(chkbxeThursdayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh003','Da004','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da004' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da004' and SessionID='Ses01'");
                if(chkbxeThursdayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh003','Da004','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da004' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da004' and SessionID='Ses02'");
            }
            if(chkbxeFriday.isSelected()){
                if(chkbxeFridayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh003','Da005','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da005' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da005' and SessionID='Ses01'");
                if(chkbxeFridayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh003','Da005','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da005' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da005' and SessionID='Ses02'");
            }
            if(chkbxeSaturday.isSelected()){
                if(chkbxeSaturdayS1.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh003','Da006','Ses01',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da006' and SessionID='Ses01'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da006' and SessionID='Ses01'");
                if(chkbxeSaturdayS2.isSelected()){
                    Insert("Insert into tblTeacherTime(TeacherID,ShiftID,DayID,SessionID,Active) values('"+lblTeacherID.getText()+"','Sh003','Da006','Ses02',1)");
                    Update("update tblTeacherTime set Active=1 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da006' and SessionID='Ses02'");
                }
                else                     
                    Update("update tblTeacherTime set Active=0 where TeacherID='"+lblTeacherID.getText()+"' and ShiftID='Sh003' and DayID='Da006' and SessionID='Ses02'");
            }
        }        
        
        JOptionPane.showMessageDialog(this, "This record was saved");
        clear();       
        
        cboTeacherName.setSelectedItem("--- Select ---");
        lblCourse.setVisible(false);
        lblSubject.setVisible(false);
        lblTeacherName.setVisible(false);
        lblTeacherID.setVisible(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clear();   
        
        cboTeacherName.setSelectedItem("--- Select ---");
        lblCourse.setVisible(false);
        lblSubject.setVisible(false);
      //  lblTeacherName.setVisible(false);
        lblTeacherID.setVisible(false);
    }//GEN-LAST:event_btnNewActionPerformed

    private void cheMorAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheMorAllActionPerformed
        //Morning shift
        if(cheMorAll.isSelected())
        {
            chkbxmMonday.setEnabled(false);
            chkbxmTuesday.setEnabled(false);
            chkbxmWednesday.setEnabled(false);
            chkbxmThursday.setEnabled(false);
            chkbxmFriday.setEnabled(false);
            chkbxmSaturday.setEnabled(false);
            
            chkbxmMonday.setSelected(true);      chkbxmMondayS1.setVisible(true);chkbxmMondayS2.setVisible(true);
            chkbxmTuesday.setSelected(true);     chkbxmTuesdayS1.setVisible(true);chkbxmThursdayS2.setVisible(true);
            chkbxmWednesday.setSelected(true);   chkbxmWednesdayS1.setVisible(true);chkbxmWednesdayS2.setVisible(true);
            chkbxmThursday.setSelected(true);    chkbxmThursdayS1.setVisible(true);chkbxmTuesdayS2.setVisible(true);
            chkbxmFriday.setSelected(true);      chkbxmFridayS1.setVisible(true);chkbxmFridayS2.setVisible(true);
            chkbxmSaturday.setSelected(true);    chkbxmSaturdayS1.setVisible(true);chkbxmSaturdayS2.setVisible(true);
        }else{
            chkbxmMonday.setEnabled(true);
            chkbxmTuesday.setEnabled(true);
            chkbxmWednesday.setEnabled(true);
            chkbxmThursday.setEnabled(true);
            chkbxmFriday.setEnabled(true);
            chkbxmSaturday.setEnabled(true);
            
            chkbxmMonday.setSelected(false);      chkbxmMondayS1.setVisible(false);chkbxmMondayS2.setVisible(false);
            chkbxmTuesday.setSelected(false);     chkbxmTuesdayS1.setVisible(false);chkbxmThursdayS2.setVisible(false);
            chkbxmWednesday.setSelected(false);   chkbxmWednesdayS1.setVisible(false);chkbxmWednesdayS2.setVisible(false);
            chkbxmThursday.setSelected(false);    chkbxmThursdayS1.setVisible(false);chkbxmTuesdayS2.setVisible(false);
            chkbxmFriday.setSelected(false);      chkbxmFridayS1.setVisible(false);chkbxmFridayS2.setVisible(false);
            chkbxmSaturday.setSelected(false);    chkbxmSaturdayS1.setVisible(false);chkbxmSaturdayS2.setVisible(false);
        }
        semster5to8();
    }//GEN-LAST:event_cheMorAllActionPerformed

    private void chkbxmMondayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxmMondayActionPerformed
        if(chkbxmMonday.isSelected()){
            chkbxmMondayS1.setVisible(true);chkbxmMondayS2.setVisible(true);
        }
        else
        {
            chkbxmMondayS1.setVisible(false);chkbxmMondayS2.setVisible(false);
            chkbxmMondayS1.setSelected(false);chkbxmMondayS2.setSelected(false);
        }
    }//GEN-LAST:event_chkbxmMondayActionPerformed

    private void chkbxmTuesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxmTuesdayActionPerformed
       if(chkbxmTuesday.isSelected()){
            chkbxmTuesdayS1.setVisible(true);chkbxmTuesdayS2.setVisible(true);
        }
        else
        {
            chkbxmTuesdayS1.setVisible(false);chkbxmTuesdayS2.setVisible(false);
            chkbxmTuesdayS1.setSelected(false);chkbxmTuesdayS2.setSelected(false);
        }
    }//GEN-LAST:event_chkbxmTuesdayActionPerformed

    private void chkbxmWednesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxmWednesdayActionPerformed
        if(chkbxmWednesday.isSelected()){
            chkbxmWednesdayS1.setVisible(true);chkbxmWednesdayS2.setVisible(true);
        }
        else
        {
            chkbxmWednesdayS1.setVisible(false);chkbxmWednesdayS2.setVisible(false);
            chkbxmWednesdayS1.setSelected(false);chkbxmWednesdayS2.setSelected(false);

        }
    }//GEN-LAST:event_chkbxmWednesdayActionPerformed

    private void chkbxmThursdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxmThursdayActionPerformed
        if(chkbxmThursday.isSelected()){
            chkbxmThursdayS1.setVisible(true);chkbxmThursdayS2.setVisible(true);
        }
        else
        {
            chkbxmThursdayS1.setVisible(false);chkbxmThursdayS2.setVisible(false);
            chkbxmThursdayS1.setSelected(false);chkbxmThursdayS2.setSelected(false);

        }
    }//GEN-LAST:event_chkbxmThursdayActionPerformed

    private void chkbxmFridayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxmFridayActionPerformed
        if(chkbxmFriday.isSelected()){
            chkbxmFridayS1.setVisible(true);chkbxmFridayS2.setVisible(true);
        }
        else
        {
           chkbxmFridayS1.setVisible(false);chkbxmFridayS2.setVisible(false);
           chkbxmFridayS1.setSelected(false);chkbxmFridayS2.setSelected(false);
        }
    }//GEN-LAST:event_chkbxmFridayActionPerformed

    private void chkbxmSaturdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxmSaturdayActionPerformed
        if(chkbxmSaturday.isSelected()){
            chkbxmSaturdayS1.setVisible(true);chkbxmSaturdayS2.setVisible(true);
        }
        else
        {
            chkbxmSaturdayS1.setVisible(false);chkbxmSaturdayS2.setVisible(false);
            chkbxmSaturdayS1.setSelected(false);chkbxmSaturdayS2.setSelected(false);

        }
    }//GEN-LAST:event_chkbxmSaturdayActionPerformed

    private void chkbxaMondayS1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkbxaMondayS1StateChanged
       
    }//GEN-LAST:event_chkbxaMondayS1StateChanged

    private void chkbxaMondayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxaMondayActionPerformed
       if(chkbxaMonday.isSelected()){
            chkbxaMondayS1.setVisible(true);chkbxaMondayS2.setVisible(true);
        }
        else
        {
            chkbxaMondayS1.setVisible(false);chkbxaMondayS2.setVisible(false);
            chkbxaMondayS1.setSelected(false);chkbxaMondayS2.setSelected(false);

        }
    }//GEN-LAST:event_chkbxaMondayActionPerformed

    private void chkbxaTuesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxaTuesdayActionPerformed
        if(chkbxaTuesday.isSelected()){
            chkbxaTuesdayS1.setVisible(true);chkbxaTuesdayS2.setVisible(true);
        }
        else
        {
            chkbxaTuesdayS1.setVisible(false);chkbxaTuesdayS2.setVisible(false);
            chkbxaTuesdayS1.setSelected(false);chkbxaTuesdayS2.setSelected(false);
        }
    }//GEN-LAST:event_chkbxaTuesdayActionPerformed

    private void chkbxaWednesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxaWednesdayActionPerformed
        if(chkbxaWednesday.isSelected()){
            chkbxaWednesdayS1.setVisible(true);chkbxaWednesdayS2.setVisible(true);
        }
        else
        {
            chkbxaWednesdayS1.setVisible(false);chkbxaWednesdayS2.setVisible(false);
            chkbxaWednesdayS1.setSelected(false);chkbxaWednesdayS2.setSelected(false);

        }
    }//GEN-LAST:event_chkbxaWednesdayActionPerformed

    private void chkbxaThursdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxaThursdayActionPerformed
        if(chkbxaThursday.isSelected()){
            chkbxaThursdayS1.setVisible(true);chkbxaThursdayS2.setVisible(true);
        }
        else
        {
            chkbxaThursdayS1.setVisible(false);chkbxaThursdayS2.setVisible(false);
            chkbxaThursdayS1.setSelected(false);chkbxaThursdayS2.setSelected(false);
        }
    }//GEN-LAST:event_chkbxaThursdayActionPerformed

    private void chkbxaFridayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxaFridayActionPerformed
        if(chkbxaFriday.isSelected()){
            chkbxaFridayS1.setVisible(true);chkbxaFridayS2.setVisible(true);
        }
        else
        {
            chkbxaFridayS1.setVisible(false);chkbxaFridayS2.setVisible(false);
            chkbxaFridayS1.setSelected(false);chkbxaFridayS2.setSelected(false);
        }
    }//GEN-LAST:event_chkbxaFridayActionPerformed

    private void chkbxaSaturdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxaSaturdayActionPerformed
        if(chkbxaSaturday.isSelected()){
            chkbxaSaturdayS1.setVisible(true);chkbxaSaturdayS2.setVisible(true);
        }
        else
        {
            chkbxaSaturdayS1.setVisible(false);chkbxaSaturdayS2.setVisible(false);
            chkbxaSaturdayS1.setSelected(false);chkbxaSaturdayS2.setSelected(false);
        }
    }//GEN-LAST:event_chkbxaSaturdayActionPerformed

    private void cheAftAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheAftAllActionPerformed
       //Afternoon shift
        if(cheAftAll.isSelected())
        {
            chkbxaMonday.setEnabled(false);
            chkbxaTuesday.setEnabled(false);
            chkbxaWednesday.setEnabled(false);
            chkbxaThursday.setEnabled(false);
            chkbxaFriday.setEnabled(false);
            chkbxaSaturday.setEnabled(false);
            
            chkbxaMonday.setSelected(true);      chkbxaMondayS1.setVisible(true);chkbxaMondayS2.setVisible(true);
            chkbxaTuesday.setSelected(true);     chkbxaTuesdayS1.setVisible(true);chkbxaThursdayS2.setVisible(true);
            chkbxaWednesday.setSelected(true);   chkbxaWednesdayS1.setVisible(true);chkbxaWednesdayS2.setVisible(true);
            chkbxaThursday.setSelected(true);    chkbxaThursdayS1.setVisible(true);chkbxaTuesdayS2.setVisible(true);
            chkbxaFriday.setSelected(true);      chkbxaFridayS1.setVisible(true);chkbxaFridayS2.setVisible(true);
            chkbxaSaturday.setSelected(true);    chkbxaSaturdayS1.setVisible(true);chkbxaSaturdayS2.setVisible(true);
        }else{
            chkbxaMonday.setEnabled(true);
            chkbxaTuesday.setEnabled(true);
            chkbxaWednesday.setEnabled(true);
            chkbxaThursday.setEnabled(true);
            chkbxaFriday.setEnabled(true);
            chkbxaSaturday.setEnabled(true);
            
            chkbxaMonday.setSelected(false);      chkbxaMondayS1.setVisible(false);chkbxaMondayS2.setVisible(false);
            chkbxaTuesday.setSelected(false);     chkbxaTuesdayS1.setVisible(false);chkbxaThursdayS2.setVisible(false);
            chkbxaWednesday.setSelected(false);   chkbxaWednesdayS1.setVisible(false);chkbxaWednesdayS2.setVisible(false);
            chkbxaThursday.setSelected(false);    chkbxaThursdayS1.setVisible(false);chkbxaTuesdayS2.setVisible(false);
            chkbxaFriday.setSelected(false);      chkbxaFridayS1.setVisible(false);chkbxaFridayS2.setVisible(false);
            chkbxaSaturday.setSelected(false);    chkbxaSaturdayS1.setVisible(false);chkbxaSaturdayS2.setVisible(false);
        }
        semster5to8();
    }//GEN-LAST:event_cheAftAllActionPerformed

    private void chkbxeMondayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxeMondayActionPerformed
        if(chkbxeMonday.isSelected()){
            chkbxeMondayS1.setVisible(true);chkbxeMondayS2.setVisible(true);
        }
        else
        {
           chkbxeMondayS1.setVisible(false);chkbxeMondayS2.setVisible(false);
           chkbxeMondayS1.setSelected(false);chkbxeMondayS2.setSelected(false);
        }
    }//GEN-LAST:event_chkbxeMondayActionPerformed

    private void chkbxeTuesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxeTuesdayActionPerformed
        if(chkbxeTuesday.isSelected()){
            chkbxeTuesdayS1.setVisible(true);chkbxeTuesdayS2.setVisible(true);
        }
        else
        {
            chkbxeTuesdayS1.setVisible(false);chkbxeTuesdayS2.setVisible(false);
            chkbxeTuesdayS1.setSelected(false);chkbxeTuesdayS2.setSelected(false);

        }
    }//GEN-LAST:event_chkbxeTuesdayActionPerformed

    private void chkbxeWednesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxeWednesdayActionPerformed
       if(chkbxeWednesday.isSelected()){
            chkbxeWednesdayS1.setVisible(true);chkbxeWednesdayS2.setVisible(true);
        }
        else
        {
            chkbxeWednesdayS1.setVisible(false);chkbxeWednesdayS2.setVisible(false);
            chkbxeWednesdayS1.setSelected(false);chkbxeWednesdayS2.setSelected(false);
        }
    }//GEN-LAST:event_chkbxeWednesdayActionPerformed

    private void chkbxeThursdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxeThursdayActionPerformed
        if(chkbxeThursday.isSelected()){
            chkbxeThursdayS1.setVisible(true);chkbxeThursdayS2.setVisible(true);
        }
        else
        {
            chkbxeThursdayS1.setVisible(false);chkbxeThursdayS2.setVisible(false);
            chkbxeThursdayS1.setSelected(false);chkbxeThursdayS2.setSelected(false);
        }
    }//GEN-LAST:event_chkbxeThursdayActionPerformed

    private void chkbxeFridayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxeFridayActionPerformed
        if(chkbxeFriday.isSelected()){
            chkbxeFridayS1.setVisible(true);chkbxeFridayS2.setVisible(true);
        }
        else
        {
            chkbxeFridayS1.setVisible(false);chkbxeFridayS2.setVisible(false);
            chkbxeFridayS1.setSelected(false);chkbxeFridayS2.setSelected(false);
        }
    }//GEN-LAST:event_chkbxeFridayActionPerformed

    private void chkbxeSaturdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxeSaturdayActionPerformed
       if(chkbxeSaturday.isSelected()){
            chkbxeSaturdayS1.setVisible(true);chkbxeSaturdayS2.setVisible(true);
        }
        else
        {
            chkbxeSaturdayS1.setVisible(false);chkbxeSaturdayS2.setVisible(false);
            chkbxeSaturdayS1.setSelected(false);chkbxeSaturdayS2.setSelected(false);
        }
    }//GEN-LAST:event_chkbxeSaturdayActionPerformed

    private void cheEveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheEveAllActionPerformed
         //Evening shift
        if(cheEveAll.isSelected())
        {
            chkbxeMonday.setEnabled(false);
            chkbxeTuesday.setEnabled(false);
            chkbxeWednesday.setEnabled(false);
            chkbxeThursday.setEnabled(false);
            chkbxeFriday.setEnabled(false);
            chkbxeSaturday.setEnabled(false);
            
            chkbxeMonday.setSelected(true);      chkbxeMondayS1.setVisible(true);chkbxeMondayS2.setVisible(true);
            chkbxeTuesday.setSelected(true);     chkbxeTuesdayS1.setVisible(true);chkbxeThursdayS2.setVisible(true);
            chkbxeWednesday.setSelected(true);   chkbxeWednesdayS1.setVisible(true);chkbxeWednesdayS2.setVisible(true);
            chkbxeThursday.setSelected(true);    chkbxeThursdayS1.setVisible(true);chkbxeTuesdayS2.setVisible(true);
            chkbxeFriday.setSelected(true);      chkbxeFridayS1.setVisible(true);chkbxeFridayS2.setVisible(true);
            chkbxeSaturday.setSelected(true);    chkbxeSaturdayS1.setVisible(true);chkbxeSaturdayS2.setVisible(true);
        }else{
            chkbxeMonday.setEnabled(true);
            chkbxeTuesday.setEnabled(true);
            chkbxeWednesday.setEnabled(true);
            chkbxeThursday.setEnabled(true);
            chkbxeFriday.setEnabled(true);
            chkbxeSaturday.setEnabled(true);
            
            chkbxeMonday.setSelected(false);      chkbxeMondayS1.setVisible(false);chkbxeMondayS2.setVisible(false);
            chkbxeTuesday.setSelected(false);     chkbxeTuesdayS1.setVisible(false);chkbxeThursdayS2.setVisible(false);
            chkbxeWednesday.setSelected(false);   chkbxeWednesdayS1.setVisible(false);chkbxeWednesdayS2.setVisible(false);
            chkbxeThursday.setSelected(false);    chkbxeThursdayS1.setVisible(false);chkbxeTuesdayS2.setVisible(false);
            chkbxeFriday.setSelected(false);      chkbxeFridayS1.setVisible(false);chkbxeFridayS2.setVisible(false);
            chkbxeSaturday.setSelected(false);    chkbxeSaturdayS1.setVisible(false);chkbxeSaturdayS2.setVisible(false);
        }
        semster5to8();
    }//GEN-LAST:event_cheEveAllActionPerformed

    private void chkbxeMondayS1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkbxeMondayS1StateChanged
        if(chkbxeMonday.isSelected()){
            chkbxeMondayS1.setVisible(true);chkbxeMondayS2.setVisible(true);
        }
        else
        {
            chkbxeMondayS1.setVisible(false);chkbxeMondayS2.setVisible(false);
            chkbxeMondayS1.setSelected(false);chkbxeMondayS2.setSelected(false);
        }
    }//GEN-LAST:event_chkbxeMondayS1StateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dlgChooseTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgChooseTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgChooseTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgChooseTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgChooseTeacher dialog = new dlgChooseTeacher(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                        try {
                            clsCon.getCon().close();
                        } catch (SQLException ex) {
                        }
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox<String> cboTeacherName;
    private javax.swing.JCheckBox cheAftAll;
    private javax.swing.JCheckBox cheEveAll;
    private javax.swing.JCheckBox cheMorAll;
    private javax.swing.JCheckBox chkbxAfternoon;
    private javax.swing.JCheckBox chkbxEvening;
    private javax.swing.JCheckBox chkbxMorning;
    private javax.swing.JCheckBox chkbxaFriday;
    private javax.swing.JCheckBox chkbxaFridayS1;
    private javax.swing.JCheckBox chkbxaFridayS2;
    private javax.swing.JCheckBox chkbxaMonday;
    private javax.swing.JCheckBox chkbxaMondayS1;
    private javax.swing.JCheckBox chkbxaMondayS2;
    private javax.swing.JCheckBox chkbxaSaturday;
    private javax.swing.JCheckBox chkbxaSaturdayS1;
    private javax.swing.JCheckBox chkbxaSaturdayS2;
    private javax.swing.JCheckBox chkbxaThursday;
    private javax.swing.JCheckBox chkbxaThursdayS1;
    private javax.swing.JCheckBox chkbxaThursdayS2;
    private javax.swing.JCheckBox chkbxaTuesday;
    private javax.swing.JCheckBox chkbxaTuesdayS1;
    private javax.swing.JCheckBox chkbxaTuesdayS2;
    private javax.swing.JCheckBox chkbxaWednesday;
    private javax.swing.JCheckBox chkbxaWednesdayS1;
    private javax.swing.JCheckBox chkbxaWednesdayS2;
    private javax.swing.JCheckBox chkbxeFriday;
    private javax.swing.JCheckBox chkbxeFridayS1;
    private javax.swing.JCheckBox chkbxeFridayS2;
    private javax.swing.JCheckBox chkbxeMonday;
    private javax.swing.JCheckBox chkbxeMondayS1;
    private javax.swing.JCheckBox chkbxeMondayS2;
    private javax.swing.JCheckBox chkbxeSaturday;
    private javax.swing.JCheckBox chkbxeSaturdayS1;
    private javax.swing.JCheckBox chkbxeSaturdayS2;
    private javax.swing.JCheckBox chkbxeThursday;
    private javax.swing.JCheckBox chkbxeThursdayS1;
    private javax.swing.JCheckBox chkbxeThursdayS2;
    private javax.swing.JCheckBox chkbxeTuesday;
    private javax.swing.JCheckBox chkbxeTuesdayS1;
    private javax.swing.JCheckBox chkbxeTuesdayS2;
    private javax.swing.JCheckBox chkbxeWednesday;
    private javax.swing.JCheckBox chkbxeWednesdayS1;
    private javax.swing.JCheckBox chkbxeWednesdayS2;
    private javax.swing.JCheckBox chkbxmFriday;
    private javax.swing.JCheckBox chkbxmFridayS1;
    private javax.swing.JCheckBox chkbxmFridayS2;
    private javax.swing.JCheckBox chkbxmMonday;
    private javax.swing.JCheckBox chkbxmMondayS1;
    private javax.swing.JCheckBox chkbxmMondayS2;
    private javax.swing.JCheckBox chkbxmSaturday;
    private javax.swing.JCheckBox chkbxmSaturdayS1;
    private javax.swing.JCheckBox chkbxmSaturdayS2;
    private javax.swing.JCheckBox chkbxmThursday;
    private javax.swing.JCheckBox chkbxmThursdayS1;
    private javax.swing.JCheckBox chkbxmThursdayS2;
    private javax.swing.JCheckBox chkbxmTuesday;
    private javax.swing.JCheckBox chkbxmTuesdayS1;
    private javax.swing.JCheckBox chkbxmTuesdayS2;
    private javax.swing.JCheckBox chkbxmWednesday;
    private javax.swing.JCheckBox chkbxmWednesdayS1;
    private javax.swing.JCheckBox chkbxmWednesdayS2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel lblTeacherID;
    private javax.swing.JLabel lblTeacherName;
    private javax.swing.JPanel plAfternon;
    private javax.swing.JPanel plEvening;
    private javax.swing.JPanel plMoring;
    // End of variables declaration//GEN-END:variables
}
