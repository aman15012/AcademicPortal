import java.awt.event.*;
import com.bulenkov.darcula.DarculaLaf;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicLookAndFeel;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Thu Apr 13 15:58:18 IST 2017
 */



/**
 * @author Varnit Jain 2015112
 * @author Aman Agarwal 2015012
 */


public class DbmsProject {

    public int panelNo;
    public int qNo;
    public int aNo;
    public String sName;
    public String sBatch;
    public String sRollno;
    public String sEmail;
    public String sStream;
    public float sCGPA;
    public String iInst_id;
    public String iName;
    public String iEmail;
    public int iOffice_hours_start;
    public int iOffice_hours_end;
    public String iOffice_day;
    public String iOffice_room;
    public String taName;
    public String taRollno;
    public String taCourse_id;
    public int taOffice_hours_start;
    public int taOffice_hours_end;
    public String taOffice_day;
    public String cCourse_name;
    public String cCourse_id;
    public String cCourse_type;
    public String cInst_id;
    public String cRecommended_books;
    public String ttCourse_id;
    public String ttDay;
    public int ttStart_time;
    public int ttEnd_time;
    public int ttNext_time;
    public String ttRoom;
    public String cdCourse_id;
    public String cdTopic;
    public String cdDate;
    public int cdTime;
    public String rRollno;
    public String rCourse_id;
    public int rGrade;
    public String login;
    public String password;
    public String[][] mainGrid = new String[][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
    };
    public String[] mainHead = new String[] {
            ".",".",".","."
    };
    public String[][] mainGrid2 = new String[][] {
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
    };
    public String[] mainHead2 = new String[] {
            ".",".",".",".",".",".","."
    };


    public String[][] mainResultSet=null;



    DefaultTableModel tableMod = new DefaultTableModel(
            mainGrid,mainHead

    );

    DefaultTableModel tableMod2 = new DefaultTableModel(
            mainGrid2,mainHead2

    );


    public String resultType="";
    public int pageNo=0;
    public int count;

    public void displayShit(){

        //System.out.println("inside shit");

        if(resultType.equals("a1")){

            tablereset();
            String[] mainHead21 = new String[] {
                    "UserName", "Password", "", "", "", "", ""
            };
            tableMod2.setColumnIdentifiers(mainHead21);
            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    String username = temp[0];
                    String password = temp[1];


                    //System.out.print(name+rollNo+cgpa+email+stream);
                    ////System.out.println(", rollNo: " + rollNo);


                    tableMod2.setValueAt(username,i-pageNo*10,0);
                    tableMod2.setValueAt(password,i-pageNo*10,1);
                    tableMod2.setValueAt(null,i-pageNo*10,2);
                    tableMod2.setValueAt(null,i-pageNo*10,3);
                    tableMod2.setValueAt(null,i-pageNo*10,4);
                    tableMod2.setValueAt(null,i-pageNo*10,5);
                    tableMod2.setValueAt(null,i-pageNo*10,6);




                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("a2")){

            //System.out.println("shitty a2");

            tablereset();
            String[] mainHead22 = new String[] {
                    "Name", "RollNo", "CGPA", "Email", "Stream", "", ""
            };
            tableMod2.setColumnIdentifiers(mainHead22);

            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    String name = temp[0];
                    String rollNo = temp[1];
                    String cgpa = temp[2];
                    String email = temp[3];
                    String stream = temp[4];


                    //System.out.print(name+rollNo+cgpa+email+stream);
                    ////System.out.println(", rollNo: " + rollNo);


                    tableMod2.setValueAt(name,i-pageNo*10,0);
                    tableMod2.setValueAt(rollNo,i-pageNo*10,1);
                    tableMod2.setValueAt(cgpa,i-pageNo*10,2);
                    tableMod2.setValueAt(email,i-pageNo*10,3);
                    tableMod2.setValueAt(stream,i-pageNo*10,4);
                    tableMod2.setValueAt(null,i-pageNo*10,5);
                    tableMod2.setValueAt(null,i-pageNo*10,6);




                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }
        else if(resultType.equals("a3")){

            //System.out.println("shitty a2");

            tablereset();
            String[] mainHead23 = new String[] {
                    "InstructorId", "Name", "Email", "OfficeStart", "OfficeEnd", "OfficeDay", ""
            };
            tableMod2.setColumnIdentifiers(mainHead23);

            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    String instructorId = temp[0];
                    String name = temp[1];
                    String email = temp[2];
                    String officeStart = temp[3];
                    String officeEnd = temp[4];
                    String OfficeDay = temp[5];


                    //System.out.print(name+rollNo+cgpa+email+stream);
                    ////System.out.println(", rollNo: " + rollNo);


                    tableMod2.setValueAt(instructorId,i-pageNo*10,0);
                    tableMod2.setValueAt(name,i-pageNo*10,1);
                    tableMod2.setValueAt(email,i-pageNo*10,2);
                    tableMod2.setValueAt(officeStart,i-pageNo*10,3);
                    tableMod2.setValueAt(officeEnd,i-pageNo*10,4);
                    tableMod2.setValueAt(OfficeDay,i-pageNo*10,5);
                    tableMod2.setValueAt(null,i-pageNo*10,6);




                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("a4")){

            tablereset();

            String[] mainHead24 = new String[] {
                    "Name", "RollNo", "CourseId", "OfficeStart", "OfficeEnd", "OfficeDay", ""
            };
            tableMod2.setColumnIdentifiers(mainHead24);
            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    String name = temp[0];
                    String rollNo = temp[1];
                    String courseId = temp[2];
                    String officeStart = temp[3];
                    String officeEnd = temp[4];
                    String OfficeDay = temp[5];


                    //System.out.print(name+rollNo+cgpa+email+stream);
                    ////System.out.println(", rollNo: " + rollNo);


                    tableMod2.setValueAt(name,i-pageNo*10,0);
                    tableMod2.setValueAt(rollNo,i-pageNo*10,1);
                    tableMod2.setValueAt(courseId,i-pageNo*10,2);
                    tableMod2.setValueAt(officeStart,i-pageNo*10,3);
                    tableMod2.setValueAt(officeEnd,i-pageNo*10,4);
                    tableMod2.setValueAt(OfficeDay,i-pageNo*10,5);
                    tableMod2.setValueAt(null,i-pageNo*10,6);




                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("a5")){

            tablereset();

            String[] mainHead25 = new String[] {
                    "CourseName", "CourseId", "CourseType", "InstructorId", "RecommendedBooks", "", ""
            };
            tableMod2.setColumnIdentifiers(mainHead25);
            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    String courseName = temp[0];
                    String courseId = temp[1];
                    String courseType = temp[2];
                    String instructorId = temp[3];
                    String recommendedBooks = temp[4];


                    //System.out.print(name+rollNo+cgpa+email+stream);
                    ////System.out.println(", rollNo: " + rollNo);


                    tableMod2.setValueAt(courseName,i-pageNo*10,0);
                    tableMod2.setValueAt(courseId,i-pageNo*10,1);
                    tableMod2.setValueAt(courseId,i-pageNo*10,2);
                    tableMod2.setValueAt(courseType,i-pageNo*10,3);
                    tableMod2.setValueAt(instructorId,i-pageNo*10,4);
                    tableMod2.setValueAt(recommendedBooks,i-pageNo*10,5);
                    tableMod2.setValueAt(null,i-pageNo*10,6);




                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("a6")){


            tablereset();
            String[] mainHead26 = new String[] {
                    "RollNo", "CourseId", "Grade", "Semester", "", "", ""
            };
            tableMod2.setColumnIdentifiers(mainHead26);

            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    String rollNo = temp[0];
                    String courseId = temp[1];
                    String grade = temp[2];
                    String semester = temp[3];


                    //System.out.print(name+rollNo+cgpa+email+stream);
                    ////System.out.println(", rollNo: " + rollNo);


                    tableMod2.setValueAt(rollNo,i-pageNo*10,0);
                    tableMod2.setValueAt(courseId,i-pageNo*10,1);
                    tableMod2.setValueAt(grade,i-pageNo*10,2);
                    tableMod2.setValueAt(semester,i-pageNo*10,3);
                    tableMod2.setValueAt(null,i-pageNo*10,4);
                    tableMod2.setValueAt(null,i-pageNo*10,5);
                    tableMod2.setValueAt(null,i-pageNo*10,6);




                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("a7")){

            tablereset();

            String[] mainHead27 = new String[] {
                    "CourseId", "Day", "StartTime", "EndTime", "Room", "NextClass", ""
            };
            tableMod2.setColumnIdentifiers(mainHead27);

            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    String courseId = temp[0];
                    String day = temp[1];
                    String startTime= temp[2];
                    String endTime = temp[3];
                    String room = temp[4];
                    String nextTime = temp[5];


                    //System.out.print(name+rollNo+cgpa+email+stream);
                    ////System.out.println(", rollNo: " + rollNo);


                    tableMod2.setValueAt(courseId,i-pageNo*10,0);
                    tableMod2.setValueAt(day,i-pageNo*10,1);
                    tableMod2.setValueAt(startTime,i-pageNo*10,2);
                    tableMod2.setValueAt(endTime,i-pageNo*10,3);
                    tableMod2.setValueAt(room,i-pageNo*10,4);
                    tableMod2.setValueAt(nextTime,i-pageNo*10,5);
                    tableMod2.setValueAt(null,i-pageNo*10,6);




                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("a8")){


            tablereset();
            String[] mainHead28 = new String[] {
                    "CourseId", "Topic", "Date", "Time", "", "", ""
            };
            tableMod2.setColumnIdentifiers(mainHead28);

            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    String courseId = temp[0];
                    String topic = temp[1];
                    String date= temp[2];
                    String time = temp[3];


                    //System.out.print(name+rollNo+cgpa+email+stream);
                    ////System.out.println(", rollNo: " + rollNo);


                    tableMod2.setValueAt(courseId,i-pageNo*10,0);
                    tableMod2.setValueAt(topic,i-pageNo*10,1);
                    tableMod2.setValueAt(date,i-pageNo*10,2);
                    tableMod2.setValueAt(time,i-pageNo*10,3);
                    tableMod2.setValueAt(null,i-pageNo*10,4);
                    tableMod2.setValueAt(null,i-pageNo*10,5);
                    tableMod2.setValueAt(null,i-pageNo*10,6);




                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("q1")){


            tablereset();
            //System.out.println("q1 shit");
            String[] mainHead11 = new String[] {
                    "Name", "RollNo", "", ""
            };
            tableMod.setColumnIdentifiers(mainHead11);

            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    tableMod.setValueAt(temp[0],i-pageNo*10,0);
                    tableMod.setValueAt(temp[1],i-pageNo*10,1);
                    tableMod.setValueAt(null,i-pageNo*10,2);
                    tableMod.setValueAt(null,i-pageNo*10,3);


                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("q2")){

            tablereset();

            String[] mainHead12 = new String[] {
                    "CourseName", "Time", "", ""
            };
            tableMod.setColumnIdentifiers(mainHead12);

            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    tableMod.setValueAt(temp[0],i-pageNo*10,0);
                    tableMod.setValueAt(temp[1],i-pageNo*10,1);
                    tableMod.setValueAt(null,i-pageNo*10,2);
                    tableMod.setValueAt(null,i-pageNo*10,3);


                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("q3")){

            tablereset();
            String[] mainHead13 = new String[] {
                    "AverageGrade", "", "", ""
            };
            tableMod.setColumnIdentifiers(mainHead13);


            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    tableMod.setValueAt(temp[0],i-pageNo*10,0);
                    tableMod.setValueAt(null,i-pageNo*10,1);
                    tableMod.setValueAt(null,i-pageNo*10,2);
                    tableMod.setValueAt(null,i-pageNo*10,3);


                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("q4")){

            tablereset();

            String[] mainHead14 = new String[] {
                    "OfficeTime", "Name", "RollNo", ""
            };
            tableMod.setColumnIdentifiers(mainHead14);

            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    tableMod.setValueAt(temp[0],i-pageNo*10,0);
                    tableMod.setValueAt(temp[1],i-pageNo*10,1);
                    tableMod.setValueAt(temp[2],i-pageNo*10,2);
                    tableMod.setValueAt(null,i-pageNo*10,3);


                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("q5")){

            tablereset();

            String[] mainHead15 = new String[] {
                    "Name", "", "", ""
            };
            tableMod.setColumnIdentifiers(mainHead15);

            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    tableMod.setValueAt(temp[0],i-pageNo*10,0);
                    tableMod.setValueAt(null,i-pageNo*10,1);
                    tableMod.setValueAt(null,i-pageNo*10,2);
                    tableMod.setValueAt(null,i-pageNo*10,3);


                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("q6")){

            tablereset();

            String[] mainHead16 = new String[] {
                    "Room", "StartTime", "EndTime", ""
            };
            tableMod.setColumnIdentifiers(mainHead16);

            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    tableMod.setValueAt(temp[0],i-pageNo*10,0);
                    tableMod.setValueAt(temp[1],i-pageNo*10,1);
                    tableMod.setValueAt(temp[2],i-pageNo*10,2);
                    tableMod.setValueAt(null,i-pageNo*10,3);


                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("q7")){

            tablereset();


            String[] mainHead17 = new String[] {
                    "CourseId", "Difficulty(10)", "", ""
            };
            tableMod.setColumnIdentifiers(mainHead17);
            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    tableMod.setValueAt(temp[0],i-pageNo*10,0);
                    tableMod.setValueAt(temp[1],i-pageNo*10,1);
                    tableMod.setValueAt(null,i-pageNo*10,2);
                    tableMod.setValueAt(null,i-pageNo*10,3);


                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("q8")){

            tablereset();
            String[] mainHead18 = new String[] {
                    "Name", "RollNo", "", ""
            };
            tableMod.setColumnIdentifiers(mainHead18);

            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    tableMod.setValueAt(temp[0],i-pageNo*10,0);
                    tableMod.setValueAt(temp[1],i-pageNo*10,1);
                    tableMod.setValueAt(temp[2],i-pageNo*10,2);
                    tableMod.setValueAt(null,i-pageNo*10,3);


                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("q9")){

            tablereset();
            String[] mainHead19 = new String[] {
                    "Name", "RollNo", "", ""
            };
            tableMod.setColumnIdentifiers(mainHead19);


            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    tableMod.setValueAt(temp[0],i-pageNo*10,0);
                    tableMod.setValueAt(temp[1],i-pageNo*10,1);
                    tableMod.setValueAt(null,i-pageNo*10,2);
                    tableMod.setValueAt(null,i-pageNo*10,3);


                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }else if(resultType.equals("q10")){

            tablereset();

            String[] mainHead110 = new String[] {
                    "Day", "Room", "From", "To"
            };
            tableMod.setColumnIdentifiers(mainHead110);

            for(int i=pageNo*10;i<(pageNo+1)*10 && i<count;i++){

                try{

                    String temp[] = mainResultSet[i];


                    tableMod.setValueAt(temp[0],i-pageNo*10,0);
                    tableMod.setValueAt(temp[1],i-pageNo*10,1);
                    tableMod.setValueAt(temp[2],i-pageNo*10,2);
                    tableMod.setValueAt(temp[3],i-pageNo*10,3);


                }catch(Exception e){
                    e.printStackTrace();
                }



            }

        }

    }

    public void tablereset(){
        for(int i=0;i<10;i++){
            String[] mainHead = new String[] {
                    ".",".",".","."
            };
            tableMod.setColumnIdentifiers(mainHead);
            tableMod.setValueAt(null,i,0);
            tableMod.setValueAt(null,i,1);
            tableMod.setValueAt(null,i,2);
            tableMod.setValueAt(null,i,3);
            String[] mainHead2 = new String[] {
                    ".",".",".",".",".",".","."
            };
            tableMod2.setColumnIdentifiers(mainHead2);

            tableMod2.setValueAt(null,i,0);
            tableMod2.setValueAt(null,i,1);
            tableMod2.setValueAt(null,i,2);
            tableMod2.setValueAt(null,i,3);
            tableMod2.setValueAt(null,i,4);
            tableMod2.setValueAt(null,i,5);
            tableMod2.setValueAt(null,i,6);

        }
    }


    public DbmsProject() {
        initComponents();
    }

    private void falseallq(){
        buttonp11.setSelected(false);
        buttonp12.setSelected(false);
        buttonp13.setSelected(false);
        buttonp14.setSelected(false);
        buttonp15.setSelected(false);
        buttonp16.setSelected(false);
        buttonp17.setSelected(false);
        buttonp18.setSelected(false);
        buttonp19.setSelected(false);
        buttonp20.setSelected(false);

    }

    private void buttonp11ActionPerformed(ActionEvent e) {
        panelNo=1;
        qNo=1;
        panelq1.setVisible(true);
        panelq2.setVisible(false);panelq3.setVisible(false);panelq4.setVisible(false);panelq5.setVisible(false);panelq6.setVisible(false);panelq7.setVisible(false);panelq8.setVisible(false);panelq9.setVisible(false);panelq10.setVisible(false);
        panelp1def.setVisible(false);
        textFieldq1inid.setText("Eg.I205");
        comboBoxq1batch.setSelectedIndex(0);
        //System.out.println("q1b");
        falseallq();
        buttonp11.setSelected(true);
        tablereset();
        tablep1 = new JTable();// reset table some other way
    }

