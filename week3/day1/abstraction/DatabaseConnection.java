package homeAssignments.week3.day1.abstraction;

public interface DatabaseConnection {
	void connect();
	void disconnect();
	abstract void executeUpdate(String query);
}
