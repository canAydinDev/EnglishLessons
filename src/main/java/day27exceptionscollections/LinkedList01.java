package day27exceptionscollections;

import java.util.LinkedList;


/*
    Collections are for storing multiple data in the same data type
    Collections are flexible in length.
    Collections have many useful methods.
    
    Thewre are 3 main Collections: i)List   ==> a)ArrayList:Successful in "search operation" but not good at "adding and removing"
                                                b)LinkedList:Successful in "adding and removing" but not good at "search operation"
                                   ii)Queue ==> a)PriorityQueue  b)Deque(double ended queue)
                                   iii)Set  ==> a)HashSet        b)LinkedHashSet      c)TreeSet
 */
public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> visiters=new LinkedList<>();
        visiters.add("Tom");
        visiters.add("Jane");
        visiters.add("Mary");
        visiters.add("Carl");
        visiters.add("Ali");

        System.out.println(visiters);//[Tom, Jane, Mary, Carl, Ali]

        

    }
}
