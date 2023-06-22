package VetInfo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void isNotOverweight() {
        Dog dog = new Dog(3, 4, false, "Bob", "Jamnik");
        assertFalse(dog.isOverweight());
    }
    @Test
    void isOverweight() {
        Dog dog = new Dog(3, 4333, false, "Bob", "Jamnik");
        assertTrue(dog.isOverweight());
    }
}