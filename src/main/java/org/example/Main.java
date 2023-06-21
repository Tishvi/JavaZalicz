package org.example;


import VetInfo.*;
public class Main {
    public static void main(String[] args) {
        Animal panjamnior = new Dog(4,32,true,"Ziemniak","Jamnik");
        panjamnior.print();
        panjamnior.printHealthStatus();
        Animal cat = new Cat (1,4,true,"Gatto","Domowy");
        cat.print();
        cat.printHealthStatus();
    }
}