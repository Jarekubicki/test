package Excersises.Warehouse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by BIURO22 on 2022-12-19
 */
public class DataInputOutput {
    private final  String DIRECTORY_PATH = "D:/Java_files/";
    private String filename;
    private String filePath;

    private void askForFileName() {
        System.out.println("Enter filename containing required data (eg. data.csv).");
    }


    public String getFilenameFromUser() {
        Scanner input = new Scanner(System.in);

        askForFileName();
        filename = input.nextLine();
        return filename;
    }

    public String setFilePath() {
//        getFilenameFromUser();
        return filePath = DIRECTORY_PATH + filename;
    }

    public String readFile() throws IOException {
        String line;
        FileReader reader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);
        return line = bufferedReader.readLine();
    }
}
