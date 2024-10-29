
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
public class DataLoaderTest {
        private UserList users = UserList.getInstance();
        private ArrayList<RegisteredUser> userList = users.getUsers();
        
    @BeforeEach
    public void setup() {
        userList.clear();
        userList.add(new RegisteredUser("pirateKing", "Monkey D.", "Luffy", "pirateking@gmail.com", "4434 2343 2343 2345"));
		userList.add(new RegisteredUser("onigiri", "Roronoa", "Zoro", "onigiri@gmail.com", "4454 2353 2323 2365"));
        DataWriter.saveUsers();
        }
        
    @AfterEach
    public void tearDown() {
        UserList.getInstance().getUsers().clear();
        DataWriter.saveUsers();
    }
    @Test
	public void testGetUsersSize() {
		userList = DataLoader.getUsers();
		assertEquals(2, userList.size());
	}

	@Test
	public void testGetUsersSizeZero() {
		UserList.getInstance().getUsers().clear();
		DataWriter.saveUsers();
		assertEquals(0, userList.size());
	}
	
	@Test
	public void testGetUserFirstUserName() {
		userList = DataLoader.getUsers();
		assertEquals("pirateKing", userList.get(1).getUserName());
	}
}
