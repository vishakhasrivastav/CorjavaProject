package jdbcPrograms;
//alt+shift+s
public class Student {

	private String studentId;
	private String sname;
	private String studentEmail;
	private Double avgMarks;
	private String tId;
	
	public Student() {
		
	}
	public Student(String studentId, String sname, String studentEmail, Double avgMarks, String tId) {
		
		this.studentId = studentId;
		this.sname = sname;
		this.studentEmail = studentEmail;
		this.avgMarks = avgMarks;
		this.tId = tId;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", sname=" + sname + ", studentEmail=" + studentEmail + ", avgMarks="
				+ avgMarks + ", tId=" + tId + "]";
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public Double getAvgMarks() {
		return avgMarks;
	}
	public void setAvgMarks(Double avgMarks) {
		this.avgMarks = avgMarks;
	}
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
	}
	
	
	
}
