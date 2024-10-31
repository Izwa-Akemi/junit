package test.practice.ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practice.ex3.MaxFinder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxFinderTest {

    private final MaxFinder maxFinder = new MaxFinder();

    @Test
    public void testFindMax() {
        assertEquals(3, maxFinder.findMax(new int[]{1, 2, 3}));
        assertEquals(5, maxFinder.findMax(new int[]{-1, -2, 5, 0}));
        assertEquals(100, maxFinder.findMax(new int[]{100, 1, 2, 3, 4}));
        assertThrows(IllegalArgumentException.class, () -> maxFinder.findMax(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> maxFinder.findMax(null));
    }
}
