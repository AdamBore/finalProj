package fileReader;

public class Tests {

	public static void main(String[] args) {
		try {
			IniFileParser fr = new IniFileParser( "c:\\lala.txt" );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( "Attempting to open file #2");
		try {
			IniFileParser fr2 = new IniFileParser( "C:\\Users\\Puki\\FinalProj\\ConfigFile\\config.ini" );
			System.out.printf( "File From Path %s was printed successfully.", "C:\\Users\\Puki\\FinalProj\\ConfigFile\\config.ini");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}