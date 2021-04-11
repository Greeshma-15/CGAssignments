package lab5;

public class NameException {
		 static void validate(String fullname,String lastname)throws UserNameException{
			if(fullname ==null||lastname==null){
				throw new UserNameException("First name and Last name is empty");
			}
			else
			{
				System.out.println("Name is entered");}
			}
	public static void main(String[] args) {
		try{
			validate("yatra","pillai");
		}catch(Exception e){
		System.out.println(e.getMessage());
		}
	}

	}


