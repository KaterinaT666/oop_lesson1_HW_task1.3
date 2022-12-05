public class Car {
	String brand;
	String model;
	double engineVolume;
	String color;
	int year;
	String country;

	public Car(String brand, String model, String country, String color, double engineVolume, int year) {

		if (model == null || model.isEmpty()){
			model = "default";
		}
		this.model = model;

		if (brand == null || brand.isEmpty()){
			brand = "default";
		}
		this.brand = brand;

		if (country == null || country.isEmpty()){
			country = "default";
		}
		this.country = country;

		if (engineVolume >= 0) {
		}
		this.engineVolume = 1.5;

		if (color == null || color.isEmpty()){
			color = "белый";
		}
		this.color = color;

		if (year >= 0) {
		}
		this.year = 2000;
	}
	public String toString(){
		 return " Марка автомобиля: " + brand + ". " + "Модель автомобиля: " + model + ". " +
				"Сборка в: " + country + ". " + "Цвет кузова — " + color + ". " +
				 "Объем двигателя — " + engineVolume + "л" + ". " + "Год выпуска — " + year +"год.";
	}
}
