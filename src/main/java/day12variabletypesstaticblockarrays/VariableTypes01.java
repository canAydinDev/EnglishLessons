package day12variabletypesstaticblockarrays;

public class VariableTypes01 {

    public  String name="Tom Hanks";
    public static int age=123;
    /*
       Note: When you create a local value it is mandatory to assign a value.
       if you try to use a local value without assigning a value it complains
     */

    //local variable
    public int add(int a, int b){
        return a+b;

    }
    public int multiply(int a, int b){
        return a*b;
    }
}
