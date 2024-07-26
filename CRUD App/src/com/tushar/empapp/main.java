package com.tushar.empapp;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Implement dao=new Implement();
        System.out.println("Welcome");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Add Employee\n"+
                    "2.Show All Employee\n"+
                    "3.Show Employee Based on ID\n"+
                    "4.Update Employee\n"+
                    "5.Delete Employee\n");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            System.out.println();
            switch (ch){
                case 1:
                    employee emp = new employee();
                    System.out.println("Enter ID");
                    int id = sc.nextInt();
                    System.out.println("Name");
                    String name = sc.next();
                    System.out.println("Enter Salary");
                    double salary = sc.nextDouble();
                    System.out.println("Enter Age");
                    int age = sc.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    dao.createEmployee(emp);
                    break;
                case 2:
                    dao.showAllEmployee();
                    break;
                case 3:
                    System.out.println("Enter ID to Show Details");
                    int empid = sc.nextInt();
                    dao.showEmployeeBasedOnID(empid);
                    break;
                case 4:
                    System.out.println("Enter id to update details");
                    int id1=sc.nextInt();
                    System.out.println("1.Change id\n"+
                            "2.Change Name\n"+
                            "3.Change Salary\n"+
                            "4.Change Age\n");
                    System.out.print("Enter choice: ");
                    int up = sc.nextInt();
                    System.out.println();

                    switch (up) {
                        case 1:
                            System.out.println("Enter new id");
                            int nid = sc.nextInt();
                            dao.updateEmployeeID(id1, nid);
                            break;
                        case 2:
                            System.out.println("Enter new name");
                            String name1 = sc.next();
                            dao.updateEmployeeName(id1, name1);
                            break;
                        case 3:
                            System.out.println("Enter new Salary");
                            double nsalary = sc.nextDouble();
                            dao.updateEmployeeSalary(id1, nsalary);
                            break;
                        case 4:
                            System.out.println("Enter new Age");
                            int nage = sc.nextInt();
                            dao.updateEmployeeAge(id1, nage);
                            break;
                        default:
                            System.out.println("Enter Valid Choice");
                            break;
                    }
                    break;

                case 5:
                    System.out.println("Enter the ID to Delete");
                    id=sc.nextInt();
                    dao.deleteEmployee(id);
                    break;
                case 6:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice");
                    break;

            }

        }while(true);
    }
}
