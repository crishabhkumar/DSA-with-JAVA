package com.rishabh;

public class StringBUILDER {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            name.append(ch);
        }
        System.out.println(name);
        System.out.println(name.deleteCharAt(0));
        System.out.println(name);
        System.out.println(name.reverse());
        System.out.println(name);

    }

}
