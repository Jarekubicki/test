package Excersises.Warehouse;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by BIURO22 on 2022-12-19
 */
public class WarehouseLogic {

    ArrayList<Product> warehouseStock = new ArrayList<>();
    DataInputOutput dataInputOutput = new DataInputOutput();

    public boolean checkIfFileExists() {
        try{
            dataInputOutput.readFile();
        } catch (IOException ioe) {
            System.out.println("File do not exist.");
            return false;
        }
        return true;
    }


}
