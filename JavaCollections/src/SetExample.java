import java.util.*;

public class SetExample {
    public static void main(String args[]){
        //create a new set
        HashSet<String> westernStates = new HashSet<String>();

        westernStates.add("Arizona");
        westernStates.add("California");
        westernStates.add("Oregon");
        westernStates.add("Utah");
        westernStates.add("New Mexico");
        westernStates.add("Nevada");
        westernStates.add("Colorado");
        westernStates.add("Montana");
        westernStates.add("Idaho");
        westernStates.add("Washington");
        westernStates.add("Wyoming");

        System.out.println(
                "\nSets store only one copy of an item in that set."+
                        westernStates);

        //Add duplicate item.
        westernStates.add("Washington");
        System.out.println(
                "\nWashington is not added again." +
                        "\n\twesternStates.add(\"Washington\");\n" +
                        westernStates);

        //Add all items in westernStates to new LinkedHashSet
        LinkedHashSet<String> westernStatesLinkedSet = new LinkedHashSet<String>();

        for(String state : westernStates){
            westernStatesLinkedSet.add(state);
        }

        System.out.println(
                "\nLinkedHashSets will retain postions.\n" +
                        westernStatesLinkedSet);

        //New TreeSet
        TreeSet<String> westernStatesTreeSet = new TreeSet<String>();

        //Add all items in westernStates to new TreeSet
        for (String state : westernStates){
            westernStatesTreeSet.add(state);
        }
        System.out.println(
                "\nA Tree Set is sorted alphabetically.\n" +
                        westernStatesTreeSet);

        //Create new set of states in the Mountain Time Zone
        HashSet<String> mountainTimeZone = new HashSet<String>();

        mountainTimeZone.add("Arizona");
        mountainTimeZone.add("Utah");
        mountainTimeZone.add("Colorado");
        mountainTimeZone.add("Montana");
        mountainTimeZone.add("Idaho");
        mountainTimeZone.add("Wyoming");
        mountainTimeZone.add("New Mexico");

        System.out.println(
                "\nMountain Time Zone States:\n" +
                        mountainTimeZone);

        HashSet<String> pacificTimeZone = new HashSet<String>();

        pacificTimeZone.add("California");
        pacificTimeZone.add("Oregon");
        pacificTimeZone.add("Washington");
        pacificTimeZone.add("Idaho");

        System.out.println(
                "\nPacfic Time Zone States:\n" +
                        pacificTimeZone);


        //Check for states that are in both time zones
        HashSet<String> intersecting = new HashSet<String>(pacificTimeZone);

        //Keep states that are in both time zones
        intersecting.retainAll(mountainTimeZone);

        System.out.println(
                "\nState in both time zones:\n" +
                        intersecting);

        //Check for states that are in both time zones
        HashSet<String> difference = new HashSet<String>(westernStates);

        //Keep states that are in both time zones
        difference.removeAll(intersecting);

        System.out.println(
                "\nStates that are not in both time zones:\n" +
                        difference);
    }
}