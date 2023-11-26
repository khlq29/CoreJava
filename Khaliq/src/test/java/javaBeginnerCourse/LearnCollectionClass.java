package javaBeginnerCourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionClass {
	public static void main(String[] args) {
		
		List<StudentSet> s = new ArrayList<>();
		
		s.add(new StudentSet("khaliq" ,1));
		s.add(new StudentSet("zarr" ,2));
		s.add(new StudentSet("asim" ,4));
		s.add(new StudentSet("shaby" ,5));
		s.add(new StudentSet("khaliq" ,3));
		
		Collections.sort(list);
		
	}

}
