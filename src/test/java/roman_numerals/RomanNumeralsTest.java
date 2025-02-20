package roman_numerals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

class RomanNumeralsTest {

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "6, VI",
            "7, VII",
            "8, VIII",
            "9, IX",
            "10, X",
            "11, XI",
            "12, XII",
            "13, XIII",
            "14, XIV",
            "15, XV",
            "16, XVI",
            "17, XVII",
            "20, XX",
            "30, XXX"
    })
    void convertToRoman(int input, String expected) {
        assertThat(new RomanNumerals().convertToRoman(input)).isEqualTo(expected);
    }

    @Disabled
    @Test
    void convertToRoman_whenNumberIsInvalid_returnsInvalidNumberError() {
        assertThatThrownBy(() -> new RomanNumerals().convertToRoman(0)).hasMessageContaining("number:invalid_number");
    }

    //TODO parameterizedTest
    //TODO cas du IX voir si je peux faire qq chose en commun avec IV
    //TODO finir le kata ;)
    //TODO faire une classe pour gérer l'exception
}
