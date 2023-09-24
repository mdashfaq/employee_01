package com.example.SpringProject.DTO;

public class EmployeeUpdateDTO {

    private int employeeid;
    private String employeename;
    private String employeeaddress;
    private int mobile;



    public EmployeeUpdateDTO(int employeeid, String employeename, String employeeaddress, int mobile) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeeaddress = employeeaddress;
        this.mobile = mobile;
    }

    public EmployeeUpdateDTO() {
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void getEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void getEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeeaddress() {
        return employeeaddress;
    }

    public void getEmployeeaddress(String employeeaddress) {
        this.employeeaddress = employeeaddress;
    }

    public int getMobile() {
        return mobile;
    }

    public void getMobile(int mobile) {
        this.mobile = mobile;
    }

}
