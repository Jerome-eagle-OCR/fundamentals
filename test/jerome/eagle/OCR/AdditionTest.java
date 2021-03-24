package jerome.eagle.OCR;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    Addition addition = new Addition();

    @Test
    public void Given_OneAndOneEntered_When_DisplayAdditionResult_Then_DisplayResultIsTwo() {
        addition.performAddition(1,1);
        assertEquals("Le résultat est 2\n", outContent.toString().replace("\r\n", "\n"));
    }
}
