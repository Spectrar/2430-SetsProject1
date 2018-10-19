//Brandon Robinson
//CSIS 2430 402
import java.util.HashMap;

public class FuzzySets {
    //Method Set Union().
    public static HashMap setUnion(HashMap a, HashMap b) {

        //Create a new instance.
        HashMap temporary = new HashMap(a);

        //Add to temporary set.
        for (Object tempB : b.keySet()) {
            if (!temporary.containsKey(tempB)) {
                temporary.put(tempB, b.get(tempB));
            }else{
                if((double)b.get(tempB)>(double)a.get(tempB)){
                    temporary.replace(tempB, temporary.get(tempB), b.get(tempB));
                }
            }


        }

        //Return the values of temporary set.
        return temporary;
    }

    //Method Set Intersection().
    public static HashMap setIntersection(HashMap a, HashMap b) {

        //Create a new instance.
        HashMap temporary = new HashMap();


        //For loop to iterate through setA.
        for (Object tempB : b.keySet()) {
            if (a.containsKey(tempB)) {
                if((double)b.get(tempB)<(double)a.get(tempB)){
                    temporary.put(tempB, b.get(tempB));
                }else{
                    temporary.put(tempB, a.get(tempB));
                }
            }


        }

        //Return the values of temporary set.
        return temporary;
    }

    //Method Set Complement
    public static HashMap setComplement(HashMap a){
        //Create a new instance.
        HashMap temporary = new HashMap();


        //For loop to iterate through setA.
        for (Object tempA : a.keySet()) {
            temporary.put(tempA, 1-(double)a.get(tempA));
        }

        //Return the values of temporary set.
        return temporary;
    }





}
