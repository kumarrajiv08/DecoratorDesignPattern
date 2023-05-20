package ToppingsDecorator;

import Pizza.BasePizza;

public class Jalapeno extends BasePizza {

    BasePizza pizza;

    public Jalapeno(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 80;
    }
}
