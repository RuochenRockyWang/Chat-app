package edu.rice.comp504.model.message;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NullMessageTest {

    @Test
    public void make() {
        assertEquals(NullMessage.make(), NullMessage.make());
    }
}