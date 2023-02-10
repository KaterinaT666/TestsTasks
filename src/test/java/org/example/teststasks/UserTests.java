package org.example.teststasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class UserTests {

	@Test
	public void addUserParametres(){
		User user = new User("Katerina666", "katerina@.ru");
		assertNotNull(user.getLogin(),user.getEmail());
		assertEquals(user.getLogin(), user.getEmail());
	}
	@Test
	public void addNullUserParametres(){
		User user = new User(null, null);
		assertNull(user.getLogin(),user.getEmail());
	}
	@Test
	public void correctEmailAddress(){
		User user = new User("Katerina666", "katerina@.ru");
		assertTrue(user.getEmail().contains("@"));
		assertTrue(user.getEmail().contains("."));
	}
	@Test
	public void equalsLoginAndEmail(){
		User user = new User("Katerina666", "katerina@.ru");
		assertNotEquals(user.getLogin(), user.getEmail());
	}
}
