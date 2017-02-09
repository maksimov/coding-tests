package ctci.ds;

import org.junit.Test;
import ctci.ds.CheckBST.Node;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Stas Maksimov (stas@maksimov.net)
 * @since 08/02/2017
 */
public class CheckBSTTest {

    @Test
    public void checkValidTree() {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(6);
        System.out.println(root.toOrderedString());
        assertTrue(new CheckBST().checkBST(root));
    }

    @Test
    public void checkInvalidTree() {
        Node root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(2);
        System.out.println(root.toOrderedString());
        assertFalse(new CheckBST().checkBST(root));
    }

    @Test
    public void checkInvalidTree2() {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(10);
        root.left.right = new Node(1);
        System.out.println(root.toOrderedString());
        assertFalse(new CheckBST().checkBST(root));
    }

    @Test
    public void checkInvalidTree3() {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(6);
        root.right.right = new Node(1);
        System.out.println(root.toOrderedString());
        assertFalse(new CheckBST().checkBST(root));
    }

    @Test
    public void checkTreeWithDuplicates() {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(6);
        root.right.right = new Node(6);
        System.out.println(root.toOrderedString());
        assertFalse(new CheckBST().checkBST(root));
    }

    @Test
    public void checkUnbalanced() {
        Node root = new Node(5);
        root.right = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
        System.out.println(root.toOrderedString());
        assertTrue(new CheckBST().checkBST(root));
    }

    @Test
    public void checkInvalidUnbalanced() {
        Node root = new Node(5);
        root.right = new Node(6);
        root.right.right = new Node(4);
        root.right.right.right = new Node(8);
        System.out.println(root.toOrderedString());
        assertFalse(new CheckBST().checkBST(root));
    }

    @Test
    public void checkTestCase1() {
        // 2
        // 1 2 3 5 4 6 7
        Node root = new Node(5);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(4);
        root.right.right = new Node(7);


        System.out.println(root.toOrderedString());
        assertFalse(new CheckBST().checkBST(root));

    }
}
