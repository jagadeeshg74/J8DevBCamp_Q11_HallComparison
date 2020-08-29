package yaksha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nos=0;
		
		
		ArrayList<Auditorium>  audilist = new ArrayList<Auditorium> ();
		
		System.out.println("Enter no of Auditorium");
		nos = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < nos; i++) {
			
			audilist.add(Auditorium.createNew(sc.nextLine()));
			
		}
			
		System.out.format("%-15s %-15s %s\n" ,"Name","Cost per Day","Capacity");
		
		for (Auditorium auditorium : audilist) {
			System.out.println(auditorium);
		}
				
		System.out.println("Enter a type to sort:");
		System.out.println("1.Sort by Cost Per Day");
		System.out.println("2.Sort by capacity");
		System.out.println();
		
		int sorttype= Integer.parseInt(sc.nextLine());
		
		//int sorttype = 0;
		
		
		switch (sorttype) {
		
		case 1: Collections.sort(audilist);
			
			break;
		case 2: Collections.sort(audilist, new CapacityComparator());
		
		break;
		default: 
			break;
		}
		
System.out.format("%-15s %-15s %s\n" ,"Name","Cost per Day","Capacity");
		
		for (Auditorium auditorium : audilist) {
			System.out.println(auditorium);
		}
		
		
		
		
		}
	
	
	
	

}
