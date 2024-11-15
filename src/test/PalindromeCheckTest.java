import Main.PalindromeCheck;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeCheckTest {
    @Test
    public void testPalindromeCheck() {
        PalindromeCheck pc = new PalindromeCheck();
        boolean check = PalindromeCheck.isPalindrome("A man, a plan, a canal: Bulus");
    }

    @Test
    public void testPalindromeTrue() {
        assertTrue(PalindromeCheck.isPalindrome("racecar"));
        assertTrue(PalindromeCheck.isPalindrome("madam"));
    }

}
