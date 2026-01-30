package org.ollamajava;

import java.net.HttpURLConnection;
import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var modelName="qwen2.5-coder:1.5b-base";
        var promptText="What is java?";

        URL url=new URL("http://localhost:11434/api/generate");
        HttpURLConnection conn= (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type","application/json; utf-8");
        conn.setRequestProperty("Accept","application/json");
        conn.setDoOutput(true);
    }
}