import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class JavaRichard {
	public JavaRichard()
	{
		System.out.println("========JavaRichard======");
	}
}

public class JavaReadFileBufferedInputStream {

		public static void main(String[] args){
			
			JavaRichard s = new JavaRichard();
			
			try {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C://file.txt"));
				try {
					// Read a file byte by byte
					while(bis.available() > 0){
						System.out.print((char)bis.read());
					}
				}finally {
					bis.close();
				}
			}catch (IOException ex){
				ex.printStackTrace();
			}
		}
}


