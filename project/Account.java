package project;
import java.io.*;

public class Account  {
	
	public String username ;
	public String pwd;
	
	Account()
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
            		username = line;
            		i++;
            	}
            	else if (i==1){
            		pwd = line;
            		i=0;
            	}
            	System.out.println(
                       line);    
            	System.out.println(
                       username + pwd);          
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
	

}
