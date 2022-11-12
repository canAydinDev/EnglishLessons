package day27exceptionscollections;

//When you extends "RuntimeException Class", your custom exception will be "Runtime Exception"
public class IllegalNameException extends  RuntimeException{

    public IllegalNameException(String message){
        super(message);
    }
}
