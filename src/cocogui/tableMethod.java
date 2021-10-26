/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocogui;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class tableMethod {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public tableMethod()
    {
        try
        {
          
            Class.forName("com.mysql.cj.jdbc.Driver");
         
            con = DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6432574","sql6432574","xyluL1fdLi");
          
            st = con.createStatement();
        }
        catch(Exception e)
        {
            System.out.println("Error is found: " + e);
        }
    }
    
    public ArrayList readTable(String tableName){
        //ArrayList to store
        ArrayList<String> allData=new ArrayList<String>();
        if("User".equals(tableName)){
            try{
                String sql = "select * from "+tableName;
                rs = st.executeQuery(sql);
                while(rs.next()){
                    String id=rs.getString("id");
                    String name = rs.getString("name");
                    String age = rs.getString("age");
                    String address = rs.getString("address");
                    String state = rs.getString("state");
                    String phoneNumber=rs.getString("phoneNumber");
                    String email=rs.getString("email");
                    String type=rs.getString("type");
                    String password=rs.getString("password");
                    //Write Data into arraylist delim=";"
                    allData.add(id+"\t"+name+"\t"+age+"\t"+address+"\t"+state+"\t"+phoneNumber+"\t" +email+"\t"+type+"\t"+password);
                }
            }catch(Exception ex){
                System.out.println("Error is found :"+ex);
            }
        }
        if("Request".equals(tableName)){
            try{
                String sql = "select * from "+tableName;
                rs = st.executeQuery(sql);
                while(rs.next()){
                    String a=rs.getString("email");
                    
                    String c = rs.getString("date");
                    String d=rs.getString("time");
                    String e=rs.getString("remarks");
                    String f=rs.getString("status");
                    //Write Data into arraylist delim=";"
                    allData.add(a+"\t"+c+"\t"+d+"\t"+e+"\t"+f);
                }
            }catch(Exception ex){
                
                System.out.println("Error is found :"+ex);
            }
        }
        
        if("foodBank".equals(tableName)){
            try{
                String sql = "select * from "+tableName;
                rs = st.executeQuery(sql);
                while(rs.next()){
                    String email=rs.getString("email");
                    String status = rs.getString("status");
                    
                    //Write Data into arraylist delim=";"
                    allData.add(email+"\t"+status);
                }
            }catch(Exception ex){
                System.out.println("Error is found :"+ex);
            }
        }
        return allData;
    }
    
    public void appendData(String tableName,String a){
        String[] arr=a.split("\t");
        String colName=("User".equals(tableName))?"(name, age, address, state, phoneNumber, email, type, password)":"(email, date, time, remarks, status)";
        try{
       
        String sql =("User".equals(tableName))? "INSERT INTO "+tableName+colName+" VALUES('"+arr[0]+"','"+arr[1]+"','"+arr[2]+"','"+arr[3]+"','"+arr[4]+"','"+arr[5]+"',"+arr[6]+",'"+arr[7]+"')":
        "INSERT INTO "+tableName+colName+" VALUES('"+arr[0]+"','"+arr[1]+"','"+arr[2]+"','"+arr[3]+"','"+arr[4]+"')";
        st.executeUpdate(sql);

        }
        catch(Exception ex){
          
            System.out.println("Error is found :"+ex);
        }
    }
    
        public void foodbank(String a){
        String[] arr=a.split("\t");
      
        try{
        String sql = "INSERT INTO foodBank VALUES('"+arr[5]+"','0')";
        st.executeUpdate(sql);

        }
        catch(Exception ex){
            System.out.println("Error is found :"+ex);
        }
    }
    
    public void deleteTable(String tableName){
        try{
            String sql="TRUNCATE TABLE "+tableName;
            st.executeUpdate(sql);
        }
        catch(Exception ex){
            System.out.println("Error is found :"+ex);
        }
    
    }
    
    public boolean checkAdminAcc(String username, String password){


        boolean checkUser = false;

        try{
            String sql = "select * from Admin where username= '"+ username + "' and password='" + password + "'" ;
            rs = st.executeQuery(sql);
           if(rs.next())
           {
              checkUser = true;
           }
        }catch(Exception ex){
            System.out.println("Error is found :"+ex);
        }

        return checkUser;
    }
    
    public boolean UpdateFoodBankOpen(String email){
        boolean checkUser = false;

        try{
            String sql = "UPDATE foodBank SET status=1 WHERE email ='"+email+"'";
            st.executeUpdate(sql);
            checkUser = true;
              
          
        }catch(Exception ex){
            System.out.println("Error is found :"+ex);
        }

        return checkUser;
}
    
     public boolean UpdateFoodBankClose(String email){
        boolean checkUser = false;

        try{
            String sql = "UPDATE foodBank SET status=0 WHERE email ='"+email+"'";
            st.executeUpdate(sql);
            checkUser = true;
              
          
        }catch(Exception ex){
            System.out.println("Error is found :"+ex);
        }

        return checkUser;
}
     public String getStatus(String email){
         String sql = "SELECT * FROM foodBank WHERE email='"+email + "'";
         String ae;
         try {
            rs = st.executeQuery(sql);
            rs.next();
            ae = rs.getString("status");
            
            return ae;
        } catch (SQLException ex) {
             
             return "0";
        }
     }
}
