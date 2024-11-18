package rocks.zipcode.io;

import rocks.zipcode.io.comparators.NameComparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] itemsToSort;

    public ItemSorter(Item[] items) {
        this.itemsToSort = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(itemsToSort, comparator);
        return itemsToSort;
    }
}
