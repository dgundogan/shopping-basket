package co.uk.lambda.shopping;


import java.util.HashMap;
import java.util.Map;

public enum ItemRepository {
    INSTANCE;

    Map<String, Item> items;

    ItemRepository() {
        items = new HashMap<>();
        items.put("Apple", new Item("Apple", 35));
        items.put("Banana", new Item("Banana", 20));
        items.put("Melon", new Item("Melon", 50, Item.Offer.BUY_ONE_GET_ONE_FREE));
        items.put("Lime", new Item("Lime", 15, Item.Offer.THREE_FOR_TWO));
    }

    public ItemRepository getInstance() {
        return INSTANCE;
    }
}
