package homeAssignments.week2.day4.polymorphism;

//method overloading
public class APIClient {
	
	//sendRequest method containing one String parameter
	private void sendRequest(String endpoint) {
		System.out.println("The endpoint for Request 1 is : "+endpoint);
	}
	
	//sendRequest method with three different parameters
	private void sendRequest(String endpoint, String requestBody, Boolean requestStatus) {
		System.out.println("The endpoint for Request 2 is : "+endpoint);
		System.out.println("The request body is " +requestBody+" and the status is : "+requestStatus);
	}
	
	//main method to create object and executing the overloaded methods
	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("https://api1.example.com");
		api.sendRequest("https://api2.examples.com", "Midhula, testleaf@111", true);
	}
}
