package homework1_2;

import java.util.ArrayList;

public class Student {

	private String id;
	private ArrayList<Course> courseOfStudent;
	
	public Student(){
		id = "";
		courseOfStudent = new ArrayList<>();
	}
	
	public Student(String id){
		this.id = id;
		courseOfStudent = new ArrayList<>();
	}
	
	public Student(String id,String[] courses){
		this.id = id;
		for(int i = 0;i < courses.length;i++){
			courseOfStudent.add(new Course(courses[i]));
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", courseOfStudent=" + courseOfStudent + "]";
	}
	
	public void setId(String id){
		this.id = id;
	}
	

	public String getId(){
		return this.id;
	}
	
	public void setCourse(String course){
		courseOfStudent.add(new Course(course));
	}
	
	public ArrayList<Course> getCourse(){
		return this.courseOfStudent;
	}
	
	public void printStu(){
		System.out.print(id+" select ");
		for(int i=0;i < courseOfStudent.size();i++){
			System.out.print( courseOfStudent.get(i).getCourseName()+" with books ");
			for(int j = 0;j < courseOfStudent.get(i).getBooksOfCourse().size();j++){
				System.out.print(courseOfStudent.get(i).getBooksOfCourse().get(j).getBookName());
				if(j < courseOfStudent.get(i).getBooksOfCourse().size()-1)
					System.out.print(",");
			}
			if(i < courseOfStudent.size()-1)
				System.out.print(";");
		}
	}
}
