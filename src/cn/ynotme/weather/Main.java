package cn.ynotme.weather;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Document document = Jsoup.connect("http://www.weather.com.cn/data/cityinfo/101010100.html")
                .get();
        System.out.println(document.body().text());
    }
}
