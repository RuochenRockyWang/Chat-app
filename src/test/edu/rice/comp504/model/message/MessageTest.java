package edu.rice.comp504.model.message;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageTest {

    Message message = ImageMessage.make("a", "a", "a", 12);

    @Test
    public void getSendUser() {
        assertEquals("a", message.getSendUser());
    }

    @Test
    public void getTimestamp() {
        assertEquals("a", message.getSendUser());
    }

    @Test
    public void getType() {
        assertEquals("image", message.getType());
    }

    @Test
    public void make() {
        Message message2 = ImageMessage.make("a", "a", "a", 12);
        assertEquals(message2, message2);
    }
}