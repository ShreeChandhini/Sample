package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class UseStudent {
	public static void main(String[] args) {
		
		 Student s1 = new Student(101,"Sree","female","A",15);
		 Student s2 = new Student(102,"Chan","female","B",18);
		 Student s3 = new Student(103,"Sree","female","C",20);
		 Student s4 = new Student(104,"Kavi","female","A",30);
		 Student s5 = new Student(105,"Sree","male","B",28);
		 Student s6 = new Student(106,"Ravi","male","C",15);
		
		ArrayList<Student>stds=new ArrayList<>();
		stds.add(s1);
		stds.add(s2);
		stds.add(s3);
		stds.add(s4);
		stds.add(s5);
		stds.add(s6);
		
		List<Student>femaleList=stds.stream().filter(x->x.getGender().equals("female")).collect(Collectors.toList());
		femaleList.forEach(a->System.out.println(a));
		List<String>names=stds.stream().map(x->x.getName()).filter(y->y.startsWith("A")).collect(Collectors.toList());
		names.forEach(x->System.out.println(x));
		long l = stds.stream().filter(x->x.getAge()>18).count();
		System.out.println(l);
		List<String> n = stds.stream().map(x->x.getName()).distinct().collect(Collectors.toList());
		System.out.println(n);
		List<String> m = stds.stream().map(x->x.getName()).sorted().collect(Collectors.toList());
		System.out.println(m);
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(n);
		
	}
}