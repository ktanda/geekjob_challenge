package challenge;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Challenge29_file2 {
	public static void main(String[] args) {
		try {
		File fp = new File("jikoshoukai.txt");
		FileReader fr = new FileReader(fp);
	    BufferedReader br = new BufferedReader(fr);
	    System.out.print(br.readLine());
		fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
