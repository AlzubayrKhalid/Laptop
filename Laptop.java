package final46;

public class Laptop {
	private String name;
	private String cpu;
	private int ram;
	private int storage;
	private double screen;
	private double weight;
	
	public Laptop()
	{
		name = "";
		cpu = "OTHER";
		ram = 2;
		storage = 128;
		screen = 10;
		weight = 0.5;
	}
	
	public Laptop (String name, String cpu, int ram , int storage, double screen, double weight)
	{
		this.setCpu(cpu);
		this.setName(name);
		this.setScreen(screen);
		this.setRam(ram);
		this.setStorage(storage);
		this.setWeight(weight);
	}
	
	public double calculatePrice()
	{
		int pricecpu;
		if (cpu.equals("INTEL"))
			pricecpu = 200;
		else if (cpu.equals("AMD"))
			pricecpu = 180;
		else
			pricecpu = 100;
		return (300*0.25*ram+pricecpu+0.5*storage+50*(screen-10)-10*(weight-0.5));
	}
	
	public boolean equals(Laptop other)
	{
		if (this.name.equals(other.name)&&this.cpu.equals(other.cpu)&&this.ram==other.ram&&this.storage==other.storage&&this.screen==other.screen&&this.weight==other.weight)
			return true;
		else
			return false;
	}
	
	public void display()
	{
		if (weight*10==Math.floor(weight*10))
			System.out.printf("\n%s, %s, %d GB RAM, %d GB, %.1f inch screen, %.1f KG. Price is %.1f",name,cpu,ram,storage,screen,weight,this.calculatePrice());
		else
			System.out.printf("\n%s, %s, %d GB RAM, %d GB, %.1f inch screen, %.2f KG. Price is %.1f",name,cpu,ram,storage,screen,weight,this.calculatePrice());

	}


	public void setCpu(String cpu) {
		if (cpu.equals("INTEL")||cpu.equals("AMD"))
			this.cpu= cpu;
		else
			this.cpu="OTHER";
	}

	public void setRam(int ram) {
		if (ram>=2)
			this.ram = ram;
		else
			this.ram=2;
	}

	public void setStorage(int storage) {
		if (storage>=128)
			this.storage = storage;
		else
			this.storage=128;
	}

	public void setScreen(double screen) {
		if (screen>=10&&screen<=17.5)
			this.screen = screen;
		else
			this.screen= 10;

	}

	public void setWeight(double weight) {
		if (weight>=0.5)
			this.weight = weight;
		else
			this.weight=0.5;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpu() {
		return cpu;
	}

	public int getRam() {
		return ram;
	}

	public int getStorage() {
		return storage;
	}

	public double getScreen() {
		return screen;
	}

	public double getWeight() {
		return weight;
	}
	
	
	
	

}
