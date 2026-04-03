package tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AssertionFailedError;
import org.junit.jupiter.api.Test;

// 1. So long as the Test method finishes without throwing an exception as test is consdiered passed.
// 2. Assertions are just methos that throw an excpetion if the assertion is false.
// 3. All Test methods are VOID. That is a Junit thing.

// TDD is more than just seeing if your code works.
// they are instrumental in designing your application.

public class Junit {
    TemperatureConverter converter = new TemperatureConverterImpl();

    @Test
    void celcius_to_fahrenheit() {   // only acceptable use case of underscores in Java
        double result = this.converter.celciusToFahrenheit(100);
        Assertions.assertEquals(212, result, 0.1); // the 0.1 is the delta, which is the maximum difference between the expected and actual values for which the test will pass.
    }

    @Test
    void fahrenheit_to_celcius() {
        double result = this.converter.fahrenheitToCelcius(212);
        Assertions.assertEquals(100, result, 0.1);
    }

    @Test // negative test. makes sure something fails appropriately
    void absolute_Zero_raises_exception() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            this.converter.celciusToFahrenheit(-400);
        });
    }

    @Test
    void kelvin_celcius() {
        // do we care if it is case sensitive?
        // what do we do if it is misspelled?
        // should we allow the letter k, s, c to indicate temperature?
        double result = this.converter.convertTemp(100, "Kelvin", "Celcius");
        Assertions.assertEquals(-173.15, result);
    }

    @Test
    void case_insensitive() {  // we can make the test case insensitive by converting the input to lower case before processing it.
        double result = this.converter.convertTemp(100, "kELvin", "cELcius");
        Assertions.assertEquals(-173.15, result);
    }
}
