public class Car {
    double engineVolume;
    String brand;
    String model;
    String color;
    String country;
    int year;

    Car(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand == null){
            this.brand = "default";
    }else {
            this.brand = brand;
        }
        if (model == null){
            this.model = "default";
        }else {
            this.model = model;
        }
        if (country == null){
            this.country= "default";
        }else {
            this.country = country;
        }
        if (year <= 0){
            this.year= 2000;
        }else {
            this.year = year;
        }
        if (color == null){
            this.color= "white";
        }else {
            this.color = color;
        }
        if (engineVolume <= 0){
            this.engineVolume= 1.5;
        }else {
            this.engineVolume = engineVolume;
        }
    }
    void Car () {
        System.out.println(brand + model + ", " + year + " год выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя - "
               + engineVolume + " л.");

    }

}
