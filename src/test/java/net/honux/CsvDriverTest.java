package net.honux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CsvDriverTest {

    @Test
    @DisplayName("connect() 메소드가 Connection 객체를 생성해서 리턴해야 한다.")
    void connect() {
        CsvDriver driver = new CsvDriver();
        CsvConnection connection = null;
        try {
            connection = (CsvConnection) driver.connect("jdbc:csv:data.csv", null);
        } catch (Exception e) {
            fail("Connection 객체 생성해 실패했습니다.");
        }
        assertThat(connection).isInstanceOf(CsvConnection.class);
    }
}