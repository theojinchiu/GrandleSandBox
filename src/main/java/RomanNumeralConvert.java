import java.util.HashMap;
import java.util.Map;

public class RomanNumeralConvert {
    private Map<String, Integer> RomanNumeralIntegerMapping = new HashMap<String, Integer>() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
        }
    };

    public int ConvertRomanNumeralToInteger(String romanNumeral) {
        int sum = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            int currentNumeralValue = TranslateRomanValue(romanNumeral.charAt(i));

            if (NextCharExist(romanNumeral, i) == false) {
                sum += currentNumeralValue;
            } else {
                int nextNumeralValue = TranslateRomanValue(romanNumeral.charAt(i+1));

                if (nextNumeralValue > currentNumeralValue)
                    sum -= currentNumeralValue;
                else
                    sum += currentNumeralValue;
            }
        }

        return sum;
    }

    private int TranslateRomanValue(char c) {
        return RomanNumeralIntegerMapping.get(Character.toString(c));
    }

    private boolean NextCharExist(String input, int currentIndex) {
        if (currentIndex + 1 < input.length())
            return true;

        return false;
    }
}
