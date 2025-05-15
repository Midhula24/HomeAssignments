package homeAssignments.week3.day1.abstraction;

public class JavaConnection extends MySqlConnection{

	static JavaConnection connection = new JavaConnection();
	
	public static void main(String[] args) {
		connection.connect();
		connection.executeQuery("\"SELECT id, name FROM your_table\"");
		connection.disconnect();
	}
	
	@Override
	public void connect() {
		System.out.println("***** DB connection established! *****");
	}
	
	@Override
	void executeQuery(String query) {
		System.out.println("Executing the query...");
		connection.executeUpdate(query);
	}

	@Override
	public void disconnect() {
		System.out.println("***** DB connection disconnected! *****");		
	}
}
