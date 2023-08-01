package overload;

public class Students {

    public void getStudentInfo(int id,String name) {
    	
    	System.out.println(id +" " +name);
			
		}
	public void getStudentInfo(String email,int phonenumber) {
		
		System.out.println(email +" " + phonenumber);
	}

	public static void main(String[] args) {
		
		Students stu = new Students();
		stu.getStudentInfo(201, "Rajalakshmi");
		stu.getStudentInfo("raji123@gmail.com", 1231234545);
	}
		
	}


