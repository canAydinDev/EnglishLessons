package day25exceptions;

public class Exception04 {
    public static void main(String[] args) {

        int r1= convertStringToInt("123abc");
        System.out.println(r1);//123
    }
    //Create a method to convert a String to an integer

    public static  int convertStringToInt(String str){
        int r1=0;
        try{
            r1=Integer.valueOf(str);

        }catch(NumberFormatException e){
            System.out.println("A problem occured while converting");
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.err.println("A problem occured while converting");

        }
        return r1;
    }
}
