import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrinterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {

        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintOutput() {

        Calculator calculator = new Calculator(3, 5);
        Printer printer = new Printer(calculator);
        printer.printOutput();

        Assert.assertEquals("8.0\n", outContent.toString());

    }

    @After
    public void clearStreams() {

        System.setOut(null);
    }
}
