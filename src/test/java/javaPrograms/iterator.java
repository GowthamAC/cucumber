package javaPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("String");
        list.add("Char");
        list.add(20);

        Iterator i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
