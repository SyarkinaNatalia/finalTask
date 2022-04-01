package dbTest;

import db.DBHelper;
import org.testng.annotations.Test;

public class DBTest {

    @Test
    public void startTest() {
        String sql = "SELECT * FROM REGISTRATION";
        DBHelper.getSqlResult(sql).forEach(s->System.out.println(s));
        System.out.println(DBHelper.getValueFirstRow(sql,"first"));
        String sql2 = "INSERT REGISTRATION(id, last, first, age) VALUES (20, 'lastname6', 'name6', 31)";
        System.out.println("Добавлено строк: " + DBHelper.getInsert(sql2));
        DBHelper.getSqlResult(sql).forEach(s->System.out.println(s));
        String sql3 = "INSERT REGISTRATION(id, last, first, age) VALUES (21, 'lastname7', 'name7', 19)";
        System.out.println("Добавлено строк: " + DBHelper.getInsert(sql2) + DBHelper.getInsert(sql3));
        DBHelper.getSqlResult(sql).forEach(s->System.out.println(s));
    }

}
