// Abraham Caban Rios
// Randomly Assigning roles to Teammates. 
import java.util.*;

public class RandomRoleAssignment {
    public static void main(String[] args) {
        String a = "Release Manager";
        String b = "Developer 1";
        String c = "Developer 2";
        String d = "Developer 3";

        String[] names = {"student1", "studenbt2", "student3", "studebnt4"};
        String[] roles = {a, b, c, d};

        List<String> roleList = Arrays.asList(roles);
        // List<String> nameList = Arrays.asList(names);
        
        Collections.shuffle(roleList);

        roleList.toArray(roles);

        System.out.println(" ");

        // Print the assigned roles
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + roles[i]);
        }
        System.out.println(" ");

    }
}
/*Here's a detailed explanation of each line of the provided code:

1. `import java.util.*;`: This line imports all classes from the `java.util` package, 
    which includes utility classes for collections, such as `List` and `Arrays`.

3. `public class RandomRoleAssignment {`: This line begins the declaration of a public 
    class named `RandomRoleAssignment`, which serves as the entry point of the program.

4. `public static void main(String[] args) {`: This line defines the `main` method, 
    which is the starting point of execution for the program. It takes an array of `String` 
    arguments (`args`) as input.

6. `String a = "Release Manager";`: This line declares a variable `a` of type `String` 
    and assigns it the value `"Release Manager"`.

7. `String b = "Developer 1";`: This line declares a variable `b` of type `String` 
    and assigns it the value `"Developer 1"`.

8. `String c = "Developer 2";`: This line declares a variable `c` of type `String` 
    and assigns it the value `"Developer 2"`.

9. `String d = "Developer 3";`: This line declares a variable `d` of type `String` 
    and assigns it the value `"Developer 3"`.

11. `String[] names = {"abe", "bethany", "isaac", "oscar"};`: This line declares 
    an array variable `names` of type `String[]` and initializes it with 
    four elements: `"abe"`, `"bethany"`, `"isaac"`, and `"oscar"`.

12. `String[] roles = {a, b, c, d};`: This line declares an array variable `roles` of type 
    `String[]` and initializes it with the values of variables `a`, `b`, `c`, and `d`. It creates 
    an array that represents the roles assigned to each person.

14. `List<String> roleList = Arrays.asList(roles);`: This line creates a new `List` 
    object called `roleList` that contains the elements of the `roles` array. It uses 
    the `Arrays.asList` method to convert the array into a `List`.

16. `Collections.shuffle(roleList);`: This line shuffles the elements of the `roleList` 
    using the `shuffle` method from the `Collections` class. This randomizes the order of the roles in the list.

18. `roleList.toArray(roles);`: This line converts the `roleList` back into an array, 
    overwriting the original `roles` array with the shuffled values. The `toArray` method 
    takes the destination array (`roles`) as a parameter.

20. `System.out.println(" ");`: This line prints an empty line to the console. 
    It is used to create a visual separation between different parts of the output.

23-26. This block of code is a loop that iterates over the `names` array. 
    It starts from `i = 0` and continues as long as `i` is less than the length of the `names` 
    array. In each iteration, it prints the name from the `names` array at index `i`, followed 
    by a colon and a space, and then the corresponding role from the `roles` array at index `i`.

28. `System.out.println(" ");`: This line prints an empty line to the console after 
    printing all the assigned roles. It provides a visual separation between the output of 
    the loop and any subsequent output.

30. `}`: This line closes the `main` method.

32. `}`: This line closes the `RandomRoleAssignment` class. */