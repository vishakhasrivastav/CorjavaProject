package collection;

import java.util.PriorityQueue;

class Student implements Comparable<Student>{
	
	private Integer sid;
	private String sname;
	private Integer science_score;
	private Integer std;
	
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	public Student(Integer sid, String sname, Integer science_score, Integer std) {
		
		this.sid = sid;
		this.sname = sname;
		this.science_score = science_score;
		this.std = std;
	}
	@Override
	public String toString() {
		return "\nStudent [sid=" + sid + ", sname=" + sname + ", science_score=" + science_score + ", std=" + std + "]";
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getScience_score() {
		return science_score;
	}
	public void setScience_score(Integer science_score) {
		this.science_score = science_score;
	}
	public Integer getStd() {
		return std;
	}
	public void setStd(Integer std) {
		this.std = std;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.science_score.compareTo(o.science_score);
	}
	
	
	
}
public class PriorityQueueEx2 {

	public static void main(String[] args) {
		Student s1=new Student(101, "John", 75, 8);
		Student s2=new Student(102, "Charlee", 90, 7);
		Student s3=new Student(103, "Max", 61, 8);
		Student s4=new Student(104, "Roger", 89, 10);
		Student s5=new Student(105, "Jason", 99, 9);
		
		PriorityQueue<Student> pq=new PriorityQueue<Student>();
		pq.add(s1);
		pq.add(s2);
		pq.add(s3);
		pq.add(s4);
		pq.add(s5);
		
		System.out.println(pq);
		
		pq.poll();
		
		System.out.println("\nAfter: \n"+pq);

	}

}
