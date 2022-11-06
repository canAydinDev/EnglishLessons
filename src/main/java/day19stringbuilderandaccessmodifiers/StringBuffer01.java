package day19stringbuilderandaccessmodifiers;

public class StringBuffer01 {
    public static void main(String[] args) {

        /*
        StringBuffer is another Class and way to create a String in java
        StringBuffer is very similar with StringBuilder Class, I mean both are mutable

        What is the difference between StringBuffer and StringBuilder?
        1)StringBuffer was created before StringBuilder in java
        2)StringBuffer is "multi-thread", but StringBuilder is not.
        3)StringBuffer is using multi-thread characteristic because of that it is slower than StringBuilder

        Scenarios:
        1)i need immutable String==>String Class
        2)i need mutable and not multi-thread==>StringBuilder
        3)i need mutable and multi-thread==> StringBuffer

        When you use multi-thread you need to create an order threads, this called "synchronization"
         */
    }
}
