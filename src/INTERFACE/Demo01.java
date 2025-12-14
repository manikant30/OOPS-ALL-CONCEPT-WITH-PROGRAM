package INTERFACE;

interface Connection
{
	void getConnection();
	void executeQuery();
	void close();
}

class OracleDriver implements Connection
{
	@Override
	public void getConnection()
	{
		System.out.println("Connection to Oracle DB");
	}
	
	@Override
	public void executeQuery()
	{
		System.out.println("Executing Query");
	}
	
	@Override
	public void close()
	{
		System.out.println("Close Connection to Oracle DB");
	}
    
	
}

public class Demo01 {
	public static void main(String[] args)
	{
		Connection driver=new OracleDriver();
		
		driver.getConnection();
		driver.executeQuery();
		driver.close();
	}

}
