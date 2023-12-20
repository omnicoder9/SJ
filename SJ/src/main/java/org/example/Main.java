package org.example;

import java.util.HexFormat;


//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
public class Main {
    public static void main(String[] args) {

        char data[] = {'a', 'b', 'c'};
        String str = new String(data);

        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abc".substring(2,3);
        String d = cde.substring(1, 2);

        String str1 = new  String();
        byte[] CDRIVES = HexFormat.of().parseHex("e04fd020ea3a6910a2d808002b30309d");
        byte[] myvar = "Any String you want".getBytes();
        String str2 = new String(myvar);
        String str3 = new String(CDRIVES);



        //https://www.geeksforgeeks.org/java-nio-charset-charset-class-in-java/
        String s= "GFG";

        java.nio.charset.Charset charSet = java.nio.charset.Charset.forName("ASCII");

        byte[] byteArr= s.getBytes(charSet);
        System.out.println("byteArr of \"GFG\" with charsetName \"ASCII\" = " + byteArr);
        for (byte a : byteArr)
        {
            System.out.println(a);
        }



    }
}