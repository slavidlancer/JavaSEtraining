package com.jse.hackerrank.tasks05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Scanner;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
    String userRole() default "GUEST";
    int budgetLimit() default 0;
}

class FamilyMember {
    @FamilyBudget(userRole = "SENIOR", budgetLimit = 100)
    public void seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
    
    @FamilyBudget(userRole = "JUNIOR", budgetLimit = 50)
    public void juniorUser(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
}

public class SomeSnippetsTemplates57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        
        while (t-- > 0) {
            String role = scanner.next();
            int spentMoney = scanner.nextInt();
            
            try {
                Class<FamilyMember> annotatedClass = FamilyMember.class;
                Method[] methods = annotatedClass.getMethods();
                
                for (Method method : methods) {
                    if (method.isAnnotationPresent(FamilyBudget.class)) {
                        FamilyBudget familyBudget = method.getAnnotation(
                                FamilyBudget.class);
                        String userRole = familyBudget.userRole();
                        int budgetLimit = familyBudget.budgetLimit();
                        
                        if (userRole.equals(role)) {
                            if (spentMoney <= budgetLimit) {
                                method.invoke(FamilyMember.class.newInstance(),
                                        budgetLimit, spentMoney);
                            } else {
                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        scanner.close();
    }
}
