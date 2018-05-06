package homework2_1;


public class PIMContact extends PIMEntity {

	String priority;
	String[] contactContent = {"","",""};
	
	
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String[] getContact() {
		return contactContent;
	}

	public void setContact(String[] contact) {
		this.contactContent = contact;
	}

	@Override
	public void fromString(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "CONTACT"+" "+priority+" "+contactContent;
	}

}
