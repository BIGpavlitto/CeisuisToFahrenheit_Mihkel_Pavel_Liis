package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;

class MainTest {
    double temp;
    String input;

    @BeforeEach
     void setUpScanner() {
        temp = 10.5;
        input = "C";

    }

    @Test
    void isDoublePositive() {
        assertThat(temp).isPositive();
    }

    @Test
    void isTrueValueOfTemp(){
        assertThat(input).isEqualTo("C");
    }
}