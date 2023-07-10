// public class Pokemon {
//     static String x = "Flame thrower";
//     public static void main(String[] args) {
//         Pokemon attack = new Pokemon();
//         System.out.println(attack.x);
//     }
// }
public class Pokemon {
    String name;
    int lvl;
    String type;

    Pokemon()// constructor
    {
        lvl = 1;
    }

    Pokemon(String pName, int pLvl)// constructor
    {
        name = pName;
        lvl = pLvl;
    }

    void attack()// method
    {
        System.out.println(name + " attack!");
    }
    
}
    