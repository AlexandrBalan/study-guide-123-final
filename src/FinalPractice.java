import java.util.HashMap;
import java.util.Map;

import org.junit.Assume;

public class FinalPractice {
    public static void main(String[] args) {
        // Feel free to call your methods here to experiment

        // YOU MUST ALSO MAKE THOROUGH TESTS FOR EVERY METHOD 
    }

    /**
     * Return the sum of the values at odd indexes in a linked list.
     * 
     * Assumes head is at index 0.
     * 
     * If passed a null head, returns 0.
     * 
     * @param head the head of the linked list
     * @return the sum of the values at odd indexes
     */
    public static int oddIndexSum(ListNode head) {
        // TODO: implement this AND MAKE MORE UNIT TESTS FOR IT
        if(head == null) return 0;

        int sum = 0;
        int index = 0;

        ListNode current = head;

        while(current != null) {//if the index is not even
            if(index % 2 != 0) {
                sum += current.data;
            }
            current = current.next;
            index++; 
        }

        return sum;
    }

    /* 
Given a reference to the head of a linked list, return the largest of only the last 3 values of the list.
Example:
Linked List:
7 -> 3 -> 19 -> 21 -> 14 -> 33 -> 8 -> 26 -> 11 -> 5
Expected Answer: 26
Last 3 values are: 26  11  5, the largest of which is 26
POSSIBLE VARIATION: Largest of last 4 values
*/

    public static int lastThree(ListNode head) {
        int first = 0;
        int second = 0;
        int third = 0;

        ListNode current = head;

        while(current != null) {
            first = second;
            second = third;
            third = current.data;
            current = current.next;
        }

        return Math.max(first, Math.max(second, third));
    }



    /*
    
            Given a reference to the root of a tree, return the sum of the leaf nodes with even values in the tree. Do not include any odd or branch nodes.
            Example:
            Tree:
                    12
                    /    \
                6      18
                / \    /  \
                4   8  16   20
                /               \
            3                22

            Expected Answer: 46
            The leaf nodes are 3   8   16   22, and the even ones are 8   16   22.
            The sum of the even leaf nodes is 8+16+22 = 46
            POSSIBLE VARIATION: Sum of leaf nodes with odd values
    
    
    
    
    */
    public static int evenLeafSum(TreeNode root) {
        if(root == null) return 0;

        boolean isLeaf = root.left == null && root.right == null;

        if(isLeaf) {
            if(root.data % 2 == 0) {//if the leaf is even 
                return root.data;
            } 

            else {
                return 0;
            }
        }

        return evenLeafSum(root.left) + evenLeafSum(root.right);
    }



                /*
Given a reference to the root of a tree, return the sum of the branch nodes with odd values in the tree. Do not include any even or leaf nodes.
Example:
Tree:
           15
         /    \
        9      4
       / \    /  \
      8   11 21   30
     / \        \
    2   6        23

Expected Answer: 45
The branch nodes are 15  9  4  8  21, and the odd ones are 15  9   21
The sum of the odd branch nodes is 15+9+21=45
POSSIBLE VARIATION: Sum of branch nodes with even values


                */

public static int oddSum(TreeNode root) {
    if(root == null) return 0;

    boolean isLeaf = root.left == null && root.right == null;


    if(isLeaf) return 0;

    int sum = 0;

    if(root.data % 2 != 0) {
        sum += root.data;
    }


    return sum + oddSum(root.left) + oddSum(root.right);
}


/*

Given a reference to a head node in a linked list of integers, return a Map<Integer, Integer> containing each value along with the number of times it shows up.
Example:
Linked List:
4 -> 34 -> 4 -> 16 -> 4 -> 16 -> 29 -> 8 -> 8

Expected Return Map (order is unimportant): 
{ 
  4: 3,
  8: 2,
  16: 2,
  29: 1,
  34: 1
} 

Explanation
4 shows up three times
8 shows up two times
16 shows up two times
29 shows up one time
34 shows up one time



*/

public static Map<Integer, Integer> valueCounts(ListNode head) {
    Map<Integer, Integer> counts = new HashMap<>();

    ListNode current = head;

    while(current != null) {
        if(counts.containsKey(current.data)) {
            counts.put(current.data, counts.get(current.data) + 1);
        }
        else {
            counts.put(current.data, 1);
        }

        current = current.next;
    }

    return counts;
}
    
}
