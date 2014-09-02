/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;
import inheritancepractice.*;

/**
 *
 * @author viewt_000
 */
public abstract class Employee {
    private static int nextEmpNumber = 0;
    private int employeeNumber;
    private Name name;
    
    public Employee(Name name)
    {
        this.name = name;
        this.employeeNumber = nextEmpNumber;
        nextEmpNumber++;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
    
    public abstract double getPay();
    
    @Override
    public String toString()
    {
        return name.toString() + ", " + employeeNumber;
    }
}
