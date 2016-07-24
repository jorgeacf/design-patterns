package com.jorgefigueiredo.pattern.gangoffour;

import com.jorgefigueiredo.pattern.gangoffour.creational.adapter.Adapter;
import com.jorgefigueiredo.pattern.gangoffour.creational.adapter.Target;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdapterPatternTest {

    @Test
    public void testAdapterObjectReturnsNewValue() {

        Target object = new Target();
        assertEquals("operation", object.operation());
        object = new Adapter();
        assertEquals("new_operation", object.operation());
    }
}
