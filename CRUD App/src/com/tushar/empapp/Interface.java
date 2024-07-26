package com.tushar.empapp;

public interface Interface {
    //create
    public void createEmployee(employee emp);
    //show all
    public void showAllEmployee();
    //show fil id
    public void showEmployeeBasedOnID(int id);
    //update
    public void updateEmployeeID(int id, int n);
    public void updateEmployeeName(int id, String name);
    public void updateEmployeeSalary(int id, double n);
    public void updateEmployeeAge(int id, int n);
    //delete
    public void deleteEmployee(int id);
}
