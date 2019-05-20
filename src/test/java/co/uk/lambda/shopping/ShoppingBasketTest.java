package co.uk.lambda.shopping;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ShoppingBasketTest {

    private ShoppingBasket basket;

    @Before
    public void setUp() throws Exception {
        basket = new ShoppingBasket();
    }

    @Test
    public void givenArray1_whenCallComputePrice_thenReturnsPrice() {
        Assert.assertEquals(0.90, basket.computePrice(Arrays.asList("Apple", "Apple", "Banana")), 0);
    }

    @Test
    public void givenArray2_whenCallComputePrice_thenReturnsPrice() {
        Assert.assertEquals(2.55, basket.computePrice(Arrays.asList("Apple", "Apple", "Banana", "Banana", "Melon", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime")), 0);
    }

    @Test
    public void givenArrayWithSpace_whenCallComputePrice_thenReturnsPrice() {
        Assert.assertEquals(1.55, basket.computePrice(Arrays.asList("Apple", " Apple", " Banana", " Melon ", "Lime ")), 0);
    }
}