import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


// Java file write example with BufferedOutputStream

public class JavaWriteFileBufferedOutputStream {

	public static void main(String[] args)
	{
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("C://file.txt"));
			String fileContent = "Java writing to a file example";
			byte[] byteArray = fileContent.getBytes();
			bos.write(byteArray);
			bos.flush();
		}catch (SecurityException e){
			System.err.println("Access to the file is denied");
			e.printStackTrace();
		} catch (FileNotFoundException e){
			System.err.println("Can't find file, or it is a directory");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println();
			e.printStackTrace();
		}
		
		/*
		 * Stream uses resources and 
		 * we have to be sure that stream will be closed
		 * if exception has been thrown
		 */
		finally {
			try {
				if(bos != null){
					bos.close();
				}
			}catch (Exception e){
				System.err.println("Can't close the stream!");
			}
		}
	}
	
}
