package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
//"extends Person" makes Student a child of person.
public class Student extends Person{
	// ToDo 1: Make this class a child of Person
	// ToDo 2: Fix the resulting errors

    //address and gpa variables.
    private String address;
    double gpa;
	// ToDo 3: Add a field for GPA and create setter and getter

    //Constructor
    Student(String name, short age){
        //super calls the constructor of the person class and gives it name and age.
        super(name, age);

    }

    /**
     * public String getAddress()
     * required by the parent to have this method.
     * @return address
     */
    public String getAddress(){
        return address;
    }
    /**
     * public String setAddress()
     * required by the parent to have this method.
     * sets address for the student
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     * public String getGpa()
     * @return gpa
     */
    public double getGpa(){
        return gpa;
    }
    /**
     * public String setGpa()
     * sets gpa for the student
     */
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
	// ToDo 4: Add comments to your code

    /**
     * public String toString()
     * @return The student's information as a String
     */
    public String toString(){

        String toString = "Student Info:\nName: " + getName() + "\nAge: " + getAge() + "\nGPA: " + gpa;
        return toString;
    }


}