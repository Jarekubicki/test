package Excersises.Warehouse;

/**
 * Created by BIURO22 on 2022-12-19
 */
public class Test {
    public static void main(String[] args) {

        WarehouseLogic app = new WarehouseLogic();
        DataInputOutput appDataInput = new DataInputOutput();

        do {
            appDataInput.getFilenameFromUser();
            appDataInput.setFilePath();
        } while (!app.checkIfFileExists());

    }
}
