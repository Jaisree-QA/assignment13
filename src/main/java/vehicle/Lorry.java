package vehicle;

public class Lorry extends Bike{

	public Lorry()
	{
		System.out.println("Lorry un available");
	}
	public static void main(String[] args) {
		Lorry l=new Lorry();
				l.carFeature("Ford", 4);
				l.displaymode();
				System.out.println("-------------------------");
				l.bikeFeature("Ola", 2, "white");
				l.displaymode();
				
				
			//	Bike b=new Bike();
			//	b.bikeFeature("Ola", 2, "white");
	}

}
