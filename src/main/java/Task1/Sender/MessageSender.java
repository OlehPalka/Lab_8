package Task1.Sender;


import lombok.AllArgsConstructor;

import java.util.List;


@AllArgsConstructor
public class MessageSender {
    private List<User> LastActiveUsers;

    public void send(String text, User user, String country) {
        int counter = 0;
        for (User UserToSend: LastActiveUsers) {
            if (UserToSend.getCountry().equals(country) & counter < 10) {
                System.out.println("Message was sent to " + UserToSend.getEmail() + " from " + user + ".");
                System.out.println(text);
                counter ++;
            }
        }
    }
}
