package Task2.Authorizatoin;

import Task2.db.AdaptedDataBase;

public class AdaptedAuthorization extends Авторизація{
    public boolean authorize(AdaptedDataBase db) {
        return авторизуватися(db);
    }
}
