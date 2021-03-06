package tutorials.datastructures;

public class BinaryTreeNode<T extends Comparable<T>>
        implements Comparable<BinaryTreeNode<T>> {
    T value;
    BinaryTreeNode<T> parent;
    BinaryTreeNode<T> leftChild;
    BinaryTreeNode<T> rightChild;

    /**
     * Constructs the tree node.
     * @param value
     */
    public BinaryTreeNode(T value) {
        this.value = value;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        BinaryTreeNode<T> other = (BinaryTreeNode<T>) obj;

        return this.compareTo(other) == 0;
    }

    @Override
    public int compareTo(BinaryTreeNode<T> other) {
        return this.value.compareTo(other.value);
    }
}
