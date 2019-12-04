import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralConverterTest {
    @Test
    public void Convert_I_To_1() {
        RomanNumeralConvert converter = new RomanNumeralConvert();

        int result = converter.ConvertRomanNumeralToInteger("I");

        Assert.assertEquals(1, result);
    }

    @Test
    public void Convert_II_To_2() {
        RomanNumeralConvert convert = new RomanNumeralConvert();

        int result = convert.ConvertRomanNumeralToInteger("II");

        Assert.assertEquals(2, result);
    }

    @Test
    public void Convert_III_To_3() {
        RomanNumeralConvert convert = new RomanNumeralConvert();

        int result = convert.ConvertRomanNumeralToInteger("III");

        Assert.assertEquals(3, result);
    }

    @Test
    public void Convert_IV_To_4() {
        RomanNumeralConvert convert = new RomanNumeralConvert();

        int result = convert.ConvertRomanNumeralToInteger("IV");

        Assert.assertEquals(4, result);
    }

    @Test
    public void Convert_V_To_5() {
        RomanNumeralConvert convert = new RomanNumeralConvert();

        int result = convert.ConvertRomanNumeralToInteger("V");

        Assert.assertEquals(5, result);
    }

    @Test
    public void Convert_VI_To_6() {
        RomanNumeralConvert convert = new RomanNumeralConvert();

        int result = convert.ConvertRomanNumeralToInteger("VI");

        Assert.assertEquals(6, result);
    }

    @Test
    public void Convert_IX_To_9() {
        RomanNumeralConvert convert = new RomanNumeralConvert();

        int result = convert.ConvertRomanNumeralToInteger("IX");

        Assert.assertEquals(9, result);
    }
}
