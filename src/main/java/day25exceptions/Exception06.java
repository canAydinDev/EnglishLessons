package day25exceptions;

public class Exception06 {
    public static void main(String[] args) {

        /*
        Exception is a Class and it has many child Classes. We have learned;
        1-AritmeticException
        2-NullPointerException
        3-NumberFormatException
        4-ArrayIndexOutBoundException
        5-StringOutBoundException
         */


        //doCombination("12345",5);//5, 12345, 2469
        //doCombination(null,5);//NullPointerException
        //doCombination("12a",5);//NumberFormatException
        //doCombination("420",0);//ArithmeticException

        //doCombination2("420",0);
        //doCombination2("12a",5);

    }
    //create a method i)Find the length of a String
    //                ii)Convert the String to an integer
    //                iii)devide the integer by a given number

    public static void doCombination(String str, int num){
        try {
            int strLength=str.length();
            System.out.println(strLength);

            int intStr=Integer.valueOf(str);
            System.out.println(intStr);

            int result=intStr/num;
            System.out.println(result);
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.err.println("There is a problem in finding length");
        }catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.err.println("there is a problem in convertion process");
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.err.println("there is a problem in division");
        }

    }
    public static void doCombination2(String str, int num){
        try {
            int strLength=str.length();
            System.out.println(strLength);

            int intStr=Integer.valueOf(str);
            System.out.println(intStr);

            int result=intStr/num;
            System.out.println(result);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}
