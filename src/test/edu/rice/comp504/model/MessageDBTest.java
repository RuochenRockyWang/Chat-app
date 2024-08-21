package edu.rice.comp504.model;

import edu.rice.comp504.model.message.CompositeMessage;
import edu.rice.comp504.model.message.ImageMessage;
import edu.rice.comp504.model.message.Message;
import edu.rice.comp504.model.message.TextMessage;
import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.*;

public class MessageDBTest {

    @Test
    public void make() {
    }

    @Test
    public void getMessageMap() {
        assertEquals(MessageDB.make().getMessageMap(), new ConcurrentHashMap<>());
    }

    @Test
    public void addMessage() {
        Message m1 = MessageDB.make().addMessage("sender", "room", "body", "text");
        Message m2 = MessageDB.make().addMessage("sender", "room", "body", "image");
        Message m3 = MessageDB.make().addMessage("sender", "room", "body", "composite");
        Message m4 = MessageDB.make().addMessage("sender", "room", "body", "hahaha");
        assertTrue(m1 instanceof TextMessage);
        assertTrue(m2 instanceof ImageMessage);
        assertTrue(m3 instanceof CompositeMessage);
        assertFalse(m4 instanceof CompositeMessage);
    }

    @Test
    public void getNextMessageID() {
    }
}