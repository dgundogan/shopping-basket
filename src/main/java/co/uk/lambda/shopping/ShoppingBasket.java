package co.uk.lambda.shopping;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ShoppingBasket {

    private ItemRepository repository;

    public ShoppingBasket() {
        repository = ItemRepository.INSTANCE.getInstance();
    }

    public double computePrice(List<String> list) {
        double sum = 0;
        Map<String, Long> purchasedItems =
                list.stream()
                        .map(i -> i.trim())
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<String, Long> purchasedItem : purchasedItems.entrySet()) {
            Item item = repository.items.get(purchasedItem.getKey());
            if(item == null)
                System.out.println("Item "+ purchasedItem.getKey()+" was not found in repository");
            sum += item.calculatePrice(purchasedItem.getValue());
        }
        return sum / 100; //convert to pound
    }
}
