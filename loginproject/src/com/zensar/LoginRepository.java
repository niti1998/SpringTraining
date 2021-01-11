package com.zensar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginRepository {

	public boolean checkLogin(String userName,String password) {
        boolean result=false;
        Connection con=DBUtil.getMySqlDbConnection();
        String sql="select * from login where user_id=?";
        try {
            PreparedStatement pst=con.prepareStatement(sql);
             pst.setString(1,userName);
             ResultSet rs=pst.executeQuery();
             while(rs.next()) {
                 String passwordFromDb = rs.getString("password");
                 if(password.equals(passwordFromDb)){
                     result=true;
                 }
             }
        }catch(Exception e) {
             e.printStackTrace();
         }
     return result;
    }
}