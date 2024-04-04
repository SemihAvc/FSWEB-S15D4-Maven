package org.example;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));


        System.out.println("******************************************");


        int decimalNumber = 13;
        String binaryNumber = convertDecimalToBinary(decimalNumber);
        System.out.println("Decimal " + decimalNumber + " in binary: " + binaryNumber);
    }

    public static boolean checkForPalindrome(String text) {
        System.out.println("Initial text: " + text);

        text = text.replaceAll("[ .,?!_\\-//\\s]", "").toLowerCase();


        Stack<Character> stack = new Stack<>();


        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        Stack<Character> tempStack = new Stack<>();


        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }


        while (!tempStack.isEmpty()) {
            if (text.charAt(0) != tempStack.peek()) {
                return false;
            }

            text = text.substring(1);
            tempStack.pop();
        }
        return true;
    }



public  static String convertDecimalToBinary(int decimal){
    ArrayList<Integer> binaryList = new ArrayList<>();
    while (decimal > 0) {
        binaryList.add(decimal % 2);
        decimal /= 2;
    }
    StringBuilder binaryString = new StringBuilder();
    for (int i = binaryList.size() - 1; i >= 0; i--) {
        binaryString.append(binaryList.get(i));
    }
    return binaryString.toString();
}
    WorkintechList<Integer> list = new WorkintechList<>();

}
