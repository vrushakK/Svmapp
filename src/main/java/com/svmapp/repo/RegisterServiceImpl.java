package com.svmapp.repo;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

import com.svmapp.model.RegisteredUser;
import com.svmapp.services.RegistrationService;

@Repository
@Service
@Transactional
public class RegisterServiceImpl extends EntityServiceImpl<RegisteredUser> implements RegistrationService {
	
	@Resource(name="converters")
	List<RegisteredUser> users = null;

	@Override
	public List<RegisteredUser> getRegisteredUser(String contactNumber) {
		if(contactNumber.length()>=10) {
			contactNumber = contactNumber.substring(contactNumber.length()-10, 10);
		}
		System.out.println(contactNumber+" Contact");
		String sql = "SELECT * FROM registrations where contact_number like :contact_number";
		try (Connection con = sql2o.open()) {
			users = con.createQuery(sql)
					.addParameter("contact_number",  "%" + contactNumber)
					.executeAndFetch(RegisteredUser.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public List<RegisteredUser> getRegisteredUser(String contactNumber, String booklet_id) {
		if(contactNumber.length()>=10) {
			contactNumber = contactNumber.substring(contactNumber.length()-10, 10);
		}
		System.out.println(contactNumber+" Contact");
		String sql = "SELECT * FROM registrations where contact_number like :contact_number AND"
				+ " booklet_id=:booklet_id";
		try (Connection con = sql2o.open()) {
			users = con.createQuery(sql)
					.addParameter("contact_number", "%" + contactNumber)
					.addParameter("booklet_id", booklet_id)
					.executeAndFetch(RegisteredUser.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

}
