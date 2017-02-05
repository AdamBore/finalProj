package fileReader;

import java.io.File;

public class FileParser 
{
	protected File sourceFile; 
	public FileParser( String _filePath) throws Exception {
		sourceFile = new File( _filePath );
		
		if( !sourceFile.exists() )
		{
			throw new Exception( "File Cannot Open from path: " + _filePath + "." );
		}
	}
}
