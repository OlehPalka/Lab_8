package Task1.Sender;

import Task1.Twitter.TwitterUser;
import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class AdaptedTwitterUser implements User{
    private TwitterUser user;

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
