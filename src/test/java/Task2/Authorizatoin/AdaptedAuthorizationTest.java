package Task2.Authorizatoin;

import Task2.db.AdaptedDataBase;
import Task2.db.БазаДаних;

import static org.junit.jupiter.api.Assertions.*;

class AdaptedAuthorizationTest {
    private Авторизація авторизація;
    private AdaptedAuthorization authorization;
    private БазаДаних базаДаних;
    private AdaptedDataBase dataBase;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        авторизація = new Авторизація();
        authorization = new AdaptedAuthorization();
        базаДаних = new БазаДаних();
        dataBase = new AdaptedDataBase();


    }

    @org.junit.jupiter.api.Test
    void authorize() {
        assertEquals(авторизація.авторизуватися(базаДаних), authorization.authorize(dataBase));
    }
}