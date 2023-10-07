package org.java8.complexpractice;

public class Employee {

    private int eId;
    private String empName;
    private Long eSalary;
    private Department eDept;

    public Employee(int eId, String empName, Long eSalary, Department eDept) {
        this.eId = eId;
        this.empName = empName;
        this.eSalary = eSalary;
        this.eDept = eDept;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long geteSalary() {
        return eSalary;
    }

    public void seteSalary(Long eSalary) {
        this.eSalary = eSalary;
    }

    public Department geteDept() {
        return eDept;
    }

    public void seteDept(Department eDept) {
        this.eDept = eDept;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", empName='" + empName + '\'' +
                ", eSalary=" + eSalary +
                ", eDept=" + eDept +
                '}';
    }
}
