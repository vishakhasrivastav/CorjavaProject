package collection;

import java.util.Comparator;

public class CompareEmpDesig implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getDesignation().compareTo(o2.getDesignation());
	}

}
