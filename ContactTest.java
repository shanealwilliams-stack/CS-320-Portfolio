package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactTest {

    @Test
    void testContactCreated() {

        Contact contact = new Contact(
                "12345",
                "Shaneal",
                "Williams",
                "1234567890",
                "123 Main Street");

        assertEquals("12345", contact.getContactId());
    }
}
