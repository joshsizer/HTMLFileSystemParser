package main;


import java.io.FileNotFoundException;

public class Main {

	public static final String rootURL = "http://team341.com/programming11/";
	public static final String DESTINATION = "C:\\Users\\joshs\\Documents\\programming11";
	
	public static void main(String[] args)
	{
		HTMLFile rootFolder = null;
		Directory workingDirectory = null;
	
		try 
		{
			rootFolder = new HTMLFile(rootURL);
			workingDirectory = new Directory(rootFolder, DESTINATION );
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("URL has no folders...");
		} 
			
		workingDirectory.downloadAllFiles(null);
		
		System.out.println("\nDownload complete.");
	}
}