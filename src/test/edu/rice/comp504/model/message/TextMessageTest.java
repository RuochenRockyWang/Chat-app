package edu.rice.comp504.model.message;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextMessageTest {
    TextMessage textMessage = (TextMessage) TextMessage.make("a", "b", "c", "d"
            , "e", 12);

    @Test
    public void make() {
        TextMessage textMessage2 = (TextMessage) TextMessage.make("a", "b", "c", "d"
                , "e", 12);
        assertEquals(textMessage2, textMessage2);
    }

    @Test
    public void getSize() {
        assertEquals(12, textMessage.getSize());
    }

    @Test
    public void getBody() {
        assertEquals("c", textMessage.getBody());
    }

    @Test
    public void getColor() {
        assertEquals("e", textMessage.getColor());
    }

    @Test
    public void getFont() {
        assertEquals("d", textMessage.getFont());
    }
}