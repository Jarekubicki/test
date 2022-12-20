package Excersises.Warehouse;

/**
 * Created by BIURO22 on 2022-12-19
 */
public class Product {

    private String name;
    private int onStockAvailable;

    public Product(String name, int onStockAvailable) {
        this.name = name;
        this.onStockAvailable = onStockAvailable;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOnStockAvailable() {
        return onStockAvailable;
    }

    public void setOnStockAvailable(int onStockAvailable) {
        this.onStockAvailable = onStockAvailable;
    }
}
