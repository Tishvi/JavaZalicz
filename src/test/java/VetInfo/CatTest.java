package VetInfo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test class for the cat
 */

class CatTest {

    @Test
    void isNotOverweight() {
        Cat cat = new Cat(3, 4, false, "ZaGatto", "Domowy");
        assertFalse(cat.isOverweight());
    }
    @Test
    void isOverweight() {
        Cat cat = new Cat(3, 4333, false, "ZaGatto", "Domowy");
        assertTrue(cat.isOverweight());
    }
}