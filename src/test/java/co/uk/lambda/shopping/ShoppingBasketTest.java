package co.uk.lambda.shopping;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ShoppingBasketTest {

    private ShoppingBasket basket;

    @Before
    public void setUp() throws Exception {
        basket = new ShoppingBasket();
    }

    @Test
    public void computePrice() {
        System.out.println(basket.computePrice(Arrays.asList("Apple", "Apple", "Banana")));
    }
}