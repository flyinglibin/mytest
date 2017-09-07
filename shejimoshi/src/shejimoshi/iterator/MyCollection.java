package shejimoshi.iterator;

public class MyCollection implements Collection {
	
	public String string[] = {"a","b","c","d","e","f"};
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator((Collection)this);
	}

	@Override
	public Object get(int i) {
		// TODO Auto-generated method stubs
		return string[i];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return string.length;
	}

}
