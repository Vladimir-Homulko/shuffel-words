import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramCript {
    private String key;
    private String text;
    Encryption encryption = new Encryption();

    public ProgramCript() throws IOException {
        readData();
        encryption.Encryption(key, text);
    }

    public void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ключ шифрования: ");
        key = reader.readLine();
        System.out.println("Введите текст: ");
        text = reader.readLine();
    }


}
