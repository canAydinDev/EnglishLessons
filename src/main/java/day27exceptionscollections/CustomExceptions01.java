package day27exceptionscollections;

public class CustomExceptions01 {

    /*
       Normally, Javahs many Exception Classes which cover many issues
       Sometimes we need custom exceptions for 2 reasons;
         1)To make Java Exceptions more spesific.
           "FileNotFoundException" has 2 reason in it i)path can be wrong ii)file does not exist
         2)To create some Exception for our application
           "IllegalGraedExeption" can be created for a school management system application
         3)Custom Exceptions guide the developers not to break the application rules
     */
    public static void main(String[] args) {
        try {
            printGrades(12);
        } catch (IllegalGradeException e) {
            System.out.println("Grades must be between zero and one hundred");
        }

        System.out.println(checkedNameFormat("tom"));


    }

    public static void printGrades(double grade) throws IllegalGradeException {
        if(grade<0||grade>100){
            throw new IllegalGradeException("Grade cannot be less then zero and more then a hundred");
        }else{
            System.out.println(grade);
        }
    }

    public static boolean checkedNameFormat(String name){
        if (name.charAt(0)>='A'&& name.charAt(0)<='Z'){
            return true;
        }else{
            throw new IllegalNameException("Name must start with uppercases");
        }
    }
}
