package chap13.book.s1303;

import chap06.book.s060705.Car;
import chap06.book.s061003.Television;

public class ProductExample {
	public static void main(String[] args) {
		Product<Television, String> product1 = new Product<Television, String>();
		product1.setKind(new Television());
		product1.setModel("스마트TV");
		Television tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}
