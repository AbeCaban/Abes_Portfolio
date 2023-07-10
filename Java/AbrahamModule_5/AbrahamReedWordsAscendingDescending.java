package AbrahamModule_5;

/*Abraham Caban Rios 4/8/2023
 * Module 5
 * This is a test program that reads words from a text file and displays all non-duplicate words in ascending order and then in descending order.
 * The file is referenced in the program, not needing to be used as a command line reference.
 * 
 * OpenJDK. (2021, September 10). java.util.regex.Pattern. 
 * Retrieved from https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/regex/Pattern.html
*/




/* Steps to take in develpment of the program.

 * create a file with words and one duplicate
 * place the words in a a set so to remove the duplicate words
 * use LinkedHashSet so the words are in order
 * display the words from the LinkedHashSet
 * display the words from the LinkedHashSet in reverse order
 * add test code
 */


import java.io.*;
import java.util.*;


public class AbrahamReedWordsAscendingDescending 
{

    public static void main(String[] args) throws FileNotFoundException 
    {

        String file = "collection_of_words.txt";

        List<String> fileWords = new ArrayList<>();
        Set<String> firstNonDuplicateWords = new LinkedHashSet<>();
 

        try (Scanner scanner = new Scanner(new File(file))) 
        {
            while (scanner.hasNext()) 
            {
                String[] lineWords = scanner.next().split("\\W+");
                for (String word : lineWords) 
                {
                    fileWords.add(word);
                    firstNonDuplicateWords.add(word);
                }
            }
        }

        List<String> nonDuplicateWordsList = new ArrayList<>(firstNonDuplicateWords);
        Collections.sort(nonDuplicateWordsList);

        System.out.println("Non-duplicate words in the file in ascending order: ");
        for (String word : nonDuplicateWordsList) 
        {
            System.out.println(word);
        }

        System.out.println();

        System.out.println("Non-duplicate words in the file in descending order:");
        Collections.reverse(nonDuplicateWordsList);
        for (String word : nonDuplicateWordsList) 
        {
            System.out.println(word);
        }

        fileWords.clear();
        firstNonDuplicateWords.clear();


        //Test code

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("collection_of_words.txt"));

            writer.write("aone");
            writer.write("\nbtwo");
            writer.write("\ncthree");
            writer.write("\ndfour");
            writer.write("\nefive");
            writer.write("\nefive");

            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(new File(file))) 
        {
            while (scanner.hasNext()) 
            {
                String[] lineWords = scanner.next().split("\\W+");
                for (String word : lineWords) 
                {
                    fileWords.add(word);
                    firstNonDuplicateWords.add(word);
                }
            }
        }

        List<String> aNonDuplicateWordsList = new ArrayList<>(firstNonDuplicateWords);
        Collections.sort(aNonDuplicateWordsList);

        System.out.println("Non-duplicate words in the file in ascending order: ");
        for (String word : aNonDuplicateWordsList) 
        {
            System.out.println(word);
        }

        System.out.println();

        System.out.println("Non-duplicate words in the file in descending order:");
        Collections.reverse(aNonDuplicateWordsList);
        for (String word : aNonDuplicateWordsList) 
        {
            System.out.println(word);
        }

        try {
            BufferedWriter seconWriter = new BufferedWriter(new FileWriter("collection_of_words.txt"));

            seconWriter.write("test program that reads words from the file program");

            seconWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
}


