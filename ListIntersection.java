package week3.home_assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numberArr=new ArrayList<Integer>();
		numberArr.add(3);
		numberArr.add(2);
		numberArr.add(11);
		numberArr.add(4);
		numberArr.add(6);
		numberArr.add(7);
		System.out.println(numberArr);
		
		
		List<Integer> numberArr1=new ArrayList<Integer>();
		numberArr1.add(1);
		numberArr1.add(2);
		numberArr1.add(8);
		numberArr1.add(4);
		numberArr1.add(9);
		numberArr1.add(7);
		System.out.println(numberArr1);
		System.out.println("Intersection Value Of the 2 Lists:");
		for (int i = 0; i <= numberArr.size()-1; i++) {
			
			for(int j=0; j<=numberArr1.size()-1; j++) {
				if(numberArr.get(i)==numberArr1.get(j)) {
					System.out.println(numberArr.get(i));
				}
				
			}
		}
		
	}

}
