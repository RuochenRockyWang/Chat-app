package edu.rice.comp504.model.user;

import edu.rice.comp504.model.chatroom.ChatRoom;
import edu.rice.comp504.model.notification.Notification;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * User abstract class to store User's related attributes.
 */
public abstract class User implements PropertyChangeListener {
    //private final int userId;
    private String username;
    private String password;
    //private String nickname;
    private String dateOfBirth;
    //private String emailAddress;
    //private final String userType;
    private ArrayList<ChatRoom> roomList;
    private ArrayList<Notification> notificationsList;
    private String school;
    private int age;
    private ArrayList<String> interests;


    /**
     * A constructor for a user.
     */
    /*public User(int uid, String username, String password, String nickname,
                String dateOfBirth, String emailAddress, String type, String school, int age, String interests) {*/

    /**
     * asdsadas.
     * @param username username.
     * @param password password.
     * @param school sdds.
     * @param age ds ad.
     * @param interests a.
     */
    public User(String username, String password, String school, int age, String interests) {
        //this.userId = uid;
        this.username = username;
        this.password = password;
        //this.nickname = nickname;
        //this.dateOfBirth = dateOfBirth;
        //this.emailAddress = emailAddress;
        // we can delete the type since the room class has difficult arrays for different roles
        // if we assign the type to the user class, we need to change it when we change the room
        //this.userType = type; be careful !
        this.roomList = new ArrayList<>();
        this.notificationsList = new ArrayList<>();
        this.interests = new ArrayList<>();
        this.school = school;
        this.age = age;
        this.addToInterests(interests);
    }

    /**
     * Add interests as a string to string array to this user.
     *
     * @param interests The interests
     */
    public void addToInterests(String interests) {
        try {
            this.interests.addAll(Arrays.asList(interests.split(", ")));
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException, addToInterests failed!");
        }
    }

    /**
     * Get interests array list of this user.
     *
     * @return The interests string array list
     */
    public ArrayList<String> getInterests() {
        return interests;
    }

    /**
     * Get age of this user.
     *
     * @return The age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set age of this user.
     *
     * @param age The age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get school name of this user.
     *
     * @return The school string
     */
    public String getSchool() {
        return school;
    }

    /**
     * Set school of this user.
     *
     * @param school The school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Get notification list for this user.
     *
     * @return The arraylist of notification object.
     */
    public ArrayList<Notification> getNotificationsList() {
        return notificationsList;
    }

    /**
     * Get username of current user.
     *
     * @return The username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Set the username of current user.
     *
     * @param username The username that needs to be changed to
     */
    public void setUserName(String username) {
        this.username = username;
    }

    /**
     * Get password of current user.
     *
     * @return Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password to a new one for current user.
     *
     * @param password The password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Get all rooms this user is in.
     *
     * @return An ArrayList of chat room of this user
     */
    public ArrayList<ChatRoom> getRoomList() {
        return roomList;
    }

    /**
     * Add one ChatRoom object to user's chat room list.
     *
     * @param cr The ChatRoom object.
     */
    public void addAChatRoom(ChatRoom cr) {
        try {
            this.roomList.add(cr);
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException, addAChatRoom failed!");
        }
    }

    /**
     * Remove a chat room by its room id.
     *
     * @return A ChatRoom object
     */
    public ChatRoom removeAChatRoom(ChatRoom room) {
        //TODO: Remove a specific chat room for this user
        this.roomList.remove(room);
        return null;
    }

    /**
     * Return the list of user/admin/owner of the chosen room.
     */
    public void removeAChatRoom(String roomName) {
        Iterator<ChatRoom> iterator = this.getRoomList().iterator();
        while (iterator.hasNext()) {
            ChatRoom room = iterator.next();
            if (room.getRoomName().equals(roomName)) {
                iterator.remove();
            }
        }
    }

    /**
     * Add one Notification object to user's notifications list
     *
     * @param n The Notification object.
     */
    public void addNotification(Notification n) {
        try {
            this.notificationsList.add(n);
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException, addNotification failed!");
        }
    }

    /**
     * set a new notifications list.
     *
     * @param list The Notification object.
     */
    public void setNotificationList(ArrayList<Notification> list) {
        try {
            this.notificationsList = list;
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException, set Notification List failed!");
        }
    }

}
