/*
Name: Oscar Boateng Acheampong
Date: April 9th 2023
Assignment No.: Module 5 Programming Assignment - Sets and Maps
Description:

Comments:
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Assignment5 {
    public static void main(String[] args) {
        File file = new File("src/collection_of_words.txt");

        // Use a TreeSet to automatically remove duplicates and sort the words
        var words = new TreeSet<String>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                words.add(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
            return;
        }

        // Display the words in ascending order
        System.out.println("Words in ascending order:");
        for (String word : words) {
            System.out.println(word);
        }

        // Display the words in descending order
        System.out.println("\nWords in descending order:");
        Set<String> descendingWords = words.descendingSet();
        for (String word : descendingWords) {
            System.out.println(word);
        }
    }
}