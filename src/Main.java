import java.time.Period;

public class Main {
    public static void main(String[] args) {
     //   задание
        System.out.println("Задание");
        person Maks = new person("Максим", -1988, "Минск", "бренд-менеджер");
        Maks.person();
        person Ann = new person("Анна", 1993, null, "методист образовательных программ");
        Ann.person();
        person Kate = new person("Катя", 1992, "Калининград", "продакт - менеджер");
        Kate.person();
        person Artem = new person("Артем", 1995, "Москва", "директор по развитию бизнеса");
        Artem.person();
// задание
        System.out.println("Задание");
        Car Lada = new Car (null,"Granta",2015, "России", "желтого", 1.7);
        Lada.Car();
        Car Audi = new Car ("Audi",null,2020, "Германии", "черный", 3.0);
        Audi.Car();
        Car BMW = new Car ("BMW","Z8",-2021, "Германии", "черный", 3.0);
        BMW.Car();
        Car Kia = new Car ("Kia","Sportage 4-го поколения",2018, null, null, 2.4);
        Kia.Car();
        Car Hyundai = new Car ("Hyundai","Avante",2016, "Южной Кореи", "оранжевый", -1.6);
        Hyundai.Car();
        }
}