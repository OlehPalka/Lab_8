package Task1.Sender;

import Task1.Facebook.FacebookUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AdaptedFacebookUserTest {
    private FacebookUser facebookUser;
    private AdaptedFacebookUser adaptedFacebookUser;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        facebookUser = new FacebookUser("lol@gmail.com", "London", new Date());
        adaptedFacebookUser = new AdaptedFacebookUser(facebookUser);
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertEquals(facebookUser.getUserCountry(), adaptedFacebookUser.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getLastActive() {
        assertEquals(facebookUser.getUserActiveTime(), adaptedFacebookUser.getLastActive());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(facebookUser.getEmail(), adaptedFacebookUser.getEmail());
    }
}