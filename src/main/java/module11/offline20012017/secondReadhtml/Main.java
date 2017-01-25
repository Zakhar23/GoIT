package module11.offline20012017.secondReadhtml;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = null;

        try {
            url = new URL("http://google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Home\\Desktop\\google.txt"),"UTF8"));

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            line = line.replaceAll("google", "yandex").replaceAll("Google", "Yandex");
            bw.write(line);
            bw.newLine();
            System.out.println(line);
        }



    }
}
