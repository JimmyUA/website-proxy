package generator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class ProxyGenerator {
    public static Document start(String URL){
        try {
            return Jsoup.connect(URL).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
