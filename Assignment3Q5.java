import javax.management.InvalidApplicationException;

import jdk.jshell.spi.ExecutionControl.UserException;

public class Assignment3Q5 {

	public static void main(String[] args) {

		UserException registration=new UserException(null, null, null);
		
		try {
			((Object) registration).registerUser("raj", "usa");
		} catch (InvalidApplicationException e) {
			System.out.println(e.getMessage());
		}
	}
}
