package in.sekar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private UserDao dao;

	public UserService() {
		System.out.println("0- Param Constructor  ");
	}

	@Autowired
	public UserService(UserDao dao) {
		System.out.println("UserService Constructor : Param Constructor");
		this.dao = dao;
	}

	public void insertUserData() {
		boolean isSaved = dao.saveUser();
		if (isSaved) {
			System.out.println("Record Instertd into db...");
		} else {
			System.out.println("Failed to insert record into db.....");
		}
	}
}
