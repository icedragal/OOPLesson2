import java.text.DecimalFormat;


public class Flower {
    final String flowerName;
    final String country;
    final double cost;
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

    @Override
    public String toString() {
        return
                "Название: " + flowerName +
                ", страна происхождения: " + country +
                ", стоимость: " + ( new DecimalFormat("#.00").format(cost)) + "₽" +
                ", срок стояния: " + lifeSpan;
    }
}
