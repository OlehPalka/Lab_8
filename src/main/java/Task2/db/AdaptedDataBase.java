package Task2.db;

public class AdaptedDataBase extends БазаДаних{
    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStatsData() {
        return отриматиСтатистичніДані();
    }
}
