package ToppingsDecorator;

import Pizza.BasePizza;

public class Mushroom extends BasePizza {

    BasePizza pizza;

    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }
}
