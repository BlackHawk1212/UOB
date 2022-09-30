
public class Student extends Person{

	private String StdId;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String StdId) {
		this.StdId = StdId;
	}

	public String getStdId() {
		return StdId;
	}

	public void setStdId(String stdId) {
		StdId = stdId;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().toString();
	}
	
	

}
