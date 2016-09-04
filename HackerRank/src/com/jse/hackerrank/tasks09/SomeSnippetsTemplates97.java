package com.jse.hackerrank.tasks09;

import java.util.Random;

class Testers {
    public static int createRandomInteger(int min, int max) {
        Random random = new Random();
        
        return (random.nextInt((max - min) + 1) + min);
    }
    
    public static Tree<Integer> createRandomBST(int size) {
        if (size == 0) {
            return new EmptyBST<Integer>();
        } else {
            return createRandomBST(size -1).add(createRandomInteger(0, 50));
        }
    }
    
    public static void checkIsEmpty(Tree<Integer> tree) throws Exception {
        if (tree instanceof EmptyBST) {
            /* if (tree.isEmpty()) {
                System.out.println("empty tree, EmptyBST type");
            } */
            
            if (!tree.isEmpty()) {
                throw new Exception("non empty tree, but EmptyBST type");
            }
        } else if (tree instanceof NonEmptyBST) {
            /* if (!tree.isEmpty()) {
                System.out.println("not empty tree, NonEmptyBST type");
            } */
            
            if (tree.isEmpty()) {
                throw new Exception("empty tree, but NonEmptyBST type");
            }
        }
    }
    
    public static void checkAddMemberAndCardinality(Tree<Integer> tree,
            int data) throws Exception {
        int nTree = (tree.add(data)).cardinality();
        
        if (nTree == (tree.cardinality() + 1)) {
            if (tree.isMember(data)) {
                throw new Exception("cardinality = cardinality + 1," +
                        " but already a member");
            } /* else {
                System.out.println("correct: cardinality = cardinality + 1" +
                        " and not a member"); // might be deleted
            } */
        } else if (nTree == tree.cardinality()) {
            if (!tree.isMember(data)) {
                throw new Exception("cardinality = cardinality," +
                        " but not a member");
            } /* else {
                System.out.println("correct: cardinality = cardinality" +
                        " and a member"); // might be deleted
            } */
        } else {
            throw new Exception("something else is wrong");
        }
    }
}

public class SomeSnippetsTemplates97 {
    public static void main(String[] args) throws Exception {
        EmptyBST<Integer> emptyTree = new EmptyBST<>();
        NonEmptyBST<Integer> nonEmptyTree = new NonEmptyBST<>(5);
        Testers.checkIsEmpty(emptyTree);
        Testers.checkIsEmpty(nonEmptyTree);
        
        Testers.checkAddMemberAndCardinality(emptyTree, 5);
        Testers.checkAddMemberAndCardinality(nonEmptyTree, 5);
        Testers.checkAddMemberAndCardinality(nonEmptyTree, 6);
        
        int numberOfTests = 1000;
        
        for (int i = 0; i < numberOfTests; i++) {
            Tree<Integer> tree;
            
            if (i % 10 == 0) {
                tree = Testers.createRandomBST(0);
            } else {
                tree = Testers.createRandomBST(i);
                
                Testers.checkAddMemberAndCardinality(tree, i);
            }
        }
    }
}
