package lesson26;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) throws IOException {
      //  Text first=new Text();
        InputStreamReader inputText1 = new InputStreamReader(
                new FileInputStream("D:\\Курсы Java\\Домашние задания\\HomeTask26.txt"), StandardCharsets.UTF_8);
        StringBuilder resultText = new StringBuilder();
        int i;
        //The first exercise:
        while ((i = inputText1.read()) != -1) {
            resultText.append((char) i);
        }
        inputText1.close();
        System.out.println(resultText);
        //The second exercise:
        InputStreamReader inputText2 = new InputStreamReader(
                new FileInputStream("D:\\Курсы Java\\Домашние задания\\HomeTask26Ex2.txt"), StandardCharsets.UTF_8);
        StringBuilder resultText2 = new StringBuilder();
        while ((i = inputText2.read()) != -1) {
            resultText2.append((char) i);
        }
        inputText2.close();
        System.out.println(resultText2);
        Pattern pattern = Pattern.compile("\\s[АаУуОоЫыИиЭэЯяЮюЁёЕе][а-я]+\\W|\\s[АаУуОоЫыИиЭэЯяЮюЁёЕе][а-я]+\\s|\\s[АаУуОоЫыИиЭэЯяЮюЁёЕе]\\s|\\s[АаУуОоЫыИиЭэЯяЮюЁёЕе]\\W");
        Matcher matcher = pattern.matcher(resultText2.toString());
        System.out.println("Words that begin with vowels: ");
        while (matcher.find()) {
            System.out.print(matcher.group()+" ");
        }



    }
}
