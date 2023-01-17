package org.example;

import org.example.Converter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest {
    Converter converter;

    @BeforeEach
    void SetUpConverter() {
        converter = new Converter();
    }

    @Test
    void getFahrenheitFromCelsius() {
        converter.setCelsius(0);
        assertEquals(32, converter.getFahrenheit());
    }

    @Test
    void getCelsiusFromFahrenheit() {
        converter.setFahrenheit(0);
        assertEquals(-17.792, converter.getCelsius());
    }

    @Test
    void getNotNullTheCelsiusField() {
        Double value = converter.getCelsius();
        assertNotNull(value);
    }

    @Test
    void getNotNullTheFahrenheitField() {
        assertNotNull(converter.getFahrenheit());
    }

    @Test
    void getReturnValueType(){
        converter.setCelsius(34);
        assertInstanceOf(Double.class, converter.getFahrenheit());
    }

    @Test
    void getCalculatedByLimitedTime() {
        //15ms for this method is needed
        assertTimeout(Duration.ofMillis(80), () -> {
                    List<Double> celsiusNumbers = Arrays.asList(20.0, 50.0, 9.0, 10.5, 30.5, 10.5, 100.10, 0.5, 1.4);
                    for (Double celsius :
                            celsiusNumbers) {
                        converter.setCelsius(celsius);
                        System.out.print(converter.getFahrenheit() + " ");
                    }
                }
        );
    }
}
