package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import db.LaboratoryDB;

import java.io.IOException;

/**
 * Created by gorobec on 17.07.16.
 */
public class DBUtils {
    private static final String DB_PATH = "/home/gorobec/Java/development/Teaching/ArtCode/LaboratoryACO13/src/main/resources/LaboratoryDB.txt";

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void save(LaboratoryDB db) throws IOException {
        String laboratoryJson = gson.toJson(db);
        IOUtils.writeToFile(laboratoryJson, DB_PATH);
    }

    public static LaboratoryDB read() throws IOException {
        String laboratoryJson = IOUtils.readFromFile(DB_PATH);

        return gson.fromJson(laboratoryJson, LaboratoryDB.class);
    }
}
