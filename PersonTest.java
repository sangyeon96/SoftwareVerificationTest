import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    @DisplayName("Check Null")
    void checkNull() {
        Person pat = new Person("Pat", 30);
        Person mat = new Person("Mat", 80);
        Person noOne = new Person(null, 20);
        Assertions.assertNotNull(pat.getName());
        Assertions.assertNotNull(mat.getName());
        Assertions.assertNotNull(noOne.getName());
    }
}