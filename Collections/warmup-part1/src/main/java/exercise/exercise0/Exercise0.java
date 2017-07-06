package exercise.exercise0;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 0: Create a List (ArrayList or LinkedList), add elements to it and print all of them using ListIterator
 *             for loop and foreach loop.
 *
 */import java.util.*;
public class Exercise0 {

    public Exercise0(){

    }

    public void iterateThroughList(){
ArrayList<Integer> alist = new ArrayList<Integer>(31);

ListIterator<Integer> it= alist.listIterator();
while(it.hasNext())
    System.out.print(it.next()+", "+it.nextIndex()+", "+it.previousIndex()+";");
System.out.println();

for(int i=0;i<alist.size();i++){

    Integer c=alist.get(i);
    System.out.println(c);

}
for (Integer x:alist){

    System.out.println(x);
}

        // TODO Exercise #0 a) Create a list (ArrayList or LinkedList) and add elements to it
        // TODO Exercise #0 a) Don't forget to specify the type of the list (Integer, String etc.)

        // TODO Exercise #0 b) Iterate through the list using ListIterator and print all its elements

        // TODO Exercise #0 c) Iterate through the list using classic for loop and print all its elements

        // TODO Exercise #0 d) Iterate through the list using foreach loop and print all its elements

    }

    public static void main(String[] args) {

        Exercise0 Ex1=new Exercise0();
        Ex1.iterateThroughList();

        // TODO Exercise #0 e) Create a new instance of Exercise0 class and call the iterateThroughList() method
    }
}
