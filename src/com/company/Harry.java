package com.company;
/*
@USER: dench
@DATE: 6.03.21
@NAME: Harry
@TIME: 10:51
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Harry {

    public static String loadText(String fileLocation) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(fileLocation)));
        return content;
    }

    public static String cleanGarbage(String text){
       text = text.replaceAll("[^A-Za-z ]", "").toLowerCase();
       return text;
    }

    public static void main(String[] args) throws IOException {
        String fileLocation="C:\\Users\\dench\\Desktop\\Уроки java\\Harry poter.txt";
        String text = loadText(fileLocation);
        text=cleanGarbage(text);
        String[] array =text.split(" ");
        String distringWords= "";
        for (int i = 0; i < array.length; i++) {
            if(!distringWords.contains(array[i])){
                distringWords+= array[i] + " ";
            }
        }
        array = distringWords.split(" ");
        Arrays.sort(array);
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
            if(i%10==0) System.out.println();
        }
        //1 знайти скільки строчок у тексті Гарі Потер (по \n)
        //2 скількики рядків містить фразу "Harry Potter"
        //3 Вивести всі власні Імена в алфавітному порядку (взяти слова з великої букви, і дивитися чи є такі ж з маленької)
        //4 для мене (зробити завдання з правим шифтом  щоб без додат. масиву і вибором кроку)
    }
}
