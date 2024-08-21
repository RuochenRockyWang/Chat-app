package edu.rice.comp504.model.message;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImageMessageTest {

    @Test
    public void make() {
        ImageMessage message = (ImageMessage) ImageMessage.make("", "aaa", "aaa", 12);
        assertEquals(message, message);
    }

    @Test
    public void getScale() {
        ImageMessage message = (ImageMessage) ImageMessage.make("", "aaa", "aaa", 12.1);
        double val = 12.1;
        double scale = message.getScale();
    }

    @Test
    public void getSourceUrl() {
        ImageMessage message = (ImageMessage) ImageMessage.make("", "aaa", "aaa", 12);
        assertEquals("aaa", message.getSourceUrl());
    }
}