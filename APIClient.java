package week3.home_assignment;

public class APIClient {
	
	public void sendRequest(String endPoint){
		System.out.println("It contains one argument:  "+ endPoint);
		
	}
	
	public void sendRequest(String endPoint, String requestBody, Boolean requestStatus){
		System.out.println("It contains 3 arguments:  "+ endPoint + requestBody + requestBody);
		
	}
	
	public static void main(String[] args) {
		APIClient api=new APIClient();
		api.sendRequest("TEXT_NUMBER");
		api.sendRequest("FIRST", "SECOND", true);
		
	}
	
}

