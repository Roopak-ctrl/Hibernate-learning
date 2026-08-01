package com.tryHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private int e_id;
    private String e_name;
    private String branch;
    private int salary;

//    public Employee(int e_id, String e_name, String branch, int salary) {
//        this.e_id = e_id;
//        this.e_name = e_name;
//        this.branch = branch;
//        this.salary = salary;
//    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", e_name='" + e_name + '\'' +
                ", branch='" + branch + '\'' +
                ", salary=" + salary +
                '}';
    }
}
