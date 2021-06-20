package com.company;

public class Student extends Person {
    public Student (String name) {
        super(name);
    }

    public void print(){
        System.out.println("I am in " +typePerson());
    }

    public String typePerson(){

        return "Student";
    }

}
