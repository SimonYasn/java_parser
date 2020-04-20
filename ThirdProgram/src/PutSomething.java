import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PutSomething {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(",");
        reader.close();


        BufferedReader reader1 = new BufferedReader(new FileReader(new File(input[1])));
        BufferedWriter outputWriter = new BufferedWriter(new FileWriter(input[2]));


        List<String> list = new ArrayList<String>();
        String line;

        while ((line = reader1.readLine()) != null) { // считываем все строки в массив
            line = line.replaceAll("\\s+",input[0]);
            outputWriter.write(line + "\r\n");
        }
        outputWriter.close();
    }
}
