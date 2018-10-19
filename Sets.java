//Brandon Robinson
//CSIS 2430 402
import java.util.*;

//Class.
public class Sets
{

    //Method Set Union().
    public static ArrayList setUnion(ArrayList a, ArrayList b)
    {

        //Create a new instance.
        ArrayList temporary = new ArrayList(a);

        //Add to temporary set.
        for (Object tempB: b){
             if(!temporary.contains(tempB)){
                 temporary.add(tempB);
             }

        }

        //Return the values of temporary set.
        return temporary;
    }

    //Method Set Intersection().
    public static ArrayList setIntersection(ArrayList a, ArrayList b)
    {

        //Create a new instance.
        ArrayList temporary = new ArrayList();


        //For loop to iterate through setA.
        for ( Object tempA : a)
        {

            //Condition Check.
            if (b.contains(tempA))
            {

                //On success, add the value to temporary set.
                temporary.add(tempA);

            }
        }

        //Return the values of temporary set.
        return temporary;
    }

    //Method Set difference().
    public static ArrayList setDifference(ArrayList a, ArrayList b)
    {

        //Create a new instance.
        ArrayList temporary = new ArrayList();
        temporary.addAll(a);
        //Remove values of B.
        temporary.removeAll(b);

        //Return the values of temporary set.
        return temporary;
    }

    //Method Set Symdifference().
    public static ArrayList setSymdifference(ArrayList a, ArrayList b)
    {

        //Create a new instance.
        ArrayList tempA;
        ArrayList tempB;

        //Set function call values to tempA and tempB.
        tempA = setUnion(a, b);
        tempB = setIntersection(a, b);



        //Return the set symmetric difference.
        return setDifference(tempA, tempB);
    }

    //Method Set Complement
    public static ArrayList setComplement(ArrayList a, ArrayList b)
    {
        //Create a new instance.
        ArrayList temporary = new ArrayList();
        temporary.addAll(b);
        //Remove values of A.
        temporary.removeAll(a);

        //Return the values of temporary set.
        return temporary;
    }




}
