//Brandon Robinson
//CSIS 2430 402
import java.util.HashMap;

public class MultiSets {

    //Method Set Union().
    public static HashMap setUnion(HashMap a, HashMap b) {

        //Create a new instance.
        HashMap temporary = new HashMap(a);

        //Add to temporary set.
        for (Object tempB : b.keySet()) {
            if (!temporary.containsKey(tempB)) {
                temporary.put(tempB, b.get(tempB));
            }else{
                if((int)b.get(tempB)>(int)a.get(tempB)){
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
                if((int)b.get(tempB)<(int)a.get(tempB)){
                    temporary.put(tempB, b.get(tempB));
                }else{
                    temporary.put(tempB, a.get(tempB));
                }
            }


        }

        //Return the values of temporary set.
        return temporary;
    }

    //Method Set difference().
    public static HashMap setDifference(HashMap a, HashMap b) {

        //Create a new instance.
        HashMap temporary = new HashMap();
        temporary.putAll(a);
        //Remove values of B.
        for (Object tempB : b.keySet()) {

            //Condition Check.
            if (temporary.containsKey(tempB)) {

                //On success, add the value to temporary set.
                temporary.replace(tempB,temporary.get(tempB),(int)temporary.get(tempB)-(int)b.get(tempB));
                if((int)temporary.get(tempB)<=0){
                    temporary.remove(tempB);
                }
            }
        }

        //Return the values of temporary set.
        return temporary;
    }

    //Method Set set Symdifference().
    public static HashMap setAddition(HashMap a, HashMap b) {

        //Create a new instance.
        HashMap temporary = new HashMap();
        temporary.putAll(a);
        //Remove values of B.
        for (Object tempB : b.keySet()) {

            //Condition Check.
            if (temporary.containsKey(tempB)) {

                //On success, add the value to temporary set.
                temporary.replace(tempB,temporary.get(tempB),(int)temporary.get(tempB)+(int)b.get(tempB));

            }else{
                temporary.put(tempB,b.get(tempB));
            }
        }

        //Return the values of temporary set.
        return temporary;
    }



}
