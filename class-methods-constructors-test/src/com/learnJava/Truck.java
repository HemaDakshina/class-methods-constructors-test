package com.learnJava;



public class Truck {
  String truckDriver;
  int truckNumber;

  public Truck(String Driver,int Number){
      this.truckDriver=Driver;
       this.truckNumber=Number;
      // Default constructor
    }

    public static void main(String[] args) {
        Truck truck1 = new Truck("Joe",123);
        System.out.println(truck1.truckDriver);
        Truck truck2 = new Truck ("Bill",456);
        System.out.println(truck2.truckDriver);
    }

}
