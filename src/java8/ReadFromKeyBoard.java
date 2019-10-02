package java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Anuj Pachauri
 *
 *         6:46:26 pm
 */
public class ReadFromKeyBoard {

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println((char) br.read()); read only characters

		// System.out.println(br.readLine());

		// Read content from file

		File file = new File("C:\\Users\\Dell\\Desktop\\Strong word for motivation.txt");
		BufferedReader fbr = new BufferedReader(new FileReader(file));
		String sb;
		while ((sb = fbr.readLine()) != null) {
			System.out.println(sb);
		}
		fbr.close();

		// FileWriter fw = new FileWriter(file);

		// fw.write("hello India..");
		// fw.close();

	}
}
