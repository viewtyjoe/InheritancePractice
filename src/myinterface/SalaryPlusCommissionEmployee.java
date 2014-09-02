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
public class SalaryPlusCommissionEmployee extends SalariedEmployee{
    private double sales;
    private double commissionRate;
    
    public SalaryPlusCommissionEmployee(Name name, double salary, short daysPaid, double commissionRate,
            int employeeNumber)
    {
        super(name, salary, daysPaid, employeeNumber);
        this.commissionRate = commissionRate;
        this.sales = 0;
    }
    
    public void addSales(double amount)
    {
        if(amount >= 0)
        {
            sales += amount;
        }
    }
    
    @Override
    public double getPay()
    {
        double commission = sales * commissionRate;
        sales = 0;
        return super.getPay() + commission;
    }
}
