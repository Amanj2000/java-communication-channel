import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] preferences_list1 = {"call", "e-mail", "xyz"};
        String[] preferences_list2 = {};

        User aman = new User("aman", Arrays.asList(preferences_list1));
        User rahul = new User("rahul", Arrays.asList(preferences_list2));

//        rahul.addPreference("sms");

        Communication communication = new Communication();
        System.out.println(communication.communicate(aman, rahul, "hi"));
        System.out.println(communication.communicate(rahul, aman, "hello"));
    }
}