package com.spring1;

import com.spring.configure.AppConfigs;
import com.spring.entities.School;
import com.spring.services.SchoolService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
public class MainMethod {

    public static void main(String[] args) throws InterruptedException, SQLException {
        System.out.println("This is the start of the PT Spring Hibernate application");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigs.class);
        SchoolService schoolService = context.getBean(SchoolService.class);
        Scanner sc = new Scanner(System.in);
        
        do {
        	System.out.println("Enter your choice :");
			System.out.println("1.Add 2.Delete 3.Update 4.Select 5.Exit");
        	int ch=sc.nextInt();
        	switch(ch) {
        	case 1:System.out.println("Add School Information");
        	System.out.println("Add ID,School Name,Type,Address and Mobile number");
        	schoolService.add(new School(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextLong()));
        	break;
        	case 2:System.out.println("Delete School Information");
        	System.out.println("Enter Id to be deleted");
        	School ss=new School();
        	ss.setSchoolId(sc.nextInt());
        	schoolService.delete(ss);
        	break;
        	case 3:System.out.println("Update School Information");
        	schoolService.update(new School(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextLong()));
        	break;
        	case 4:System.out.println("Retriving School Information");
    		List<School> ool=schoolService.selects();
    		for(School i:ool) {
    			System.out.println(i.getSchoolId()+"    "+i.getName()+"     "+i.getType()+"     "+i.getAddress()+"      "+i.getMobileNum());
    		}
    		break;
        	case 5:System.out.println("Exiting");
        	System.exit(0);
        	break;
        	}
        }
        while(true);
        // Add Employee
        
        //schoolService.add(new School(6,"Little Star High School", "Secondary", "Adilabad",8007970999l));
       /* School s=new School();
        s.setSchoolId(9);
        schoolService.delete(s);*/
        
        
        /*School sch=new School();
        sch.setSchoolId(7);
        sch.setName("Bhagavathi High School");
        sch.setType("Secondary");
        sch.setAddress("Siddipet");
        sch.setMobileNum(8007970999l);
        schoolService.update(sch  );*/

        //context.close();
    }
}