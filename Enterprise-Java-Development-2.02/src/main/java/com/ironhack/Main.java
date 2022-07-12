package com.ironhack;

public class Main {
    public static boolean containsProtectedWord(String s){
        String [] palabrasSeparadas = s.split(" ");
        String keywords[] = { "abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while" };

        for (String y:palabrasSeparadas) {
            for (String t:keywords) {
                if (y.equals(t)){
                    return true;
                }
            }
        }
        return false;
    }
}