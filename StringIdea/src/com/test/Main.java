package com.test;

public class Main {

    public static void main(String[] args) throws MyException {

        System.out.println("encoding:");
        String str = "AAAAaaaBBBBBB\\12";
        System.out.println("input:");
        System.out.println(str);
        StringEncoding enc = new StringEncoding();
        System.out.println("output:");
        System.out.println(enc.encoding(str));
        System.out.println();

        System.out.println("decoding:");
        String stri = "4A3a6B\\\\\\1\\2";
        System.out.println("input:");
        System.out.println(stri);
        StringDecoding dec = new StringDecoding();
        System.out.println("output:");
        System.out.println(dec.decoding(stri));

        if (enc.encoding(str) != stri) {
            throw new MyException ();
        }

    }
}
