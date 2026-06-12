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

    // TODO: implement the rest of the study guide AND MAKE GOOD UNIT TESTS
}
