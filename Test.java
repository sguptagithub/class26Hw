package class26Hw;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Person> personMap = new TreeMap<>();
        personMap.put(1, new Person("Mary", "Jones", 30, 30000.0));
        personMap.put(2, new Person("paula", "Williams", 20, 40000.00));
        personMap.put(3, new Person("Debie", "Johnson", 55, 26000.00));
        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            int personId = entry.getKey();
            Person person = entry.getValue();
            System.out.println("Person ID " + personId);
            person.printDetails();
        }
    }
}
