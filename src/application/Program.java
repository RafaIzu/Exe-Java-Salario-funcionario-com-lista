package application;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import entities.Salary;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
	
		System.out.print("How many employees will be registered?");
		int num=sc.nextInt();
		System.out.println();
		List<Salary>list=new ArrayList<>();
		
		for (int i=0;i<num;i++) {
			System.out.printf("Employee #%d%n",i+1);
			System.out.print("Id: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name=sc.nextLine();
			System.out.print("Salary: ");
			double salary=sc.nextDouble();
			list.add(new Salary(salary,id,name)); //importante
			
			
		}
		
		
		System.out.println();

		System.out.print("Enter the employee id that will have salary increase:");
		int checkId=sc.nextInt();
		
		Salary employee=list.stream().filter(x->x.getId()==checkId).findFirst().orElse(null); //importante
		
		if(employee==null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter percentage:");
			double percentage=sc.nextDouble();
			employee.increaseSalary(percentage);
		}
		for (Salary x:list) {
			System.out.println(x.getString()); //importante
		}
		
		
		
		sc.close();

	}

}
