package chap18.lecture.p06filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class App06 {
	public static void main(String[] args) throws Exception {
		// BufferedReader, BufferedWriter 사용해서
		// output/FilterExample51.txt 를
		// output/FilterExample61.txt 로 복사
		String origin = "output/FilterExample51.txt";
		
		String copy = "output/FilterExample61.txt";
		
		Reader br = new BufferedReader(new FileReader(origin));
		Writer bw = new BufferedWriter(new FileWriter(copy));
		
		int data = 0;
		
		while((data = br.read()) != -1) {
			bw.write(data);
		}
		
		System.out.println("프로그램 종료!");
		
		bw.close();
		bw.close();
	}
}
