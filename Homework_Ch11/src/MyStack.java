import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Object peek() {
		return get(size() - 1);
	}

	public Object pop() {
		Object o = get (size() - 1);
		remove(size() - 1);
		return o;
	}
	public void push(Object o) {
		add(o);
	}
	@Override
	public String toString() {
		return "stack: " + super.toString();
	}

}
