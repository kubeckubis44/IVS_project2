package Calculator_test;

//potrebne knihovny

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

//trida, zacatek testu
public class calculator_tests{

    //je potreba vytvorit staticky virtualni objekt
    private static final Math math = new Math();
    
    //test na funkcnost scitani
    @Test
    public void Scitani_test(){
        
        //tyto testy by se mely rovnat
        assertTrue(0 == math.Scitani(0, 0));
        assertTrue(0 == math.Scitani(-1, 1));
        assertTrue(10 == math.Scitani(10, 0));
        assertTrue(-30 == math.Scitani(-20, -10));
        assertTrue(-1 == math.Scitani(12, -13));
        assertTrue(200000 == math.Scitani(100000, 100000));
        assertTrue(10 == math.Scitani(4.25, 5.75));
        assertTrue(-2.2345 == math.Scitani(-1.4986, -0.7359));

        //tyto testy by se nemely rovnat
        assertFalse(0 == math.Scitani(2, 3));
        assertFalse(-2 == math.Scitani(-2, -2));
        assertFalse(1000000 == math.Scitani(100000, 100000));
        assertFalse(-2.5 == math.Scitani(-1.5, 2));
        assertFalse(123 == math.Scitani(123, 1));
        assertFalse(3.4598 == math.Scitani(3.125, 5.649));
    }

    //test na funkcnost odcitani
    @Test
    public void Odcitani_test(){

        //tyto testy by se mely rovnat
        assertTrue(0 == math.Odcitani(0, 0));
        assertTrue(0 == math.Odcitani(2, 2));
        assertTrue(-10 == math.Odcitani(-45, -35));
        assertTrue(30 == math.Odcitani(20, -10));
        assertTrue(-9000 == math.Odcitani(1000, 10000));
        assertTrue(0 == math.Odcitani(10000, 10000));
        assertTrue(4.06 == math.Odcitani(8.23, 4.17));
        assertTrue(-16.2221 == math.Odcitani(-10.2345, -5.9876));

        //tyto testy by se nemely rovnat
        assertFalse(0 == math.Odcitani(2, 3));
        assertFalse(-2 == math.Odcitani(-2, -2));
        assertFalse(1000000 == math.Odcitani(100000, 100000));
        assertFalse(-2.5 == math.Odcitani(-1.5, 2));
        assertFalse(123 == math.Odcitani(123, 1));
        assertFalse(3.4598 == math.Odcitani(3.125, 5.649));
    }

    //test na funkcnost nasobeni
    @Test
    public void Nasobeni_test(){
        
        //tyto testy by se mely rovnat
        assertTrue(0 == math.Nasobeni(0, 0));
        assertTrue(6 == math.Nasobeni(2, 3));
        assertTrue(-40 == math.Nasobeni(-10, 4));
        assertTrue(200 == math.Nasobeni(-20, -10));
        assertTrue(-13104 == math.Nasobeni(-84, 156));
        assertTrue(0 == math.Nasobeni(100000, 0));
        assertTrue(19.6875 == math.Nasobeni(2.25, 8.75));
        assertTrue(-3.86508 == math.Nasobeni(-12.468, 0.31));

        //tyto testy by se nemely rovnat
        assertFalse(1000000 == math.Nasobeni(1000000, 0));
        assertFalse(-2.5 == math.Nasobeni(-1.5, 2));
        assertFalse(1 == math.Nasobeni(123, 1));
        assertFalse(3.4598 == math.Nasobeni(3.125, 5.649));

    }

    //test na funkcnost deleni
    @Test
    public void Deleni_test() {
        
        //tyto testy ocekavaji string vystup ,,ERROR,, po zavolani funkce s temito vstupnimi parametry
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        math.Deleni(5, 0);
        assertEquals("ERROR", outContent.toString());
        System.setOut(originalOut);

        //tyto testy by se mely rovnat
        assertTrue(0 == math.Deleni(0, 5));
        assertTrue(1 == math.Deleni(3, 3));
        assertTrue(-2 == math.Deleni(-8, 4));
        assertTrue(2 == math.Deleni(-20, -10));
        assertTrue(-0.8 == math.Deleni(-100, 125));
        assertTrue(21.25 == math.Deleni(4.25, 0.2));
        assertTrue(-8.5 == math.Deleni(2.25, -8.75));

        //tyto testy by se nemely rovnat
        assertFalse(1 == math.Deleni(2, 3));
        assertFalse(-0.5 == math.Deleni(-100, 250));
        assertFalse(21.2 == math.Deleni(4.25, 0.2));
        assertFalse(12.56 == math.Deleni(2.25, -8.75));
    }

