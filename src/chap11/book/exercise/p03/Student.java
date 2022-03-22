package chap11.book.exercise.p03;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	// 여기서 코드를 작성하세요.
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			
			return this.studentNum.equals(student.studentNum);
		}
		return super.equals(obj);
	}
}
