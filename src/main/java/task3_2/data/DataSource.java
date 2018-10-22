package task3_2.data;


import task3_2.data.factory.ElectronicMaket;
import task3_2.data.factory.FoodMaket;
import task3_2.data.factory.GoodsMaker;
import task3_2.model.entity.Goods;


import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static GoodsMaker goodsMaker;

    public static List<Goods> getGoods(String name, int numb) {

        List<Goods> goods = new ArrayList<Goods>();
        switch (name.toLowerCase()) {
            case "food":
                goodsMaker = new FoodMaket();
                break;
            case "electronics":
                goodsMaker = new ElectronicMaket();
                break;
            default:
                return goods;
        }
        for (int i = 0; i < numb; i++) {
            goods.add(goodsMaker.createGoods());
        }
        return goods;
    }
}
