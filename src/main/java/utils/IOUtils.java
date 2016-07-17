package utils;

import java.io.*;

/**
 * Created by gorobec on 17.07.16.
 */
public class IOUtils {
    public static String readFromFile(String path) throws IOException {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new FileReader(path));

        while (br.ready()){
            sb.append(br.readLine());
        }
        br.close();
        return sb.toString();
    }

    public static void writeToFile(String laboratoryJson, String path) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        bw.write(laboratoryJson);
        bw.flush();
        bw.close();

    }
}
