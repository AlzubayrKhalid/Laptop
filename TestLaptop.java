package final46;
import java.util.Scanner;
public class TestLaptop {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Laptop lp1 = new Laptop("KSU_Laptop","INTEL",16,512,14.2,1.33);
		
		
		Laptop lp2 = new Laptop();
		System.out.print("Enter laptop name: ");
		String name= read.next();
		lp2.setName(name);
		
		System.out.print("Enter CPU (INTEL/AMD/OTHER): ");
		String cpu= read.next();
		lp2.setCpu(cpu);
		
		System.out.print("Enter RAM (GB): ");
		int ram= read.nextInt();
		lp2.setRam(ram);
		
		System.out.print("Enter storage (GB): ");
		int storage= read.nextInt();
		lp2.setStorage(storage);
		
		System.out.print("Enter screen size (inch): ");
		double screen= read.nextDouble();
		lp2.setScreen(screen);
		
		System.out.print("Enter weight (KG): ");
		double weight= read.nextDouble();
		lp2.setWeight(weight);
		
		lp1.display();
		lp2.display();
		
		System.out.printf("\n\nAre the laptops equal? %b\n",lp1.equals(lp2));
		
		if (lp1.calculatePrice()>lp2.calculatePrice())
			System.out.printf("%s is more expensive than %s\n",lp1.getName(),lp2.getName());
		else if (lp2.calculatePrice()>lp1.calculatePrice())
			System.out.printf("%s is more expensive than %s\n",lp2.getName(),lp1.getName());
		else 
			System.out.println("Both laptops are equals.");
		
		
		read.close();
	}

}
