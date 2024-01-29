package pro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class Empl{
	
	  private String name;
	    private String account;
	    private Integer salary;
	 
	    public Empl(String name, String account, Integer salary) {
	        super();
	        this.name = name;
	        this.account = account;
	        this.salary = salary;
	    }
	 
	    @Override
	    public String toString() {
	 
	        return "name: "+ this.name +" | account: "+ this.account +" | salary: "+this.salary;
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public String getAccount() {
	        return account;
	    }
	 
	    public void setAccount(String account) {
	        this.account = account;
	    }
	 
	    public Integer getSalary() {
	        return salary;
	    }
	 
	    public void setSalary(Integer salary) {
	        this.salary = salary;
	    }
	}
	

public class StreamFilter {

	public static void main(String[] args) {

		
		/*
		 * String[] str=new String[4]; str[0]="1234"; str[1]="4321"; str[2]="1243";
		 * str[3]="4312"; str[4]="4312ab";
		 * 
		 * Stream<String> stream=Stream.of(str);
		 */
		//List list=stream.map(s->Integer.valueOf(s)).skip(4).sorted().collect(Collectors.toList());
		
		//list.stream().peek(null);
		
		//Get employees getting salary more than 20k from list of employee object

		// program to find third highest number in an array using stream api

		List<Integer> list =Arrays.asList(1,2,13,56,44,4,22,5); // 1,2,4,5,13,22,44,56
		Comparator<Integer> com=(s1,s2)->{
			return s1>s2?+1:-1;
		};
		Optional<Integer> i= list.stream()
              .sorted(com).skip(2).findFirst();
		//System.out.println(i.get());
		
		// emp 
		//  name , sal, id
		
		/*Emp e1= new Emp();
		e1.setName("chimu");
		e1.setSal(24);
		

		Emp e2= new Emp();
		e1.setName("chimu");
		e1.setSal(14);
		

		Emp e3= new Emp();
		e1.setName("chimu");
		e1.setSal(2);
		
		List<Emp> li=new ArrayList<Emp>();
		li.add(e3);li.add(e2);li.add(e1);
		*//*
		li.stream().filter(e->e.getSal()>20).forEach(System.out::println);
		*/
		//Map<Integer,List<Emp>> map=li.stream().collect(Collectors.groupingBy(Emp::getSal));
		
		//System.out.println(map.size());
		
	
		
		//System.out.println(lll.get(0).getSal());
		List<Empl> empList = new ArrayList<>();
        empList.add(new Empl("Nataraja G", "Accounts", 8000));
        empList.add(new Empl("Nagesh Y", "Admin", 15000));
        empList.add(new Empl("Vasu V", "Security", 2500));
        empList.add(new Empl("Amar", "Entertinment", 12500));
 
        // find employees whose salaries are above 10000
        empList.stream().filter(emp->emp.getSalary() > 10000).forEach(System.out::println);
    
		
	}

}
