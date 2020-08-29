package yaksha;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Auditorium implements Comparable<Auditorium>{
	
	private String name;
	private Double costperday;
	private Integer capacity;
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s\n ",  name , costperday ,capacity );
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCostperday() {
		return costperday;
	}
	public void setCostperday(Double costperday) {
		this.costperday = costperday;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	public Auditorium(String name, Double costperday, Integer capacity) {
		super();
		this.name = name;
		this.costperday = costperday;
		this.capacity = capacity;
	}
	
	public static Auditorium createNew(String detail) {
		//Concert Hall,15000,550
		String[] details =detail.split(",");
		Auditorium audi = new Auditorium(details[0],Double.parseDouble(details[1]),Integer.parseInt(details[2]));
			
		return audi;
	}


	
	public int compareTo(Auditorium o) {	
		
		return Double.compare(this.costperday, o.costperday) ;
	}

		

		
}
		
		
	