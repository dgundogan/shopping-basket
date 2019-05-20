package co.uk.lambda.shopping;


import java.util.HashMap;
import java.util.Map;

public enum ItemRepository {
    INSTANCE;

    Map<String, Item> items;

    ItemRepository() {
        items = new HashMap<>();
        items.put("Apple", new Item("Apple", 0.35));
        items.put("Banana", new Item("Banana", 0.2));
        items.put("Melon", new Item("Melon", 0.5, Item.Offer.BUY_ONE_GET_ONE_FREE));
        items.put("Lime", new Item("Lime", 0.15, Item.Offer.THREE_FOR_TWO));
    }

    public ItemRepository getInstance() {
        return INSTANCE;
    }
}
