
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Simon Furry
 */
import java.util.Scanner;

public class Solution04 {
    /*
    Create a simple mad-lib program that:
    Prompts user for...
    Noun, Verb, Adjective, and Adverb.
    "Do you "verb" your "adjective" "noun" "adverb"? That's hilarious!"
     */

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
        String UserNoun = in.nextLine();

        System.out.print("Enter a verb: ");
        String UserVerb = in.nextLine();

        System.out.print("Enter an adjective: ");
        String UserAdjective = in.nextLine();

        System.out.print("Enter an adverb: ");
        String UserAdverb = in.nextLine();

        System.out.print("Do you " + UserVerb + " your " + UserNoun + " " + UserAdjective + " " + UserAdverb + "? That's hilarious!");
    }

}
