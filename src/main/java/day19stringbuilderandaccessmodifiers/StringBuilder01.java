package day19stringbuilderandaccessmodifiers;

public class StringBuilder01 {
    public static void main(String[] args) {
        //What is StringBuilder Class?
        //StringBuilder Class is for creating "mutable String"
        //We use "String class' create a String, why or when we will need "StringBuilder" ?

        //String Class is "immutable" , StringBuilder Class is "mutable"
        //String Class is "immutable" because of that it dosen't change existing value
        //if you want to assign a new value to a variable,
        //jawa will create a new container inside the "string pool"
        //then will put new value in it, then change the address pointer to the new container

        String name="Tom";
        name="Mark";

        //if any container does not have any address pointer, "garbage collector" removes the container
        //from the memory.
        //Before removing things from memory, Jawa finalize them. Without finalizing Jawa does not remove
        //anything from memory
        //Finalize() method is executed by Garbage Collector before the object is destroyed.

        String s="John";
        String r="John";
        String c="John";
        String u =new String("John");// Jawa will create a new container and create a new John

        String sd="John";

        //if you want to change value directly, without creating new container in memory you can use "StringBuilder" class



        //How to create a StringBuilder object?
        //1.Way:
        StringBuilder sb1=new StringBuilder("Clara");
        sb1=new StringBuilder("Jim");
        System.out.println(sb1);

        //2. Way:
        StringBuilder sb2=new StringBuilder();
        System.out.println(sb2);
        sb2.append("Clara ");
        System.out.println(sb2);//Clara
        sb2.append("Ocean ");
        System.out.println(sb2);//ClaraOcean
        sb2.append("Miami ").append("FL");
        System.out.println(sb2);

        //How to learn the capacity in a StringBuilder

        StringBuilder sb3=new StringBuilder();

        int numOfChars=sb3.length();//0
        System.out.println(numOfChars);

        int cap=sb3.capacity();//16
        System.out.println(cap);
        sb3.append("Jacjson");
        sb3.length();//8
        sb3.capacity();//16
        sb3.append("MexicoThe USA");
        sb3.length();//20
        sb3.capacity();//==>x2+2++>16x2+2=34
        sb3.append("....................");
        sb3.capacity();//34x2+2==>70

        //Note: if you existing capacity,Jawa will increase the capacity
        //like; 2*existing capacity+2
    }
}
