package edu.rice.comp504.model;

import org.eclipse.jetty.websocket.api.*;
import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.assertEquals;

public class UserDBTest {
    @Test
    public void getUsers() {
        assertEquals(5, UserDB.getUsers().size());
    }

    @Test
    public void addUser() {
        UserDB.addUser("test", "test2", 18, "swim", "1111");
        assertEquals(5, UserDB.getUsers().size());
    }

    @Test
    public void checkUser() {
        UserDB.addUser("test", "test2", 18, "swim", "1111");
        assertEquals(true, UserDB.checkUser("test"));
    }

    @Test
    public void getSessionUserMap() {
        Map<Session, String> map = new ConcurrentHashMap<>();
        map = UserDB.getSessionUserMap();
        assertEquals(map, UserDB.getSessionUserMap());
    }

    @Test
    public void genNextUserId() {
        assertEquals(1, UserDB.genNextUserId());
    }

    @Test
    public void addSessionUser() {
        TestSession test = new TestSession();
        UserDB.addSessionUser(test, "aaa");
        assertEquals(3, UserDB.getSessionUserMap().size());
    }

    @Test
    public void getUser() {
        TestSession test = new TestSession();
        assertEquals(null, UserDB.getUser(test));
    }

    @Test
    public void removeUser() {
        TestSession test = new TestSession();
        UserDB.addUser("aaa", "rice", 11, "a", "111");
        UserDB.addSessionUser(test, "aaa");
        UserDB.removeUser(test);
    }

    @Test
    public void getSessions() {
        Set<Session> set = new HashSet<>();
        TestSession test = new TestSession();
        UserDB.addSessionUser(test, "aaa");
        set.add(test);
        assertEquals(set, UserDB.getSessions());
    }

    @Test
    public void getUserBySession() {
        TestSession test = new TestSession();
        UserDB.addSessionUser(test, "aaa");
        assertEquals("aaa", UserDB.getUserBySession(test));
    }

    @Test
    public void getHateSpeechCount() {
        Map<String, Integer> map = new HashMap<>();
        assertEquals(map, UserDB.getHateSpeechCount());
    }

    @Test
    public void setHateSpeechCount() {
        Map<String, Integer> map = new HashMap<>();
        UserDB.setHateSpeechCount(map);
        assertEquals(map, UserDB.getHateSpeechCount());
    }

    class TestSession implements org.eclipse.jetty.websocket.api.Session {

        @Override
        public void close() {

        }

        @Override
        public void close(CloseStatus closeStatus) {

        }

        @Override
        public void close(int i, String s) {

        }

        @Override
        public void disconnect() throws IOException {

        }

        @Override
        public long getIdleTimeout() {
            return 0;
        }

        @Override
        public void setIdleTimeout(long l) {

        }

        @Override
        public InetSocketAddress getLocalAddress() {
            return null;
        }

        @Override
        public WebSocketPolicy getPolicy() {
            return null;
        }

        @Override
        public String getProtocolVersion() {
            return null;
        }

        @Override
        public RemoteEndpoint getRemote() {
            return null;
        }

        @Override
        public InetSocketAddress getRemoteAddress() {
            return null;
        }

        @Override
        public UpgradeRequest getUpgradeRequest() {
            return null;
        }

        @Override
        public UpgradeResponse getUpgradeResponse() {
            return null;
        }

        @Override
        public boolean isOpen() {
            return false;
        }

        @Override
        public boolean isSecure() {
            return false;
        }

        @Override
        public SuspendToken suspend() {
            return null;
        }
    }

}