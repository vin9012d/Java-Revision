package main.java.day9dependencyInjection.tightCoupling;

public class User {
    private String name;
  private Address address = new Address("Surat", "Gujarat"); // ❌ tight coupling

    public User(String name){
        this.name = name;
    }


}
