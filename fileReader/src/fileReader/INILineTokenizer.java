package fileReader;

import java.util.StringTokenizer;

public class INILineTokenizer {

	private String tokens;

	public INILineTokenizer(String tokens) {
		this.tokens = tokens;
	}

	public Pair<String, String> TokenizeLine(String _line) throws Exception {

		StringTokenizer st = new StringTokenizer( _line, tokens );
		
		String first = st.nextToken();
		String second = st.nextToken();
		
		if( st.hasMoreTokens() ){
			throw new Exception( "Invalid line format in INI file." ); 
		}
		
		Pair< String, String > p1 = new Pair< String, String >( first, second ); 
		return p1;

	}
}
