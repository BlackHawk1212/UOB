import java.util.ArrayList;
import java.util.List;

public class Publisher implements Observer, Subject{
	
	private List<Observer> publisher = new ArrayList <>();
	
	public Publisher() {
		
	}

	@Override
	public void registerObserver(Observer x) {
		// TODO Auto-generated method stub
		publisher.addAll(publisher);
	}

	@Override
	public void removeObserver(Observer x) {
		// TODO Auto-generated method stub
		publisher.remove(publisher);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("New book released");
		for(Observer publisher : publisher) {
			publisher.update("Sale!");
		}
	}

	@Override
	public void update(String s) {
		// TODO Auto-generated method stub
		
	}	
	
	
	
	
}
