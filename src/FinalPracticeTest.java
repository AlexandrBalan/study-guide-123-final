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
}
