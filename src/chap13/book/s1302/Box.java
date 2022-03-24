package chap13.book.s1302;

public class Box<T> {
	private T t;
	public void set(T t) { this.t = t; }
	public T get() { return t; }
}
