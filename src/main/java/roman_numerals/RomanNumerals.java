package roman_numerals;

public class RomanNumerals {

    public String convertToRoman(int number) {
        if(number > 5 && number < 10) {
            if(number == 9) {
                return convertBeforeNewRomanSymbol(number);
            }
            return convertToRoman(5) + convertToRoman(1).repeat(number - 5);
            //1 -> "I"
            //2 -> "II"
            //
        }

        if(number == 4) {
            return convertBeforeNewRomanSymbol(number);
        }

        if(number > 10) {
            return convertToRoman(10) + convertToRoman(number - 10);
        }

        if(number == 5) {
            return "V";
        }

        if(number == 10) {
            return "X";
        }

        return "I".repeat(number);
    }

    private String convertBeforeNewRomanSymbol(int number) {
        return convertToRoman(1) + convertToRoman(number + 1);
    }
}
