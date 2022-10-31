package day12variabletypesstaticblockarrays;

public class Runner {
    public static void main(String[] args) {

        VariableTypes01 obj1=new VariableTypes01();

        System.out.println(obj1.name);
        System.out.println(VariableTypes01.age);
        obj1.add(3,5);//8
        obj1.multiply(3,5);//15
    }
}
