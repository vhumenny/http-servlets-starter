package com.dmdev.http.client;

import java.io.IOException;
import java.net.URL;

public class UrlExample {
    public static void main(String[] args) throws IOException {
        var url = new URL
                ("file:C:\\Users\\Admin\\dev\\http-servlets-starter\\src\\http\\socket\\DatagramRunner.java");
        var urlConnection = url.openConnection();
        System.out.println(new String(urlConnection.getInputStream().readAllBytes()));

    }

    private static void checkGoogle() throws IOException {
        var url = new URL("https://www.google.com");
        var urlConnection = url.openConnection();
        urlConnection.setDoOutput(true);

        try (var outputStream = urlConnection.getOutputStream()) {
        }

        System.out.println(new String(urlConnection.getInputStream().readAllBytes()));
    }
}
