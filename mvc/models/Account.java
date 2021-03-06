package mvc.models;
import java.io.*;

public class Account  {
	
	public String buyerusername, sellerusername ;
	public String buyerpwd, sellerpwd;
	
	public Account()
	{
		 String line = null;
		 int i=0;
		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader("src/Files/Account.txt");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
            	if(i == 0)
            	{
            		buyerusername = line;
            		i++;
            		System.out.println(line);
            	}
            	else if (i == 1)
            	{
            		buyerpwd = line;
            		i++;
            		System.out.println(line);
            	}
            	else if(i == 2)
            	{
            		sellerusername = line;
            		i++;    
            		System.out.println(line);
            	}
            	else if(i == 3)
            	{
            		sellerpwd = line;
            		i=0;
            		System.out.println(line);
            	}       
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
	}
	public boolean validatePwdB(String inputpwd)
	{
		if(inputpwd.equals(buyerpwd))
			return true;
		else
			return false;
	}
	public boolean validatePwdS(String inputpwd)
	{
		if(inputpwd.equals(sellerpwd))
				return true;
		else
			return false;
	}
	

}