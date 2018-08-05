package br.ce.wcaquino.utils;

public class Paths  {

    public static String userPath(){
        return System.getProperty("user.dir");
    }

    public static String systemPath(){
        return System.getProperty("user.home");
    }
}
