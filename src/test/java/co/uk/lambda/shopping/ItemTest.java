package co.uk.lambda.shopping;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

    private Item item;

    @Test
    public void givenNoneOffer_whenCallCalculatePrice_thenReturnsPrice() {

        item = new Item("Apple", 35);

        Assert.assertTrue(350.0 == item.calculatePrice(10L));
    }

    @Test
    public void givenBuyOneGetOneFreeOffer_whenCallCalculatePrice_thenReturnsPrice() {

        item = new Item("Melons", 50, Item.Offer.BUY_ONE_GET_ONE_FREE);

        Assert.assertTrue(250.0 == item.calculatePrice(10L));
    }

    @Test
    public void givenBuyThreeForTwoFreeOffer_whenCallCalculatePrice_thenReturnsPrice() {

        item = new Item("Limes", 15, Item.Offer.THREE_FOR_TWO);

        Assert.assertTrue(105.0 == item.calculatePrice(10L));
    }
}