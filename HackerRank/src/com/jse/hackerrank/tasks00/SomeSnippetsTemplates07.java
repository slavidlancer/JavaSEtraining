package com.jse.hackerrank.tasks00;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SomeSnippetsTemplates07 {
    public static void main(String[] args) {
        List<Object> mylist = new ArrayList<>();
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

    private static Iterator<?> getCustomIterator(List<Object> mylist){
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
