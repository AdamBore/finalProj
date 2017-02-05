import java.util.HashMap;

public class UserManager 
{
	private HashMap< String, SystemUser> users; 
	private static String tableName = new String( "Users" );
	DatabaseConnector dbCon;
	
	public UserManager( DatabaseConnector _dbCon ) 
	{
		InitEmptyMap();
		users.put( "Administrator",  CreateDefaultUser() );
		dbCon = _dbCon;
		
	}
	
	public UserManager( SystemUser _defaultUser, DatabaseConnector _dbCon ) 
	{ 
		InitEmptyMap();
		users.put(_defaultUser.getName(), _defaultUser );
		dbCon = _dbCon;
	}
	
	public boolean AddUser( SystemUser _newUser )
	{
		String userName = _newUser.getName();
		
		if( !users.containsKey( "userName" ) )
		{
			users.put( userName,  _newUser );
			AddUserToDataBase( _newUser );
			return true; 
		}
		
		return false; 
	}
	
	private void InitEmptyMap()
	{
		users = new HashMap<String, SystemUser>();		
	}
	
	private SystemUser CreateDefaultUser()
	{
		return new SystemUser("Administrator", "Admin", "P@ssw0rd1");
	}
	
	private void AddUserToDataBase( SystemUser _newUser )
	{
		dbCon.AddItemToTable( _newUser, tableName ); //not chacking result for now		
	}
	
}

