package com.example.myfirstapp;

public class Verificator {
    private final static String USERNAME = "julian.kranz@gmail.com";
    private final static String PASSWORD = "jk";

    public static boolean verificate(CharSequence username, CharSequence password) {
        return USERNAME.contentEquals(username) && PASSWORD.contentEquals(password);
    }

}
