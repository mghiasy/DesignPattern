package counter;

public class Counter  {
	
	private int count=0;
	
	public void increment(){
		count++;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void decrement(){
		count--;
	}

}
