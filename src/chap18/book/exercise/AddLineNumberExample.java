package chap18.book.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/chap18/book/exercise/AddLineNumberExample.java";
		Reader rd = new FileReader(filePath);
		BufferedReader br = new BufferedReader(rd);
		
		String line = "";
		int lineNumber = 1;
		while((line = br.readLine()) != null) {
			System.out.println(lineNumber + ":" + line);
			lineNumber++;
		}
		
		br.close();
		rd.close();
	}
}
