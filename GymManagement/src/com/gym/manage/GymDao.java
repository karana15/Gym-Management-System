package com.gym.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class GymDao {
	
	public static boolean insertMemberToDB(gym gy) {
		boolean f=false;
		try {
			
			//jdbc code
			Connection con = CP.createC();
			String q="insert into members(mname, mage, mgender, mphone, maddress, mpack) values(?,?,?,?,?,?)";
			
			//prepared statement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of parameter
			pstmt.setString(1, gy.getMemberName());
			pstmt.setInt(2, gy.getMemberAge());
			pstmt.setString(3, gy.getMemberGender());
			pstmt.setString(4, gy.getMemberPhone());
			pstmt.setString(5, gy.getMemberAddress());
			pstmt.setString(6, gy.getMemberPack());
			
			//execute
			pstmt.executeUpdate();
			
			f=true;
		
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return f;
	}

	public static boolean deleteMember(int userId) {
		boolean f = false;
		try {
			
			//jbdc code
			Connection con = CP.createC();
			String q="detele from members where mid=?";
			//prepared statement
			PreparedStatement pstmt= con.prepareStatement(q);
			//set the value
			pstmt.setInt(1, userId);
			
			pstmt.executeUpdate();
			
			f=true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showAll() {
		try {
			
			Connection con = CP.createC();
			String q="select * from members";
			
			Statement stmt= con.createStatement();
			ResultSet set= stmt.executeQuery(q);
			
			while(set.next()) {
				int id =set.getInt(1);
				String name=set.getString(2);
				int age=set.getInt(3);
				String gender= set.getString(4);
				String phone= set.getString(5);
				String address=set.getString(6);
				String pack=set.getString(7);
				
				System.out.println("Id: "+ id);
				System.out.println("Name: "+ name);
				System.out.println("Age: "+age);
				System.out.println("Gender: "+gender);
				System.out.println("Phone no.: "+phone);
				System.out.println("Address: "+address);
				System.out.println("Active Package: "+pack);
				System.out.println("---------+++++++----------+++++++++--------");
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public static void memberdetail(int id) {
		try {
			//jbdc code
			Connection con = CP.createC();
			String q="select * from members where mid=?";
			//prepared statement
			PreparedStatement pstmt= con.prepareStatement(q);
			//set the value
			pstmt.setInt(1, id);
			
			ResultSet set= pstmt.executeQuery();
			
			while(set.next()) {
				int iid =set.getInt(1);
				String name=set.getString(2);
				int age=set.getInt(3);
				String gender= set.getString(4);
				String phone= set.getString(5);
				String address=set.getString(6);
				String pack=set.getString(7);
				
				System.out.println("Id: "+ iid);
				System.out.println("Name: "+ name);
				System.out.println("Age: "+age);
				System.out.println("Gender: "+gender);
				System.out.println("Phone no.: "+phone);
				System.out.println("Address: "+address);
				System.out.println("Active Package: "+pack);
				System.out.println("---------+++++++----------+++++++++--------");
				
				
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
