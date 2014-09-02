/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancepractice;

/**
 * This class stores a name in the form first middle last suffix,
 * providing empty strings if a portion of the name is not provided
 * @author Nathaniel Davis
 */
public class Name {
    private String first, middle, last, suffix;
    
    public Name(String first, String last)
    {
        this.first = first;
        this.last = last;
        this.middle = "";
        this.suffix = "";
    }
    
    public Name(String first, String middle, String last)
    {
        this.first = first;
        this.middle = middle;
        this.last = last;
        this.suffix = "";
    }
    
    public Name(String first, String middle, String last, String suffix)
    {
        this.first = first;
        this.middle = middle;
        this.last = last;
        this.suffix = suffix;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }
    
    public String getMiddleInitial()
    {
        return middle.substring(0);
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    
    @Override
    public String toString()
    {
        return first + middle + last + suffix;
    }
}