    private void buttonp12ActionPerformed(ActionEvent e) {
        panelNo=1;
        qNo=2;
        panelq2.setVisible(true);
        panelq1.setVisible(false);panelq3.setVisible(false);panelq4.setVisible(false);panelq5.setVisible(false);panelq6.setVisible(false);panelq7.setVisible(false);panelq8.setVisible(false);panelq9.setVisible(false);panelq10.setVisible(false);
        panelp1def.setVisible(false);
        textFieldq2rollno.setText("Eg.2015012");
        textFieldq2date.setText("DD/MM/YYYY");
        //System.out.println("q2b");
        falseallq();
        buttonp12.setSelected(true);
        tablereset();
        tablep1 = new JTable();// reset table some other way
    }

    private void buttonp13ActionPerformed(ActionEvent e) {
        panelNo=1;
        qNo=3;
        panelq3.setVisible(true);
        panelq1.setVisible(false);panelq2.setVisible(false);panelq4.setVisible(false);panelq5.setVisible(false);panelq6.setVisible(false);panelq7.setVisible(false);panelq8.setVisible(false);panelq9.setVisible(false);panelq10.setVisible(false);
        panelp1def.setVisible(false);
        textFieldq3inod.setText("Eg.I205");
        //System.out.println("q3b");
        falseallq();
        buttonp13.setSelected(true);
        tablereset();
        tablep1 = new JTable();// reset table some other way
    }

    private void buttonp14ActionPerformed(ActionEvent e) {
        panelNo=1;
        qNo=4;
        panelq4.setVisible(true);
        panelq1.setVisible(false);panelq2.setVisible(false);panelq3.setVisible(false);panelq5.setVisible(false);panelq6.setVisible(false);panelq7.setVisible(false);panelq8.setVisible(false);panelq9.setVisible(false);panelq10.setVisible(false);
        panelp1def.setVisible(false);
        textFieldq4rollno.setText("Eg.2015012");
        textFieldq4cid.setText("Eg.CSE101");
        //System.out.println("q4b");
        falseallq();
        buttonp14.setSelected(true);
        tablereset();
        tablep1 = new JTable();// reset table some other way
    }

    private void buttonp15ActionPerformed(ActionEvent e) {
        panelNo=1;
        qNo=5;
        panelq5.setVisible(true);
        panelq1.setVisible(false);panelq3.setVisible(false);panelq4.setVisible(false);panelq2.setVisible(false);panelq6.setVisible(false);panelq7.setVisible(false);panelq8.setVisible(false);panelq9.setVisible(false);panelq10.setVisible(false);
        panelp1def.setVisible(false);
        textFieldq5inid.setText("Eg.I205");
        //System.out.println("q5b");
        falseallq();
        buttonp15.setSelected(true);
        tablereset();
        tablep1 = new JTable();// reset table some other way
    }

    private void buttonp16ActionPerformed(ActionEvent e) {
        panelNo=1;
        qNo=6;
        panelq6.setVisible(true);
        panelq1.setVisible(false);panelq3.setVisible(false);panelq4.setVisible(false);panelq5.setVisible(false);panelq2.setVisible(false);panelq7.setVisible(false);panelq8.setVisible(false);panelq9.setVisible(false);panelq10.setVisible(false);
        panelp1def.setVisible(false);
        comboBoxq6day.getSelectedItem().toString();
        textFieldq6time.setText("Eg.1200");
        //System.out.println("q6b");
        falseallq();
        buttonp16.setSelected(true);
        tablereset();
        tablep1 = new JTable();// reset table some other way
    }

    private void buttonp17ActionPerformed(ActionEvent e) {
        panelNo=1;
        qNo=7;
        panelq7.setVisible(true);
        panelq1.setVisible(false);panelq3.setVisible(false);panelq4.setVisible(false);panelq5.setVisible(false);panelq6.setVisible(false);panelq2.setVisible(false);panelq8.setVisible(false);panelq9.setVisible(false);panelq10.setVisible(false);
        panelp1def.setVisible(false);
        textFieldq7rollno.setText("Eg.2015012");
        //System.out.println("q7b");
        falseallq();
        buttonp17.setSelected(true);
        tablereset();
        tablep1 = new JTable();// reset table some other way
    }

    private void buttonp18ActionPerformed(ActionEvent e) {
        panelNo=1;
        qNo=8;
        panelq8.setVisible(true);
        panelq1.setVisible(false);panelq3.setVisible(false);panelq4.setVisible(false);panelq5.setVisible(false);panelq6.setVisible(false);panelq7.setVisible(false);panelq2.setVisible(false);panelq9.setVisible(false);panelq10.setVisible(false);
        panelp1def.setVisible(false);
        comboBoxq8batch.setSelectedIndex(0);
        comboBoxq8stream.setSelectedIndex(0);
        //System.out.println("q8b");
        falseallq();
        buttonp18.setSelected(true);
        tablereset();
        tablep1 = new JTable();// reset table some other way
    }

    private void buttonp19ActionPerformed(ActionEvent e) {
        panelNo=1;
        qNo=9;
        panelq9.setVisible(true);
        panelq1.setVisible(false);panelq3.setVisible(false);panelq4.setVisible(false);panelq5.setVisible(false);panelq6.setVisible(false);panelq7.setVisible(false);panelq8.setVisible(false);panelq2.setVisible(false);panelq10.setVisible(false);
        panelp1def.setVisible(false);
        comboBoxq9batch.setSelectedIndex(0);
        comboBoxq9stream.setSelectedIndex(0);
        //System.out.println("q9b");
        falseallq();
        buttonp19.setSelected(true);
        tablereset();
        tablep1 = new JTable();// reset table some other way
    }

    private void buttonp20ActionPerformed(ActionEvent e) {
        panelNo=1;
        qNo=2;
        panelq10.setVisible(true);
        panelq1.setVisible(false);panelq3.setVisible(false);panelq4.setVisible(false);panelq5.setVisible(false);panelq6.setVisible(false);panelq7.setVisible(false);panelq8.setVisible(false);panelq9.setVisible(false);panelq2.setVisible(false);
        panelp1def.setVisible(false);
        textFieldq10courseid.setText("Eg.CSE101");
        textFieldq10date.setText("MM/DD/YYYY");
        //System.out.println("q10b");
        falseallq();
        buttonp20.setSelected(true);
        tablereset();
        tablep1 = new JTable();// reset table some other way
    }

