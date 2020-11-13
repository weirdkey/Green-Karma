package com.example.myfirstapp;

public class Verificator {
    private final static String USERNAME = "admin";
    private final static String PASSWORD = "admin";

    public static boolean verificate(CharSequence username, CharSequence password) {
        return USERNAME.contentEquals(username) && PASSWORD.contentEquals(password);
    }

}
