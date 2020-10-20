import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Oleksii Saiun. 2020-Oct-20. Sorting using [Comparator] interface
 *  
 * */

public class SortComparator_App {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Oleksii","Saiun",34,5000);
		Employee emp2 = new Employee("Susan","Park",70,800);
		Employee emp3 = new Employee("Chris","Zelmon",50,9000);
		Employee emp4 = new Employee("Anna","Boss",29,4800);
		Employee emp5 = new Employee("Alex","Johnson",49,5000);
		Employee emp6 = new Employee("Anna","Peterson",19,2300);
		Employee emp7 = new Employee("Maks","Skliness",30,3500);
		Employee emp8 = new Employee("Junioer","Kstezy",34,5000);
		Employee emp9 = new Employee("Palm","Cheerleston",34,1200);
		Employee emp10 = new Employee("Tanya","Shwarz",32,6500);

		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		list.add(emp9);
		list.add(emp10);
		
         Comparator<Employee> emp_last_name_asc =new Comparator<>()
        		 {
					@Override
					public int compare(Employee e1, Employee e2) {
						return e1.getSalary()-e2.getSalary();
					}        	 
        		 };
        		 
                 Comparator<Employee> emp_last_name_desc =new Comparator<>()
        		 {
					@Override
					public int compare(Employee e1, Employee e2) {
						return e2.getSalary()-e1.getSalary();
					}        	 
        		 };
        		 
        Collections.sort(list,emp_last_name_asc);
		for(Employee emp : list)
		{
			System.out.println(emp);
		}
		
		System.out.println("-----------");
		
		Collections.sort(list,emp_last_name_desc);
		for(Employee emp : list)
		{
			System.out.println(emp);
		}

	}

}
