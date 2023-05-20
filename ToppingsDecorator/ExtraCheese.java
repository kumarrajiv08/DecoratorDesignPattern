package ToppingsDecorator;

import Pizza.BasePizza;

public class ExtraCheese extends BasePizza {

    BasePizza pizza;


    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 10;
    }
}
