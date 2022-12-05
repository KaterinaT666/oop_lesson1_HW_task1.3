public class Main {
	public static void main(String[] args) {

		Car lada = new Car("Lada", "", "России",
				"желтого цвета", -1.7, -2015);

		Car audi = new Car("Audi", " A8 50 L TDI quattro", "Германии",
				"черный цвет", 3.0, 0);

		Car bmw = new Car("BMW", null, "Германии",
				"черный цвет", 0, 2021);

		Car kia = new Car("Kia", "Sportage 4-го поколения", "Южной Корее",
				"", 2.4, 2018);

		Car hyundai = new Car("Hyundai", "Avante", "Южной Корее",
				"оранжевый", 1.6, 2016);


		System.out.println(lada);
		System.out.println(audi);
		System.out.println(bmw);
		System.out.println(kia);
		System.out.println(hyundai);
	}
}