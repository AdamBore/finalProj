package fileReader;

import java.util.List;

public class IniFileParser extends FileParser {

	public IniFileParser(String _filePath) throws Exception {
		super(_filePath);
		// TODO Auto-generated constructor stub
	}

	public List GetParameters() throws Exception
	{
		return (List) LineReader.GetLines( sourceFile );
		
	}
}
