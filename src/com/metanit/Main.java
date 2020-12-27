package com.metanit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        String myStr;
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        myStr = in.nextLine();
        System.out.println(" Тип Лексемы | Символ \n");
        System.out.println(" ---------------------- ");
        Lexer lexer = new Lexer(myStr);
        List<Token> allTokens = new ArrayList<>(lexer.getAllTokens());
        allTokens.forEach(integer -> System.out.println(integer.toString()));
    }

}
