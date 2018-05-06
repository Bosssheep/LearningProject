package homework2_1;

import java.util.Date;

// Each todo item must have a priority (a string), a date and a string that contains the actual text of the todo item.
public class PIMTodo extends PIMEntity implements DateInter{

	String priority;
	String date;
	String content;
	
	
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public void fromString(String s) {

	}

	@Override
	public String toString() {
		return "TODO"+" "+priority+" "+date+" "+content;
		
	}

}
