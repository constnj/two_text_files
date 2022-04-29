import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("in.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));

        while (true) {
            String a = reader.readLine();
            if (a == null) {
                break;
            }
            writer.write(a + " " + a.length());
        }
    }
}
