package day19stringbuilderandaccessmodifiers;

public class StringBuilder02 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Missisippi");

        //toString() is used to change StrigBuilders to Strings
        String test=sb1.toString();
        System.out.println(test);

        //reverse () is used to reverse a String.
        //If you gewt a question like "how to reverse a String"
        //tell them;
          //i) i can reverse a String bu using StringBuilder Reverse Method
          //ii) second way i can reverse a String by using loops
        //Interviewer will tell you use the loops
        StringBuilder reverseSb1=sb1.reverse();
        System.out.println(reverseSb1);//ippisissiM

        sb1.deleteCharAt(0);
        System.out.println(sb1);//ppisissiM

        //unbold methods can not change original value
             //chars()
             //equals()
        //if a method came from String Class can not change the original value
            //toString()
            //length()
            //substring()
        //deleteCharAt () is used a character at a spesific index
        //Note: when you use a method for StringBuilders, if it is bold and not coming from String Class it changes the original value

        //delete(starting index,ending index) is used to delete characters from starting to ending index
        //starting index is inclusive, ending index is exclusive
        sb1.delete(2,5);
        System.out.println(sb1);//ppssiM

        //replace(starting index,ending index,new value) is used to change characters from starting to ending index
        //starting is inclusive, ending is exclusive
        sb1.replace(2,4,"IS");
        System.out.println(sb1);//ppISiM

        //insert(number of characters from the begining, new value) method will insert "new value" after skipping number of characters from the begining
        sb1.insert(3,"XXX");
        System.out.println(sb1);//ppIXXXSiM

        StringBuilder sb2=new StringBuilder("Java is love");
        StringBuilder sb3=new StringBuilder("Java is love");

        /*
        the value 0 if this StringBuilder contains the same character sequence as that of the argument StringBuilder;
        a negative integer if the first StringBuilder is lexicographically less than the second StringBuilder argument;
        or a positive integer if the first StringBuilder is lexicographically greater than the second StringBuilder argument.
        Note: compareTo() method does not ignore cases, it checks alphabetical order by using ASCII Value
         */
        int result=sb2.compareTo(sb3);
        System.out.println(result);//0

        //setCarAt(index,new charvalue) isused update a spesdific character at a spesific index
        sb3.setCharAt(8, 'm');
        System.out.println(sb3);//Java is move

        /*
        1)Mechanism behind the "immutality"
        2)Benefit of "immutality"
        3)difference between "immutality" and "mutality"
        4)Features of the StringBuilder
         */
    }
}
