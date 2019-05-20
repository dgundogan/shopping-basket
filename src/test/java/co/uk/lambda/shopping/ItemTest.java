package co.uk.lambda.shopping;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

    private Item item;

    @Test
    public void givenNoneOffer_whenCallCalculatePrice_thenReturnsPrice() {

        item = new Item("Apple", 35);

        Assert.assertEquals(350, item.calculatePrice(10L), 0);
    }

    @Test
    public void givenBuyOneGetOneFreeOffer_whenCallCalculatePrice_thenReturnsPrice() {

        item = new Item("Melons", 50, Item.Offer.BUY_ONE_GET_ONE_FREE);

        Assert.assertEquals(250, item.calculatePrice(10L), 0);
    }

    @Test
    public void givenBuyThreeForTwoFreeOffer_whenCallCalculatePrice_thenReturnsPrice() {

        item = new Item("Limes", 15, Item.Offer.THREE_FOR_TWO);

        Assert.assertEquals(105, item.calculatePrice(10L), 0);
    }
}