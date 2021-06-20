package com.company;

public class App {
    public static void main(String[] args) {
        Person[] arrays={
         new Cleaner("Ivan"),
         new Student("Ira"),
         new Teacher("Petro"),
                new Staff("Dmytro"),
        };
        for (Person current: arrays){
            System.out.print("My name is: "+current. getName()+"  " );
            current.print();
        }

    }
}
