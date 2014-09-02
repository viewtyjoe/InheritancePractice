/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;
import inheritancepractice.*;
/**
 *
 * @author viewt_000
 */
public class HourlyEmployee implements Employee
{
    private double hourlyRate;
    private double hours;
    private double overtimeMultiplier;
    private final int employeeNumber;
    private Name name;
    
    public HourlyEmployee(Name name, double hourlyRate, double overtimeMultiplier, int employeeNumber)
    {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.overtimeMultiplier = overtimeMultiplier;
        this.employeeNumber = employeeNumber;
    }
    
    public void addHours(double hours)
    {
        if(hours >= 0)
        {
            this.hours += hours;
        }
    }

    @Override
    public Name getName() {
        return name;
    }

    @Override
    public double getPay() 
    {
        double pay = 0;
        if(hours > 40)
        {
            pay += hourlyRate * 40;
            hours -= 40;
            pay += hours * overtimeMultiplier * hourlyRate;
        }
        else
        {
            pay = hours * hourlyRate;
        }
        hours = 0;
        return pay;
    }

    @Override
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setOvertimeMultiplier(double overtimeMultiplier) {
        this.overtimeMultiplier = overtimeMultiplier;
    }

    public void setName(Name name) {
        this.name = name;
    }
    
    
}
