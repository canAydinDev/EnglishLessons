package day27exceptionscollections;

//To make a class "Exception Class" make it child of the "Exception Class" by using "extends" keyword
//If you used extends exception it will be "compile time exception" (checked exception)
public class IllegalGradeException extends Exception{

    public IllegalGradeException(String message){
        super(message);
    }

}
