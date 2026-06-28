package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

    @Test
    void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Shaneal", "Williams", "1234567890", "123 Main Street");

        service.addContact(contact);

        assertEquals(contact, service.getContact("12345"));
    }

    @Test
    void testAddDuplicateContact() {
        ContactService service = new ContactService();
        Contact contact1 = new Contact("12345", "Shaneal", "Williams", "1234567890", "123 Main Street");
        Contact contact2 = new Contact("12345", "Jane", "Smith", "0987654321", "456 Oak Street");

        service.addContact(contact1);

        assertFalse(service.addContact(contact2));
    }

    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Shaneal", "Williams", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.deleteContact("12345");

        assertNull(service.getContact("12345"));
    }

    @Test
    void testUpdateFirstName() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Shaneal", "Williams", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.updateFirstName("12345", "Jane");

        assertEquals("Jane", service.getContact("12345").getFirstName());
    }

    @Test
    void testUpdateLastName() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Shaneal", "Williams", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.updateLastName("12345", "Smith");

        assertEquals("Smith", service.getContact("12345").getLastName());
    }

    @Test
    void testUpdatePhone() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Shaneal", "Williams", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.updatePhone("12345", "0987654321");

        assertEquals("0987654321", service.getContact("12345").getPhone());
    }

    @Test
    void testUpdateAddress() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "Shaneal", "Williams", "1234567890", "123 Main Street");

        service.addContact(contact);
        service.updateAddress("12345", "456 Oak Street");

        assertEquals("456 Oak Street", service.getContact("12345").getAddress());
    }
}