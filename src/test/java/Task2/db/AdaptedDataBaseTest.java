package Task2.db;

import static org.junit.jupiter.api.Assertions.*;

class AdaptedDataBaseTest {
    private БазаДаних базаДаних;
    private AdaptedDataBase dataBase;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        базаДаних = new БазаДаних();
        dataBase = new AdaptedDataBase();
    }

    @org.junit.jupiter.api.Test
    void getUserData() {
        assertEquals(базаДаних.отриматиДаніКористувача(), dataBase.getUserData());
    }

    @org.junit.jupiter.api.Test
    void getStatsData() {
        assertEquals(базаДаних.отриматиСтатистичніДані(), dataBase.getStatsData());
    }
}