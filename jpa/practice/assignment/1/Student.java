package assignment1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private String studentName;
	private int marks;
	private int semester;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, int marks, int semester) {
		super();
		this.studentName = studentName;
		this.marks = marks;
		this.semester = semester;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", marks=" + marks + ", semester=" + semester + "]";
	}
	
	
}
