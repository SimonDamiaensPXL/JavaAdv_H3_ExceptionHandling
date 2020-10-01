package be.pxl.ja.streamingservice.model;

import be.pxl.ja.streamingservice.exception.InvalidDateException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateOfBirthTest {

    @Test
    public void throwsInvalidDateExceptionWhenDateInFuture() {
        assertThrows(InvalidDateException.class, () -> {
            new Profile("name").setDateOfBirth(LocalDate.now().plusDays(1));
        });
    }
}
