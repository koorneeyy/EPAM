package task3_2.data.factory;

import task3_2.model.entity.Food;
import task3_2.model.entity.Goods;

public class FoodMaket implements GoodsMaker {
    @Override
    public Goods createGoods() {
        return new Food();
    }
}
