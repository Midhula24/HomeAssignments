package homeAssignments.week3.day1.abstraction;

public abstract class MySqlConnection implements DatabaseConnection{
	
	abstract void executeQuery(String query);
	
	@Override
	public void executeUpdate(String query) {
		System.out.println("DB update successful!");
		System.out.println("The executed query is : "+query);
	}
}
