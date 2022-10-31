package day11constructorsmethodcallstatickeyword;

public class Static01 {

    /*
        1)static class members (variables and methods) are common far all objects create from the class
        2)When you do any update on "static" class members , all object will see the updates on it
        3) if you want every object informed about every update on a class member make it static
     */

    //How to create static variable
    //to make a variable static, put static keyword between access modifier and data type
    public static int staticCounter=0;
    public int nonStaticCounter=0;

    public Static01 (){
        staticCounter++;
        nonStaticCounter++;
    }

}
