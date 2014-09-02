/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;
import inheritancepractice.*;
/**
 * This class implements a Salaried employee
 * the daysPaid property determines how many days of pay
 * the employee gets per paycheck (365 being the full salary, 1 being a single day).
 * @author viewt_000
 */
public class SalariedEmployee implements Employee
{
    private Name name;
    private int employeeNumber;
    private double annualSalary;
    private short daysPaid;
    
    public SalariedEmployee(Name name, double annualSalary, short daysPaid, int employeeNumber)
    {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.annualSalary = annualSalary;
        this.daysPaid = daysPaid;
    }
    
    @Override
    public double getPay()
    {
        return annualSalary * (daysPaid / 365);
    }

    @Override
    public Name getName() {
        return name;
    }

    @Override
    public int getEmployeeNumber()
    {
        return employeeNumber;
    }
}