    private void buttonq1goActionPerformed(ActionEvent e) {
        iInst_id=textFieldq1inid.getText().toLowerCase();
        sBatch=comboBoxq1batch.getSelectedItem().toString().toLowerCase();
        ////System.out.println("go1"+sBatch+iInst_id);

        try{

            //Query1
            //String instid = "i2";
            //String batch = "2015";

            String query1 = "select student.name, student.rollNo from student " +
                    "where student.rollno in (select rollNo from " +
                    "(select courseId from course where instructorId = \"" + iInst_id + "\") I " +
                    "natural join(select rollNo,courseId from studentReport where " +
                    "studentReport.rollNo like \"" + sBatch + "%\" and semester=\"W17\") SR)";

            ////System.out.println(query1);


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("name");
                temp[1] = res1.getString("rollNo");


                mainResultSet[count]=temp;

                //System.out.println(temp[0]+temp[1]);

                count++;
            }

            ////System.out.println(count);



            resultType="q1";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }


        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }

    }

    private void buttonq2goActionPerformed(ActionEvent e) {
        sRollno=textFieldq2rollno.getText().toLowerCase();
        cdDate=textFieldq2date.getText().toLowerCase();
        ////System.out.println("go2"+sRollno+cdDate);

        try{

            //Query1
            //String instid = "i2";
            //String batch = "2015";

            String query1 = "Select courseName,time from course \n" +
                    "natural join\n" +
                    "(select courseId from studentReport where rollNo = " + sRollno +" and semester=\"W17\") SR\n" +
                    "natural join \n" +
                    "(select deadlines.courseId,deadlines.time from deadlines where deadlines.date = \""+cdDate+"\"\n" +
                    ") D";

            ////System.out.println(query1);


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("courseName");
                temp[1] = Integer.toString(res1.getInt("time"));


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="q2";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }


        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }

    }

    private void buttonq3goActionPerformed(ActionEvent e) {
        iInst_id=textFieldq3inod.getText().toLowerCase();
        ////System.out.println("go3"+iInst_id);

        try{

            //Query1
            //String instid = "i2";
            //String batch = "2015";

            String query1 = "Select avg(grade) as AvgGrade from\n" +
                    "(Select grade, semester from studentReport natural join\n" +
                    "(Select courseId from course where instructorId=\""+iInst_id+"\" ) C)T where  semester!=\"W17\"";

            ////System.out.println(query1);


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("AvgGrade");


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="q3";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }


        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }

    }

    private void buttonq4goActionPerformed(ActionEvent e) {
        sRollno=textFieldq4rollno.getText().toLowerCase();
        cCourse_id=textFieldq4cid.getText().toLowerCase();
        taOffice_day=comboBoxq4day.getSelectedItem().toString().toLowerCase();
        ////System.out.println("go4"+sRollno+cCourse_id+taOffice_day);

        try{

            //Query1
            //String instid = "i2";
            //String batch = "2015";

            String query1 = "Select TA.officeStart,TA.name,TA.rollNo from TA where TA.officeStart not in (select startTime from \n" +
                    "(Select timeTable.startTime,timeTable.courseId from timeTable \n" +
                    "natural join\n" +
                    "(Select studentReport.courseId from studentReport where studentReport.rollNo = \""+sRollno+"\") SR\n" +
                    "where timeTable.day=\""+taOffice_day+"\") T) and TA.officeDay=\""+taOffice_day+"\" and ta.courseId=\""+cCourse_id+"\"";

            ////System.out.println(query1);


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];



                temp[0] = Integer.toString(res1.getInt("officeStart"));
                temp[1] = res1.getString("name");
                temp[2] = res1.getString("rollNo");


                mainResultSet[count]=temp;

                //System.out.println(temp[0]+temp[1]+temp[2]);

                count++;
            }

            ////System.out.println(count);



            resultType="q4";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }


        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }
    }

    private void buttonq5goActionPerformed(ActionEvent e) {
        iInst_id=textFieldq5inid.getText().toLowerCase();
        ////System.out.println("go5"+iInst_id);

        try{

            //Query1
            //String instid = "i2";
            //String batch = "2015";

            String query1 = "Select student.name,student.rollNo from student where student.rollNo in (Select rollNo from studentReport where courseId in \n" +
                    "(Select courseId from (Select courseId from course where instructorId= \""+iInst_id+"\") C1  ) group by rollNo having count(*) = (select count(*) from" +
                    "(Select courseId from course where instructorId= \""+iInst_id+"\") C2)) ";

            ////System.out.println(query1);


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];



                temp[0] = res1.getString("name");
                temp[1] = res1.getString("rollNo");


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="q5";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }

        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }

    }

    private void buttonq6goActionPerformed(ActionEvent e) {
        ttDay=comboBoxq6day.getSelectedItem().toString().toLowerCase();

        try{
            ttStart_time=Integer.parseInt(textFieldq6time.getText());
        }catch (Exception x)
        {
            //System.out.println("Enter valid type.");
        }
        ////System.out.println("go6"+ttDay+ttStart_time);

        try{

            //Query1
            //String instid = "i2";
            //String batch = "2015";

            String query1 = "Select room,endTime,nextTime from timeTable where " +
                    "endTime>="+ttStart_time+" and nextTime>endTime and day= \""+ttDay+"\"";

            ////System.out.println(query1);


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("room");
                temp[1] = Integer.toString(res1.getInt("endTime"));
                temp[2] = Integer.toString(res1.getInt("nextTime"));


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="q6";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }


        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }


    }

    private void buttonq7goActionPerformed(ActionEvent e) {
        sRollno=textFieldq7rollno.getText().toLowerCase();
        ////System.out.println("go7"+sRollno);

        try{

            //Query1
            //String instid = "i2";
            //String batch = "2015";

            String query1 = "Select courseId,gr from \n" +
                    "((Select rollNo, courseId from studentReport where rollNo=\""+sRollno+"\" and semester!=\"W17\" ) SR1\n" +
                    "natural join\n" +
                    "(Select avg(grade) as gr,courseId from (Select grade,courseId from " +
                    "(select courseId, grade from studentReport where semester!=\"W17\") SR ) T " +
                    "group by courseId) SR2) order by gr desc";

            ////System.out.println(query1);


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("courseId");
                temp[1] = Integer.toString(res1.getInt("gr"));


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="q7";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }


        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }
    }

    private void buttonq8goActionPerformed(ActionEvent e) {
        sBatch=comboBoxq8batch.getSelectedItem().toString().toLowerCase();
        sStream=comboBoxq8stream.getSelectedItem().toString().toLowerCase();
        cCourse_id=textFieldq8cid.getText().toLowerCase();
        ////System.out.println("go8"+sBatch+sStream+cCourse_id);

        try{

            //Query1
            //String instid = "i2";
            //String batch = "2015";

            String query1 = "Select name,rollNo,grade from student natural join " +
                    "(Select studentReport.rollNo,studentReport.grade from studentReport " +
                    "natural join student where studentReport.rollNo like \""+sBatch+"%\" and " +
                    "student.stream = \""+sStream+"\" and studentReport.courseId = \""+cCourse_id+"\" and " +
                    "studentReport.semester != \"W17\") T where grade>=8";

            ////System.out.println(query1);


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("name");
                temp[1] = res1.getString("rollNo");
                temp[2] = Float.toString(res1.getFloat("grade"));


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="q8";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }


        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }


    }

    private void buttonq9goActionPerformed(ActionEvent e) {
        sBatch=comboBoxq9batch.getSelectedItem().toString().toLowerCase();
        sStream=comboBoxq9stream.getSelectedItem().toString().toLowerCase();
        ////System.out.println("go9"+sBatch+sStream);

        try{

            //Query1
            //String instid = "i2";
            //String batch = "2015";

            String query1 = "Select name,rollNo from (\n" +
                    "Select name,rollNo from student where rollNo in " +
                    "(Select distinct t1.rollNo from ta t1 join ta t2 " +
                    "on t1.rollNo = t2.rollNo and t1.courseId!=t2.courseId)\n" +
                    ") T where rollNo like \""+sBatch+"%\"";

            ////System.out.println(query1);


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("name");
                temp[1] = res1.getString("rollNo");


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="q9";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }


        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }
    }

    private void buttonq10goActionPerformed(ActionEvent e) {
        cCourse_id=textFieldq10courseid.getText().toLowerCase();
        cdDate=textFieldq10date.getText().toLowerCase();
        java.util.Date utilDate = new java.util.Date(cdDate);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        DateFormat format2=new SimpleDateFormat("EEEE");
        String finalDay=format2.format(sqlDate).toLowerCase();

        ////System.out.println(finalDay);
        ////System.out.println("go10"+cCourse_id+cdDate);

        try{

            //Query1
            //String instid = "i2";
            //String batch = "2015";

            String query1 = "Select day,room,startTime,endTime from " +
                    "(Select day,room,startTime,endTime,time from timeTable " +
                    "natural join (Select courseId,time from deadlines where " +
                    "date=\""+cdDate+"\" and courseId=\""+cCourse_id+"\")A)B where " +
                    "day=\""+finalDay+"\" and startTime<time";

            ////System.out.println(query1);


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("day");
                temp[1] = res1.getString("room");
                temp[2] = Integer.toString(res1.getInt("startTime"));
                temp[3] = Integer.toString(res1.getInt("endTime"));


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="q10";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }


        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }

    }

    private void buttonp1adminActionPerformed(ActionEvent e) {
        panelNo=2;
        Panel1.setVisible(false);
        Panel3.setVisible(false);
        Panel2.setVisible(true);
        label33.setText("Administrator Panel");
        textFieldp2login.setText("Eg.admin123");
        passwordFieldp2pass.setText(null);
        //System.out.println("admin");
        tablereset();
    }

    private void buttonp2backActionPerformed(ActionEvent e) {
        panelNo=1;
        Panel1.setVisible(true);
        Panel2.setVisible(false);
        Panel3.setVisible(false);
        panelp1def.setVisible(true);
        falseallq();
        tablereset();
        //System.out.println("back");
    }

    private void buttonp2goActionPerformed(ActionEvent e) {
        login=textFieldp2login.getText();
        password=new String(passwordFieldp2pass.getPassword());
        //write stuff to check conditions

        //if..then
        try{


            String query1 = "Select * from\n" +
                    "login where username=\""+login+"\" and password=\""+password+"\"";

            ////System.out.println(query1);


            ResultSet res1 = st1.executeQuery(query1);
            count=0;
            while(res1.next()){
                count++;
            }

            if(count>0){
                buttonlogin.setSelected(false);
                buttonstudents.setSelected(false);
                buttoninstructor.setSelected(false);
                buttonTA.setSelected(false);
                buttonRep.setSelected(false);
                buttonTT.setSelected(false);
                buttonDead.setSelected(false);
                buttonCourses.setSelected(false);
                panelp3def.setVisible(true);
                panelNo=3;
                Panel1.setVisible(false);
                Panel2.setVisible(false);
                Panel3.setVisible(true);
                tablereset();
                //System.out.println("go"+login+password);
                ////System.out.println("No results matching query");
            }else{
                label33.setText("Incorrect, please try again");
            }
            res1.close();


        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }


    }

    private void buttoncrossActionPerformed(ActionEvent e) {
        panelNo=1;
        Panel1.setVisible(true);
        Panel2.setVisible(false);
        Panel3.setVisible(false);
        panelp1def.setVisible(true);
        buttonp11.setSelected(false);
        falseallq();
        tablereset();
        //System.out.println("cross");
    }

    private void buttonloginActionPerformed(ActionEvent e) {
        panelNo=3;
        aNo=1;
        panela1.setVisible(true);
        panela2.setVisible(false);panela3.setVisible(false);panela4.setVisible(false);panela5.setVisible(false);panela6.setVisible(false);panela7.setVisible(false);panela8.setVisible(false);
        panelp3def.setVisible(false);

        buttonlogin.setSelected(true);
        buttonstudents.setSelected(false);
        buttoninstructor.setSelected(false);
        buttonTA.setSelected(false);
        buttonRep.setSelected(false);
        buttonTT.setSelected(false);
        buttonDead.setSelected(false);
        buttonCourses.setSelected(false);
        tablereset();
        tablep3 = new JTable();// reset table some other way
        //System.out.println("login");

        try{

            String query1; //= "INSERT INTO instructor(instructorId,name,email,officeStart,officeEnd,officeDay) VALUES ('"+iInst_id+"','"+iName+"','"+iEmail+"',"+iOffice_hours_start+","+iOffice_hours_end+",'"+iOffice_day+"','"+"')";


            query1="select * from login";


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("username");
                temp[1] = res1.getString("password");

                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="a1";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }

        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }



    }

    private void buttonstudentsActionPerformed(ActionEvent e) {
        panelNo=3;
        aNo=2;
        panela2.setVisible(true);
        panela1.setVisible(false);panela3.setVisible(false);panela4.setVisible(false);panela5.setVisible(false);panela6.setVisible(false);panela7.setVisible(false);panela8.setVisible(false);
        panelp3def.setVisible(false);
        buttonlogin.setSelected(false);
        buttonstudents.setSelected(true);
        buttoninstructor.setSelected(false);
        buttonTA.setSelected(false);
        buttonRep.setSelected(false);
        buttonTT.setSelected(false);
        buttonDead.setSelected(false);
        buttonCourses.setSelected(false);
        textFielda2name.setText("Eg.Varnit Jain");
        comboBoxa2stream.setSelectedIndex(0);
        textFielda2roll.setText("Eg.2015012");
        textFielda2gpa.setText("Eg.9.8");
        textFielda2email.setText("Eg.abc@xyz.com");
        //System.out.println("students");
        tablereset();
        tablep3 = new JTable();// reset table some other way
    }

    private void buttoninstructorActionPerformed(ActionEvent e) {
        panelNo=3;
        aNo=3;
        buttonlogin.setSelected(false);
        buttonstudents.setSelected(false);
        buttoninstructor.setSelected(true);
        buttonTA.setSelected(false);
        buttonRep.setSelected(false);
        buttonTT.setSelected(false);
        buttonDead.setSelected(false);
        buttonCourses.setSelected(false);
        panela3.setVisible(true);
        panela1.setVisible(false);panela2.setVisible(false);panela4.setVisible(false);panela5.setVisible(false);panela6.setVisible(false);panela7.setVisible(false);panela8.setVisible(false);
        panelp3def.setVisible(false);
        textFielda3name.setText("Eg.Vikram Goel");
        comboBox13.setSelectedIndex(0);
        textFielda3inid.setText("Eg.I205");
        textFielda3ots.setText("Eg.1200");
        textFielda3otf.setText("Eg.1300");
        textFielda3email.setText("Eg.abc@xyz.com");
        //System.out.println("instructor");
        tablereset();
        tablep3 = new JTable();// reset table some other way
    }

    private void buttonTAActionPerformed(ActionEvent e) {
        panelNo=3;
        aNo=4;
        buttonlogin.setSelected(false);
        buttonstudents.setSelected(false);
        buttoninstructor.setSelected(false);
        buttonTA.setSelected(true);
        buttonRep.setSelected(false);
        buttonTT.setSelected(false);
        buttonDead.setSelected(false);
        buttonCourses.setSelected(false);
        panela4.setVisible(true);
        panela1.setVisible(false);panela3.setVisible(false);panela2.setVisible(false);panela5.setVisible(false);panela6.setVisible(false);panela7.setVisible(false);panela8.setVisible(false);
        panelp3def.setVisible(false);
        textFielda4name.setText("Eg.Vasu Kumar");
        comboBoxa4day.setSelectedIndex(0);
        textFielda4rollno.setText("Eg.2015012");
        textFielda4ofs.setText("Eg.1200");
        textFielda4otf.setText("Eg.1300");
        textFielda4cid.setText("Eg.CSE101");
        //System.out.println("ta");
        tablereset();
        tablep3 = new JTable();// reset table some other way
    }

    private void buttonCoursesActionPerformed(ActionEvent e) {
        panelNo=3;
        aNo=5;
        buttonlogin.setSelected(false);
        buttonstudents.setSelected(false);
        buttoninstructor.setSelected(false);
        buttonTA.setSelected(false);
        buttonRep.setSelected(false);
        buttonTT.setSelected(false);
        buttonDead.setSelected(false);
        buttonCourses.setSelected(true);
        panela5.setVisible(true);
        panela1.setVisible(false);panela3.setVisible(false);panela2.setVisible(false);panela4.setVisible(false);panela6.setVisible(false);panela7.setVisible(false);panela8.setVisible(false);
        panelp3def.setVisible(false);
        textFielda5course.setText("Eg.DBMS");
        comboBoxa5ctype.setSelectedIndex(0);
        textFielda5cid.setText("Eg.C101");
        textFielda5inid.setText("Eg.I205");
        textFielda5books.setText("Eg.Lost Souls");
        //System.out.println("course");
        tablereset();
        tablep3 = new JTable();// reset table some other way
    }

    private void buttonRepActionPerformed(ActionEvent e) {
        panelNo=3;
        aNo=6;
        buttonlogin.setSelected(false);
        buttonstudents.setSelected(false);
        buttoninstructor.setSelected(false);
        buttonTA.setSelected(false);
        buttonRep.setSelected(true);
        buttonTT.setSelected(false);
        buttonDead.setSelected(false);
        buttonCourses.setSelected(false);
        panela6.setVisible(true);
        panela1.setVisible(false);panela3.setVisible(false);panela2.setVisible(false);panela4.setVisible(false);panela5.setVisible(false);panela7.setVisible(false);panela8.setVisible(false);
        panelp3def.setVisible(false);
        textFielda6rollno.setText("Eg.2015012");
        comboBoxa6grade.setSelectedIndex(0);
        textFielda6cid.setText("Eg.C101");
        //System.out.println("rep");
        tablereset();
        tablep3 = new JTable();// reset table some other way
    }

    private void buttonTTActionPerformed(ActionEvent e) {
        panelNo=3;
        aNo=7;
        buttonlogin.setSelected(false);
        buttonstudents.setSelected(false);
        buttoninstructor.setSelected(false);
        buttonTA.setSelected(false);
        buttonRep.setSelected(false);
        buttonTT.setSelected(true);
        buttonDead.setSelected(false);
        buttonCourses.setSelected(false);
        panela7.setVisible(true);
        panela1.setVisible(false);panela3.setVisible(false);panela2.setVisible(false);panela4.setVisible(false);panela6.setVisible(false);panela5.setVisible(false);panela8.setVisible(false);
        panelp3def.setVisible(false);
        textFielda7ts.setText("Eg.1200");
        comboBoxa7day.setSelectedIndex(0);
        textFielda7cid.setText("Eg.C101");
        textFielda7tf.setText("Eg.1300");
        textFielda7nt.setText("Eg.1400");
        textFielda7room.setText("Eg.C21");
        //System.out.println("tt");
        tablereset();
        tablep3 = new JTable();// reset table some other way
    }

    private void buttonDeadActionPerformed(ActionEvent e) {
        panelNo=3;
        aNo=8;
        buttonlogin.setSelected(false);
        buttonstudents.setSelected(false);
        buttoninstructor.setSelected(false);
        buttonTA.setSelected(false);
        buttonRep.setSelected(false);
        buttonTT.setSelected(false);
        buttonDead.setSelected(true);
        buttonCourses.setSelected(false);
        panela8.setVisible(true);
        panela1.setVisible(false);panela3.setVisible(false);panela2.setVisible(false);panela4.setVisible(false);panela6.setVisible(false);panela7.setVisible(false);panela5.setVisible(false);
        panelp3def.setVisible(false);
        textFielda8date.setText("Eg.DD/MM/YY");
        textFielda8cid.setText("Eg.C101");
        textFielda8time.setText("Eg.1200");
        textFielda8topic.setText("Eg.Circuits");
        //System.out.println("dead");
        tablereset();
        tablep3 = new JTable();// reset table some other way
    }

    private void buttona8goActionPerformed(ActionEvent e) {
        cdCourse_id=textFielda8cid.getText().toLowerCase();
        cdDate=textFielda8date.getText().toLowerCase();
        try{

            cdTime=Integer.parseInt(textFielda8time.getText());
        }catch (Exception x)
        {
            //System.out.println("Enter valid type.");
        }
        cdTopic=textFielda8topic.getText().toLowerCase();
        //System.out.println("goa8"+cdCourse_id+cdDate+cdTime+cdTopic);

        try{

            String query1 = "INSERT INTO deadlines(courseId,topic,date,time) VALUES ('"+cdCourse_id+"','"+cdTopic+"','"+cdDate+"',"+cdTime+")";

            st1.executeUpdate(query1);

            query1="select * from deadlines";


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("courseId");
                temp[1] = res1.getString("topic");
                temp[2] = res1.getString("date");
                temp[3] = Integer.toString(res1.getInt("time"));


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="a8";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }

        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }

    }

    private void buttona7goActionPerformed(ActionEvent e) {
        ttCourse_id=textFielda7cid.getText().toLowerCase();
        ttRoom=textFielda7room.getText().toLowerCase();
        try{
            ttStart_time=Integer.parseInt(textFielda7ts.getText());
            ttEnd_time=Integer.parseInt(textFielda7tf.getText());
            ttNext_time=Integer.parseInt(textFielda7nt.getText());

        }catch (Exception x)
        {
            //System.out.println("Enter valid type.");
        }
        ttDay=comboBoxa7day.getSelectedItem().toString().toLowerCase();
        ////System.out.println("goa7"+ttCourse_id+ttRoom+ttStart_time+ttEnd_time+ttNext_time+ttDay);

        try{

            String query1 = " INSERT INTO timeTable(courseId,day,startTime,endTime,room,nextTime) VALUES ('"+ttCourse_id+"','"+ttDay+"',"+ttStart_time+","+ttEnd_time+",'"+ttRoom+"',"+ttNext_time+")";

            st1.executeUpdate(query1);

            query1="select * from timeTable";


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("courseId");
                temp[1] = res1.getString("day");
                temp[2] = Integer.toString(res1.getInt("startTime"));
                temp[3] = Integer.toString(res1.getInt("endTime"));
                temp[4] = res1.getString("room");
                temp[5] = Integer.toString(res1.getInt("nextTime"));


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="a7";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }

        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }

    }

    private void buttona6goActionPerformed(ActionEvent e) {
        rCourse_id=textFielda6cid.getText().toLowerCase();
        rRollno=textFielda6rollno.getText().toLowerCase();
        try{
            rGrade=Integer.parseInt(comboBoxa6grade.getSelectedItem().toString());

        }catch (Exception x)
        {
            //System.out.println("Enter valid type.");
        }
        ////System.out.println("goa6"+rCourse_id+rRollno+rGrade);

        try{

            String query1 = "INSERT INTO studentReport(rollNo,courseId,grade,semester) VALUES ('"+rRollno+"','"+rCourse_id+"',"+rGrade+",'"+"W17"+"')";

            st1.executeUpdate(query1);

            query1="select * from studentReport";


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("rollNo");
                temp[1] = res1.getString("courseId");
                temp[2] = Integer.toString(res1.getInt("grade"));
                temp[3] = res1.getString("semester");


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="a6";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }

        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }

    }

    private void buttona5goActionPerformed(ActionEvent e) {
        cCourse_name=textFielda5course.getText().toLowerCase();
        cCourse_id=textFielda5cid.getText().toLowerCase();
        cInst_id=textFielda5inid.getText().toLowerCase();
        cRecommended_books=textFielda5books.getText().toLowerCase();
        cCourse_type=comboBoxa5ctype.getSelectedItem().toString().toLowerCase();
        ////System.out.println("goa5"+cCourse_id+cCourse_name+cInst_id+cRecommended_books+cCourse_type);

        try{

            String query1 = "INSERT INTO course(courseName,courseId,courseType,instructorId,recommendedBooks) VALUES ('"+cCourse_name+"','"+cCourse_id+"','"+cCourse_type+"','"+cInst_id+"','"+cRecommended_books+"')";

            st1.executeUpdate(query1);

            query1="select * from course";


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("courseName");
                temp[1] = res1.getString("courseId");
                temp[2] = res1.getString("courseType");
                temp[3] = res1.getString("InstructorId");
                temp[4] = res1.getString("recommendedBooks");


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="a5";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }

        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }

    }

    private void buttona4goActionPerformed(ActionEvent e) {
        taRollno=textFielda4rollno.getText().toLowerCase();
        taName=textFielda4name.getText().toLowerCase();
        taCourse_id=textFielda4cid.getText().toLowerCase();
        try{
            taOffice_hours_start=Integer.parseInt(textFielda4ofs.getText());
            taOffice_hours_end=Integer.parseInt(textFielda4ofs.getText());

        }catch (Exception x)
        {
            //System.out.println("Enter valid type.");
        }
        taOffice_day=comboBoxa4day.getSelectedItem().toString().toLowerCase();
        ////System.out.println("goa4"+taRollno+taName+taOffice_day+taOffice_hours_start+taOffice_hours_end+taCourse_id);


        try{

            String query1 = "INSERT INTO ta(name,rollNo,courseId,officeStart,officeEnd,officeDay) VALUES ('"+taName+"','"+taRollno+"','"+taCourse_id+"',"+taOffice_hours_start+","+taOffice_hours_end+",'"+taOffice_day+"')";

            st1.executeUpdate(query1);

            query1="select * from ta";


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("name");
                temp[1] = res1.getString("rollNo");
                temp[2] = res1.getString("courseId");
                temp[3] = Integer.toString(res1.getInt("officeStart"));
                temp[4] = Integer.toString(res1.getInt("officeEnd"));
                temp[5] = res1.getString("officeDay");


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="a4";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }

        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }

    }

    private void buttona3goActionPerformed(ActionEvent e) {
        iInst_id=textFielda3inid.getText().toLowerCase();
        iName=textFielda3name.getText().toLowerCase();
        iEmail=textFielda3email.getText().toLowerCase();
        try{

            iOffice_hours_start=Integer.parseInt(textFielda3ots.getText());
            iOffice_hours_end=Integer.parseInt(textFielda4otf.getText());
        }catch (Exception x)
        {
            //System.out.println("Enter valid type.");
        }
        iOffice_day=comboBox13.getSelectedItem().toString().toLowerCase();
        ////System.out.println("goa3"+iInst_id+iName+iEmail+iOffice_day+iOffice_hours_start+iOffice_hours_end);


        try{

            String query1 = "INSERT INTO instructor(instructorId,name,email,officeStart,officeEnd,officeDay) VALUES ('"+iInst_id+"','"+iName+"','"+iEmail+"',"+iOffice_hours_start+","+iOffice_hours_end+",'"+iOffice_day+"','"+"')";

            st1.executeUpdate(query1);

            query1="select * from instructor";


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("instructorId");
                temp[1] = res1.getString("name");
                temp[2] = res1.getString("email");
                temp[3] = Integer.toString(res1.getInt("officeStart"));
                temp[4] = Integer.toString(res1.getInt("officeEnd"));
                temp[5] = res1.getString("officeDay");


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);



            resultType="a3";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }

        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }

    }

    private void buttona2goActionPerformed(ActionEvent e) {
        sRollno=textFielda2roll.getText().toLowerCase();
        sName=textFielda2name.getText().toLowerCase();
        sEmail=textFielda2email.getText().toLowerCase();
        try{

            sCGPA=Float.parseFloat(textFielda2gpa.getText());
        }catch (Exception x)
        {
            //System.out.println("Enter valid type.");
        }
        sStream=comboBoxa2stream.getSelectedItem().toString().toLowerCase();
        ////System.out.println("goa2"+sRollno+sName+sEmail+sCGPA+sStream);

        try{

            String query1 = "INSERT INTO student(name,rollNo,cgpa,email,stream) VALUES ('"+sName+"','"+sRollno+"',"+sCGPA+",'"+sEmail+"','"+sStream+"')";

            st1.executeUpdate(query1);

            query1="select * from student";


            ResultSet res1 = st1.executeQuery(query1);
            count=0;

            mainResultSet=new String[100][10];

            while(res1.next()){

                String temp[] = new String[10];


                temp[0] = res1.getString("name");
                temp[1] = res1.getString("rollNo");
                temp[2] = Float.toString(res1.getFloat("cgpa"));
                temp[3] = res1.getString("email");
                temp[4] = res1.getString("stream");


                mainResultSet[count]=temp;

                ////System.out.println(name+rollNo+cgpa+email+stream);

                count++;
            }

            ////System.out.println(count);





            resultType="a2";
            pageNo=0;
            if(pageNo*10<count){
                //System.out.println("nice");
                displayShit();
                pageNo++;

            }else{
                pageNo=0;
                displayShit();
            }





        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }


    }

    private void buttonenterActionPerformed(ActionEvent e) {
        Panel0.setVisible(false);
        Panel1.setVisible(true);
        Panel2.setVisible(false);
        Panel3.setVisible(false);
        tablereset();
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Aman Agarwal
        frame1 = new JFrame();
        Panel0 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        buttonenter = new JButton();
        label28 = new JLabel();
        panel1 = new JPanel();
        Panel1 = new JPanel();
        buttonp11 = new JButton();
        buttonp12 = new JButton();
        buttonp13 = new JButton();
        buttonp14 = new JButton();
        buttonp15 = new JButton();
        buttonp16 = new JButton();
        buttonp17 = new JButton();
        buttonp18 = new JButton();
        buttonp19 = new JButton();
        buttonp20 = new JButton();
        panelp1table = new JPanel();
        scrollPane1 = new JScrollPane();
        tablep1 = new JTable();
        buttonp1next = new JButton();
        panelp1head = new JPanel();
        labelp1head = new JLabel();
        buttonp1admin = new JButton();
        panelp1def = new JPanel();
        panelq1 = new JPanel();
        labelq1 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        textFieldq1inid = new JTextField();
        comboBoxq1batch = new JComboBox<>();
        buttonq1go = new JButton();
        panelq2 = new JPanel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        textFieldq2rollno = new JTextField();
        buttonq2go = new JButton();
        textFieldq2date = new JTextField();
        panelq3 = new JPanel();
        label8 = new JLabel();
        label9 = new JLabel();
        textFieldq3inod = new JTextField();
        buttonq3go = new JButton();
        panelq4 = new JPanel();
        label16 = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();
        textFieldq4rollno = new JTextField();
        buttonq4go = new JButton();
        textFieldq4cid = new JTextField();
        label19 = new JLabel();
        comboBoxq4day = new JComboBox<>();
        panelq5 = new JPanel();
        label14 = new JLabel();
        label15 = new JLabel();
        textFieldq5inid = new JTextField();
        buttonq5go = new JButton();
        panelq6 = new JPanel();
        label10 = new JLabel();
        label12 = new JLabel();
        buttonq6go = new JButton();
        textFieldq6time = new JTextField();
        label13 = new JLabel();
        comboBoxq6day = new JComboBox<>();
        panelq8 = new JPanel();
        label21 = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();
        buttonq8go = new JButton();
        textFieldq8cid = new JTextField();
        label24 = new JLabel();
        comboBoxq8stream = new JComboBox<>();
        comboBoxq8batch = new JComboBox<>();
        panelq7 = new JPanel();
        label11 = new JLabel();
        label20 = new JLabel();
        textFieldq7rollno = new JTextField();
        buttonq7go = new JButton();
        panelq9 = new JPanel();
        label25 = new JLabel();
        label26 = new JLabel();
        label27 = new JLabel();
        buttonq9go = new JButton();
        comboBoxq9stream = new JComboBox<>();
        comboBoxq9batch = new JComboBox<>();
        panelq10 = new JPanel();
        label31 = new JLabel();
        label32 = new JLabel();
        textFieldq10courseid = new JTextField();
        buttonq10go = new JButton();
        label36 = new JLabel();
        textFieldq10date = new JTextField();
        Panel2 = new JPanel();
        label33 = new JLabel();
        label34 = new JLabel();
        label35 = new JLabel();
        textFieldp2login = new JTextField();
        passwordFieldp2pass = new JPasswordField();
        buttonp2go = new JButton();
        buttonp2back = new JButton();
        Panel3 = new JPanel();
        panelutext = new JPanel();
        label68 = new JLabel();
        label69 = new JLabel();
        buttonlogin = new JButton();
        buttonstudents = new JButton();
        buttoninstructor = new JButton();
        buttonTA = new JButton();
        buttonCourses = new JButton();
        buttonRep = new JButton();
        buttonTT = new JButton();
        buttonDead = new JButton();
        panelp3table = new JPanel();
        scrollPane2 = new JScrollPane();
        tablep3 = new JTable();
        buttonp3next = new JButton();
        panelp3head = new JPanel();
        label39 = new JLabel();
        buttoncross = new JButton();
        panelp3def = new JPanel();
        panela1 = new JPanel();
        label63 = new JLabel();
        panela2 = new JPanel();
        label40 = new JLabel();
        label41 = new JLabel();
        label42 = new JLabel();
        textFielda2name = new JTextField();
        comboBoxa2stream = new JComboBox<>();
        buttona2go = new JButton();
        textFielda2roll = new JTextField();
        label70 = new JLabel();
        textFielda2gpa = new JTextField();
        label71 = new JLabel();
        textFielda2email = new JTextField();
        label72 = new JLabel();
        panela3 = new JPanel();
        label45 = new JLabel();
        label46 = new JLabel();
        label47 = new JLabel();
        textFielda3name = new JTextField();
        comboBox13 = new JComboBox<>();
        buttona3go = new JButton();
        textFielda3inid = new JTextField();
        label73 = new JLabel();
        textFielda3ots = new JTextField();
        label75 = new JLabel();
        textFielda3email = new JTextField();
        label76 = new JLabel();
        textFielda3otf = new JTextField();
        label77 = new JLabel();
        panel19 = new JPanel();
        label43 = new JLabel();
        label44 = new JLabel();
        textField14 = new JTextField();
        button40 = new JButton();
        textField28 = new JTextField();
        label74 = new JLabel();
        panela4 = new JPanel();
        label51 = new JLabel();
        label52 = new JLabel();
        label53 = new JLabel();
        textFielda4name = new JTextField();
        comboBoxa4day = new JComboBox<>();
        buttona4go = new JButton();
        textFielda4rollno = new JTextField();
        label81 = new JLabel();
        textFielda4ofs = new JTextField();
        label82 = new JLabel();
        textFielda4cid = new JTextField();
        label83 = new JLabel();
        textFielda4otf = new JTextField();
        label84 = new JLabel();
        panela5 = new JPanel();
        label48 = new JLabel();
        label49 = new JLabel();
        label50 = new JLabel();
        textFielda5course = new JTextField();
        comboBoxa5ctype = new JComboBox<>();
        buttona5go = new JButton();
        textFielda5cid = new JTextField();
        label78 = new JLabel();
        textFielda5inid = new JTextField();
        label79 = new JLabel();
        textFielda5books = new JTextField();
        label80 = new JLabel();
        panela6 = new JPanel();
        label54 = new JLabel();
        label55 = new JLabel();
        label56 = new JLabel();
        comboBoxa6grade = new JComboBox<>();
        buttona6go = new JButton();
        textFielda6rollno = new JTextField();
        textFielda6cid = new JTextField();
        label86 = new JLabel();
        panela7 = new JPanel();
        label57 = new JLabel();
        label58 = new JLabel();
        label59 = new JLabel();
        textFielda7cid = new JTextField();
        comboBoxa7day = new JComboBox<>();
        buttona7go = new JButton();
        textFielda7ts = new JTextField();
        label87 = new JLabel();
        textFielda7room = new JTextField();
        label88 = new JLabel();
        textFielda7tf = new JTextField();
        label89 = new JLabel();
        textFielda7nt = new JTextField();
        label64 = new JLabel();
        panela8 = new JPanel();
        label60 = new JLabel();
        label61 = new JLabel();
        label62 = new JLabel();
        textFielda8cid = new JTextField();
        buttona8go = new JButton();
        textFielda8time = new JTextField();
        label90 = new JLabel();
        textFielda8topic = new JTextField();
        label91 = new JLabel();
        textFielda8date = new JTextField();

        //======== frame1 ========
        {
            frame1.setVisible(true);
            frame1.setTitle("Academic Query Engine");
            frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame1.setResizable(false);
            Container frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //======== Panel0 ========
            {

                // JFormDesigner evaluation mark
                Panel0.setBorder(new javax.swing.border.CompoundBorder(
                        new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                                java.awt.Color.red), Panel0.getBorder())); Panel0.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

                Panel0.setLayout(null);

                //---- label1 ----
                label1.setIcon(new ImageIcon("admin-numb/logo.png"));
                Panel0.add(label1);
                label1.setBounds(0, 0, 690, 500);

                //---- label2 ----
                label2.setIcon(new ImageIcon("admin-numb/plainlogo.png"));
                Panel0.add(label2);
                label2.setBounds(new Rectangle(new Point(265, 60), label2.getPreferredSize()));

                //---- buttonenter ----
                buttonenter.setIcon(new ImageIcon("admin-numb/next.png"));
                buttonenter.addActionListener(e -> {
                    //button1ActionPerformed(e);
                    buttonenterActionPerformed(e);
                });
                Panel0.add(buttonenter);
                buttonenter.setBounds(775, 435, 55, 50);

                //---- label28 ----
                label28.setText("Welcome.");
                Panel0.add(label28);
                label28.setBounds(435, 390, 66, 21);

                //======== panel1 ========
                {
                    panel1.setLayout(null);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel1.getComponentCount(); i++) {
                            Rectangle bounds = panel1.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel1.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel1.setMinimumSize(preferredSize);
                        panel1.setPreferredSize(preferredSize);
                    }
                }
                Panel0.add(panel1);
                panel1.setBounds(225, 380, 305, 120);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < Panel0.getComponentCount(); i++) {
                        Rectangle bounds = Panel0.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = Panel0.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    Panel0.setMinimumSize(preferredSize);
                    Panel0.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(Panel0);
            Panel0.setBounds(0, 0, 845, 500);

            //======== Panel1 ========
            {
                Panel1.setBackground(UIManager.getColor("Table.dropLineShortColor"));
                Panel1.setVisible(false);
                Panel1.setLayout(null);

                //---- buttonp11 ----
                buttonp11.setText("    Who teaches who?");
                buttonp11.setIcon(new ImageIcon("admin-numb/one1.png"));
                buttonp11.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonp11.setBackground(UIManager.getColor("Panel.background"));
                buttonp11.setAlignmentY(0.0F);
                buttonp11.setHorizontalAlignment(SwingConstants.LEFT);
                buttonp11.setBorderPainted(false);
                buttonp11.setSelectedIcon(new ImageIcon("admin-numb/sone.png"));
                buttonp11.addActionListener(e -> buttonp11ActionPerformed(e));
                Panel1.add(buttonp11);
                buttonp11.setBounds(0, 0, 245, 50);

                //---- buttonp12 ----
                buttonp12.setText("    Conflicting Deadlines");
                buttonp12.setIcon(new ImageIcon("admin-numb/two.png"));
                buttonp12.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonp12.setBackground(UIManager.getColor("Panel.background"));
                buttonp12.setBorderPainted(false);
                buttonp12.setAlignmentY(0.0F);
                buttonp12.setHorizontalAlignment(SwingConstants.LEFT);
                buttonp12.setActionCommand("    Conflicting Deadlines");
                buttonp12.setSelectedIcon(new ImageIcon("admin-numb/stwo.png"));
                buttonp12.addActionListener(e -> buttonp12ActionPerformed(e));
                Panel1.add(buttonp12);
                buttonp12.setBounds(0, 50, 245, 50);

                //---- buttonp13 ----
                buttonp13.setText("    Avg grade by a Prof");
                buttonp13.setIcon(new ImageIcon("admin-numb/three.png"));
                buttonp13.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonp13.setBackground(UIManager.getColor("Panel.background"));
                buttonp13.setBorderPainted(false);
                buttonp13.setAlignmentY(0.0F);
                buttonp13.setHorizontalAlignment(SwingConstants.LEFT);
                buttonp13.setActionCommand("    Conflicting Deadlines");
                buttonp13.setSelectedIcon(new ImageIcon("admin-numb/sthree.png"));
                buttonp13.addActionListener(e -> buttonp13ActionPerformed(e));
                Panel1.add(buttonp13);
                buttonp13.setBounds(0, 100, 245, 50);

                //---- buttonp14 ----
                buttonp14.setText("    Find a free TA");
                buttonp14.setIcon(new ImageIcon("admin-numb/four.png"));
                buttonp14.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonp14.setBackground(UIManager.getColor("Panel.background"));
                buttonp14.setBorderPainted(false);
                buttonp14.setAlignmentY(0.0F);
                buttonp14.setHorizontalAlignment(SwingConstants.LEFT);
                buttonp14.setActionCommand("    Conflicting Deadlines");
                buttonp14.setSelectedIcon(new ImageIcon("admin-numb/sfour.png"));
                buttonp14.addActionListener(e -> buttonp14ActionPerformed(e));
                Panel1.add(buttonp14);
                buttonp14.setBounds(0, 150, 245, 50);

                //---- buttonp15 ----
                buttonp15.setText("    Prof's Pets");
                buttonp15.setIcon(new ImageIcon("admin-numb/five.png"));
                buttonp15.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonp15.setBackground(UIManager.getColor("Panel.background"));
                buttonp15.setBorderPainted(false);
                buttonp15.setAlignmentY(0.0F);
                buttonp15.setHorizontalAlignment(SwingConstants.LEFT);
                buttonp15.setActionCommand("    Conflicting Deadlines");
                buttonp15.setSelectedIcon(new ImageIcon("admin-numb/sfive.png"));
                buttonp15.addActionListener(e -> buttonp15ActionPerformed(e));
                Panel1.add(buttonp15);
                buttonp15.setBounds(0, 200, 245, 50);

                //---- buttonp16 ----
                buttonp16.setText("    Extra Class");
                buttonp16.setIcon(new ImageIcon("admin-numb/six.png"));
                buttonp16.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonp16.setBackground(UIManager.getColor("Panel.background"));
                buttonp16.setBorderPainted(false);
                buttonp16.setAlignmentY(0.0F);
                buttonp16.setHorizontalAlignment(SwingConstants.LEFT);
                buttonp16.setActionCommand("    Conflicting Deadlines");
                buttonp16.setSelectedIcon(new ImageIcon("admin-numb/ssix.png"));
                buttonp16.addActionListener(e -> buttonp16ActionPerformed(e));
                Panel1.add(buttonp16);
                buttonp16.setBounds(0, 250, 245, 50);

                //---- buttonp17 ----
                buttonp17.setText("    Difficulty of Courses");
                buttonp17.setIcon(new ImageIcon("admin-numb/seven.png"));
                buttonp17.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonp17.setBackground(UIManager.getColor("Panel.background"));
                buttonp17.setBorderPainted(false);
                buttonp17.setAlignmentY(0.0F);
                buttonp17.setHorizontalAlignment(SwingConstants.LEFT);
                buttonp17.setActionCommand("    Conflicting Deadlines");
                buttonp17.setSelectedIcon(new ImageIcon("admin-numb/sseven.png"));
                buttonp17.addActionListener(e -> buttonp17ActionPerformed(e));
                Panel1.add(buttonp17);
                buttonp17.setBounds(0, 300, 245, 50);

                //---- buttonp18 ----
                buttonp18.setText("    Who can be a TA?");
                buttonp18.setIcon(new ImageIcon("admin-numb/eight.png"));
                buttonp18.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonp18.setBackground(UIManager.getColor("Panel.background"));
                buttonp18.setBorderPainted(false);
                buttonp18.setAlignmentY(0.0F);
                buttonp18.setHorizontalAlignment(SwingConstants.LEFT);
                buttonp18.setSelectedIcon(new ImageIcon("admin-numb/seight.png"));
                buttonp18.addActionListener(e -> buttonp18ActionPerformed(e));
                Panel1.add(buttonp18);
                buttonp18.setBounds(0, 350, 245, 50);

                //---- buttonp19 ----
                buttonp19.setText("    TAship fanatics");
                buttonp19.setIcon(new ImageIcon("admin-numb/nine.png"));
                buttonp19.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonp19.setBackground(UIManager.getColor("Panel.background"));
                buttonp19.setBorderPainted(false);
                buttonp19.setAlignmentY(0.0F);
                buttonp19.setHorizontalAlignment(SwingConstants.LEFT);
                buttonp19.setActionCommand("    Conflicting Deadlines");
                buttonp19.setSelectedIcon(new ImageIcon("admin-numb/snine.png"));
                buttonp19.addActionListener(e -> buttonp19ActionPerformed(e));
                Panel1.add(buttonp19);
                buttonp19.setBounds(0, 400, 245, 50);

                //---- buttonp20 ----
                buttonp20.setText("    Class before Deadline?");
                buttonp20.setIcon(new ImageIcon("admin-numb/ten.png"));
                buttonp20.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonp20.setBackground(UIManager.getColor("Panel.background"));
                buttonp20.setBorderPainted(false);
                buttonp20.setAlignmentY(0.0F);
                buttonp20.setHorizontalAlignment(SwingConstants.LEFT);
                buttonp20.setActionCommand("    Conflicting Deadlines");
                buttonp20.setSelectedIcon(new ImageIcon("admin-numb/sten.png"));
                buttonp20.addActionListener(e -> buttonp20ActionPerformed(e));
                Panel1.add(buttonp20);
                buttonp20.setBounds(0, 450, 245, 50);

                //======== panelp1table ========
                {
                    panelp1table.setPreferredSize(new Dimension(60, 60));
                    panelp1table.setBackground(UIManager.getColor("Panel.background"));
                    panelp1table.setLayout(null);

                    //======== scrollPane1 ========
                    {

                        //---- tablep1 ----

                        tablep1.setSelectionBackground(UIManager.getColor("Button.background"));
                        tablep1.setBorder(new EmptyBorder(5, 5, 5, 5));

                        tablep1.setModel(tableMod);
                        tablep1.setAutoscrolls(false);
                        tablep1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                        tablep1.setGridColor(UIManager.getColor("Button.darcula.color2"));
                        scrollPane1.setViewportView(tablep1);
                    }
                    panelp1table.add(scrollPane1);
                    scrollPane1.setBounds(0, 0, 600, 200);

                    //---- buttonp1next ----
                    buttonp1next.setText("Next");
                    buttonp1next.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttonp1next.addActionListener(e -> {buttonp1nextActionPerformed(e);} );
                    buttonp1next.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttonp1next.setBackground(UIManager.getColor("Panel.background"));
                    buttonp1next.setBorderPainted(false);
                    buttonp1next.setAlignmentY(0.0F);
                    buttonp1next.setHorizontalAlignment(SwingConstants.LEADING);
                    buttonp1next.setActionCommand("    Conflicting Deadlines");
                    panelp1table.add(buttonp1next);
                    buttonp1next.setBounds(495, 205, 105, 30);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelp1table.getComponentCount(); i++) {
                            Rectangle bounds = panelp1table.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelp1table.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelp1table.setMinimumSize(preferredSize);
                        panelp1table.setPreferredSize(preferredSize);
                    }
                }
                Panel1.add(panelp1table);
                panelp1table.setBounds(245, 260, 600, 240);

                //======== panelp1head ========
                {
                    panelp1head.setPreferredSize(new Dimension(60, 60));
                    panelp1head.setBackground(UIManager.getColor("Button.background"));
                    panelp1head.setLayout(null);

                    //---- labelp1head ----
                    labelp1head.setIcon(new ImageIcon("admin-numb/u2.png"));
                    labelp1head.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelp1head.add(labelp1head);
                    labelp1head.setBounds(-45, -10, 480, 110);

                    //---- buttonp1admin ----
                    buttonp1admin.setIcon(new ImageIcon("admin-numb/settings-5-xxl.png"));
                    buttonp1admin.addActionListener(e -> buttonp1adminActionPerformed(e));
                    panelp1head.add(buttonp1admin);
                    buttonp1admin.setBounds(535, 15, 60, 55);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelp1head.getComponentCount(); i++) {
                            Rectangle bounds = panelp1head.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelp1head.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelp1head.setMinimumSize(preferredSize);
                        panelp1head.setPreferredSize(preferredSize);
                    }
                }
                Panel1.add(panelp1head);
                panelp1head.setBounds(235, 0, 610, 90);

                //======== panelp1def ========
                {
                    panelp1def.setPreferredSize(new Dimension(60, 60));
                    panelp1def.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelp1def.setLayout(null);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelp1def.getComponentCount(); i++) {
                            Rectangle bounds = panelp1def.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelp1def.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelp1def.setMinimumSize(preferredSize);
                        panelp1def.setPreferredSize(preferredSize);
                    }
                }
                Panel1.add(panelp1def);
                panelp1def.setBounds(245, 90, 600, 170);

                //======== panelq1 ========
                {
                    panelq1.setPreferredSize(new Dimension(60, 60));
                    panelq1.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelq1.setEnabled(false);
                    panelq1.setVisible(false);
                    panelq1.setLayout(null);

                    //---- labelq1 ----
                    labelq1.setText("Q1. Find out the students currently enrolled under an instructor in a batch.");
                    panelq1.add(labelq1);
                    labelq1.setBounds(new Rectangle(new Point(15, 20), labelq1.getPreferredSize()));

                    //---- label3 ----
                    label3.setText("Instructor Id: ");
                    panelq1.add(label3);
                    label3.setBounds(new Rectangle(new Point(45, 60), label3.getPreferredSize()));

                    //---- label4 ----
                    label4.setText("Batch: ");
                    panelq1.add(label4);
                    label4.setBounds(new Rectangle(new Point(45, 90), label4.getPreferredSize()));

                    //---- textFieldq1inid ----
                    textFieldq1inid.setText("Eg. I205");
                    panelq1.add(textFieldq1inid);
                    textFieldq1inid.setBounds(145, 55, 215, textFieldq1inid.getPreferredSize().height);

                    //---- comboBoxq1batch ----
                    comboBoxq1batch.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Batch Year",
                            "2013",
                            "2014",
                            "2015",
                            "2016"
                    }));
                    panelq1.add(comboBoxq1batch);
                    comboBoxq1batch.setBounds(145, 90, 215, comboBoxq1batch.getPreferredSize().height);

                    //---- buttonq1go ----
                    buttonq1go.setText("Go");
                    buttonq1go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttonq1go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttonq1go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttonq1go.setBorderPainted(false);
                    buttonq1go.setAlignmentY(0.0F);
                    buttonq1go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttonq1go.setActionCommand("    Conflicting Deadlines");
                    buttonq1go.addActionListener(e -> buttonq1goActionPerformed(e));
                    panelq1.add(buttonq1go);
                    buttonq1go.setBounds(435, 75, 105, 30);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelq1.getComponentCount(); i++) {
                            Rectangle bounds = panelq1.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelq1.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelq1.setMinimumSize(preferredSize);
                        panelq1.setPreferredSize(preferredSize);
                    }
                }
                Panel1.add(panelq1);
                panelq1.setBounds(245, 90, 600, 170);

                //======== panelq2 ========
                {
                    panelq2.setPreferredSize(new Dimension(60, 60));
                    panelq2.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelq2.setVisible(false);
                    panelq2.setLayout(null);

                    //---- label5 ----
                    label5.setText("Q2. Find out the deadlines scheduled on the same day for a student.");
                    panelq2.add(label5);
                    label5.setBounds(new Rectangle(new Point(15, 20), label5.getPreferredSize()));

                    //---- label6 ----
                    label6.setText("Student Roll No: ");
                    panelq2.add(label6);
                    label6.setBounds(new Rectangle(new Point(45, 60), label6.getPreferredSize()));

                    //---- label7 ----
                    label7.setText("Date: ");
                    panelq2.add(label7);
                    label7.setBounds(new Rectangle(new Point(45, 95), label7.getPreferredSize()));

                    //---- textFieldq2rollno ----
                    textFieldq2rollno.setText("Eg. 205012");
                    panelq2.add(textFieldq2rollno);
                    textFieldq2rollno.setBounds(160, 55, 215, textFieldq2rollno.getPreferredSize().height);

                    //---- buttonq2go ----
                    buttonq2go.setText("Go");
                    buttonq2go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttonq2go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttonq2go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttonq2go.setBorderPainted(false);
                    buttonq2go.setAlignmentY(0.0F);
                    buttonq2go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttonq2go.setActionCommand("    Conflicting Deadlines");
                    buttonq2go.addActionListener(e -> buttonq2goActionPerformed(e));
                    panelq2.add(buttonq2go);
                    buttonq2go.setBounds(435, 70, 105, 30);

                    //---- textFieldq2date ----
                    textFieldq2date.setText("DD/MM/YYYY");
                    panelq2.add(textFieldq2date);
                    textFieldq2date.setBounds(160, 90, 215, 30);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelq2.getComponentCount(); i++) {
                            Rectangle bounds = panelq2.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelq2.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelq2.setMinimumSize(preferredSize);
                        panelq2.setPreferredSize(preferredSize);
                    }
                }
                Panel1.add(panelq2);
                panelq2.setBounds(245, 90, 600, 170);

                //======== panelq3 ========
                {
                    panelq3.setPreferredSize(new Dimension(60, 60));
                    panelq3.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelq3.setVisible(false);
                    panelq3.setLayout(null);

                    //---- label8 ----
                    label8.setText("Q3. Find out the average grade an instructor gives in his courses.");
                    panelq3.add(label8);
                    label8.setBounds(new Rectangle(new Point(15, 20), label8.getPreferredSize()));

                    //---- label9 ----
                    label9.setText("Instructor Id: ");
                    panelq3.add(label9);
                    label9.setBounds(new Rectangle(new Point(45, 75), label9.getPreferredSize()));

                    //---- textFieldq3inod ----
                    textFieldq3inod.setText("Eg. I205");
                    panelq3.add(textFieldq3inod);
                    textFieldq3inod.setBounds(160, 70, 215, textFieldq3inod.getPreferredSize().height);

                    //---- buttonq3go ----
                    buttonq3go.setText("Go");
                    buttonq3go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttonq3go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttonq3go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttonq3go.setBorderPainted(false);
                    buttonq3go.setAlignmentY(0.0F);
                    buttonq3go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttonq3go.setActionCommand("    Conflicting Deadlines");
                    buttonq3go.addActionListener(e -> buttonq3goActionPerformed(e));
                    panelq3.add(buttonq3go);
                    buttonq3go.setBounds(435, 70, 105, 30);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelq3.getComponentCount(); i++) {
                            Rectangle bounds = panelq3.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelq3.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelq3.setMinimumSize(preferredSize);
                        panelq3.setPreferredSize(preferredSize);
                    }
                }
                Panel1.add(panelq3);
                panelq3.setBounds(245, 90, 600, 170);

                //======== panelq4 ========
                {
                    panelq4.setPreferredSize(new Dimension(60, 60));
                    panelq4.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelq4.setVisible(false);
                    panelq4.setLayout(null);

                    //---- label16 ----
                    label16.setText("Q4. Find out if a TA from a course is available during the free time of a student on a day. ");
                    panelq4.add(label16);
                    label16.setBounds(new Rectangle(new Point(10, 15), label16.getPreferredSize()));

                    //---- label17 ----
                    label17.setText("Student Roll No: ");
                    panelq4.add(label17);
                    label17.setBounds(new Rectangle(new Point(45, 55), label17.getPreferredSize()));

                    //---- label18 ----
                    label18.setText("Day: ");
                    panelq4.add(label18);
                    label18.setBounds(new Rectangle(new Point(45, 90), label18.getPreferredSize()));

                    //---- textFieldq4rollno ----
                    textFieldq4rollno.setText("Eg. 205012");
                    panelq4.add(textFieldq4rollno);
                    textFieldq4rollno.setBounds(160, 50, 215, textFieldq4rollno.getPreferredSize().height);

                    //---- buttonq4go ----
                    buttonq4go.setText("Go");
                    buttonq4go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttonq4go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttonq4go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttonq4go.setBorderPainted(false);
                    buttonq4go.setAlignmentY(0.0F);
                    buttonq4go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttonq4go.setActionCommand("    Conflicting Deadlines");
                    buttonq4go.addActionListener(e -> buttonq4goActionPerformed(e));
                    panelq4.add(buttonq4go);
                    buttonq4go.setBounds(435, 85, 105, 30);

                    //---- textFieldq4cid ----
                    textFieldq4cid.setText("Eg. CSE101");
                    panelq4.add(textFieldq4cid);
                    textFieldq4cid.setBounds(160, 120, 215, 31);

                    //---- label19 ----
                    label19.setText("Course Id: ");
                    panelq4.add(label19);
                    label19.setBounds(45, 125, 105, 21);

                    //---- comboBoxq4day ----
                    comboBoxq4day.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Day",
                            "Monday",
                            "Tuesday",
                            "Wednesday",
                            "Thursday",
                            "Friday",
                            "Saturday",
                            "Sunday"
                    }));
                    panelq4.add(comboBoxq4day);
                    comboBoxq4day.setBounds(160, 85, 214, comboBoxq4day.getPreferredSize().height);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelq4.getComponentCount(); i++) {
                            Rectangle bounds = panelq4.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelq4.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelq4.setMinimumSize(preferredSize);
                        panelq4.setPreferredSize(preferredSize);
                    }
                }
                Panel1.add(panelq4);
                panelq4.setBounds(245, 90, 600, 170);

                //======== panelq5 ========
                {
                    panelq5.setPreferredSize(new Dimension(60, 60));
                    panelq5.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelq5.setVisible(false);
                    panelq5.setLayout(null);

                    //---- label14 ----
                    label14.setText("Q5. Find out the students who have taken all the course under a professor. ");
                    panelq5.add(label14);
                    label14.setBounds(new Rectangle(new Point(20, 15), label14.getPreferredSize()));

                    //---- label15 ----
                    label15.setText("Instructor Id: ");
                    panelq5.add(label15);
                    label15.setBounds(new Rectangle(new Point(45, 80), label15.getPreferredSize()));

                    //---- textFieldq5inid ----
                    textFieldq5inid.setText("Eg. I205");
                    panelq5.add(textFieldq5inid);
                    textFieldq5inid.setBounds(160, 75, 215, textFieldq5inid.getPreferredSize().height);

                    //---- buttonq5go ----
                    buttonq5go.setText("Go");
                    buttonq5go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttonq5go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttonq5go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttonq5go.setBorderPainted(false);
                    buttonq5go.setAlignmentY(0.0F);
                    buttonq5go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttonq5go.setActionCommand("    Conflicting Deadlines");
                    buttonq5go.addActionListener(e -> buttonq5goActionPerformed(e));
                    panelq5.add(buttonq5go);
                    buttonq5go.setBounds(435, 75, 105, 30);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelq5.getComponentCount(); i++) {
                            Rectangle bounds = panelq5.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelq5.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelq5.setMinimumSize(preferredSize);
                        panelq5.setPreferredSize(preferredSize);
                    }
                }
                Panel1.add(panelq5);
                panelq5.setBounds(245, 90, 600, 170);

                //======== panelq6 ========
                {
                    panelq6.setPreferredSize(new Dimension(60, 60));
                    panelq6.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelq6.setVisible(false);
                    panelq6.setLayout(null);

                    //---- label10 ----
                    label10.setText("Q6. Find out which room(s) are available for extra class on a day.");
                    panelq6.add(label10);
                    label10.setBounds(new Rectangle(new Point(20, 15), label10.getPreferredSize()));

                    //---- label12 ----
                    label12.setText("Day: ");
                    panelq6.add(label12);
                    label12.setBounds(new Rectangle(new Point(45, 60), label12.getPreferredSize()));

                    //---- buttonq6go ----
                    buttonq6go.setText("Go");
                    buttonq6go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttonq6go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttonq6go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttonq6go.setBorderPainted(false);
                    buttonq6go.setAlignmentY(0.0F);
                    buttonq6go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttonq6go.setActionCommand("    Conflicting Deadlines");
                    buttonq6go.addActionListener(e -> buttonq6goActionPerformed(e));
                    panelq6.add(buttonq6go);
                    buttonq6go.setBounds(435, 75, 105, 30);

                    //---- textFieldq6time ----
                    textFieldq6time.setText("Eg. 1200 ");
                    panelq6.add(textFieldq6time);
                    textFieldq6time.setBounds(160, 90, 215, 31);

                    //---- label13 ----
                    label13.setText("Needed After: ");
                    panelq6.add(label13);
                    label13.setBounds(45, 95, 105, 21);

                    //---- comboBoxq6day ----
                    comboBoxq6day.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Day",
                            "Monday",
                            "Tuesday",
                            "Wednesday",
                            "Thursday",
                            "Friday",
                            "Saturday",
                            "Sunday"
                    }));
                    panelq6.add(comboBoxq6day);
                    comboBoxq6day.setBounds(160, 55, 214, comboBoxq6day.getPreferredSize().height);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelq6.getComponentCount(); i++) {
                            Rectangle bounds = panelq6.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelq6.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelq6.setMinimumSize(preferredSize);
                        panelq6.setPreferredSize(preferredSize);
                    }
                }
                Panel1.add(panelq6);
                panelq6.setBounds(245, 90, 600, 170);

                //======== panelq8 ========
                {
                    panelq8.setPreferredSize(new Dimension(60, 60));
                    panelq8.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelq8.setVisible(false);
                    panelq8.setLayout(null);

                    //---- label21 ----
                    label21.setText("Q8. Find out students who are eligible to be a TA in a course. (Grade>=8)");
                    panelq8.add(label21);
                    label21.setBounds(new Rectangle(new Point(10, 15), label21.getPreferredSize()));

                    //---- label22 ----
                    label22.setText("Batch: ");
                    panelq8.add(label22);
                    label22.setBounds(new Rectangle(new Point(45, 55), label22.getPreferredSize()));

                    //---- label23 ----
                    label23.setText("Stream: ");
                    panelq8.add(label23);
                    label23.setBounds(new Rectangle(new Point(45, 90), label23.getPreferredSize()));

                    //---- buttonq8go ----
                    buttonq8go.setText("Go");
                    buttonq8go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttonq8go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttonq8go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttonq8go.setBorderPainted(false);
                    buttonq8go.setAlignmentY(0.0F);
                    buttonq8go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttonq8go.setActionCommand("    Conflicting Deadlines");
                    buttonq8go.addActionListener(e -> buttonq8goActionPerformed(e));
                    panelq8.add(buttonq8go);
                    buttonq8go.setBounds(435, 85, 105, 30);

                    //---- textFieldq8cid ----
                    textFieldq8cid.setText("Eg. CSE101");
                    panelq8.add(textFieldq8cid);
                    textFieldq8cid.setBounds(160, 120, 215, 31);

                    //---- label24 ----
                    label24.setText("Course Id: ");
                    panelq8.add(label24);
                    label24.setBounds(45, 125, 105, 21);

                    //---- comboBoxq8stream ----
                    comboBoxq8stream.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Stream",
                            "CSE",
                            "ECE",
                            "CSAM"
                    }));
                    panelq8.add(comboBoxq8stream);
                    comboBoxq8stream.setBounds(160, 85, 214, 30);

                    //---- comboBoxq8batch ----
                    comboBoxq8batch.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Batch",
                            "2013",
                            "2014",
                            "2015",
                            "2016"
                    }));
                    panelq8.add(comboBoxq8batch);
                    comboBoxq8batch.setBounds(160, 50, 214, 33);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelq8.getComponentCount(); i++) {
                            Rectangle bounds = panelq8.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelq8.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelq8.setMinimumSize(preferredSize);
                        panelq8.setPreferredSize(preferredSize);
                    }
                }
                Panel1.add(panelq8);
                panelq8.setBounds(245, 90, 600, 170);

                //======== panelq7 ========
                {
                    panelq7.setPreferredSize(new Dimension(60, 60));
                    panelq7.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelq7.setVisible(false);
                    panelq7.setLayout(null);

                    //---- label11 ----
                    label11.setText("Q7. Find out the order of difficulty of courses for a student.");
                    panelq7.add(label11);
                    label11.setBounds(new Rectangle(new Point(25, 15), label11.getPreferredSize()));

                    //---- label20 ----
                    label20.setText("Student Roll No: ");
                    panelq7.add(label20);
                    label20.setBounds(new Rectangle(new Point(45, 80), label20.getPreferredSize()));

                    //---- textFieldq7rollno ----
                    textFieldq7rollno.setText("Eg. 205012");
                    panelq7.add(textFieldq7rollno);
                    textFieldq7rollno.setBounds(160, 75, 215, textFieldq7rollno.getPreferredSize().height);

                    //---- buttonq7go ----
                    buttonq7go.setText("Go");
                    buttonq7go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttonq7go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttonq7go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttonq7go.setBorderPainted(false);
                    buttonq7go.setAlignmentY(0.0F);
                    buttonq7go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttonq7go.setActionCommand("    Conflicting Deadlines");
                    buttonq7go.addActionListener(e -> buttonq7goActionPerformed(e));
                    panelq7.add(buttonq7go);
                    buttonq7go.setBounds(435, 75, 105, 30);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelq7.getComponentCount(); i++) {
                            Rectangle bounds = panelq7.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelq7.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelq7.setMinimumSize(preferredSize);
                        panelq7.setPreferredSize(preferredSize);
                    }
                }
                Panel1.add(panelq7);
                panelq7.setBounds(245, 90, 600, 170);

                //======== panelq9 ========
                {
                    panelq9.setPreferredSize(new Dimension(60, 60));
                    panelq9.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelq9.setVisible(false);
                    panelq9.setLayout(null);

                    //---- label25 ----
                    label25.setText("Q9. Find out students who are TAs in atleast 2 courses.");
                    panelq9.add(label25);
                    label25.setBounds(new Rectangle(new Point(35, 15), label25.getPreferredSize()));

                    //---- label26 ----
                    label26.setText("Batch: ");
                    panelq9.add(label26);
                    label26.setBounds(new Rectangle(new Point(45, 60), label26.getPreferredSize()));

                    //---- label27 ----
                    label27.setText("Stream: ");
                    //panelq9.add(label27);
                    label27.setBounds(new Rectangle(new Point(45, 95), label27.getPreferredSize()));

                    //---- buttonq9go ----
                    buttonq9go.setText("Go");
                    buttonq9go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttonq9go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttonq9go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttonq9go.setBorderPainted(false);
                    buttonq9go.setAlignmentY(0.0F);
                    buttonq9go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttonq9go.setActionCommand("    Conflicting Deadlines");
                    buttonq9go.addActionListener(e -> buttonq9goActionPerformed(e));
                    panelq9.add(buttonq9go);
                    buttonq9go.setBounds(435, 55, 105, 30);

                    //---- comboBoxq9stream ----
                    comboBoxq9stream.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Stream",
                            "CSE",
                            "ECE",
                            "CSAM"
                    }));
                    //panelq9.add(comboBoxq9stream);
                    comboBoxq9stream.setBounds(160, 90, 214, 35);

                    //---- comboBoxq9batch ----
                    comboBoxq9batch.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Batch",
                            "2012",
                            "2013",
                            "2014",
                            "2015",
                            "2016"
                    }));
                    panelq9.add(comboBoxq9batch);
                    comboBoxq9batch.setBounds(160, 55, 214, 33);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelq9.getComponentCount(); i++) {
                            Rectangle bounds = panelq9.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelq9.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelq9.setMinimumSize(preferredSize);
                        panelq9.setPreferredSize(preferredSize);
                    }
                }
                Panel1.add(panelq9);
                panelq9.setBounds(245, 90, 600, 170);

                //======== panelq10 ========
                {
                    panelq10.setPreferredSize(new Dimension(60, 60));
                    panelq10.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelq10.setVisible(false);
                    panelq10.setLayout(null);

                    //---- label31 ----
                    label31.setText("Q10. Find out if there is a class before the deadlines in a course on the same day.");
                    panelq10.add(label31);
                    label31.setBounds(new Rectangle(new Point(35, 15), label31.getPreferredSize()));

                    //---- label32 ----
                    label32.setText("Course Id:");
                    panelq10.add(label32);
                    label32.setBounds(new Rectangle(new Point(55, 60), label32.getPreferredSize()));

                    //---- textFieldq10courseid ----
                    textFieldq10courseid.setText("Eg. CSE101");
                    panelq10.add(textFieldq10courseid);
                    textFieldq10courseid.setBounds(160, 55, 215, 31);

                    //---- buttonq10go ----
                    buttonq10go.setText("Go");
                    buttonq10go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttonq10go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttonq10go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttonq10go.setBorderPainted(false);
                    buttonq10go.setAlignmentY(0.0F);
                    buttonq10go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttonq10go.setActionCommand("    Conflicting Deadlines");
                    buttonq10go.addActionListener(e -> buttonq10goActionPerformed(e));
                    panelq10.add(buttonq10go);
                    buttonq10go.setBounds(435, 75, 105, 30);

                    //---- label36 ----
                    label36.setText("Date:");
                    panelq10.add(label36);
                    label36.setBounds(55, 105, 65, 21);

                    //---- textFieldq10date ----
                    textFieldq10date.setText("DD/MM/YYYY");
                    panelq10.add(textFieldq10date);
                    textFieldq10date.setBounds(160, 100, 215, 31);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelq10.getComponentCount(); i++) {
                            Rectangle bounds = panelq10.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelq10.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelq10.setMinimumSize(preferredSize);
                        panelq10.setPreferredSize(preferredSize);
                    }
                }
                Panel1.add(panelq10);
                panelq10.setBounds(245, 90, 600, 170);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < Panel1.getComponentCount(); i++) {
                        Rectangle bounds = Panel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = Panel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    Panel1.setMinimumSize(preferredSize);
                    Panel1.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(Panel1);
            Panel1.setBounds(0, 0, 846, 500);

            //======== Panel2 ========
            {
                Panel2.setVisible(false);
                Panel2.setLayout(null);

                //---- label33 ----
                label33.setText("Administrator Login");
                label33.setHorizontalAlignment(SwingConstants.CENTER);
                label33.setFont(label33.getFont().deriveFont(label33.getFont().getSize() + 10f));
                Panel2.add(label33);
                label33.setBounds(225, 130, 375, 52);

                //---- label34 ----
                label34.setText("Login: ");
                Panel2.add(label34);
                label34.setBounds(new Rectangle(new Point(245, 225), label34.getPreferredSize()));

                //---- label35 ----
                label35.setText("Password: ");
                Panel2.add(label35);
                label35.setBounds(245, 270, 165, 21);

                //---- textFieldp2login ----
                textFieldp2login.setText("Eg. admin123");
                Panel2.add(textFieldp2login);
                textFieldp2login.setBounds(345, 220, 215, textFieldp2login.getPreferredSize().height);
                Panel2.add(passwordFieldp2pass);
                passwordFieldp2pass.setBounds(345, 265, 215, passwordFieldp2pass.getPreferredSize().height);

                //---- buttonp2go ----
                buttonp2go.setText("Go");
                buttonp2go.setIcon(new ImageIcon("admin-numb/next.png"));
                buttonp2go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonp2go.setBackground(UIManager.getColor("Panel.background"));
                buttonp2go.setBorderPainted(false);
                buttonp2go.setAlignmentY(0.0F);
                buttonp2go.setHorizontalAlignment(SwingConstants.LEADING);
                buttonp2go.setActionCommand("    Conflicting Deadlines");
                buttonp2go.addActionListener(e -> buttonp2goActionPerformed(e));
                Panel2.add(buttonp2go);
                buttonp2go.setBounds(560, 335, 105, 30);

                //---- buttonp2back ----
                buttonp2back.setIcon(new ImageIcon("admin-numb/back.png"));
                buttonp2back.addActionListener(e -> buttonp2backActionPerformed(e));
                Panel2.add(buttonp2back);
                buttonp2back.setBounds(20, 15, 40, 40);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < Panel2.getComponentCount(); i++) {
                        Rectangle bounds = Panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = Panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    Panel2.setMinimumSize(preferredSize);
                    Panel2.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(Panel2);
            Panel2.setBounds(0, 0, 845, 500);

            //======== Panel3 ========
            {
                Panel3.setBackground(UIManager.getColor("Table.dropLineShortColor"));
                Panel3.setVisible(false);
                Panel3.setLayout(null);

                //======== panelutext ========
                {
                    panelutext.setLayout(null);

                    //---- label68 ----
                    label68.setText("Administrator \n\n");
                    label68.setFont(label68.getFont().deriveFont(label68.getFont().getSize() + 10f));
                    panelutext.add(label68);
                    label68.setBounds(new Rectangle(new Point(40, 20), label68.getPreferredSize()));

                    //---- label69 ----
                    label69.setText("Panel\n");
                    label69.setFont(label69.getFont().deriveFont(label69.getFont().getSize() + 11f));
                    label69.setHorizontalAlignment(SwingConstants.CENTER);
                    panelutext.add(label69);
                    label69.setBounds(50, 50, 132, 29);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelutext.getComponentCount(); i++) {
                            Rectangle bounds = panelutext.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelutext.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelutext.setMinimumSize(preferredSize);
                        panelutext.setPreferredSize(preferredSize);
                    }
                }
                Panel3.add(panelutext);
                panelutext.setBounds(0, 400, 245, 100);

                //---- buttonlogin ----
                buttonlogin.setText("    Login");
                buttonlogin.setIcon(new ImageIcon("admin-numb/login.png"));
                buttonlogin.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonlogin.setBackground(UIManager.getColor("Panel.background"));
                buttonlogin.setAlignmentY(0.0F);
                buttonlogin.setHorizontalAlignment(SwingConstants.LEFT);
                buttonlogin.setBorderPainted(false);
                buttonlogin.setSelectedIcon(new ImageIcon("admin-numb/slogin.png"));
                buttonlogin.setPressedIcon(new ImageIcon("admin-numb/slogin.png"));
                buttonlogin.addActionListener(e -> buttonloginActionPerformed(e));
                Panel3.add(buttonlogin);
                buttonlogin.setBounds(0, 0, 245, 50);

                //---- buttonstudents ----
                buttonstudents.setText("    Students");
                buttonstudents.setIcon(new ImageIcon("admin-numb/student.png"));
                buttonstudents.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonstudents.setBackground(UIManager.getColor("Panel.background"));
                buttonstudents.setBorderPainted(false);
                buttonstudents.setAlignmentY(0.0F);
                buttonstudents.setHorizontalAlignment(SwingConstants.LEFT);
                buttonstudents.setActionCommand("    Conflicting Deadlines");
                buttonstudents.setSelectedIcon(new ImageIcon("admin-numb/sstudent.png"));
                buttonstudents.addActionListener(e -> buttonstudentsActionPerformed(e));
                Panel3.add(buttonstudents);
                buttonstudents.setBounds(0, 50, 245, 50);

                //---- buttoninstructor ----
                buttoninstructor.setText("    Instructor");
                buttoninstructor.setIcon(new ImageIcon("admin-numb/instructor.png"));
                buttoninstructor.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttoninstructor.setBackground(UIManager.getColor("Panel.background"));
                buttoninstructor.setBorderPainted(false);
                buttoninstructor.setAlignmentY(0.0F);
                buttoninstructor.setHorizontalAlignment(SwingConstants.LEFT);
                buttoninstructor.setActionCommand("    Conflicting Deadlines");
                buttoninstructor.setSelectedIcon(new ImageIcon("admin-numb/sinstructor.png"));
                buttoninstructor.addActionListener(e -> buttoninstructorActionPerformed(e));
                Panel3.add(buttoninstructor);
                buttoninstructor.setBounds(0, 100, 245, 50);

                //---- buttonTA ----
                buttonTA.setText("    TA");
                buttonTA.setIcon(new ImageIcon("admin-numb/ta.png"));
                buttonTA.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonTA.setBackground(UIManager.getColor("Panel.background"));
                buttonTA.setBorderPainted(false);
                buttonTA.setAlignmentY(0.0F);
                buttonTA.setHorizontalAlignment(SwingConstants.LEFT);
                buttonTA.setActionCommand("    Conflicting Deadlines");
                buttonTA.setSelectedIcon(new ImageIcon("admin-numb/sta.png"));
                buttonTA.addActionListener(e -> buttonTAActionPerformed(e));
                Panel3.add(buttonTA);
                buttonTA.setBounds(0, 150, 245, 50);

                //---- buttonCourses ----
                buttonCourses.setText("    Courses");
                buttonCourses.setIcon(new ImageIcon("admin-numb/course.png"));
                buttonCourses.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonCourses.setBackground(UIManager.getColor("Panel.background"));
                buttonCourses.setBorderPainted(false);
                buttonCourses.setAlignmentY(0.0F);
                buttonCourses.setHorizontalAlignment(SwingConstants.LEFT);
                buttonCourses.setActionCommand("    Conflicting Deadlines");
                buttonCourses.setSelectedIcon(new ImageIcon("admin-numb/scourse.png"));
                buttonCourses.addActionListener(e -> buttonCoursesActionPerformed(e));
                Panel3.add(buttonCourses);
                buttonCourses.setBounds(0, 200, 245, 50);

                //---- buttonRep ----
                buttonRep.setText("    Student Report");
                buttonRep.setIcon(new ImageIcon("admin-numb/report.png"));
                buttonRep.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonRep.setBackground(UIManager.getColor("Panel.background"));
                buttonRep.setBorderPainted(false);
                buttonRep.setAlignmentY(0.0F);
                buttonRep.setHorizontalAlignment(SwingConstants.LEFT);
                buttonRep.setActionCommand("    Conflicting Deadlines");
                buttonRep.setSelectedIcon(new ImageIcon("admin-numb/sreport.png"));
                buttonRep.addActionListener(e -> buttonRepActionPerformed(e));
                Panel3.add(buttonRep);
                buttonRep.setBounds(0, 250, 245, 50);

                //---- buttonTT ----
                buttonTT.setText("    TimeTable");
                buttonTT.setIcon(new ImageIcon("admin-numb/timetable.png"));
                buttonTT.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonTT.setBackground(UIManager.getColor("Panel.background"));
                buttonTT.setBorderPainted(false);
                buttonTT.setAlignmentY(0.0F);
                buttonTT.setHorizontalAlignment(SwingConstants.LEFT);
                buttonTT.setActionCommand("    Conflicting Deadlines");
                buttonTT.setSelectedIcon(new ImageIcon("admin-numb/stimetable.png"));
                buttonTT.addActionListener(e -> buttonTTActionPerformed(e));
                Panel3.add(buttonTT);
                buttonTT.setBounds(0, 300, 245, 50);

                //---- buttonDead ----
                buttonDead.setText("    Deadlines");
                buttonDead.setIcon(new ImageIcon("admin-numb/deadlines.png"));
                buttonDead.setBorder(new BevelBorder(BevelBorder.LOWERED));
                buttonDead.setBackground(UIManager.getColor("Panel.background"));
                buttonDead.setBorderPainted(false);
                buttonDead.setAlignmentY(0.0F);
                buttonDead.setHorizontalAlignment(SwingConstants.LEFT);
                buttonDead.setSelectedIcon(new ImageIcon("admin-numb/sdeadlines.png"));
                buttonDead.addActionListener(e -> buttonDeadActionPerformed(e));
                Panel3.add(buttonDead);
                buttonDead.setBounds(0, 350, 245, 50);

                //======== panelp3table ========
                {
                    panelp3table.setPreferredSize(new Dimension(60, 60));
                    panelp3table.setBackground(UIManager.getColor("Panel.background"));
                    panelp3table.setLayout(null);

                    //======== scrollPane2 ========
                    {

                        //---- tablep3 ----
                        tablep3.setSelectionBackground(UIManager.getColor("Button.background"));
                        tablep3.setBorder(new EmptyBorder(5, 5, 5, 5));
                        tablep3.setModel(tableMod2);
                        tablep3.setAutoscrolls(false);
                        tablep3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                        tablep3.setGridColor(UIManager.getColor("Button.darcula.color2"));
                        scrollPane2.setViewportView(tablep3);
                    }
                    panelp3table.add(scrollPane2);
                    scrollPane2.setBounds(0, 0, 600, 200);

                    //---- buttonp3next ----
                    buttonp3next.setText("Next");
                    buttonp3next.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttonp3next.addActionListener(e -> {buttonp3nextActionPerformed(e);} );
                    buttonp3next.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttonp3next.setBackground(UIManager.getColor("Panel.background"));
                    buttonp3next.setBorderPainted(false);
                    buttonp3next.setAlignmentY(0.0F);
                    buttonp3next.setHorizontalAlignment(SwingConstants.LEADING);
                    buttonp3next.setActionCommand("    Conflicting Deadlines");
                    panelp3table.add(buttonp3next);
                    buttonp3next.setBounds(495, 205, 105, 30);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelp3table.getComponentCount(); i++) {
                            Rectangle bounds = panelp3table.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelp3table.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelp3table.setMinimumSize(preferredSize);
                        panelp3table.setPreferredSize(preferredSize);
                    }
                }
                Panel3.add(panelp3table);
                panelp3table.setBounds(245, 260, 600, 240);

                //======== panelp3head ========
                {
                    panelp3head.setPreferredSize(new Dimension(60, 60));
                    panelp3head.setBackground(UIManager.getColor("Button.background"));
                    panelp3head.setLayout(null);

                    //---- label39 ----
                    label39.setIcon(new ImageIcon("admin-numb/u2.png"));
                    label39.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelp3head.add(label39);
                    label39.setBounds(-45, -10, 480, 110);

                    //---- buttoncross ----
                    buttoncross.setIcon(new ImageIcon("admin-numb/cross1.png"));
                    buttoncross.addActionListener(e -> buttoncrossActionPerformed(e));
                    panelp3head.add(buttoncross);
                    buttoncross.setBounds(540, 15, 50, 45);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelp3head.getComponentCount(); i++) {
                            Rectangle bounds = panelp3head.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelp3head.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelp3head.setMinimumSize(preferredSize);
                        panelp3head.setPreferredSize(preferredSize);
                    }
                }
                Panel3.add(panelp3head);
                panelp3head.setBounds(235, 0, 610, 90);

                //======== panelp3def ========
                {
                    panelp3def.setPreferredSize(new Dimension(60, 60));
                    panelp3def.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panelp3def.setEnabled(false);
                    panelp3def.setLayout(null);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panelp3def.getComponentCount(); i++) {
                            Rectangle bounds = panelp3def.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panelp3def.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panelp3def.setMinimumSize(preferredSize);
                        panelp3def.setPreferredSize(preferredSize);
                    }
                }
                Panel3.add(panelp3def);
                panelp3def.setBounds(245, 90, 600, 170);

                //======== panela1 ========
                {
                    panela1.setPreferredSize(new Dimension(60, 60));
                    panela1.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panela1.setEnabled(false);
                    panela1.setVisible(false);
                    panela1.setLayout(null);

                    //---- label63 ----
                    label63.setText("List of Administrators:");
                    label63.setFont(label63.getFont().deriveFont(label63.getFont().getSize() + 6f));
                    panela1.add(label63);
                    label63.setBounds(new Rectangle(new Point(20, 65), label63.getPreferredSize()));

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panela1.getComponentCount(); i++) {
                            Rectangle bounds = panela1.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panela1.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panela1.setMinimumSize(preferredSize);
                        panela1.setPreferredSize(preferredSize);
                    }
                }
                Panel3.add(panela1);
                panela1.setBounds(245, 90, 600, 170);

                //======== panela2 ========
                {
                    panela2.setPreferredSize(new Dimension(60, 60));
                    panela2.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panela2.setEnabled(false);
                    panela2.setVisible(false);
                    panela2.setLayout(null);

                    //---- label40 ----
                    label40.setText("Insert to Student table:");
                    panela2.add(label40);
                    label40.setBounds(new Rectangle(new Point(10, 10), label40.getPreferredSize()));

                    //---- label41 ----
                    label41.setText("Name:");
                    panela2.add(label41);
                    label41.setBounds(new Rectangle(new Point(10, 40), label41.getPreferredSize()));

                    //---- label42 ----
                    label42.setText("Stream:");
                    panela2.add(label42);
                    label42.setBounds(new Rectangle(new Point(10, 75), label42.getPreferredSize()));

                    //---- textFielda2name ----
                    textFielda2name.setText("Eg. Varnit Jain");
                    panela2.add(textFielda2name);
                    textFielda2name.setBounds(100, 35, 175, textFielda2name.getPreferredSize().height);

                    //---- comboBoxa2stream ----
                    comboBoxa2stream.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Stream",
                            "CSE",
                            "ECE",
                            "CSAM"
                    }));
                    panela2.add(comboBoxa2stream);
                    comboBoxa2stream.setBounds(100, 70, 175, comboBoxa2stream.getPreferredSize().height);

                    //---- buttona2go ----
                    buttona2go.setText("Go");
                    buttona2go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttona2go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttona2go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttona2go.setBorderPainted(false);
                    buttona2go.setAlignmentY(0.0F);
                    buttona2go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttona2go.setActionCommand("    Conflicting Deadlines");
                    buttona2go.addActionListener(e -> buttona2goActionPerformed(e));
                    panela2.add(buttona2go);
                    buttona2go.setBounds(480, 130, 105, 30);

                    //---- textFielda2roll ----
                    textFielda2roll.setText("Eg. 2015012");
                    panela2.add(textFielda2roll);
                    textFielda2roll.setBounds(100, 105, 175, 31);

                    //---- label70 ----
                    label70.setText("Roll No:");
                    panela2.add(label70);
                    label70.setBounds(10, 110, 86, 21);

                    //---- textFielda2gpa ----
                    textFielda2gpa.setText("Eg. 9.8");
                    panela2.add(textFielda2gpa);
                    textFielda2gpa.setBounds(400, 35, 175, 31);

                    //---- label71 ----
                    label71.setText("CGPA: ");
                    panela2.add(label71);
                    label71.setBounds(310, 40, 86, 21);

                    //---- textFielda2email ----
                    textFielda2email.setText("Eg. abc@xyz.com");
                    panela2.add(textFielda2email);
                    textFielda2email.setBounds(400, 70, 175, 31);

                    //---- label72 ----
                    label72.setText("email:");
                    panela2.add(label72);
                    label72.setBounds(310, 75, 86, 21);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panela2.getComponentCount(); i++) {
                            Rectangle bounds = panela2.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panela2.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panela2.setMinimumSize(preferredSize);
                        panela2.setPreferredSize(preferredSize);
                    }
                }
                Panel3.add(panela2);
                panela2.setBounds(245, 90, 600, 170);

                //======== panela3 ========
                {
                    panela3.setPreferredSize(new Dimension(60, 60));
                    panela3.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panela3.setEnabled(false);
                    panela3.setVisible(false);
                    panela3.setLayout(null);

                    //---- label45 ----
                    label45.setText("Insert to Instructor table:");
                    panela3.add(label45);
                    label45.setBounds(new Rectangle(new Point(10, 10), label45.getPreferredSize()));

                    //---- label46 ----
                    label46.setText("Name:");
                    panela3.add(label46);
                    label46.setBounds(new Rectangle(new Point(10, 40), label46.getPreferredSize()));

                    //---- label47 ----
                    label47.setText("Office Day:");
                    panela3.add(label47);
                    label47.setBounds(new Rectangle(new Point(10, 75), label47.getPreferredSize()));

                    //---- textFielda3name ----
                    textFielda3name.setText("Eg. Vikram Goel");
                    panela3.add(textFielda3name);
                    textFielda3name.setBounds(100, 35, 175, textFielda3name.getPreferredSize().height);

                    //---- comboBox13 ----
                    comboBox13.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Day",
                            "Monday",
                            "Tuesday",
                            "Wednesday",
                            "Thursday",
                            "Friday",
                            "Saturday",
                            "Sunday"
                    }));
                    panela3.add(comboBox13);
                    comboBox13.setBounds(100, 70, 175, comboBox13.getPreferredSize().height);

                    //---- buttona3go ----
                    buttona3go.setText("Go");
                    buttona3go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttona3go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttona3go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttona3go.setBorderPainted(false);
                    buttona3go.setAlignmentY(0.0F);
                    buttona3go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttona3go.setActionCommand("    Conflicting Deadlines");
                    buttona3go.addActionListener(e -> buttona3goActionPerformed(e));
                    panela3.add(buttona3go);
                    buttona3go.setBounds(480, 130, 105, 30);

                    //---- textFielda3inid ----
                    textFielda3inid.setText("Eg. I205");
                    panela3.add(textFielda3inid);
                    textFielda3inid.setBounds(100, 105, 175, 31);

                    //---- label73 ----
                    label73.setText("Instructor Id:");
                    panela3.add(label73);
                    label73.setBounds(10, 110, 86, 21);

                    //---- textFielda3ots ----
                    textFielda3ots.setText("Eg. 1200");
                    panela3.add(textFielda3ots);
                    textFielda3ots.setBounds(400, 35, 85, 31);

                    //---- label75 ----
                    label75.setText("Office Time: ");
                    panela3.add(label75);
                    label75.setBounds(310, 40, 86, 21);

                    //---- textFielda3email ----
                    textFielda3email.setText("Eg. abc@xyz.com");
                    panela3.add(textFielda3email);
                    textFielda3email.setBounds(400, 70, 175, 31);

                    //---- label76 ----
                    label76.setText("email:");
                    panela3.add(label76);
                    label76.setBounds(310, 75, 86, 21);

                    //---- textFielda3otf ----
                    textFielda3otf.setText("Eg. 1300");
                    panela3.add(textFielda3otf);
                    textFielda3otf.setBounds(495, 35, 80, 31);

                    //---- label77 ----
                    label77.setText("-");
                    panela3.add(label77);
                    label77.setBounds(490, 40, 40, label77.getPreferredSize().height);

                    //======== panel19 ========
                    {
                        panel19.setPreferredSize(new Dimension(60, 60));
                        panel19.setBackground(UIManager.getColor("Button.darcula.color1"));
                        panel19.setEnabled(false);
                        panel19.setVisible(false);
                        panel19.setLayout(null);

                        //---- label43 ----
                        label43.setText("Insert to Login table:");
                        panel19.add(label43);
                        label43.setBounds(new Rectangle(new Point(10, 10), label43.getPreferredSize()));

                        //---- label44 ----
                        label44.setText("Login:");
                        panel19.add(label44);
                        label44.setBounds(new Rectangle(new Point(10, 55), label44.getPreferredSize()));

                        //---- textField14 ----
                        textField14.setText("Eg. admin69");
                        panel19.add(textField14);
                        textField14.setBounds(100, 50, 175, textField14.getPreferredSize().height);

                        //---- button40 ----
                        button40.setText("Go");
                        button40.setIcon(new ImageIcon("admin-numb/next.png"));
                        button40.setBorder(new BevelBorder(BevelBorder.LOWERED));
                        button40.setBackground(UIManager.getColor("Button.darcula.color1"));
                        button40.setBorderPainted(false);
                        button40.setAlignmentY(0.0F);
                        button40.setHorizontalAlignment(SwingConstants.LEADING);
                        button40.setActionCommand("    Conflicting Deadlines");
                        panel19.add(button40);
                        button40.setBounds(470, 120, 105, 30);

                        //---- textField28 ----
                        textField28.setText("Eg. mypass123");
                        panel19.add(textField28);
                        textField28.setBounds(400, 50, 175, 31);

                        //---- label74 ----
                        label74.setText("Password: ");
                        panel19.add(label74);
                        label74.setBounds(310, 55, 86, 21);

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < panel19.getComponentCount(); i++) {
                                Rectangle bounds = panel19.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = panel19.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            panel19.setMinimumSize(preferredSize);
                            panel19.setPreferredSize(preferredSize);
                        }
                    }
                    panela3.add(panel19);
                    panel19.setBounds(0, 237, 600, 170);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panela3.getComponentCount(); i++) {
                            Rectangle bounds = panela3.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panela3.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panela3.setMinimumSize(preferredSize);
                        panela3.setPreferredSize(preferredSize);
                    }
                }
                Panel3.add(panela3);
                panela3.setBounds(245, 90, 600, 170);

                //======== panela4 ========
                {
                    panela4.setPreferredSize(new Dimension(60, 60));
                    panela4.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panela4.setEnabled(false);
                    panela4.setVisible(false);
                    panela4.setLayout(null);

                    //---- label51 ----
                    label51.setText("Insert to TA table:");
                    panela4.add(label51);
                    label51.setBounds(new Rectangle(new Point(10, 10), label51.getPreferredSize()));

                    //---- label52 ----
                    label52.setText("Name:");
                    panela4.add(label52);
                    label52.setBounds(new Rectangle(new Point(10, 40), label52.getPreferredSize()));

                    //---- label53 ----
                    label53.setText("Office Day:");
                    panela4.add(label53);
                    label53.setBounds(new Rectangle(new Point(10, 75), label53.getPreferredSize()));

                    //---- textFielda4name ----
                    textFielda4name.setText("Eg. Vasu Kumar");
                    panela4.add(textFielda4name);
                    textFielda4name.setBounds(100, 35, 175, textFielda4name.getPreferredSize().height);

                    //---- comboBoxa4day ----
                    comboBoxa4day.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Day",
                            "Monday",
                            "Tuesday",
                            "Wednesday",
                            "Thursday",
                            "Friday",
                            "Saturday",
                            "Sunday"
                    }));
                    panela4.add(comboBoxa4day);
                    comboBoxa4day.setBounds(100, 70, 175, comboBoxa4day.getPreferredSize().height);

                    //---- buttona4go ----
                    buttona4go.setText("Go");
                    buttona4go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttona4go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttona4go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttona4go.setBorderPainted(false);
                    buttona4go.setAlignmentY(0.0F);
                    buttona4go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttona4go.setActionCommand("    Conflicting Deadlines");
                    buttona4go.addActionListener(e -> buttona4goActionPerformed(e));
                    panela4.add(buttona4go);
                    buttona4go.setBounds(480, 130, 105, 30);

                    //---- textFielda4rollno ----
                    textFielda4rollno.setText("Eg. 2015123");
                    panela4.add(textFielda4rollno);
                    textFielda4rollno.setBounds(100, 105, 175, 31);

                    //---- label81 ----
                    label81.setText("Roll No:");
                    panela4.add(label81);
                    label81.setBounds(10, 110, 86, 21);

                    //---- textFielda4ofs ----
                    textFielda4ofs.setText("Eg. 1200");
                    panela4.add(textFielda4ofs);
                    textFielda4ofs.setBounds(400, 35, 85, 31);

                    //---- label82 ----
                    label82.setText("Office Time: ");
                    panela4.add(label82);
                    label82.setBounds(310, 40, 86, 21);

                    //---- textFielda4cid ----
                    textFielda4cid.setText("Eg. CSE101");
                    panela4.add(textFielda4cid);
                    textFielda4cid.setBounds(400, 70, 175, 31);

                    //---- label83 ----
                    label83.setText("Course Id:");
                    panela4.add(label83);
                    label83.setBounds(310, 75, 86, 21);

                    //---- textFielda4otf ----
                    textFielda4otf.setText("Eg. 1300");
                    panela4.add(textFielda4otf);
                    textFielda4otf.setBounds(495, 35, 80, 31);

                    //---- label84 ----
                    label84.setText("-");
                    panela4.add(label84);
                    label84.setBounds(490, 40, 40, label84.getPreferredSize().height);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panela4.getComponentCount(); i++) {
                            Rectangle bounds = panela4.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panela4.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panela4.setMinimumSize(preferredSize);
                        panela4.setPreferredSize(preferredSize);
                    }
                }
                Panel3.add(panela4);
                panela4.setBounds(245, 90, 600, 170);

                //======== panela5 ========
                {
                    panela5.setPreferredSize(new Dimension(60, 60));
                    panela5.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panela5.setEnabled(false);
                    panela5.setVisible(false);
                    panela5.setLayout(null);

                    //---- label48 ----
                    label48.setText("Insert to Course table:");
                    panela5.add(label48);
                    label48.setBounds(new Rectangle(new Point(10, 10), label48.getPreferredSize()));

                    //---- label49 ----
                    label49.setText("Name:");
                    panela5.add(label49);
                    label49.setBounds(new Rectangle(new Point(10, 40), label49.getPreferredSize()));

                    //---- label50 ----
                    label50.setText("Type:");
                    panela5.add(label50);
                    label50.setBounds(new Rectangle(new Point(10, 75), label50.getPreferredSize()));

                    //---- textFielda5course ----
                    textFielda5course.setText("Eg. DBMS");
                    panela5.add(textFielda5course);
                    textFielda5course.setBounds(100, 35, 175, textFielda5course.getPreferredSize().height);

                    //---- comboBoxa5ctype ----
                    comboBoxa5ctype.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Type",
                            "CSE",
                            "ECE",
                            "CSAM"
                    }));
                    panela5.add(comboBoxa5ctype);
                    comboBoxa5ctype.setBounds(100, 70, 175, comboBoxa5ctype.getPreferredSize().height);

                    //---- buttona5go ----
                    buttona5go.setText("Go");
                    buttona5go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttona5go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttona5go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttona5go.setBorderPainted(false);
                    buttona5go.setAlignmentY(0.0F);
                    buttona5go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttona5go.setActionCommand("    Conflicting Deadlines");
                    buttona5go.addActionListener(e -> buttona5goActionPerformed(e));
                    panela5.add(buttona5go);
                    buttona5go.setBounds(480, 130, 105, 30);

                    //---- textFielda5cid ----
                    textFielda5cid.setText("Eg. CSE101");
                    panela5.add(textFielda5cid);
                    textFielda5cid.setBounds(100, 105, 175, 31);

                    //---- label78 ----
                    label78.setText("Course Id:");
                    panela5.add(label78);
                    label78.setBounds(10, 110, 86, 21);

                    //---- textFielda5inid ----
                    textFielda5inid.setText("Eg. I205");
                    panela5.add(textFielda5inid);
                    textFielda5inid.setBounds(400, 35, 175, 31);

                    //---- label79 ----
                    label79.setText("Instructor Id: ");
                    panela5.add(label79);
                    label79.setBounds(310, 40, 86, 21);

                    //---- textFielda5books ----
                    textFielda5books.setText("Eg. Lost Soul");
                    panela5.add(textFielda5books);
                    textFielda5books.setBounds(400, 70, 175, 31);

                    //---- label80 ----
                    label80.setText("Books:");
                    panela5.add(label80);
                    label80.setBounds(310, 75, 86, 21);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panela5.getComponentCount(); i++) {
                            Rectangle bounds = panela5.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panela5.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panela5.setMinimumSize(preferredSize);
                        panela5.setPreferredSize(preferredSize);
                    }
                }
                Panel3.add(panela5);
                panela5.setBounds(245, 90, 600, 170);

                //======== panela6 ========
                {
                    panela6.setPreferredSize(new Dimension(60, 60));
                    panela6.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panela6.setEnabled(false);
                    panela6.setVisible(false);
                    panela6.setLayout(null);

                    //---- label54 ----
                    label54.setText("Insert to Report table:");
                    panela6.add(label54);
                    label54.setBounds(new Rectangle(new Point(10, 10), label54.getPreferredSize()));

                    //---- label55 ----
                    label55.setText("Roll No:");
                    panela6.add(label55);
                    label55.setBounds(new Rectangle(new Point(10, 40), label55.getPreferredSize()));

                    //---- label56 ----
                    label56.setText("Grade:");
                    panela6.add(label56);
                    label56.setBounds(new Rectangle(new Point(10, 75), label56.getPreferredSize()));

                    //---- comboBoxa6grade ----
                    comboBoxa6grade.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Grade",
                            "10",
                            "9",
                            "8",
                            "7",
                            "6",
                            "5"
                    }));
                    panela6.add(comboBoxa6grade);
                    comboBoxa6grade.setBounds(100, 70, 175, comboBoxa6grade.getPreferredSize().height);

                    //---- buttona6go ----
                    buttona6go.setText("Go");
                    buttona6go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttona6go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttona6go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttona6go.setBorderPainted(false);
                    buttona6go.setAlignmentY(0.0F);
                    buttona6go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttona6go.setActionCommand("    Conflicting Deadlines");
                    buttona6go.addActionListener(e -> buttona6goActionPerformed(e));
                    panela6.add(buttona6go);
                    buttona6go.setBounds(480, 130, 105, 30);

                    //---- textFielda6rollno ----
                    textFielda6rollno.setText("Eg. 2015012");
                    panela6.add(textFielda6rollno);
                    textFielda6rollno.setBounds(100, 35, 175, 31);

                    //---- textFielda6cid ----
                    textFielda6cid.setText("Eg. CSE101");
                    panela6.add(textFielda6cid);
                    textFielda6cid.setBounds(400, 35, 175, 31);

                    //---- label86 ----
                    label86.setText("Course Id: ");
                    panela6.add(label86);
                    label86.setBounds(310, 40, 86, 21);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panela6.getComponentCount(); i++) {
                            Rectangle bounds = panela6.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panela6.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panela6.setMinimumSize(preferredSize);
                        panela6.setPreferredSize(preferredSize);
                    }
                }
                Panel3.add(panela6);
                panela6.setBounds(245, 90, 600, 170);

                //======== panela7 ========
                {
                    panela7.setPreferredSize(new Dimension(60, 60));
                    panela7.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panela7.setEnabled(false);
                    panela7.setVisible(false);
                    panela7.setLayout(null);

                    //---- label57 ----
                    label57.setText("Insert to TimeTable:");
                    panela7.add(label57);
                    label57.setBounds(new Rectangle(new Point(10, 10), label57.getPreferredSize()));

                    //---- label58 ----
                    label58.setText("Course Id:");
                    panela7.add(label58);
                    label58.setBounds(new Rectangle(new Point(10, 40), label58.getPreferredSize()));

                    //---- label59 ----
                    label59.setText("Day:");
                    panela7.add(label59);
                    label59.setBounds(new Rectangle(new Point(10, 75), label59.getPreferredSize()));

                    //---- textFielda7cid ----
                    textFielda7cid.setText("Eg. CSE101");
                    panela7.add(textFielda7cid);
                    textFielda7cid.setBounds(100, 35, 175, textFielda7cid.getPreferredSize().height);

                    //---- comboBoxa7day ----
                    comboBoxa7day.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Day",
                            "Monday",
                            "Tuesday",
                            "Wednesday",
                            "Thursday",
                            "Friday",
                            "Saturday",
                            "Sunday"
                    }));
                    panela7.add(comboBoxa7day);
                    comboBoxa7day.setBounds(100, 70, 175, comboBoxa7day.getPreferredSize().height);

                    //---- buttona7go ----
                    buttona7go.setText("Go");
                    buttona7go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttona7go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttona7go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttona7go.setBorderPainted(false);
                    buttona7go.setAlignmentY(0.0F);
                    buttona7go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttona7go.setActionCommand("    Conflicting Deadlines");
                    buttona7go.addActionListener(e -> buttona7goActionPerformed(e));
                    panela7.add(buttona7go);
                    buttona7go.setBounds(480, 130, 105, 30);

                    //---- textFielda7ts ----
                    textFielda7ts.setText("Eg. 1200");
                    panela7.add(textFielda7ts);
                    textFielda7ts.setBounds(400, 35, 85, 31);

                    //---- label87 ----
                    label87.setText("Time: ");
                    panela7.add(label87);
                    label87.setBounds(310, 40, 86, 21);

                    //---- textFielda7room ----
                    textFielda7room.setText("Eg. C12");
                    panela7.add(textFielda7room);
                    textFielda7room.setBounds(400, 70, 175, 31);

                    //---- label88 ----
                    label88.setText("Room:");
                    panela7.add(label88);
                    label88.setBounds(310, 75, 86, 21);

                    //---- textFielda7tf ----
                    textFielda7tf.setText("Eg. 1300");
                    panela7.add(textFielda7tf);
                    textFielda7tf.setBounds(495, 35, 80, 31);

                    //---- label89 ----
                    label89.setText("-");
                    panela7.add(label89);
                    label89.setBounds(490, 40, 40, label89.getPreferredSize().height);

                    //---- textFielda7nt ----
                    textFielda7nt.setText("Eg. 1400");
                    panela7.add(textFielda7nt);
                    textFielda7nt.setBounds(100, 110, 175, 31);

                    //---- label64 ----
                    label64.setText("Next Class:");
                    panela7.add(label64);
                    label64.setBounds(10, 115, 85, 21);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panela7.getComponentCount(); i++) {
                            Rectangle bounds = panela7.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panela7.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panela7.setMinimumSize(preferredSize);
                        panela7.setPreferredSize(preferredSize);
                    }
                }
                Panel3.add(panela7);
                panela7.setBounds(245, 90, 600, 170);

                //======== panela8 ========
                {
                    panela8.setPreferredSize(new Dimension(60, 60));
                    panela8.setBackground(UIManager.getColor("Button.darcula.color1"));
                    panela8.setEnabled(false);
                    panela8.setVisible(false);
                    panela8.setLayout(null);

                    //---- label60 ----
                    label60.setText("Insert to Deadlines table:");
                    panela8.add(label60);
                    label60.setBounds(new Rectangle(new Point(10, 10), label60.getPreferredSize()));

                    //---- label61 ----
                    label61.setText("Course Id:");
                    panela8.add(label61);
                    label61.setBounds(new Rectangle(new Point(10, 40), label61.getPreferredSize()));

                    //---- label62 ----
                    label62.setText("Date:");
                    panela8.add(label62);
                    label62.setBounds(new Rectangle(new Point(10, 75), label62.getPreferredSize()));

                    //---- textFielda8cid ----
                    textFielda8cid.setText("Eg. CSE101");
                    panela8.add(textFielda8cid);
                    textFielda8cid.setBounds(100, 35, 175, textFielda8cid.getPreferredSize().height);

                    //---- buttona8go ----
                    buttona8go.setText("Go");
                    buttona8go.setIcon(new ImageIcon("admin-numb/next.png"));
                    buttona8go.setBorder(new BevelBorder(BevelBorder.LOWERED));
                    buttona8go.setBackground(UIManager.getColor("Button.darcula.color1"));
                    buttona8go.setBorderPainted(false);
                    buttona8go.setAlignmentY(0.0F);
                    buttona8go.setHorizontalAlignment(SwingConstants.LEADING);
                    buttona8go.setActionCommand("    Conflicting Deadlines");
                    buttona8go.addActionListener(e -> buttona8goActionPerformed(e));
                    panela8.add(buttona8go);
                    buttona8go.setBounds(480, 130, 105, 30);

                    //---- textFielda8time ----
                    textFielda8time.setText("Eg. 1200");
                    panela8.add(textFielda8time);
                    textFielda8time.setBounds(400, 35, 175, 31);

                    //---- label90 ----
                    label90.setText("Time: ");
                    panela8.add(label90);
                    label90.setBounds(310, 40, 86, 21);

                    //---- textFielda8topic ----
                    textFielda8topic.setText("Eg. Circuits");
                    panela8.add(textFielda8topic);
                    textFielda8topic.setBounds(400, 70, 175, 31);

                    //---- label91 ----
                    label91.setText("Topic:");
                    panela8.add(label91);
                    label91.setBounds(310, 75, 86, 21);

                    //---- textFielda8date ----
                    textFielda8date.setText("DD/MM/YYYY");
                    panela8.add(textFielda8date);
                    textFielda8date.setBounds(100, 75, 175, textFielda8date.getPreferredSize().height);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panela8.getComponentCount(); i++) {
                            Rectangle bounds = panela8.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panela8.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panela8.setMinimumSize(preferredSize);
                        panela8.setPreferredSize(preferredSize);
                    }
                }
                Panel3.add(panela8);
                panela8.setBounds(245, 90, 600, 170);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < Panel3.getComponentCount(); i++) {
                        Rectangle bounds = Panel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = Panel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    Panel3.setMinimumSize(preferredSize);
                    Panel3.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(Panel3);
            Panel3.setBounds(0, 0, 846, 500);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < frame1ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = frame1ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = frame1ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                frame1ContentPane.setMinimumSize(preferredSize);
                frame1ContentPane.setPreferredSize(preferredSize);
            }
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private void buttonp3nextActionPerformed(ActionEvent e) {
        if(pageNo*10<count){
            displayShit();
            pageNo++;
        }else{
            pageNo=0;
            displayShit();
        }
    }

    private void buttonp1nextActionPerformed(ActionEvent e) {
        if(pageNo*10<count){
            displayShit();
            pageNo++;
        }else{
            pageNo=0;
            displayShit();
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Aman Agarwal
    private JFrame frame1;
    private JPanel Panel0;
    private JLabel label1;
    private JLabel label2;
    private JButton buttonenter;
    private JLabel label28;
    private JPanel panel1;
    private JPanel Panel1;
    private JButton buttonp11;
    private JButton buttonp12;
    private JButton buttonp13;
    private JButton buttonp14;
    private JButton buttonp15;
    private JButton buttonp16;
    private JButton buttonp17;
    private JButton buttonp18;
    private JButton buttonp19;
    private JButton buttonp20;
    private JPanel panelp1table;
    private JScrollPane scrollPane1;
    private JTable tablep1;
    private JButton buttonp1next;
    private JPanel panelp1head;
    private JLabel labelp1head;
    private JButton buttonp1admin;
    private JPanel panelp1def;
    private JPanel panelq1;
    private JLabel labelq1;
    private JLabel label3;
    private JLabel label4;
    private JTextField textFieldq1inid;
    private JComboBox<String> comboBoxq1batch;
    private JButton buttonq1go;
    private JPanel panelq2;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JTextField textFieldq2rollno;
    private JButton buttonq2go;
    private JTextField textFieldq2date;
    private JPanel panelq3;
    private JLabel label8;
    private JLabel label9;
    private JTextField textFieldq3inod;
    private JButton buttonq3go;
    private JPanel panelq4;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JTextField textFieldq4rollno;
    private JButton buttonq4go;
    private JTextField textFieldq4cid;
    private JLabel label19;
    private JComboBox<String> comboBoxq4day;
    private JPanel panelq5;
    private JLabel label14;
    private JLabel label15;
    private JTextField textFieldq5inid;
    private JButton buttonq5go;
    private JPanel panelq6;
    private JLabel label10;
    private JLabel label12;
    private JButton buttonq6go;
    private JTextField textFieldq6time;
    private JLabel label13;
    private JComboBox<String> comboBoxq6day;
    private JPanel panelq8;
    private JLabel label21;
    private JLabel label22;
    private JLabel label23;
    private JButton buttonq8go;
    private JTextField textFieldq8cid;
    private JLabel label24;
    private JComboBox<String> comboBoxq8stream;
    private JComboBox<String> comboBoxq8batch;
    private JPanel panelq7;
    private JLabel label11;
    private JLabel label20;
    private JTextField textFieldq7rollno;
    private JButton buttonq7go;
    private JPanel panelq9;
    private JLabel label25;
    private JLabel label26;
    private JLabel label27;
    private JButton buttonq9go;
    private JComboBox<String> comboBoxq9stream;
    private JComboBox<String> comboBoxq9batch;
    private JPanel panelq10;
    private JLabel label31;
    private JLabel label32;
    private JTextField textFieldq10courseid;
    private JButton buttonq10go;
    private JLabel label36;
    private JTextField textFieldq10date;
    private JPanel Panel2;
    private JLabel label33;
    private JLabel label34;
    private JLabel label35;
    private JTextField textFieldp2login;
    private JPasswordField passwordFieldp2pass;
    private JButton buttonp2go;
    private JButton buttonp2back;
    private JPanel Panel3;
    private JPanel panelutext;
    private JLabel label68;
    private JLabel label69;
    private JButton buttonlogin;
    private JButton buttonstudents;
    private JButton buttoninstructor;
    private JButton buttonTA;
    private JButton buttonCourses;
    private JButton buttonRep;
    private JButton buttonTT;
    private JButton buttonDead;
    private JPanel panelp3table;
    private JScrollPane scrollPane2;
    private JTable tablep3;
    private JButton buttonp3next;
    private JPanel panelp3head;
    private JLabel label39;
    private JButton buttoncross;
    private JPanel panelp3def;
    private JPanel panela1;
    private JLabel label63;
    private JPanel panela2;
    private JLabel label40;
    private JLabel label41;
    private JLabel label42;
    private JTextField textFielda2name;
    private JComboBox<String> comboBoxa2stream;
    private JButton buttona2go;
    private JTextField textFielda2roll;
    private JLabel label70;
    private JTextField textFielda2gpa;
    private JLabel label71;
    private JTextField textFielda2email;
    private JLabel label72;
    private JPanel panela3;
    private JLabel label45;
    private JLabel label46;
    private JLabel label47;
    private JTextField textFielda3name;
    private JComboBox<String> comboBox13;
    private JButton buttona3go;
    private JTextField textFielda3inid;
    private JLabel label73;
    private JTextField textFielda3ots;
    private JLabel label75;
    private JTextField textFielda3email;
    private JLabel label76;
    private JTextField textFielda3otf;
    private JLabel label77;
    private JPanel panel19;
    private JLabel label43;
    private JLabel label44;
    private JTextField textField14;
    private JButton button40;
    private JTextField textField28;
    private JLabel label74;
    private JPanel panela4;
    private JLabel label51;
    private JLabel label52;
    private JLabel label53;
    private JTextField textFielda4name;
    private JComboBox<String> comboBoxa4day;
    private JButton buttona4go;
    private JTextField textFielda4rollno;
    private JLabel label81;
    private JTextField textFielda4ofs;
    private JLabel label82;
    private JTextField textFielda4cid;
    private JLabel label83;
    private JTextField textFielda4otf;
    private JLabel label84;
    private JPanel panela5;
    private JLabel label48;
    private JLabel label49;
    private JLabel label50;
    private JTextField textFielda5course;
    private JComboBox<String> comboBoxa5ctype;
    private JButton buttona5go;
    private JTextField textFielda5cid;
    private JLabel label78;
    private JTextField textFielda5inid;
    private JLabel label79;
    private JTextField textFielda5books;
    private JLabel label80;
    private JPanel panela6;
    private JLabel label54;
    private JLabel label55;
    private JLabel label56;
    private JComboBox<String> comboBoxa6grade;
    private JButton buttona6go;
    private JTextField textFielda6rollno;
    private JTextField textFielda6cid;
    private JLabel label86;
    private JPanel panela7;
    private JLabel label57;
    private JLabel label58;
    private JLabel label59;
    private JTextField textFielda7cid;
    private JComboBox<String> comboBoxa7day;
    private JButton buttona7go;
    private JTextField textFielda7ts;
    private JLabel label87;
    private JTextField textFielda7room;
    private JLabel label88;
    private JTextField textFielda7tf;
    private JLabel label89;
    private JTextField textFielda7nt;
    private JLabel label64;
    private JPanel panela8;
    private JLabel label60;
    private JLabel label61;
    private JLabel label62;
    private JTextField textFielda8cid;
    private JButton buttona8go;
    private JTextField textFielda8time;
    private JLabel label90;
    private JTextField textFielda8topic;
    private JLabel label91;
    private JTextField textFielda8date;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    static final String JDBC_DRIVER = "com.mysql/jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/dbmsproject";

    static final String uname = "root";
    static final String pass = "wow";
    private Connection con1 = null;
    private Statement st1 = null;



    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        BasicLookAndFeel darcula = new DarculaLaf();
        UIManager.setLookAndFeel(darcula);
        DbmsProject a = new DbmsProject();



        try{

            Class.forName("com.mysql.jdbc.Driver");

            //System.out.println("Connecting to database...");
            a.con1 = DriverManager.getConnection(DB_URL,uname,pass);

            System.out.printf("statement time");

            a.st1 = a.con1.createStatement();


            /*//query1
            String instid = "i2";
            String batch = "2015";

            String query1="select student.name, student.rollNo from student where student.rollno in " +
                    "(select rollNo from (select courseId from course where instructorId = \"" + instid + "\") I natural join" +
                    "(select rollNo,courseId from studentReport where studentReport.rollNo like \"" + batch + "%\") SR)";

            //System.out.println(query1);


            ResultSet res1 = a.st1.executeQuery(query1);
            while(res1.next()){
                String name = res1.getString("name");
                String rollNo = res1.getString("rollNo");

                System.out.print("name: " + name);
                //System.out.println(", rollNo: " + rollNo);

            }
            res1.close();
            //query1 end*/

            //Query2


        }catch (ClassNotFoundException ex1){
            ex1.printStackTrace();
        }catch(SQLException s){
            s.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                try {
                    a.st1.close();
                    a.con1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                //System.out.println("In shutdown hook");
            }
        }, "Shutdown-thread"));



    }
}