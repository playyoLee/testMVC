package okjsp;

import java.util.ArrayList;
import java.util.List;



public class UserDAO {

	static List<User> list=new ArrayList<User>();
	
	static public void addList(User user)
	{
		list.add(user);
	}
	
	static public int getSize()
	{
		return  list.size();
	}
}
