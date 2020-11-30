package test.mypac;

public class FruitBox<T> { //<- generic class
	public T item; // <- field type 
	
	public void setItem(T item) {
		this.item=item;
	}
	
	public T getItem() {
		
		return this.item;
	}
}
