package day25exceptions;

public class Exception02 {

    public static void main(String[] args) {
        String []a ={"A","B","D","E"};
        String str=getElement(a,5);
        System.out.println(str);//trow exception==>ArrayIndexOutOfBoundsException

    }
    //Create a method to get any element from a String array
    public static String getElement(String []a, int idx){
        String s="";
        try{
            s= a[idx];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("A problem occured in array indexes");
            System.out.println(e.getMessage());// to receive more technical
            e.printStackTrace();//gives detailed technical for Exception
        }
        return s;

    }
}
