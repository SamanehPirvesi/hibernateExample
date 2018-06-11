import com.example.dao.UserDao;
import com.example.model.Address;
import com.example.model.User;

public class Test {

	public static void main(String[] args) {

	   User u=new User("sara","ahadi");
	   UserDao udao=new UserDao();
	   Address a=new Address("nizza",3);
	   Address a2=new Address("RE UMBER",13);
	   Address a3=new Address("sss",67);
	u.addAdress(a);
	u.addAdress(a2);
	u.addAdress(a3);
	   
	   
	    udao.createUser(u);
	 
	   
	   
//	   User readedUser= udao.getUserById(2);
//	   System.out.println(readedUser.getName());
////	   
//	   readedUser.setName("hhh");
//	   udao.updateUser(readedUser);
//	   udao.deleteUser(readedUser);
	   
//	   udao.getUserByName("aaa").stream().map(u -> u.getSurNmae()).forEach(System.out :: println);
//	   udao.updateUserById(34, "maryam");
	   
	}

}
