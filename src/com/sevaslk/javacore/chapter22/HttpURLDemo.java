package com.sevaslk.javacore.chapter22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

class HttpURLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("https://www.google.com/");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        System.out.println("Метод запроса: " + hpCon.getRequestMethod());
        System.out.println("Код ответа: " + hpCon.getResponseCode());
        System.out.println("Ответное сообщение: " + hpCon.getResponseMessage());

        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrFields = hdrMap.keySet();
        System.out.println("\nДалее следует заголовок:");

        for (String k : hdrFields) {
            System.out.println("Ключ: " + k + " Значение: " + hdrMap.get(k));
        }
    }
}
