package edu.rice.comp504.model.message;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageFacTest {

    MessageFac fac = new MessageFac();

    @Test
    public void make() {
        assertEquals(NullMessage.make(), fac.make(""));
    }
}