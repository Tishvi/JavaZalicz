package org.example;

import PersonalInfo.*;
import VetInfo.*;

import java.util.Vector;

/**
 * add to animal list to worker
 */
class Vet extends Worker{
     Vector<Animal> animals;

    /**
     * initializes the worker with an empty animal list
     * @param name of the worker
     * @param age of the worker
     * @param salary of the worker
     */
    public Vet(String name, int age, int salary) {
        super(name, age, salary);
        animals = new Vector<Animal>();
    }

    /**
     *
     * @param name of the worker
     * @param age of the worker
     * @param salary of the worker
     * @param animals animal list prescribed to worker
     */
    public Vet(String name, int age, int salary,Vector<Animal> animals) {
        super(name, age, salary);
        this.animals = animals;
    }

    /**
     * prints workers personal information
     * prints animal info from to list
     */
    public void printAnimalInfo(){
        System.out.println("Woreks Personal Information: " + getName() + " " + getAge() + " " + getSalary());
        for (Animal anim : animals){
            anim.print();
            anim.printHealthStatus();
        }
    }
}
public class Main {
    /**
     *creates two animal list,
     * populates them,
     * designs to workers,
     * prints correct animal list under correct worker.
     */
    public static void main(String[] args) {
        Vector<Animal> animals1 = new Vector<Animal>();
        Vector<Animal> animals2 = new Vector<Animal>();

        animals1.add(new Dog(7,13,true,"Marchew","Jamnik"));
        animals1.add(new Dog(1,51,false,"Burak","Jamnik"));
        animals1.add(new Dog(10,18,true,"Imbir","Jamnik"));
        animals1.add(new Dog(6,9,false,"Figa","Jamnik"));
        animals1.add(new Dog(3,7,true,"Pomelo","Jamnik"));
        animals1.add(new Dog(3,15,true,"Pierucha","Jamnik"));
        animals2.add(new Cat (2,2,false,"Gatto","Domowy"));
        animals2.add(new Cat (4,6,true,"ElGatto","Domowy"));
        animals2.add(new Cat (1,3,false,"SiGatto","Domowy"));
        animals2.add(new Cat (0,4,false,"JaGatto","Domowy"));
        animals2.add(new Cat (2,4,true,"DaGatto","Domowy"));

        Vet vet1 = new Vet("Marek", 29,5000,animals1);
        Vet vet2 = new Vet("Franek",47,4999,animals2);
        vet2.printAnimalInfo();
        vet1.printAnimalInfo();

    }
}