package week3.home_assignment;

public class JavaConnection implements DatabaseConnection{

		
	public void connect() {
		System.out.println("This Connect Method Implements From Interface");
		
	}

	
	public void disconnect() {
		System.out.println("This disconnect Method Implements From Interface");
		
	}

	
	public void executeUpdate() {
	
		System.out.println("This executeupdate Method Implements From Interface");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaConnection jav=new JavaConnection();
		jav.connect();
		jav.disconnect();
		jav.executeUpdate();

	}

}
