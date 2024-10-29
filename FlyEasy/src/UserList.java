/**
 * Data loader for FlyEazy
 * @author Alex Phakdy
 */

import java.util.ArrayList;
public class UserList {
    private static UserList users;
	private ArrayList<RegisteredUser> userList;
	
	private UserList() {
		userList = DataLoader.getUsers();
	}
	
	public static UserList getInstance() {
		if(users == null) {
			users = new UserList();
		}
		
		return users;
	}

	public boolean haveUser(String userName) {
		for(RegisteredUser user : userList) {
			if(user.getUserName().equals(userName)) {
				return true;
			}
		}
		
		return false;
	}
	/**
	 * returns the user if string equals the username 
	 */ 
	public RegisteredUser getUser(String userName) {
		for(RegisteredUser user : userList) {
			if(user.getUserName().equals(userName)) {
				return user;
			}
		}
		
		return null;
	}
	
	public ArrayList<RegisteredUser> getUsers() {
		return userList;
	}
	/**
	 * method to add user, if username already exists return false, if not it will add to the userList
	 */ 
	public boolean addUser(String userName, String firstName, String lastName, String email, String cardNum) {
		if(haveUser(userName))return false;
		
		userList.add(new RegisteredUser(userName, firstName, lastName, email, cardNum));
		return true;
	}
	/**
	 * writes the data and saves the users to a list to allow logging in
	 */ 
	public void saveUsers() {
		DataWriter.saveUsers();
	}
}