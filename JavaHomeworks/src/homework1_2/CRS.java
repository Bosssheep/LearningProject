package homework1_2;

public class CRS {

	public static void main(String[] args){
		Student stu = new Student();
		for(int i=0;i < args.length;i++){
			if(i==0){
				stu.setId(args[i]);
			}
			else{
				stu.setCourse(args[i]);
			}
		}
		stu.printStu();
		
	}

}
