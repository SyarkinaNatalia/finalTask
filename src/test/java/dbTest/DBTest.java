package dbTest;

import db.DBHelper;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class DBTest {

    @Test
    public void startTest() {
        String sql = "SELECT * FROM REGISTRATION ORDER BY id DESC";
        DBHelper.getSqlResult(sql).forEach(s->System.out.println(s));
        System.out.println(DBHelper.getValueFirstRow(sql,"first"));
        int i = Integer.parseInt(DBHelper.getValueFirstRow(sql,"id")) + 1;
        String sql1 = "INSERT REGISTRATION(id, last, first, age) VALUES ('"+ i + "', 'lastname6', 'name6', 31)";
        System.out.println("Добавлено строк: " + DBHelper.getInsert(sql1));
    }

}
