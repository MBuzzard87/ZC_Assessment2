package rocks.zipcode.assessment2.collections;


import java.util.ArrayList;
import java.util.List;


/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    List<String> strList = new ArrayList<>();
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.strList = strings;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        strList.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        strList.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        int numItems = 0;

        for(String strItem : strList) {
            if (strItem == item) {
                    numItems++;
            }
        }


        return numItems;
    }
}
