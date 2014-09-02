/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;
import inheritancepractice.*;
/**
 *
 * @author viewt_000
 */
public class EmployeeTester {
    public static void main(String[] args) {
        SalariedEmployee bob = new SalariedEmployee(new Name("Bob", "Test"), 52000, (short)14);
        System.out.println(bob);
        System.out.println(bob.getPay());
    }
}
