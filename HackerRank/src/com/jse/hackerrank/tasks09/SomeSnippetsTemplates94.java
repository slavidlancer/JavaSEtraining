package com.jse.hackerrank.tasks09;

@SuppressWarnings("rawtypes")
interface Tree<E extends Comparable> {
    boolean isEmpty();

    int cardinality();

    boolean isMember(E element);

    NonEmptyBST<E> add(E element);
}

@SuppressWarnings("rawtypes")
class EmptyBST<E extends Comparable> implements Tree<E> {
    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean isMember(E element) {
        return false;
    }

    @Override
    public NonEmptyBST<E> add(E element) {
        return new NonEmptyBST<E>(element);
    }
}

@SuppressWarnings("rawtypes")
class NonEmptyBST<E extends Comparable> implements Tree<E> {
    E data;
    Tree<E> left, right;

    public NonEmptyBST(E element) {
        this.data = element;
        this.left = new EmptyBST<E>();
        this.right = new EmptyBST<E>();
    }

    public NonEmptyBST(E element, Tree<E> left, Tree<E> right) {
        this.data = element;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return 1 + this.left.cardinality() + this.right.cardinality();
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean isMember(E element) {
        if (this.data == element) {
            return true;
        } else {
            if (element.compareTo(this.data) < 0) {
                return left.isMember(element);
            } else {
                return right.isMember(element);
            }
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public NonEmptyBST<E> add(E element) {
        if (this.data == element) {
            return this;
        } else {
            if (element.compareTo(this.data) < 0) {
                return new NonEmptyBST(data, left.add(element), right);
            } else {
                return new NonEmptyBST(data, left, right.add(element));
            }
        }

        // return new NonEmptyBST<E>(element); //unreachable code
    }
}

public class SomeSnippetsTemplates94 {
    public static void main(String[] args) {
        Tree<String> emptyTreeOfStrings = new EmptyBST<>();
        System.out.println(emptyTreeOfStrings.isEmpty());
        System.out.println(emptyTreeOfStrings.cardinality());
        Tree<String> nonEmptyTreeOfStrings = emptyTreeOfStrings.add("element");
        nonEmptyTreeOfStrings = nonEmptyTreeOfStrings.add("second");
        System.out.println(emptyTreeOfStrings.cardinality());
        System.out.println(emptyTreeOfStrings.isEmpty());
        System.out.println(emptyTreeOfStrings.isMember("element"));
        
        System.out.println(nonEmptyTreeOfStrings.cardinality());
        System.out.println(nonEmptyTreeOfStrings.isEmpty());
        System.out.println(nonEmptyTreeOfStrings.isMember("element"));
    }
}
