package main.java.day9dependencyInjection.tightCoupling;

public class Main {

    public  static  void main (String[] args){
      User user = new User("vinod"); // here user is direclty tight coupled with address

        Address address = new Address("Surat", "Gujarat");
      LooseCouplingUser looseCouplingUser = new LooseCouplingUser(address, "vinod");




    }

}
