package homework2_1;

import java.util.Date;

public class PIMAppointment extends PIMEntity implements DateInter{

	String priority;
	String date;
	String description;
	
	
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getData() {
		return date;
	}

	public void setData(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void fromString(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "APPOINTMENT"+" "+priority+" "+date+" "+description;
	}

}
