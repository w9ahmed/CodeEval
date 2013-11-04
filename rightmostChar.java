import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
		
		try  {
			File file = new File(args[0]);
			BufferedReader br = new BufferedReader(new FileReader(file)); /* "C:\\text.txt" */
			String sCurrentLine;
			while ((sCurrentLine=br.readLine())!=null) {
				String objs = sCurrentLine.split(",")[0];
				char c = sCurrentLine.split(",")[1].charAt(0);
				System.out.println(objs.lastIndexOf(c));
			} // end while
		} catch (Exception e) {
			e.printStackTrace();
		} // end catch
	
	}

} // end class