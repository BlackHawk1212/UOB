package com.perisic.beds.recycling;

import java.util.Vector;

/**
 * This is where the data lives, i.e. cans, bottles and crates are recorded
 * in this class. We might call it our database (if we insist!).
 * It also provides a summative statement about all the items inserted into the
 * machine.
 *
 * @author Marc Conrad
 */
public class ReceiptBasis {
    private Vector<DepositItem> myItems = new Vector<DepositItem>();

    /**
     * @param item an item that has been inserted into the machine (such as can, bottle, crate).
     */
    public void addItem(DepositItem item) {
        myItems.add(item);
        item.number = myItems.indexOf(item);
    }

    /**
     * Calculates a summary based on the items inserted.
     *
     * @return the overall value of the items inserted by the customer.
     */
    public String computeSum() {
        String receipt = "";
        int sum = 0;
        for (int i = 0; i < myItems.size(); i++) {
            DepositItem item = myItems.get(i);
            receipt = receipt + (item.number + 1) + ": " + item.value + " (" + item.getName() + ")";
            receipt = receipt + System.getProperty("line.separator");
            sum = sum + item.value;
        }
        receipt = receipt + "Total: " + sum;
        return receipt;
    }
}
