import org.junit.Test;

import static org.junit.Assert.*;
public class PrinterTest {
    Printer printer = new Printer();

    @Test
    public void hasSheets(){assertEquals(1000, printer.getSheets());}

    @Test
    public void canPrint(){assertEquals(950, printer.print(5, 10));}

    @Test
    public void preventsPrint(){assertEquals(1000, printer.print(500, 300));}

    @Test
    public void tonerRunsOut(){assertEquals(1000, printer.print(101, 1));}

}
