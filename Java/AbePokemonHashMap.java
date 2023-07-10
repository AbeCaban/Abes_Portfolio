
import java.util.*;

public class AbePokemonHashMap {
    public static void main(String[] args) {
           Map<String, Integer> pokemonID = new LinkedHashMap<>();

    pokemonID.put("Balbasour", 1);
    pokemonID.put("Ivysour", 2);
    pokemonID.put("Venasour", 3);
    pokemonID.put("Squirtle", 4);
    pokemonID.put("Wartoutle", 5);
    pokemonID.put("Blastoise", 6);

    System.out.println(pokemonID);

    System.out.println(pokemonID.get("Balbasour"));
    System.out.println(pokemonID.containsKey("Ivysour"));
    System.out.println(pokemonID.containsKey("Wartoutle"));
    System.out.println(pokemonID.containsValue(8));
    pokemonID.put("Charmander", 7);
    System.out.println(pokemonID);
    // pokemonID. 
    }
}

