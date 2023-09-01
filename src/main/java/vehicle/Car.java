package vehicle;

public class Car {
		int tyre;
		String name;
		String color;
		public void carFeature(String name, int tyre)
		{
			this.name=name;
			this.tyre=tyre;
		}
		public void displaymode()
		{
			System.out.println("Car name : "+name);
			System.out.println("No of tyres : "+tyre);
			System.out.println("Colour  : "+color);

		}
}
