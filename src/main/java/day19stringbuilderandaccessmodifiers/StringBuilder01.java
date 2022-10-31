package day19stringbuilderandaccessmodifiers;

public class StringBuilder01 {
    public static void main(String[] args) {
        //What is StringBuilder Class?
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

    }
}
