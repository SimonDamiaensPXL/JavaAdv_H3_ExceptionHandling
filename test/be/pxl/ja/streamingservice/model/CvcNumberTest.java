package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CvcNumberTest {
    
    @Test
    public void validCvcNumber(){
        CreditCardNumber creditCardNumber = new CreditCardNumber("4321876532147654", "123");

        assertEquals("123", creditCardNumber.getCvc());
    }

    @Test
    public void throwsInvalidArgumentExceptionWhenNumberTooShort() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CreditCardNumber("4321876532147654", "12");
        });
    }

    @Test
    public void throwsInvalidArgumentExceptionWhenNumberTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CreditCardNumber("4321876532147654", "1234");
        });
    }
}
