package com.ivoyant.spring;

public class Alien {
    private int age;
    private Computer com;

    public Alien() {
        System.out.println("alien object created");
    }

    public int getAge() {
        return age;
    }
    //Setter Injection
    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

//    constructor injection
//    public Alien(int age, Computer lap) {
//        this.age = age;
//        this.lap = lap;
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("codding");
        com.compile();
    }
}


