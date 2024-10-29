import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class DataWriterTest {
    private UserList users = UserList.getInstance();
    private ArrayList<RegisteredUser> userList = users.getUsers();
        
        @BeforeEach
        public void setup() {
            UserList.getInstance().getUsers().clear();
            DataWriter.saveUsers();
        }
        
        @AfterEach
        public void tearDown() {
            UserList.getInstance().getUsers().clear();
            DataWriter.saveUsers();
        }
        
        
        @Test
        public void testWritingZeroUsers() {
            userList = DataLoader.getUsers();
            assertEquals(0, userList.size());
        }
    
        @Test
        public void testWritingOneUser() {
            userList.add(new RegisteredUser("pirateKing", "Monkey D.", "Luffy", "pirateking@gmail.com", "4434 2343 2343 2345"));
            DataWriter.saveUsers();
            assertEquals("pirateKing", DataLoader.getUsers().get(1).getUserName());
        }
        @Test
        public void testWritingEmptyUser() {
            userList.add(new RegisteredUser("", "", "", "", ""));
            DataWriter.saveUsers();
            assertEquals("", DataLoader.getUsers().get(0).getUserName());
        }
}