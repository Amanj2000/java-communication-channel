import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class TestClass {

    void printUsers(User user1, User user2) {
        System.out.println("User: " + user1);
        System.out.println("User: " + user2);
        System.out.println();
    }

    @Test
    public void simpleTest() {
        User aman = new User("aman", Arrays.asList("call", "e-mail"));
        User rahul = new User("rahul", Arrays.asList("call", "sms"));
        printUsers(aman, rahul);

        Communication communication = new Communication();
        System.out.println(communication.sendMessage(aman, rahul, "hi"));
        System.out.println(communication.sendMessage(rahul, aman, "hello"));
    }

    @Test
    public void invalidPreferenceTest() {
        User aman = new User("aman", Arrays.asList("call", "e-mail"));
        User rahul = new User("rahul", Arrays.asList("sms", "xyz"));
        printUsers(aman, rahul);

        Communication communication = new Communication();
        System.out.println(communication.sendMessage(aman, rahul, "hi"));
        System.out.println(communication.sendMessage(rahul, aman, "hello"));
    }

    @Test
    public void preferencesEmptyTest() {
        User aman = new User("aman", Arrays.asList("call", "e-mail"));
        User rahul = new User("rahul", Collections.emptyList());
        printUsers(aman, rahul);

        Communication communication = new Communication();
        System.out.println(communication.sendMessage(aman, rahul, "hi"));
        System.out.println(communication.sendMessage(rahul, aman, "hello"));
    }

    @Test
    public void addPreferencesTest() {
        User aman = new User("aman", Arrays.asList("call", "e-mail"));
        User rahul = new User("rahul", Arrays.asList("call", "sms"));
        printUsers(aman, rahul);

        Communication communication = new Communication();
        System.out.println(communication.sendMessage(rahul, aman, "hello"));

        System.out.println("Adding preference sms to user aman");
        aman.optIn("sms");
        printUsers(aman, rahul);

        System.out.println(communication.sendMessage(rahul, aman, "hello"));

        System.out.println("Adding preference sms again to user aman");
        aman.optIn("sms");
        printUsers(aman, rahul);

        System.out.println(communication.sendMessage(rahul, aman, "hello"));
    }

    @Test
    public void removePreferencesTest() {
        User aman = new User("aman", Arrays.asList("call", "e-mail"));
        User rahul = new User("rahul", Arrays.asList("call", "sms"));
        printUsers(aman, rahul);

        Communication communication = new Communication();
        System.out.println(communication.sendMessage(rahul, aman, "hello"));

        System.out.println("Removing preference call from user aman");
        aman.optOut("call");
        printUsers(aman, rahul);

        System.out.println(communication.sendMessage(rahul, aman, "hello"));

        System.out.println("Removing preference call again from user aman");
        aman.optOut("call");
        printUsers(aman, rahul);

        System.out.println(communication.sendMessage(rahul, aman, "hello"));
    }
}
