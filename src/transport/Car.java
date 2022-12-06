package transport;

import java.time.LocalDate;
import java.time.Month;

public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmissionType;
    private final String bodyworkType;
    private String registrationNumber;
    private final int numberOfSeats;
    private Boolean isSummerTires;


    public Car(String brand, String model, float engineVolume, String color, int year, String country, String transmissionType, String bodyworkType, String registrationNumber, int numberOfSeats, Boolean isTiresSummer) {

        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else this.brand = "default";

        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else this.model = "default";

        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else this.engineVolume = 1.5F;

        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else this.color = "Белый";

        if (year > 0) {
            this.year = year;
        } else this.year = 2000;

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else this.country = "default";

        if (transmissionType != null && !transmissionType.isEmpty() && !transmissionType.isBlank()) {
            this.transmissionType = transmissionType;
        } else this.transmissionType = "Автомат";

        if (bodyworkType != null && !bodyworkType.isEmpty() && !bodyworkType.isBlank()) {
            this.bodyworkType = bodyworkType;
        } else this.bodyworkType = "Седан";

        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else this.registrationNumber = "Отсутствует";

        if (numberOfSeats > 0) {
            this.numberOfSeats = numberOfSeats;
        } else this.numberOfSeats = 2;

        if (isTiresSummer != null) {
            this.isSummerTires = isTiresSummer;
        } else this.isSummerTires = true;

    }
    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        this(brand, model, engineVolume, color, year, country, "Автомат", "Седан", "d231aa131", 4, true);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyworkType() {
        return bodyworkType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else this.engineVolume = 1.5F;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else this.color = "Белый";
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        if (transmissionType != null && !transmissionType.isEmpty() && !transmissionType.isBlank()) {
            this.transmissionType = transmissionType;
        } else this.transmissionType = "Автомат";
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else this.registrationNumber = "Отсутствует";
    }

    public Boolean getSummerTires() {
        return isSummerTires;
    }

    public void setTiresSummer(Boolean tiresSummer) {
        if (tiresSummer != null) {
            this.isSummerTires = tiresSummer;
        } else this.isSummerTires = true;
    }

    public void changTires(){
        int monthNumber = LocalDate.now().getMonthValue();
        switch (monthNumber){
            case 1:
            case 2:
            case 3:
            case 4:
            case 11:
            case 12:
                isSummerTires = false;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                isSummerTires = true;
                break;
        }
    }
    public boolean isCorrectRegistrationNumber(){
        if (registrationNumber.length() != 9){
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3])
                || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8]))
            return false;
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return brand + " " + model + " " +
                year + " года выпуска, страна сборки: " + country + ", " +
                color + " цвет, объем двигателя — " + engineVolume +
                " л., тип коробки передач:  " + transmissionType +
                ", тип кузова: " + bodyworkType +
                ", регистрационный номер: " + registrationNumber +
                ", количество сидячи мест: " + numberOfSeats +
                ", резина: " + (isSummerTires ? "летняя" : "зимняя");
    }
}
