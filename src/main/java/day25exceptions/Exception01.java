package day25exceptions;

public class Exception01 {
    /*
       1)Exception is unexpected result.
       2)There are two ways to work with exceptions.
           i)Try-catch blocks: Handling Exceptions
           ii)Trow exceptions and block the application.
       3)If you do not handle Exception, java stops execution and the application is blocked.


     */
    public static void main(String[] args) {
        devide(6,2);
        devide(12,0);//A problem occured when dividing
        divide2(12,0);//A problem occured in division

    }
    //1. way: we do not recommend this way. it is not mandatory to know all math rules. in math, there may be a lot of way to consider every formule
    //to solve a code requirements.
    public static  void devide(int a, int b){
        if (b==0){
            System.out.println("A problem occured when dividing");
        } else{
            System.out.println(a/b);
        }
    }
    //2. way : Hande Exception by using try - catch bloks

    public static void divide2(int a, int b){
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("A problem occured in division");
        }
    }

}
