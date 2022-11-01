package Arrays;

public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cars = { "BMW", "Mercedes", "Toyota", "KIA", "Volvo", "Tesla" };

		for (String car : cars) {
			System.out.println(car);

		}
		System.out.println("---------");
		for (int b = 0; b < cars.length; b++) {
			System.out.print(cars[b] + " ");
		}

	}

}
