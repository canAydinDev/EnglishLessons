package day12variabletypesstaticblockarrays;

/*
   1) if you dont assign any value for static and non-static variables, Java assigns "default values" to them
   but Java doesnt assign default value for "local variables"

   2) default values are "0" for numeric data types, it is "null" for string, it is "false" for boolean
 */

public class StaticBlock01 {
    /*
        1)java class loader makes the classes re ady to use
        2)when the classes make ready, class members are loaded according to some order.
        3)main method is the first to be loaded normally
        4)sometimes we need something to be loaded before main method, for this scenario we use static block.
          the codes inside the static block is executed before everything in the class, even before main method.
        5)Rule: static structures can work just with static class members
                don't put non-static class members into static method, it will give error
        6) static block can be used just with static variables' because of the rule in 5th step
        7)"static block" is used to initialeze(assigning first value) "static variables"

        Note: when we create a variable inside the main method, we do not use "static" keyword, because
              java knows everything inside the main is "static".
     */
    public static double pi;

    static {
        System.out.println("this is static block");
        pi=3.14;//initializing pi variable
    }
    public static void main(String[] args) {
        System.out.println("this is main method");
    }
    static {
        System.out.println("this is the second static block");
    }
}
