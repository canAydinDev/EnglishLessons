package day11constructorsmethodcallstatickeyword;
  /*
    when you creat a class you will use it to create an object most probably, Java knows it
    because of that when you creat a class java puts constructor in it automatically, its name is default constructor
    "default constructors" are invisible.

    if you create your own constructor java deletes the default constructor
     */

    //how to create "constructor"
    //Note: constructor name must match with the class name
    //What is the difference between the constructors and methods?
    //Note: Constructors do not have return type but methods have
    //Note: Constructor name must match with the class name but method name can be any name
    //Note: Constructors are used to create object but method are ussed to create some actions

    //if any class you want to use, is in the same package no need to import,
    //but if the class is in the different package, you need to import it.
public class Car {
    String make="Toyota";
    String model="Prius";
    int year =2020;
    int price =20000;
    public Car (){
        System.out.println("car constructor 1");
    }
    public Car(String make,String model,int year,int price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }
    public Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }


}
