package seven.lesson20;

public class Arithmetic<T> {

	T value;
	
	Arithmetic(T value){
		this.value = value;
	}
	
	void set(T x) {
		value = x;
	}
	
	T get() {
		return value;
	}
}
