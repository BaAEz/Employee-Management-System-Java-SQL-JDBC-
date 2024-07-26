package com.tushar.empapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Implement implements Interface{
    Connection con;

    @Override
    public void createEmployee(employee emp) {
        con = DBconnect.createDBConnection();
        String query="insert into employee values(?,?,?,?)";
        try{
            PreparedStatement p=con.prepareStatement(query);
            p.setInt(1, emp.getId());
            p.setString(2, emp.getName());
            p.setDouble(3, emp.getSalary());
            p.setInt(4, emp.getAge());
            int cnt=p.executeUpdate();
            if(cnt!=0)
                System.out.println("Employee Inserted Successfully\n");


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void showAllEmployee() {
        con=DBconnect.createDBConnection();
        String query = "select * from employee";
        System.out.println("Employee Details :");
        System.out.println("-------------------------------------");
        System.out.format("%s\t%s\t%s\t%s\n","ID","Name","Salary","Age");
        System.out.println("-------------------------------------");
        try {
            Statement s = con.createStatement();
            ResultSet result=s.executeQuery(query);
            while(result.next()){
                System.out.format("%d\t%s\t%f\t%d\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getDouble(3),
                        result.getInt(4));
                System.out.println("-------------------------------------");
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void showEmployeeBasedOnID(int id) {
        con=DBconnect.createDBConnection();
        String query = "select * from employee where id ="+id;
        System.out.println("Employee Details :");
        System.out.println("-------------------------------------");
        System.out.format("%s\t%s\t%s\t%s\n","ID","Name","Salary","Age");
        System.out.println("-------------------------------------");
        try {
            Statement s = con.createStatement();
            ResultSet result=s.executeQuery(query);
            while(result.next()){
                System.out.format("%d\t%s\t%f\t%d\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getDouble(3),
                        result.getInt(4));
                System.out.println("-------------------------------------");
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void updateEmployeeID(int id, int n) {
        con=DBconnect.createDBConnection();
        String query = "update employee set id=? where id=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, n);
            pstm.setInt(2,id);
            int cnt=pstm.executeUpdate();
            if(cnt!=0)
                System.out.println("Employee Details Updated\n");

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void updateEmployeeName(int id, String name) {
        con=DBconnect.createDBConnection();
        String query = "update employee set name=? where id=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, name);
            pstm.setInt(2,id);
            int cnt=pstm.executeUpdate();
            if(cnt!=0)
                System.out.println("Employee Details Updated\n");

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void updateEmployeeSalary(int id, double n){
        con=DBconnect.createDBConnection();
        String query = "update employee set salary=? where id=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setDouble(1, n);
            pstm.setInt(2,id);
            int cnt=pstm.executeUpdate();
            if(cnt!=0)
                System.out.println("Employee Details Updated\n");

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void updateEmployeeAge(int id, int n){
        con=DBconnect.createDBConnection();
        String query = "update employee set age=? where id=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, n);
            pstm.setInt(2,id);
            int cnt=pstm.executeUpdate();
            if(cnt!=0)
                System.out.println("Employee Details Updated\n");

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void deleteEmployee(int id) {
        con=DBconnect.createDBConnection();
        String query = "delete from employee where id=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id);
            int cnt=pstm.executeUpdate();
            if(cnt!=0)
                System.out.println("Employee Deleted Sucessfully\n");

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
