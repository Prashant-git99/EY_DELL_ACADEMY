package Class_5;

import java.util.ArrayList;
import java.util.Iterator;

public class HowArrayListWorks {
	public static void main(String[] args) {
		
	       //In list duplicates is allowed 
        // Insertion order is maintained
        ArrayList<String> arrList=new ArrayList<>();
        arrList.add("j");
        arrList.add("j");
        arrList.add("j");
        arrList.add("j");
        arrList.add(null);
        arrList.add(null);  //any number of null is allowed

        arrList.add("Z"); arrList.add("N"); arrList.add("M"); arrList.add("D");

        Iterator<String> itr=arrList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        //second arraylist 

        System.out.println("Second array list");
        ArrayList<String> arrList2= new ArrayList<>();
        arrList2.add("P"); arrList.add("A");

        arrList.addAll(arrList2); //adding second array list to first..
        System.out.println("Size of my array list is "+ arrList.size());

        arrList.remove("Z"); //remove one element
        for(String str: arrList)
        {
            System.out.println(str+ " ");
        }

        arrList.removeAll(arrList2);
        for(String str: arrList)
        {
            System.out.println(str+ " ");
        }



        arrList.set(1, "New Element");
        for(String str: arrList)
        {
            System.out.println(str+ " ");
        }


        arrList.retainAll(arrList2);
        for(String str: arrList)
        {
            System.out.println(str+ " ");
        }
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next() + " ");
//        }
        //

        arrList.clear();
    }
}