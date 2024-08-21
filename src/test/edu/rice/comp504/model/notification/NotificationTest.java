package edu.rice.comp504.model.notification;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotificationTest {
    Notification test = SimpleNotification.make("sender", "receiver", "test");

    @Test
    public void getType() {
        assertEquals(test.getType(), "simple");
    }

    @Test
    public void isHasButton() {
        assertEquals(test.isHasButton(), false);
    }

    @Test
    public void isReadStatus() {
        assertEquals(test.isReadStatus(), false);
    }

    @Test
    public void getInfo() {
        assertEquals(test.getInfo(), "test");
    }

    @Test
    public void getReceiver() {
        assertEquals(test.getReceiver(), "receiver");
    }

    @Test
    public void buttonRemove() {
        test.buttonRemove();
        assertEquals(test.isHasButton(), false);
    }

    @Test
    public void notificationRead() {
        test.notificationRead();
        assertEquals(test.isReadStatus(), true);
    }

    @Test
    public void make() {
    }

    @Test
    public void getSender() {
        assertEquals(test.getSender(), "sender");
    }

    @Test
    public void setSender() {
        test.setSender("test2");
        assertEquals(test.getSender(), "test2");
    }

    @Test
    public void getTimestamp() {
        test.setTimestamp("111");
        assertEquals(test.getTimestamp(), "111");
    }

    @Test
    public void setTimestamp() {
        test.setTimestamp("111");
        assertEquals(test.getTimestamp(), "111");
    }

    @Test
    public void testNotificationFac() {
        NotificationFac notificationFac = new NotificationFac();
        Notification acceptNotification = notificationFac.make("inviteAccept", "sender", "receiver", "info");
        Notification applyNotification = notificationFac.make("apply", "sender", "receiver", "info");
        Notification interactNotification = notificationFac.make("request", "sender", "receiver", "info");
        Notification inviteNotification = notificationFac.make("invite", "sender", "receiver", "info");
        Notification kickNotification = notificationFac.make("kick", "sender", "receiver", "info");
        Notification muteNotification = notificationFac.make("mute", "sender", "receiver", "info");
        Notification nullNotification = notificationFac.make("null", "sender", "receiver", "info");
        Notification rejectNotification = notificationFac.make("inviteReject", "sender", "receiver", "info");
        Notification simpleNotification = notificationFac.make("simple", "sender", "receiver", "info");
        Notification warningNotification = notificationFac.make("warn", "sender", "receiver", "info");
        Notification otherNotification = notificationFac.make("sdjisdji", "sender", "receiver", "info");
        Notification acceptNot = notificationFac.make("accept", "sender", "receiver", "info");
        Notification rejectNot = notificationFac.make("inviteAccept", "sender", "receiver", "info");
    }
}