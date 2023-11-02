package Library;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	
	public Properties prop;
	
	    public void getdatafromPropertyfile() throws FileNotFoundException{	
		
	    	prop = new Properties();
	    	
		FileInputStream ip  = new FileInputStream("C:\\Users\\ts\\eclipse-workspace\\EVJointssFinal\\Config\\config.properties");
		try {
			prop.load(ip);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
		
					
					
				}
			
				
	}


