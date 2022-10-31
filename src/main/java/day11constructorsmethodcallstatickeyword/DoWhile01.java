package day11constructorsmethodcallstatickeyword;

import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int counter=0;

        do {
            System.out.println("enter your username and password");
            String userName= input.nextLine();
            String psw=input.nextLine();
            if (userName.equals("admin")&&psw.equals("pwd123")){
                System.out.println("You are in your account");
                break;
            }



            else if (counter==3){
                System.out.println("your account is blocked");
                break;
            }
            counter++;
            System.out.println("try again");

        }while(counter<=3);

    }
}
