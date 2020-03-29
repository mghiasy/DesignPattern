package counter;

import java.util.ArrayList;
import java.util.Collection;

public interface ISubject {
     //we can define as abstract class and implement donotify here
     Collection<IFrameObserver> observerList = new ArrayList<IFrameObserver>();
     void removeObserver(IFrameObserver observer);
     void addObserver(IFrameObserver observer);
     void doNotify(Counter counter);
}
