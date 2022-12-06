import java.text.DecimalFormat;


public class Flower {
    private String flowerName;
    private String country;
    private  double cost;
    int lifeSpan;

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()) {
            this.flowerName = flowerName;
        } else this.flowerName = "Тип цветка не указан";

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else this.country = "Россия";

        if (cost > 0) {
            this.cost = cost;
        } else this.cost = 1;

        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else this.lifeSpan = 3;
    }
    public Flower(String flowerName, String country, double cost) {
        this(flowerName, country, cost, 3);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public void setFlowerName(String flowerName) {
        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()) {
            this.flowerName = flowerName;
        } else this.flowerName = "Тип цветка не указан";
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else this.country = "Россия";
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else this.cost = 1;
    }

    @Override
    public String toString() {
        return
                "Название: " + flowerName +
                ", страна происхождения: " + country +
                ", стоимость: " + ( new DecimalFormat("#.00").format(cost)) + "₽" +
                ", срок стояния: " + lifeSpan;
    }
}
