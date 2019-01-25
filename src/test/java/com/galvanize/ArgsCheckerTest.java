package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArgsCheckerTest {
    private ArgsChecker argsChecker;

    @BeforeEach
    void runBefore() {
        argsChecker = new ArgsChecker();
    }

    @Test
    void argsCheckLength() {
        final Exception exception = assertThrows(IllegalArgumentException.class, () -> argsChecker.check(new String[]{"2"}));
        assertEquals("too few arguments", exception.getMessage());

        final Exception exception1 = assertThrows(IllegalArgumentException.class, () -> argsChecker.check(new String[]{"1", "2", "1"}));
        assertEquals("too many arguments", exception1.getMessage());
    }

    @Test
    void argsCheckNaN() {
        final Exception exception = assertThrows(IllegalArgumentException.class, () -> argsChecker.check(new String[]{"1", "b"}));
        assertEquals("non-numeric arguments", exception.getMessage());
    }

    @Test
    void argsCheckZero() {
        final Exception exception = assertThrows(IllegalArgumentException.class, () -> argsChecker.check(new String[]{"0", "1"}));
        assertEquals("zeros", exception.getMessage());
    }

    @Test
    void argsCheckNegative() {
        final Exception exception = assertThrows(IllegalArgumentException.class, () -> argsChecker.check(new String[]{"1", "-1"}));
        assertEquals("negative numbers", exception.getMessage());
    }

}
