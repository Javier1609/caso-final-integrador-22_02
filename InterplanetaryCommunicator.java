import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class InterplanetaryCommunicator {
    public int countVowels(String message) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < message.length(); i++) {
            if (vowels.indexOf(message.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public String reverseMessage(String message) {
        return new StringBuilder(message).reverse().toString();
    }

    public boolean isPalindrome(String message) {
        String reversed = reverseMessage(message);
        return message.equals(reversed);
    }

    @Test
    void testCountVowels() {
        InterplanetaryCommunicator communicator = new InterplanetaryCommunicator();
        assertEquals(3, communicator.countVowels("Hello World"));
    }

    @Test
    void testReverseMessage() {
        InterplanetaryCommunicator communicator = new InterplanetaryCommunicator();
        assertEquals("dlroW olleH", communicator.reverseMessage("Hello World"));
    }

    @Test
    void testIsPalindrome() {
        InterplanetaryCommunicator communicator = new InterplanetaryCommunicator();
        assertTrue(communicator.isPalindrome("madam"));
        assertFalse(communicator.isPalindrome("Hello World"));
    }
}