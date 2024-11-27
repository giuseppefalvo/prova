import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BorrowerNameTest {

    private BorrowerName borrowerName;

    @BeforeEach
    public void setUp() {
        borrowerName = new BorrowerName();
    }

    @Test
    public void getFullName() {
        borrowerName.setFirstName("John");
        borrowerName.setLastName("Dooe");
        assertEquals("John Doe", borrowerName.getFullName());
    }

    @Test
    public void getFirstName() {
        borrowerName.setFirstName("John");
        assertEquals("John", borrowerName.getFirstName());
    }

    @Test
    public void getLastName() {
        borrowerName.setLastName("Doe");
        assertEquals("Doe", borrowerName.getLastName());
    }

    @Test
    public void firstNameNull() {
        String name = "John";
        borrowerName.setFirstName("John");
        assertEquals(name,borrowerName.getFirstName());
    }
}