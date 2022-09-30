
public interface Subject {
	
	public void registerObserver(Observer x);
	
	public void removeObserver(Observer x);
	
	public void notifyObserver();
	
	

}
