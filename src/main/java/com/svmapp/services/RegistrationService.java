package com.svmapp.services;

import java.util.List;

import com.svmapp.model.RegisteredUser;

public interface RegistrationService extends EntityService<RegisteredUser> {

	/**
	 * returns the booklets registered for that particular contact number
	 * @param contactNumber
	 * @return
	 */
	List<RegisteredUser> getRegisteredUser(String contactNumber);
	
	
	/**
	 * Returns the booklets registered for that contact number, provided the booklet_id
	 * matches one of the booklet_id registered for that contact number.
	 * 
	 * This call serves the purpose of authenticating the user as well
	 * @param contactNumber
	 * @param booklet_id
	 * @return
	 */
	List<RegisteredUser> getRegisteredUser(String contactNumber, String booklet_id);
	
}
