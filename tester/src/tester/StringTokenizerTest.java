package tester;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	
	private String tokens;
	
	public StringTokenizerTest(String tokens) {
		this.tokens = tokens;
	}

	public void TokenizeString( String _input )
	{
		StringTokenizer st = new StringTokenizer( _input, tokens ); 
		
		for( int i = 1 ; st.hasMoreTokens() ; ++i )
		{
			System.out.println( i + ". " + st.nextToken() );
		}
	}
}
