package homework2_1;

import java.util.Date;

public class PIMNote extends PIMEntity {

	String priority;
	String content;
	
	
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
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
		
		return "NOTE"+" "+priority+" "+content;
	}

}
