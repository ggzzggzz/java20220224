package chap99.codingbat;

public class String2 {
	public boolean catDog(String str) {
		int catCnt = 0, dogCnt = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 3);
			if (sub.equals("cat")) {
				catCnt++;
			} else if (sub.equals("dog")) {
				dogCnt++;
			}
		}

		return catCnt == dogCnt;
	}

	public int countHi(String str) {
		int cnt = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("hi")) {
				cnt++;
			}
		}

		return cnt;
	}

	public String doubleChar(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			result += str.charAt(i);
			result += str.charAt(i);
		}

		return result;
	}
}
