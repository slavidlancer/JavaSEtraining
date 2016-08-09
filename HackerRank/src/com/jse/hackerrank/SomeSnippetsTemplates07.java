package com.jse.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SomeSnippetsTemplates07 {
    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            mylist.add(input.nextInt());
        }
        
        mylist.add("###");
        
        for (int i = 0; i < m; i++) {
            mylist.add(input.next());
        }
        
        Iterator<?> iterator = getCustomIterator(mylist);
        
        while (iterator.hasNext()) {
            Object element = iterator.next();
            
            System.out.println((String) element);
        }
        
        input.close();
    }

    static Iterator<?> getCustomIterator(ArrayList<Object> mylist){
        Iterator<?> iterator = mylist.iterator();
        
        while(iterator.hasNext()){
           Object element = iterator.next();
           
           if(element instanceof String) {
              break;
           }
        }
        
        return iterator;
     }
}
