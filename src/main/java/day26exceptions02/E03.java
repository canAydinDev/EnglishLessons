package day26exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {
    public static void main(String[] args) throws IOException {
        /*
           1)FileNotFoundException ==> it is throw if the path of the file is wrong or if the file is not existing
           2)FileNotFoundException is a "compile time exception" (Checked exception)
           3)FileNotFoundException is the child of "IoException" class

           4)"IoException" class is related ith all possible"input-output" issues
           5)"IoException" is a "compile time exception" (Checked Exception)
           6)When you use a parent -child exception classes in try catch blocks, you should type the child class first.
           7)When you encounter a "compile time exception" (Checked Exception) ,you have 2 options
             i)using "throws" keyword in method signature line
               **Java will throw exception and stop execution of the remaining part of coding
             ii)you can handle by using try+catch blocks
               **Java will execute whatever you typed inside the catch block and does not stop execution for coding
           8)What is the difference between throw and throws?
             i)  "throw" keyword is used to create any Exception class object
                 "throws" keyword is put to method signature line
             ii) By using throws keyword you can declare multiple exceptions
                 After using throw keyword we can not add multiple exception classes
             iii)After using "throw" keyword, you have to create an Exception object
                 After using throws keyword you will just tell the name of Excepton class
           9)What is the difference between "Exception" and "error"?
             "Exception" can be handled because we have useful ways to handle them
             But errors can not be handled.
             OutOfMemory, StackOutOfMemory, VirtualMachine, Assertion Errors.

         */

       readTheText();

        System.out.println("\n===============");
       readTheTextFile();

    }
    //Create a method to read a text from a text file.
    //if the file path is wrong , if the text can not be found, if the text can not be read, stop execution
    //if we want java to move on reading the remaining part of coding, then we should handle exception that we
    //may encounter.

    public static void readTheText() throws IOException {
        FileInputStream fis=new FileInputStream("src/main/java/day26exceptions02/TextFile.txt");

        int k=0;
        while ((k=fis.read())!=-1){
            System.out.print((char) k);
        }
    }


    public static void readTheTextFile(){
        try {
            FileInputStream fis=new FileInputStream("src/main/java/day26exceptions02/TextFile.txt");
            int k=0;
            while ((k= fis.read())!=-1){
                System.out.println((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is an issue in path or in the file"+e.getMessage());
        } catch (IOException e) {
            System.out.println("There is an issue in reading the text"+e.getMessage());
        }
        System.out.println("execution did not stop");
    }

}
