package counter;

public class Counter  implements ISubject{

	//relation with counterState
	CounterState counterState;

	public void setCountHandler(CountHandler countHandler) {
		this.countHandler = countHandler;
	}

	//for COR
	private CountHandler countHandler;
	private int count=0;
	//donotify
	public void increment(){
		//count++;
		count = count+counterState.computeDigit();
		doNotify(this);
		//COR
		countHandler.handle(count);
	}

	public int getCount() {
		return count;
	}

	//Because we dont set count here any more
	//we send it to states
//	public void setCount(int count) {
//		this.count = count;
//	}

	//donotify
	public void decrement(){
		//count--;
		count = count-counterState.computeDigit();
		doNotify(this);
		countHandler.handle(count);
	}
	@Override
	public void removeObserver(IFrameObserver observer) {
		observerList.remove(observer);
	}

	//SetterMethod for counterState
	public void setCounterState(CounterState counterState) {
		this.counterState = counterState;
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
