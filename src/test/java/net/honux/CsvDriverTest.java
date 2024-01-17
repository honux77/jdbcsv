package net.honux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.*;

class CsvDriverTest {

    @Test
    @DisplayName("connect() 메소드가 Connection 객체를 생성해서 리턴해야 한다.")
    void connect() throws SQLException {
        CsvDriver driver = new CsvDriver();
        CsvConnection connection = connection = (CsvConnection) driver.connect("jdbc:csv:data.csv", null);
        assertThat(connection).isInstanceOf(CsvConnection.class);
    }
}