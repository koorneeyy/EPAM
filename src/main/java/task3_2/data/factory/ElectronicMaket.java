package task3_2.data.factory;

import task3_2.model.entity.Electronics;
import task3_2.model.entity.Goods;

public class ElectronicMaket implements GoodsMaker {
    @Override
    public Goods createGoods() {
        return new Electronics();
    }
}
