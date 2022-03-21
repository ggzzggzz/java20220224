package chap10.lecture.p03checked;

public class App04 {
	public static void main(String[] args) {
		
		try {
			Class.forName("");			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
