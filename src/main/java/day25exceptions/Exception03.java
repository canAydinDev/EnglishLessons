package day25exceptions;

public class Exception03 {
    public static void main(String[] args) {
        int r1=getNumOfCharacters("Tom Hanks");
        System.out.println(r1);//9

        int r2=getNumOfCharacters("");
        System.out.println(r2);//0

        int r3=getNumOfCharacters(null);//NullPointerException: if you use length() method with "null" you will get "NullPointerException"
        System.out.println(r3);


    }

    //Create a method find the number of characters in a String
    public static int getNumOfCharacters(String str){
        int numOfChars=0;
        try{
            numOfChars=str.length();
        }catch(NullPointerException e){
            System.out.println("A problem occured in using length()");
            System.out.println(e.getMessage());
            e.getStackTrace();
            System.err.println("A problem occured in using length()");

        }
        return numOfChars;
    }
}
