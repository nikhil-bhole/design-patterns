package unit;

import codingque.StringCombinations;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StringCombinationsTest {

    @Test
    public void testPrintPermutations() {
        // Setup: redirect System.out to capture output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        // Test case 1: String "AB"
        String input1 = "AB";
        String expectedOutput1 = "AB\nBA\n";  // Expecting exact line breaks
        StringCombinations.printPermutations(input1, "");

        // Validate the output
        String actualOutput1 = baos.toString();
        Assert.assertEquals(actualOutput1, expectedOutput1, "The permutations output doesn't match.");

        // Clear the output stream for the next test case
        baos.reset();

        // Test case 2: String "XYZ"
        String input2 = "XYZ";
        String expectedOutput2 = "XYZ\nXZY\nYXZ\nYZX\nZXY\nZYX\n"; // Ensure exact line breaks
        StringCombinations.printPermutations(input2, "");

        // Validate the output
        String actualOutput2 = baos.toString();
        Assert.assertEquals(actualOutput2, expectedOutput2, "The permutations output doesn't match.");
    }


}