package com.company;

public class Staff extends Person{

    public Staff(String name) {
        super(name);
    }

    public void print(){
        System.out.println("I am in " +typePerson());
    }

    public String typePerson(){

        return "Staff";
    }
}
