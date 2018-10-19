//Brandon Robinson
//CSIS 2430 402

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AppRun {
    public static void main(String[] args) {
        //Basic sets setup
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);

        ArrayList<Integer> b1 = new ArrayList<Integer>();
        b1.add(4);
        b1.add(5);
        b1.add(6);
        b1.add(7);
        b1.add(8);
        //Multi sets setup
        HashMap a2 = new HashMap();
        a2.put("bird", 3);
        a2.put("dog", 1);
        a2.put("cat", 5);
        a2.put("lizard", 6);
        a2.put("gerbil", 1);

        HashMap b2 = new HashMap();
        b2.put("bird", 6);
        b2.put("dog", 3);
        b2.put("cat", 2);
        b2.put("lizard", 5);
        b2.put("gerbil", 2);
        //Fuzzy sets setup
        HashMap a3 = new HashMap();
        a3.put("bird", 0.3);
        a3.put("dog", 0.1);
        a3.put("cat", 0.5);
        a3.put("lizard", 0.6);
        a3.put("gerbil", 0.1);

        HashMap b3 = new HashMap();
        b3.put("bird", 0.6);
        b3.put("dog", 0.3);
        b3.put("cat", 0.2);
        b3.put("lizard", 0.5);
        b3.put("gerbil", 0.2);

        Sets mySets = new Sets();
        MultiSets myMulti = new MultiSets();
        FuzzySets myFuzzy = new FuzzySets();

        //Output.
        System.out.println("Project Question 1 Basic Sets:\n");
        System.out.println("A: contents are:" + Arrays.toString(a1.toArray()));
        System.out.println("B: contents are: " + Arrays.toString(b1.toArray()));
        System.out.println("Complement of A: " + Arrays.toString(mySets.setComplement(a1, b1).toArray()));
        System.out.println("Union: " + Arrays.toString(mySets.setUnion(a1, b1).toArray()));
        System.out.println("Intersection: " + Arrays.toString(mySets.setIntersection(a1, b1).toArray()));
        System.out.println("Difference (A - B): " + Arrays.toString(mySets.setDifference(a1, b1).toArray()));
        System.out.println("Symmetric Difference: " + Arrays.toString(mySets.setSymdifference(a1, b1).toArray()));

        System.out.println();
        System.out.println();

        System.out.println("Project Question 2 Multi Sets:\n");
        System.out.println("A: contents are:" + a2);
        System.out.println("B: contents are: " + b2);
        System.out.println("Union: " + myMulti.setUnion(a2, b2));
        System.out.println("Intersection: " + myMulti.setIntersection(a2, b2));
        System.out.println("Difference (A - B): " + myMulti.setDifference(a2, b2));
        System.out.println("Addition (A + B): " + myMulti.setAddition(a2, b2));

        System.out.println();
        System.out.println();

        System.out.println("Project Question 3 Fuzzy Sets:\n");
        System.out.println("A: contents are:" + a3);
        System.out.println("B: contents are: " + b3);
        System.out.println("Complement of A: " + myFuzzy.setComplement(a3));
        System.out.println("Union: " + myFuzzy.setUnion(a3, b3));
        System.out.println("Intersection: " + myFuzzy.setIntersection(a3, b3));
    }
}
