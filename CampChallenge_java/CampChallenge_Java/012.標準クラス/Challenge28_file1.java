package challenge;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Challenge28_file1 {
	public static void main(String[] args) {
		try {
		File fp = new File("jikoshoukai.txt");
        FileWriter fw = new FileWriter(fp);
        fw.write("Hellow");
        fw.close();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}