
public class SystemUser 
{
	private String name;
	private String lastName;
	private String password; 
	private boolean canLogOn;
	
	public SystemUser( String _name, String _lastName ) 
	{
		this.name = _name; 
		this.lastName = _lastName; 
		this.password = "IHaveNoPassword";
		this.canLogOn = false; 
	}
	
	public SystemUser(String _name, String _lastName, String _password  ) 
	{
		this.name = _name; 
		this.lastName = _lastName; 
		this.password = Security.GetHashPassword( _password );
		this.canLogOn = true;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String _password) {
		this.password = Security.GetHashPassword( _password );
		this.canLogOn = true;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public boolean CanLogOn() {
		return canLogOn;
	}

	public void setCanLogOn(boolean _canLogOn) {
		this.canLogOn = _canLogOn;
	}
}
