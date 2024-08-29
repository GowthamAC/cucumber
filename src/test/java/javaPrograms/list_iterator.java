package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class list_iterator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("String");
        list.add("Char");
        list.add(20);

        int size= list.size();
        ListIterator i = list.listIterator(size);
        while(i.hasPrevious()){
            System.out.println(i.previous());
        }
    }
}
