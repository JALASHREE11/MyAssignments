package week3.day1;

public class Students {
    public void getStudentInfo(int id) {
    	System.out.println("ID:"+id);
    }
    public void getStudentInfo(int id,String name) {
    	System.out.println("ID:"+id); 
    	System.out.println("Name:"+name);
    }
    public void getStudentInfo(String email, String phone) {
    	System.out.println("Email:"+email); 
    	System.out.println("Phone:"+phone);
    }
	public static void main(String[] args) {
		Students s=new Students(); 
		s.getStudentInfo(11); 
		s.getStudentInfo("jalas@hotmail.com", "98765432"); 
		s.getStudentInfo(45, "karthi");
		
		

	}

}
