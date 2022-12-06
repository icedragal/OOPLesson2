import java.text.DecimalFormat;
import java.util.Arrays;

public class Bouquet {
    private Flower[] bouquet;
    public Bouquet(Flower[] bouquet){
        this.bouquet = bouquet;
    }


    public void printCostOfBouquet() {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;

        for (Flower flower : bouquet) {
            if (flower != null) {
                System.out.println(flower);
                totalCost+= flower.getCost();
                if (flower.lifeSpan < minLifeSpan) {
                    minLifeSpan = flower.lifeSpan;
                }
            }
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + ( new DecimalFormat("#.00").format(totalCost)) + "₽");
        System.out.println("Срок стояния букета: " + minLifeSpan + " дней");
    }
}
