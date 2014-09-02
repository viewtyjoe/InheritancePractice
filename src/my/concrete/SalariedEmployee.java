/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;
import inheritancepractice.*;
/**
 * This class implements a Salaried employee
 * the daysPaid property determines how many days of pay
 * the employee gets per paycheck (365 being the full salary, 1 being a single day).
 * @author viewt_000
 */
public class SalariedEmployee extends Employee
{
    private double annualSalary;
    private short daysPaid;
    
    public SalariedEmployee(Name name, double annualSalary, short daysPaid)
    {
        super(name);
        this.annualSalary = annualSalary;
        this.daysPaid = daysPaid;
    }
    
    public double getPay()
    {
        return annualSalary * (daysPaid / 365.0);
    }
}
