package counter;

public class Counter  implements ISubject{

	private CounterState counterState;
	private int count=0;
	//donotify
	public void increment(){
		count++;
		doNotify(this);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	//donotify
	public void decrement(){
		count--;
		doNotify(this);
	}
	@Override
	public void removeObserver(IFrameObserver observer) {
		observerList.remove(observer);
	}

	@Override
	public void addObserver(IFrameObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void doNotify(Counter counter) {
		for(IFrameObserver IFrameObserver :observerList){
			IFrameObserver.update(counter);
		}
	}

}
