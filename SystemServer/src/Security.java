
public class Security 
{
	public static String GetHashPassword( String _plainTextPassword )
	{
		return _plainTextPassword; // if needed password will be hashed
	}
	
	public static boolean AuthenticateUser( String _userPassword, String _recivedPassword )
	{
		return _userPassword == GetHashPassword( _recivedPassword );
	}
}
