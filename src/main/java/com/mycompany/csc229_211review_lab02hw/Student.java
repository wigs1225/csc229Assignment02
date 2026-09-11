package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person{
	// ToDo 1: Make this class a child of Person
	// ToDo 2: Fix the resulting errors

    private String address;
    double gpa;
	// ToDo 3: Add a field for GPA and create setter and getter

    Student(String name, short age, double gpa){
        super(name, age);
        this.gpa = gpa;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
	// ToDo 4: Add comments to your code

}