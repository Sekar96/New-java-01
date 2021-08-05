package in.sekar;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao 
{
	public UserDao()
	{
		System.out.println("USer DAo: Constructor");
	}
	
	public boolean saveUser()
	{
		return true;
	}
}
