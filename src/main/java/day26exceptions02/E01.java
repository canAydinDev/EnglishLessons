package day26exceptions02;

public class E01 {
    public static void main(String[] args) {
        prinAge(25);

        try {
            prinAge(-25);
        }catch (IllegalArgumentException e){

            e.printStackTrace();
            System.out.println(e.getMessage());

        }

        try {
            printWorkersAge(12);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("its done");

    }
    //create qa method to print the given age

    public static void prinAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Age can not be a negative number");
        }
        System.out.println(age);
    }
    //Create a method to print workers' age(under 16 is not acceptable)

    public static void printWorkersAge(int age){
        if(age<16){
            throw new IllegalArgumentException("Age can not be under 16");
        }
        System.out.println(age);
    }
}
