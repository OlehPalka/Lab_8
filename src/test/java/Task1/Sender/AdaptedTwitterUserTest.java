package Task1.Sender;

import Task1.Facebook.FacebookUser;
import Task1.Twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AdaptedTwitterUserTest {
    private TwitterUser twitterUser;
    private AdaptedTwitterUser adaptedTwitterUser;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        twitterUser = new TwitterUser("lol@gmail.com", "London", new Date());
        adaptedTwitterUser = new AdaptedTwitterUser(twitterUser);
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertEquals(twitterUser.getUserCountry(), adaptedTwitterUser.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getLastActive() {
        assertEquals(twitterUser.getUserActiveTime(), adaptedTwitterUser.getLastActive());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(twitterUser.getEmail(), adaptedTwitterUser.getEmail());
    }
}