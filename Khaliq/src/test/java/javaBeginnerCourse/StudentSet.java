package javaBeginnerCourse;

import java.util.Comparator;
import java.util.Objects;

import org.apache.poi.ss.formula.functions.LookupUtils.CompareResult;
import org.codehaus.groovy.transform.sc.transformers.CompareToNullExpression;

public class StudentSet implements Comparator<StudentSet> {
	String name;
	int rollno;
	
	public  StudentSet(String name, int rollno) {
		this.name= name;
		this.rollno=rollno;
		
	}
	
	
	
	public String toString() {
		return "Student{" + "name= " + name + '\'' +", rollNo=" + rollno + '}';
		
	}
	
	
	public boolean equals(Object o) {
		if(this==o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		StudentSet s = (StudentSet) o;
		return rollno == s.rollno;
	}
	
	public int hashCode() {
		
		return Objects.hash(rollno);
	}
	
	


	
	public int compareTo(StudentSet that) {
		
		return this.rollno - that.rollno;
	}
	
	

}
