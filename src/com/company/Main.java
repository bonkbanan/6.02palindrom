package com.company;

public class Main {

    public static boolean isPalindromLight(String text){
        StringBuilder builder = new StringBuilder(text);
        String reverse=builder.reverse().toString();
        boolean result=true;
        if(text.equals(reverse)){
        }else{
            result=false;
        }
        return result;
    }
    public static boolean isPalindromRefactored(String text){
        return (text.equals((new StringBuilder(text)).reverse().toString()))
                ? true : false;
    }

    public static void main(String[] args) {
        System.out.println("Hello the sixth March");
        String text = "потоп";
        System.out.println(isPalindromRefactored(text));

    }
}
