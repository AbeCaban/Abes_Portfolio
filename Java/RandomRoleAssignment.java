// Abraham Caban Rios
// Randomly Assigning roles to Teammates. 
import java.util.*;

public class RandomRoleAssignment {
    public static void main(String[] args) {
        String a = "Release Manager";
        String b = "Developer 1";
        String c = "Developer 2";
        String d = "Developer 3";

        String[] names = {"abe", "bethany", "isaac", "oscar"};
        String[] roles = {a, b, c, d};

        List<String> roleList = Arrays.asList(roles);
        // List<String> nameList = Arrays.asList(names);
        
        Collections.shuffle(roleList);

        roleList.toArray(roles);


        // Print the assigned roles
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + roles[i]);
        }
    }


    
}
