package chap10.lecture.p03checked;

import java.io.FileReader;

public class App05 {
	public static void main(String[] args) {
		// 하나 try 블럭 사용
		// 하나이상의 catch 블럭 사용
		// 컴파일 오류 해결
		
		try {
			FileReader fr = new FileReader("");
			fr.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
