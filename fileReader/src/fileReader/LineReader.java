package fileReader;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LineReader {
	public static List< String > GetLines( File _inputFile ) throws Exception
	{
		
		if( !_inputFile.exists() ){
			throw new Exception( "Bad input file recived." ); 
		}
		
		BufferedReader br = new BufferedReader( new FileReader( _inputFile ) );
		List< String > lines = new ArrayList(); 
		
		String line = br.readLine();
		
		while( line != null ){
			lines.add( line );
			line = br.readLine();
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
