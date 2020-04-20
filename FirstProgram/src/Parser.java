
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(",");
        reader.close();
        BufferedReader br = new BufferedReader(new FileReader(new File(input[0])));
        List<String> list = new ArrayList<String>();
        String line;
        while ((line = br.readLine()) != null) { // считываем все строки в массив
            list.add(line);
        }
        br.close();
        int counter = list.size() / 7; //ищем 1/7 от обьема файла
        int balance = list.size() % 7; //ищем возможный остаток строк
        BufferedWriter outputWriter = null;
        for (int i = 0; i < 7; i++) {   // записываем в 7 разных файлов одинаковое кол-во строк, в 7 файл дописываем остаток
            outputWriter = new BufferedWriter(new FileWriter("C:\\" + input[1]+i + ".txt"));
            for (int k = 0; k < counter; k++) {
                outputWriter.write(list.get(0)+ "\r\n");
                list.remove(0);
            }
            if (i == 6 && balance != 0) {
                for (int m = 0; m < balance; m++) {
                    outputWriter.write(list.get(0) + "\r\n");
                    list.remove(0);
                }
            }
            outputWriter.close();
        }

    }
}
