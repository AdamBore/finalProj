package fileReader;

import java.util.HashMap;
import java.util.List;

public class IniFileParser extends FileParser {

	public IniFileParser(String _filePath) throws Exception {
		super(_filePath);
		// TODO Auto-generated constructor stub
	}

	public HashMap< String, String> GetParameters() throws Exception
	{
		List lines = (List) LineReader.GetLines( sourceFile );
		
		
	}
}
