import java.io.File;
import java.io.IOException;

//FileUtils class is in Apache Commons library which, if you haven¡¯t included in your project yet, you can download it from here.
//- See more at: http://www.javacodeexamples.com/read-file/#sthash.ldikzsBl.dpuf
public class JavaWriteFileFileUtils {
    public static void main(String[] args) {
        File file = new File("c://file.txt");
		String content = "Java file write example using FileUtils";
//            FileUtils.writeStringToFile(file, content); //
    } 
}