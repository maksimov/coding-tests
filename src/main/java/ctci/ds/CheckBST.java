package ctci.ds;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Stas Maksimov (stas@maksimov.net)
 * @since 08/02/2017
 */
public class CheckBST {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        String toOrderedString() {
            StringBuffer buf = new StringBuffer();
            if( left != null ) {
                buf.append(left.toOrderedString()).append(" ");
            }
            buf.append(data).append(" ");
            if( right != null ) {
                buf.append(right.toOrderedString()).append(" ");
            }
            return buf.toString();
        }

    }

    Node find(Node root, int data) {
        if( root.data == data) return root;
        if( data < root.data && root.left != null ) {
            return find(root.left, data);
        } else {
            if( root.right != null ) {
                return find(root.right, data);
            }
        }
        return null;
    }

    private Map<Integer, Boolean> unique = new HashMap<>();
    private Node globalRoot = null;

    private boolean check(Node root) {
        if( root == null) return true;
        if( unique.containsKey(root.data) ) return false;
        unique.put(root.data, true); // add node value to the "uniqueness" map
        if( find(globalRoot, root.data) != root ) return false; // check if the node is in the right place
        if( (root.left != null && root.left.data > root.data)
                || (root.right != null && root.right.data < root.data )) return false;
        if( root.left != null && root.right != null && root.left.data > root.right.data ) return false;
        return check(root.left) && check(root.right);
    }

    boolean checkBST(Node root) {
        globalRoot = root;
        unique.clear();
        return check(root);
    }

}
