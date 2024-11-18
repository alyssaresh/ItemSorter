package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {

    @Test
    public void test1() {
        Item socks = new Item(0L, "socks", 5.0);
        Item pants = new Item(1L, "pants", 40.0);
        Item shirt = new Item (2L, "shirt", 20.0);
        Item hat = new Item (3L, "hat", 15.0);
        Item[] itemsToSort = {socks, pants, shirt, hat};
        Item[] expected = {socks, hat, shirt, pants};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = new PriceComparator();

        //when
        Item[] actual = itemSorter.sort(comparator);

        //then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        Item brownie = new Item(1L, "brownie", 1.50);
        Item cookie = new Item(0L, "cookie", 1.0);
        Item cupcake = new Item (2L, "cupcake", 2.0);
        Item[] itemsToSort = {brownie, cookie, cupcake};
        Item[] expected = {cookie, brownie, cupcake};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = new PriceComparator();

        //when
        Item[] actual = itemSorter.sort(comparator);

        //then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        Item milk = new Item (2L, "milk", 2.50);
        Item bread = new Item(1L, "bread", 3.50);
        Item eggs = new Item(0L, "eggs", 3.00);
        Item[] itemsToSort = {milk, bread, eggs};
        Item[] expected = {milk, eggs, bread};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = new PriceComparator();

        //when
        Item[] actual = itemSorter.sort(comparator);

        //then
        Assert.assertArrayEquals(expected, actual);
    }
}
