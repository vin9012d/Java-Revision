package main.java.day9dependencyInjection.tightCoupling;

public class LooseCouplingUser {
    public Address address;
    public String name;


    public LooseCouplingUser(Address address, String name){
        this.address= address;
        this.name = name;

    }




}
