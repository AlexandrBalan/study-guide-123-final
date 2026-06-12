import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    // TODO: Make more tests for oddIndexSum
    @Test
    void testOddIndexSum_null() {
        assertEquals(0, FinalPractice.oddIndexSum(null));
    }

    @Test
    void testOddIndexSum_oneNode() {
        ListNode list = new ListNode(4);
        assertEquals(0, FinalPractice.oddIndexSum(list));
    }

    @Test
    void testOddIndexSum_sameValues() {
        ListNode list = new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(3))));
        assertEquals(6, FinalPractice.oddIndexSum(list));
    }

    // TODO: Make thorough tests for ALL the questions on the study guide
    // last three big numbers
    @Test
    void testLastThreeLargest() {
        ListNode list = new ListNode(7, new ListNode(4, new ListNode(26, new ListNode(5))));
        assertEquals(26, FinalPractice.lastThree(list));
    }

    @Test
    void testLastThreeLargest_allSame() {
        ListNode list = new ListNode(5, new ListNode(5, new ListNode(5, new ListNode(5))));
        assertEquals(5, FinalPractice.lastThree(list));
    }

    @Test
    void testLastThreeLargest_lastBiggest() {
        ListNode list = new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(99))));

        assertEquals(99, FinalPractice.lastThree(list));
    }



    //EvenLeafSum test cases
    @Test
    void testEvenLeafSum_null() {
        assertEquals(0, FinalPractice.evenLeafSum(null));
    }

    @Test
    void testEvenLeafSum_singleEvenLeaf() {
        assertEquals(4, FinalPractice.evenLeafSum(new TreeNode(4)));
    }

    @Test
    void testEvenLeafSum_singleOddLeaf() {
        assertEquals(0, FinalPractice.evenLeafSum(new TreeNode(5)));
    }



    //oddSum test cases

    @Test
    void testOddSum_null() {
        assertEquals(0, FinalPractice.oddSum(null));
    }

    @Test
    void testOddSum_singleNode() {
        assertEquals(0, FinalPractice.oddSum(new TreeNode(7)));
    }

    @Test
    void TestOddSum_allEven() {
    TreeNode tree = new TreeNode(2, new TreeNode(4), new TreeNode(1));
    assertEquals(0, FinalPractice.oddSum(tree));
    }
}
