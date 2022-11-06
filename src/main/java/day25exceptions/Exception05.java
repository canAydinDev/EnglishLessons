package day25exceptions;

public class Exception05 {
    public static void main(String[] args) {
      char ch1=getCharForString("Java",6);
        System.out.println(""+ch1);

    }
    //Create a method to get any character from a String

    public static char getCharForString(String str, int idx){
        char ch=' ';
        try {
            ch=str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.err.println("A problem is occured while we using charAt()");
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

        return ch;
    }
}
