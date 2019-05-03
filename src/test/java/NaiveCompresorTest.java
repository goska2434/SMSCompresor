import compresor.NaiveCompresor;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;



import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)

public class NaiveCompresorTest {

    private NaiveCompresor compresor;
    @Before
    public void setUp() throws Exception{
        compresor = new NaiveCompresor();

    }
    @Test
    @Parameters({"Ala ma kota, AlaMaKota", "Przyszedł SMS, PrzyszedłSms"})
    public void compressTest(String SMSText, String expectedResult) {
        String compressedSMS = compresor.compress(SMSText);
        assertEquals(expectedResult, compressedSMS);
    }
    @Test
    @Parameters({"Ala Ma KoTa, AlaMaKota", "Przyszedł SMS, PrzyszedłSms"})
    public void mixedCasedCompressTest(String compressedSMS, String expectedResult) {
        String decompressedSMS = compresor.compress(compressedSMS);
        assertEquals(expectedResult, decompressedSMS);
    }

    @Test
    @Parameters({"AlaMaKota, ala ma kota ", "PrzyszedłSMS, przyszedł s m s"})
    public void uncompressTest(String compressedSMS, String expectedResult) {
        String decompressedSMS = compresor.uncompress(compressedSMS);
        assertEquals(expectedResult, decompressedSMS);
    }


//    @Test
//    public void emptyUncompressTest() {
//        String decompressedSMS = compresor.uncompress(compressedSMS);
//        String given ="Ala ma kota";
//        String[] expected = {"Ala ma kota"};
//        assertArrayEquals(expected, paginator.paginate(given));
//    }
//    @Test
//    public void emptyUncompressTest(String given, String expected) { given = "";
//        expected = "";
//        given = "";
//        assertEquals(expected, compresor.uncompress());
//
//    }





}
