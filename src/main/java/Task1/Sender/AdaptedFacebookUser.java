package Task1.Sender;

import Task1.Facebook.FacebookUser;
import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class AdaptedFacebookUser implements User {
    private FacebookUser user;


    @Override
    public String getCountry() {
        return user.getUserCountry();
    }

    @Override
    public Date getLastActive() {
        return user.getUserActiveTime();
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }
}
