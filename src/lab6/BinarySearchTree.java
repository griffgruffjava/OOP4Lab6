/**
 * This class implements a binary search tree whose nodes hold objects that
 * implement the Comparable interface.
 */
package lab6;

public class BinarySearchTree<E extends Comparable<E>>
{

    private Node root;

    private class Node
    {

        public E data;
        public Node left;
        public Node right;
    }

    public BinarySearchTree()
    {
        root = null;
    }

    public void insert(E e)
    {
        Node newNode = new Node();
        newNode.data = e;
        newNode.left = null;
        newNode.right = null;
        if (root == null)
        {
            root = newNode;
        } else
        {
            insertSub(root, newNode);
        }
    }

    private void insertSub(Node node, Node newNode)
    {
        if (newNode.data.compareTo(node.data) < 0)
        {
            if (node.left == null)
            {
                node.left = newNode;
            } else
            {
                insertSub(node.left, newNode);
            }
        } else
        {
            if (node.right == null)
            {
                node.right = newNode;
            } else
            {
                insertSub(node.right, newNode);
            }
        }
    }

    private void insertIter(E e)
    {
        Node newNode = new Node();
        newNode.data = e;
        newNode.left = null;
        newNode.right = null;

        Node nextNode = new Node();
        nextNode = root;
        
        
        

    }

    public void print()
    {
        if (root != null)
        {
            printSub(root);
        }
    }

    private void printSub(Node node)
    {
        if (node != null)
        {
            printSub(node.left);
            System.out.println(node.data);
            printSub(node.right);
        }
    }

    public void printPre()
    {
        if (root != null)
        {
            printSubPre(root);
        }
    }

    private void printSubPre(Node node)
    {
        if (node != null)
        {
            System.out.println(node.data);
            printSubPre(node.left);
            printSubPre(node.right);
        }
    }

    public void printPost()
    {
        if (root != null)
        {
            printSubPost(root);
        }
    }

    private void printSubPost(Node node)
    {
        if (node != null)
        {
            printSubPost(node.left);
            printSubPost(node.right);
            System.out.println(node.data);
        }
    }

    public boolean contains(E e)
    {
        Node current = root;

        while (current != null)
        {
            int result = current.data.compareTo(e);

            if (result == 0)
            {
                return true;
            } else if (result < 0)
            {
                current = current.right;
            } else
            {
                current = current.left;
            }

        }

        return false;
    }

    public boolean containsRecursive(E e)
    {

        if (root != null)
        {

            return subContainsRecursive(root, e);
        }
        return false;
    }

    private boolean subContainsRecursive(Node n, E e)
    {
        if (n != null)
        {
            int result = n.data.compareTo(e);

            if (result == 0)
            {
                return true;
            } else if (result < 0)
            {
                return subContainsRecursive(n.right, e);
            } else
            {
                return subContainsRecursive(n.left, e);
            }
        }
        return false;
    }

}
