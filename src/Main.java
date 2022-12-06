import transport.Car;

public class Main {
    public static void main(String[] args) {
        Human max = new Human("Максим", -1988, "", null);
        Human anya = new Human("Аня", 1993, "Москва",  "методист образовательных программ");
        Human katya = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        Human vova = new Human("Владимир", 2001, "Казань", "безработный");
        System.out.println(max);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vova);

        Flower roza = new Flower("Роза обыкновенная", "Голландия", 35.59, 3);
        Flower hriz = new Flower("Хризантема", "", 15, 5);
        Flower pion = new Flower("Пион", "Англии", 69.9, 1);
        Flower gips = new Flower("Гипсофила", "Турция", 19.5, 10);
        Flower[] bouquetFlower = new Flower[7];
        bouquetFlower[0] = roza;
        bouquetFlower[1] = hriz;
        bouquetFlower[2] = pion;
        bouquetFlower[3] = gips;
        bouquetFlower[4] = gips;
        bouquetFlower[5] = gips;
        bouquetFlower[6] = null;
        Bouquet bouquet = new Bouquet(bouquetFlower);
        bouquet.printCostOfBouquet();

//        System.out.println(roza);
//        System.out.println(hriz);
//        System.out.println(pion);
//        System.out.println(gips);

//        Car granta = new Car("Lada", "Granta", 1.7F, "Желтый", -2015, "Россия");
//        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0F, "Черный", 2020, "Германия");
//        Car bmw = new Car("BMW", "Z8", 3.0F, "Черный", 2021, "Германия");
//        Car kia = new Car("Kia", "Sportage 4-го поколения", 1.7F, "Крсный", 2018, "Южная Корея");
//        Car hyundai = new Car("Hyundai", "Avante", 1.6F, "Оранжевый", 2016, "Южная Корея");
//        System.out.println(granta);
//        System.out.println(audi);
//        System.out.println(bmw);
//        System.out.println(kia);
//        System.out.println(hyundai);


    }
}