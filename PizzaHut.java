import Pizza.BasePizza;
import Pizza.VegDelight;
import ToppingsDecorator.ExtraCheese;
import ToppingsDecorator.Mushroom;

public class PizzaHut {
    public static void main(String[] args) {

        BasePizza pizza = new VegDelight();
        ExtraCheese cheesePizza = new ExtraCheese(pizza);
        Mushroom mushroomPizzaWithCheese = new Mushroom(cheesePizza);

        System.out.println(mushroomPizzaWithCheese.getCost()); // 100 + 10 + 50 = 160


    }
}
