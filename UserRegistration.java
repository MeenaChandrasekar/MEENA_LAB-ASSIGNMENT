

package e;

public class UserRegistration {
	
	public void registerUser(String username,String userCountry)
			throws Exception {
		if(userCountry.equals("india")) {
			System.out.println("successful registration of user");
		}else
			throw new Exception("invalid country name : "+
		userCountry+" please provide india");
	}
}
