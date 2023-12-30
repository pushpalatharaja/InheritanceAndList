package week3.home_assignment;

public class Execution extends Button{
	public void executing() {
		System.out.println("Executing....  Extends From Button Class");
	}
	
	public static void main(String[] args) {
		Execution ele=new Execution();
		ele.click();
		ele.submit();
		ele.executing();
		
	}
	
}
