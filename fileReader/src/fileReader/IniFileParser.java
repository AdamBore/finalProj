package fileReader;

import java.util.HashMap;
import java.util.List;

public class IniFileParser extends FileParser {

	public IniFileParser(String _filePath) throws Exception {
		super(_filePath);
		// TODO Auto-generated constructor stub
	}

	public HashMap< String, String > GetParameters() throws Exception
	{
		List<String> lines = LineReader.GetLines( sourceFile );
		HashMap< String, String > result = new HashMap<String, String>();
		INILineTokenizer iniTok = new INILineTokenizer( "= " );
		
		int listSize = lines.size();  
		for( int i = 0; i < listSize; ++i )
		{
			Pair< String, String > lineParams = iniTok.TokenizeLine( lines.get(i) );
			result.put(lineParams.first, lineParams.second );
		}
		
		return result;
	}
}
