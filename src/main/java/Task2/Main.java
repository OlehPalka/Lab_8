package Task2;

import Task2.Authorizatoin.AdaptedAuthorization;
import Task2.db.AdaptedDataBase;

public class Main {
    public static void main(String[] args) {
        AdaptedDataBase db = new AdaptedDataBase();
        AdaptedAuthorization authorization = new AdaptedAuthorization();
        if (authorization.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
