package com.epam.learn;

public class ReverseString {

    public static void main(String[] args) {

        String input = "HelloWorld"; //dlroWolleH --> output
        String output = "";

        //using charAt
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        System.out.println("Output using the charAt: " + output);

        //using charArray
        char[] charArray = input.toCharArray();
        String output1 = "";

        for (int i = charArray.length - 1; i >= 0; i--) {
            output1 = output1 + charArray[i];
        }
        System.out.print("Output using the toCharArray: " + output1);

        //using reverse method in StringBuilder
        System.out.println();
        StringBuilder sb = new StringBuilder(input);
        System.out.println("Output using the reverse method in StringBuilder: " + sb.reverse());
    }
}
