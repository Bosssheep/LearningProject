package homework1_2;

import java.util.ArrayList;

public class Course {
	
	private String courseName;
	private ArrayList<Book> booksOfCourse;
	
	
	public Course(){
		booksOfCourse = new ArrayList<>();
	}
	
	public Course(String course){
		courseName = course;
		booksOfCourse = new ArrayList<>();
		switch(course){
			case "Java": booksOfCourse.add( new Book("Thinking in Java"));
			             booksOfCourse.add( new Book("Java 8"));
			             break;
			case "WebEngineering":booksOfCourse.add( new Book("Web Engineering")); break;
			case "OperationSystem":booksOfCourse.add( new Book("Operation System"));break;
			default: break;
		}
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", booksOfCourse=" + booksOfCourse + "]";
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ArrayList<Book> getBooksOfCourse() {
		return booksOfCourse;
	}

	public void setBooksOfCourse(ArrayList<Book> booksOfCourse) {
		this.booksOfCourse = booksOfCourse;
	}

	
	
}
