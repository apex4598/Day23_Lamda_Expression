package com.userentrytest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserEntryTest {

	@Test
	public void userTest() {
		ValidateUserEntry userEntry = new ValidateUserEntry();
		assertEquals("Ajit", userEntry.firstName("Ajit"));
		assertEquals("Padwal", userEntry.lastName("Padwal"));
		assertEquals("987765542", userEntry.contactNumber("987765542"));
		assertEquals("abc@xyz.com", userEntry.contactNumber("abc@xyz.com"));
}
}
