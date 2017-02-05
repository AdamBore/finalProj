package fileReader;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LineReader {
	public static List GetLines( File _inputFile ) throws Exception
	{
		
		if( !_inputFile.exists() ){
			throw new Exception( "Bad input file recived." ); 
		}
		
		BufferedReader br = new BufferedReader( new FileReader( _inputFile ) );
		List lines = new List(); 
		
		String line = br.readLine();
		
		while( line != null ){
			lines.add( line );
		}
		
		
		
		
		try
		{
			br.close();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
		
		return lines;
	}
}
