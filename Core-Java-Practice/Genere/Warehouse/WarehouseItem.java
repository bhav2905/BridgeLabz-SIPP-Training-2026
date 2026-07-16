package Warehouse;
public abstract class WarehouseItem {

    protected int itemId;
    protected String itemName;

    public WarehouseItem(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Item ID = " + itemId +
                ", Item Name = " + itemName;
    }
}
