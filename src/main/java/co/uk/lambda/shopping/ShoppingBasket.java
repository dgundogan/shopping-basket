package co.uk.lambda.shopping;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ShoppingBasket {

    ItemRepository repository;

    public ShoppingBasket() {
        repository = ItemRepository.INSTANCE.getInstance();
    }

    public double computePrice(List<String> list) {
        double sum = 0;
        Map<String, Long> purchasedItems =
                list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry<String, Long> purchasedItem : purchasedItems.entrySet()) {
            Item item = repository.items.get(purchasedItem.getKey());

            sum += item.calculatePrice(purchasedItem.getValue());
        }
        return sum;
    }
}