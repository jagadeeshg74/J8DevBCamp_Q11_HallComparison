package yaksha;


import java.io.IOException;
import java.text.ParseException;

import java.util.ArrayList;

import java.util.Collections;


import org.junit.jupiter.api.Test;

public class MainClassTest {
	
	
	
	@Test
    public void testAuditorium_CostPerDay() throws ParseException, IOException {
             
		Auditorium a1= Auditorium.createNew("Concert Hall,15000,550");
		Auditorium a2= Auditorium.createNew("Opera Hall,10000,400");
		Auditorium a3= Auditorium.createNew("Symphony Hall,20000,500");
		
		ArrayList<Auditorium> audilist = new ArrayList<Auditorium>();
		audilist.add(a1);
		audilist.add(a2);
		audilist.add(a3);

		Collections.sort(audilist);
		
		ArrayList<Auditorium> audilistsorted1 = new ArrayList<Auditorium>();
		audilistsorted1.add(a2);
		audilistsorted1.add(a1);	
		audilistsorted1.add(a3);
			
	//	assertTrue(audilistsorted1.equals(audilist));
		
		
		 TestUtils.yakshaAssert(TestUtils.currentTest(),audilistsorted1.equals(audilist)==true ?"true":"false",TestUtils.businessTestFile);
			
        
    }
	
	@Test
    public void testAuditorium_SortByCapacity() throws ParseException, IOException {
		
		Auditorium a1= Auditorium.createNew("Concert Hall,15000,550");
		Auditorium a2= Auditorium.createNew("Opera Hall,10000,400");
		Auditorium a3= Auditorium.createNew("Symphony Hall,20000,500");
		
		ArrayList<Auditorium> audilist = new ArrayList<Auditorium>();
		audilist.add(a1);
		audilist.add(a2);
		audilist.add(a3);

		Collections.sort(audilist);
		
		ArrayList<Auditorium> audilistsorted2 = new ArrayList<Auditorium>();
		audilistsorted2.add(a2);
		audilistsorted2.add(a3);	
		audilistsorted2.add(a1);
        
       
       
       Collections.sort(audilist,new CapacityComparator());
       
       
     //  assertTrue(audilistsorted2.equals(audilist));
       
       TestUtils.yakshaAssert(TestUtils.currentTest(),audilistsorted2.equals(audilist)==true ?"true":"false",TestUtils.businessTestFile);
		
		
		
	}
	

}
