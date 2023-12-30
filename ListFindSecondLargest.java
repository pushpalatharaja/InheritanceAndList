package week3.home_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> sortNum=new ArrayList<Integer>();
		sortNum.add(3);
		sortNum.add(2);
		sortNum.add(11);
		sortNum.add(4);
		sortNum.add(6);
		sortNum.add(7);
		System.out.println("Given Array: "+sortNum);
		Collections.sort(sortNum);
		System.out.println("Sorted Array: "+sortNum);
		int size_e= sortNum.size();
		System.out.println("Second Largest Number is: "+sortNum.get(size_e-2));
		
		
	}

}
