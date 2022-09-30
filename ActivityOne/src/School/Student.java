/**
 * @author Nimesh Mendis
 */

package School;

public class Student {
	
	private Student buddy;
	private City hometown;
	private String name;
	private int studentId;
	
	public void reportBuddyName(String name) {
		
		this.name = name;
		
	}
	
	public Student(int studentId,String name) {
		
		this.studentId = studentId;
		this.name = name;
		
	}

	//Getters and Setters
	public Student getBuddy() {
		return buddy;
	}

	public void setBuddy(Student buddy) {
		this.buddy = buddy;
	}

	public City getHometown() {
		return hometown;
	}

	public void setHometown(City hometown) {
		this.hometown = hometown;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	

}
