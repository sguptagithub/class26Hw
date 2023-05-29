package class26Hw;

import java.util.LinkedHashSet;

public class StringCollection {
    /*
    Create the collection that will store single uniques
    Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {
        LinkedHashSet<String> stringSet = new LinkedHashSet<>();

        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("OpenAI");
        stringSet.add("Java");
        stringSet.add("Example");

        StringBuilder sb = new StringBuilder();
        for (String str : stringSet) {
            sb.append(str);
        }
        String concatenatedString = sb.toString();

        System.out.println(concatenatedString);
    }

}
