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

}
