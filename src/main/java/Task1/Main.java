package Task1;

import Task1.Facebook.FacebookUser;
import Task1.Sender.AdaptedFacebookUser;
import Task1.Sender.AdaptedTwitterUser;
import Task1.Sender.MessageSender;
import Task1.Sender.User;
import Task1.Twitter.TwitterUser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> LastActiveUsers = new ArrayList<User>();

        FacebookUser user1 = new FacebookUser("lol.gmail.com", "Omerica", new Date());
        TwitterUser user2 = new TwitterUser("kek.gmail.com", "London", new Date());
        TwitterUser user3 = new TwitterUser("kak.gmail.com", "GB", new Date());

        AdaptedFacebookUser adaptedFacebookUser = new AdaptedFacebookUser(user1);
        AdaptedTwitterUser adaptedTwitterUser = new AdaptedTwitterUser(user2);
        AdaptedTwitterUser sender = new AdaptedTwitterUser(user3);

        LastActiveUsers.add(adaptedFacebookUser);
        LastActiveUsers.add(adaptedTwitterUser);

        MessageSender spam = new MessageSender(LastActiveUsers);
        spam.send("Gopa", sender, "London");
    }
}
