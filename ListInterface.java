package week3.home_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> companies=new ArrayList<String>();
		companies.add("HCL");
		companies.add("Wipro");
		companies.add("Aspire Systems");
		companies.add("CTS");
		System.out.println(companies);

		for(int i=0; i<=companies.size()-1;i++) {
			System.out.println(companies.get(i));
		}
		
		// Sorting ArrayList in Acending Order
        Collections.sort(companies);
 
        // Printing the sorted ArrayList
        System.out.println("Collection in Acending Order : " + companies);
        
        System.out.println("Collection in Decending Order : ");
        for(int j=companies.size()-1; j>=0;j--) {
			System.out.println(companies.get(j));
		}
        

	}

}
