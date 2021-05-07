package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests

    @Test
    public void onlyBracketsReturnsTrueBasic() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsFalseBasic() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void onlyBracketsReturnsTrueWithNonBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]}"));
    }

    @Test
    public void onlyBracketsReturnsTrueWithWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
    }


    @Test
    public void onlyBracketsReturnsTrueEmpty() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsFalseWrongOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyBracketsReturnsMultiplePairs() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][[[]]]"));
    }

}
