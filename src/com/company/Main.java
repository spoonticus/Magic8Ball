package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String end = new String();

    while (true) {
        System.out.print("Please ask the Magic 8-Ball a question: ");
        String question = keyboard.nextLine();

        Random magic = new Random();
        List<String> list = new ArrayList<String>();
        list.add("It is certain");
        list.add("It is decidedly so");
        list.add("Without a doubt");
        list.add("Yes definitely");
        list.add("You may rely on it");
        list.add("As I see it, yes");
        list.add("Most likely");
        list.add("Outlook good");
        list.add("Yes");
        list.add("Signs point to yes");
        list.add("Reply hazy try again");
        list.add("Ask again later");
        list.add("Better not tell you now");
        list.add("Cannot predict now");
        list.add("Concentrate and ask again");
        list.add("Don't count on it");
        list.add("My reply is no");
        list.add("My sources say no");
        list.add("Outlook not so good");
        list.add("Very doubtful");

        System.out.println(question);
        System.out.println("MAGIC 8-BALL SAYS:");
        System.out.println(list.get(magic.nextInt(list.size())));
        System.out.println("Do you have another question for the Magic 8-ball? (y/n)");
        end = keyboard.nextLine();
        end = end.toLowerCase();
        if(end.equals("n")){
            break;
        }
    }
    keyboard.close();


    }
}
