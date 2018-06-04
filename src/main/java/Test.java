import com.example.dao.UserDao;
import com.example.model.User;

public class Test {

	public static void main(String[] args) {

	   
	   UserDao udao=new UserDao();
	   
	   
//	    udao.createUser(u);
	 
	   
	   
//	   User readedUser= udao.getUserById(2);
//	   System.out.println(readedUser.getName());
//	   
//	   readedUser.setName("hhh");
//	   udao.updateUser(readedUser);
//	   udao.deleteUser(readedUser);
	   
//	   udao.getUserByName("aaa").stream().map(u -> u.getSurNmae()).forEach(System.out :: println);
	   udao.updateUserById(34, "maryam");
	   
	}

}
