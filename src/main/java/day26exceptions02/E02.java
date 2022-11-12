package day26exceptions02;

public class E02 {
    public static void main(String[] args) {

        /*
           1)if you want to execute a code for every scenerio, use "finally" block after try body
           2)try can be used in these ways:
             a)try + cach
             b)try + multiply catch
             c)try + multiply catch + finally
             Note:"try" can not be used alone

             finally keyword is used to give a stop point for code line

           3)"ArithmeticException", "NullPointerException", "ArrayOutOfBoundEXception", "StringOutOfBoundException",
              "NumberFormatException", "IllegalArgumentException" are displayed on the console after running the code,
              therefore they are called "Run Time Exception"

           4)There is compile time exception, they will be displayed before clicking on the run button. Therefore they are
           called "Compile Time Exception"
         */
        devide(5,0);// actual value we receive for the data is called arguments
    }

    //create  a method to do division then save the result into database
    public  static void devide(int a, int b){// the data that we parameterize inside method parenthesis these are parameters
        try {
            System.out.println(a/b+" was saved into database");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("do not use zero as divisor");
        }finally {
            System.out.println("cut the connection with the database");
        }


    }
}
