/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Finbar
 */
public class BinarySearchTreeTest {

    public BinarySearchTreeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class BinarySearchTree.
     */
//    @Test
//    public void testInsert() {
//        System.out.println("insert");
//        String a = "hello";
//        String b = "help";
//        String c = "hippo";
//        String d = "Hand";
//        String e = "hand";
//        String f = "helper";
//        String g = "harper";
//        BinarySearchTree<String> instance = new BinarySearchTree();
//        instance.insert(a);
//        instance.insert(b);
//        instance.insert(c);
//        instance.insert(d);
//        instance.insert(e);
//        instance.insert(f);
//        instance.insert(g);
//
//    }
//
//    /**
//     * Test of print method, of class BinarySearchTree.
//     */
//    @Test
//    public void testPrint() {
//        System.out.println("print");
//        BinarySearchTree instance = new BinarySearchTree();
//        instance.print();
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of contains method, of class BinarySearchTree.
     */
//    @Test
//    public void testContains() {
//        System.out.println("contains interative");
//        String a = "hello";
//        String b = "help";
//        String c = "hippo";
//        String d = "hi";
//        String e = "me";
//        String f = "moe";
//        String g = "bath";
//        String h = "french";
//        String i = "late";
//        String j = "june";
//        String k = "dog";
//        String l = "jason";
//        BinarySearchTree<String> instance = new BinarySearchTree();
//        instance.insert(a);
//        instance.insert(b);
//        instance.insert(c);
//        instance.insert(d);
//        instance.insert(e);
//        instance.insert(f);
//        instance.insert(g);
//        instance.insert(h);
//        instance.insert(i);
//        instance.insert(j);
//        instance.insert(k);
//        instance.insert(l);
//
//        for (int x = 0; x < 300000; x++) {
//            boolean expResult = true;
//            boolean result = instance.contains("jason");
//            assertEquals(expResult, result);
//        }
//
//    }
//
//    /**
//     * Test of containsRecursive method, of class BinarySearchTree.
//     */
//    @Test
//    public void testContainsRecursive() { //recursive is the faster of the two contains methods
//        System.out.println("containsRecursive");
//        String a = "hello";
//        String b = "help";
//        String c = "hippo";
//        String d = "hi";
//        String e = "me";
//        String f = "moe";
//        String g = "bath";
//        String h = "french";
//        String i = "late";
//        String j = "june";
//        String k = "dog";
//        String l = "jason";
//        BinarySearchTree<String> instance = new BinarySearchTree();
//        instance.insert(a);
//        instance.insert(b);
//        instance.insert(c);
//        instance.insert(d);
//        instance.insert(e);
//        instance.insert(f);
//        instance.insert(g);
//        instance.insert(h);
//        instance.insert(i);
//        instance.insert(j);
//        instance.insert(k);
//        instance.insert(l);
//
//        for (int x = 0; x < 300000; x++) {
//            boolean expResult = true;
//            boolean result = instance.containsRecursive("jason");
//            assertEquals(expResult, result);
//        }
//
//    }
    @Test
    public void testPreOrderMethods()
    {
        System.out.println("testPreOrderMethods");
        String a = "hello";
        String b = "help";
        String c = "hippo";
        String d = "hi";
        String e = "me";
        String f = "moe";
        String g = "bath";
        String h = "french";
        String i = "late";
        String j = "june";
        String k = "dog";
        String l = "jason";
        BinarySearchTree<String> instance = new BinarySearchTree();
        instance.insert(a);
        instance.insert(b);
        instance.insert(c);
        instance.insert(d);
        instance.insert(e);
        instance.insert(f);
        instance.insert(g);
        instance.insert(h);
        instance.insert(i);
        instance.insert(j);
        instance.insert(k);
        instance.insert(l);
        
        instance.preOrderPrintIter();
        System.out.println("\n\n");
        instance.printPre();
    }
}
