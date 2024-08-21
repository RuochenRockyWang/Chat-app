package edu.rice.comp504.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomDBTest {

    @Test
    public void getONLY() {
    }

    @Test
    public void make() {
    }

    @Test
    public void getRooms() {
        assertEquals(RoomDB.make().getRooms().size(), 2);
    }

    @Test
    public void addGroupRoom() {
        RoomDB.make().addGroupRoom(1, "name", "swim", "owner",
                false, "111");
        assertEquals(RoomDB.make().getRooms().size(), 1);
    }

    @Test
    public void addUserChat() {
        RoomDB.make().addUserChat("name", "name2");
        assertEquals(RoomDB.make().getRooms().size(), 2);
    }

    @Test
    public void getNextRoomID() {
        RoomDB.make().getNextRoomID();
        assertEquals(RoomDB.make().nextRoomID, 3);

    }
}