package collection;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		ArrayList<Integer>nums=new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(60);
		nums.add(70);
		nums.set(6,75);
		nums.remove(5);
		System.out.println(nums.size());
		
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		
		for(Integer x:nums) {
			System.out.println(x);
		}
		
		nums.forEach(x->System.out.println(x));

		nums.forEach(x->{
			if(x<50) {	
				System.out.println(x);
			}
		});
		}
	}