    //test na funkcnost mocniny
    @Test
    public void Mocnina_test() {
        
        //tyto testy ocekavaji string vystup ,,ERROR,, po zavolani funkce s temito vstupnimi parametry
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        math.Mocnina(0, -1);
        assertEquals("ERROR", outContent.toString());
        System.setOut(originalOut);

        System.setOut(new PrintStream(outContent));
        math.Mocnina(0, -23);
        assertEquals("ERROR", outContent.toString());
        System.setOut(originalOut);

        System.setOut(new PrintStream(outContent));
        math.Mocnina(0, 0);
        assertEquals("ERROR", outContent.toString());
        System.setOut(originalOut);

        //tyto testy by se mely rovnat
        assertTrue(0 == math.Mocnina(0, 5));
        assertTrue(16 == math.Mocnina(4, 2));
        assertTrue(-4096 == math.Mocnina(-8, 4));
        assertTrue(-8000 == math.Mocnina(-20, 3));
        assertTrue(1 == math.Mocnina(459153, 0));
        assertTrue(20.25 == math.Mocnina(4.5, 2));

        //tyto testy by se nemely rovnat
        assertFalse(1 == math.Mocnina(0, 4));
        assertFalse(8 == math.Mocnina(4, 2));
        assertFalse(-1000 == math.Mocnina(-2, 4));
        assertFalse(-80025 == math.Mocnina(-20, 3));
    }

    //test na funkcnost odmocniny
    @Test
    public void Odmocnina_test() {
        
        //tyto testy ocekavaji string vystup ,,ERROR,, po zavolani funkce s temito vstupnimi parametry
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        math.Odmocnina(3, 0);
        assertEquals("ERROR", outContent.toString());
        System.setOut(originalOut);

        System.setOut(new PrintStream(outContent));
        math.Odmocnina(-12, 2);
        assertEquals("ERROR", outContent.toString());
        System.setOut(originalOut);

        System.setOut(new PrintStream(outContent));
        math.Odmocnina(-2, -5);
        assertEquals("ERROR", outContent.toString());
        System.setOut(originalOut);

        //tyto testy by se mely rovnat
        assertTrue(2 == math.Odmocnina(8, 3));
        assertTrue(2.25 == math.Odmocnina(11.390625, 3));
        assertTrue(3 == math.Odmocnina(729, 6));
        assertTrue(2 == math.Odmocnina(8192, 13));

        //tyto testy by se nemely rovnat
        assertFalse(1 == math.Odmocnina(2, 4));
        assertFalse(2 == math.Odmocnina(1, 2));
        assertFalse(-1000 == math.Odmocnina(2000, 4));
        assertFalse(20 == math.Odmocnina(20, 3));
    }

    //test na funkcnost logaritmu
    @Test
    public void Logaritmus_test() {
        
        //tyto testy ocekavaji string vystup ,,ERROR,, po zavolani funkce s temito vstupnimi parametry
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        math.Mocnina(4, -2);
        assertEquals("ERROR", outContent.toString());
        System.setOut(originalOut);

        System.setOut(new PrintStream(outContent));
        math.Mocnina(-10, 23);
        assertEquals("ERROR", outContent.toString());
        System.setOut(originalOut);

        System.setOut(new PrintStream(outContent));
        math.Mocnina(0, 5);
        assertEquals("ERROR", outContent.toString());
        System.setOut(originalOut);

        System.setOut(new PrintStream(outContent));
        math.Mocnina(4, 0);
        assertEquals("ERROR", outContent.toString());
        System.setOut(originalOut);

        //tyto testy by se mely rovnat
        assertTrue(5 == math.Mocnina(2, 32));
        assertTrue(2 == math.Mocnina(4, 16));
        assertTrue(3 == math.Mocnina(10, 1000));
        assertTrue(3 == math.Mocnina(16, 4096));
        assertTrue(1 == math.Mocnina(0.23, 0.23));

        //tyto testy by se nemely rovnat
        assertFalse(2 == math.Mocnina(4, 4));
        assertFalse(8 == math.Mocnina(4, 2));
        assertFalse(-1000 == math.Mocnina(-2, 4));
        assertFalse(-20 == math.Mocnina(-20, 3));
    }

}
