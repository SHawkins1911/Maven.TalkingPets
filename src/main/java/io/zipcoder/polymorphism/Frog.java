package io.zipcoder.polymorphism;

public class Frog extends Pet {

    public Frog(String name){
        super(name);
    }


    @Override
    public String speak(){
        return "Ribbit...Ribbit";
    }
}
