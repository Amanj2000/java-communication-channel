import channel.ChannelType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestClass {
    private static Communication communication;
    private static User aman;
    private static User rahul;

    @BeforeEach
    void init() {
        communication = new Communication();

        aman = new User(1, "aman");
        rahul = new User(2, "rahul");

        communication.registerUser(aman, Arrays.asList(ChannelType.CALL, ChannelType.EMAIL));
        communication.registerUser(rahul, Arrays.asList(ChannelType.CALL, ChannelType.SMS));
    }

    void printUsers(User user1, User user2) {
        System.out.println(communication.info(user1));
        System.out.println(communication.info(user2));
    }

    @Test
    public void simpleTest() {
        printUsers(aman, rahul);

        System.out.println(communication.sendMessage(aman, rahul, "hi"));
        System.out.println(communication.sendMessage(rahul, aman, "hello"));
    }

    @Test
    public void preferencesEmptyTest() {
        communication.registerUser(rahul);
        printUsers(aman, rahul);

        System.out.println(communication.sendMessage(aman, rahul, "hi"));
        System.out.println(communication.sendMessage(rahul, aman, "hello"));
    }

    @Test
    public void addPreferencesTest() {
        printUsers(aman, rahul);

        System.out.println(communication.sendMessage(rahul, aman, "hello"));

        System.out.println("Adding preference sms to user aman");
        communication.optIn(aman, ChannelType.SMS);
        printUsers(aman, rahul);

        System.out.println(communication.sendMessage(rahul, aman, "hello"));

        System.out.println("Adding preference sms again to user aman");
        communication.optIn(aman, ChannelType.SMS);
        printUsers(aman, rahul);

        System.out.println(communication.sendMessage(rahul, aman, "hello"));
    }

    @Test
    public void removePreferencesTest() {
        printUsers(aman, rahul);

        System.out.println(communication.sendMessage(rahul, aman, "hello"));

        System.out.println("Removing preference call from user aman");
        communication.optOut(aman, ChannelType.CALL);
        printUsers(aman, rahul);

        System.out.println(communication.sendMessage(rahul, aman, "hello"));

        System.out.println("Removing preference call again from user aman");
        communication.optOut(aman, ChannelType.CALL);
        printUsers(aman, rahul);

        System.out.println(communication.sendMessage(rahul, aman, "hello"));
    }
}
