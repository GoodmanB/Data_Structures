import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Run_StructuresTest {

    @Test
    public void map()
    {
      Map hashmap = new LinkedHashMap();

        hashmap.put("Java",55);
        hashmap.put("Python",60);
        hashmap.put("C++",65);
        hashmap.put("Javascript",55);

        hashmap.remove(65);
        hashmap.clear();

        hashmap.put("HTML",55);
        hashmap.put("CSS",60);
        hashmap.put("JQuery",65);
        hashmap.put("C#",55);

        assertTrue(hashmap.containsValue(60));
        int result = 8+hashmap.size();
        assertEquals(12,result);
    }

    @Test
    public void set()
    {
        Set mySet = new HashSet();

        mySet.add("Java");
        mySet.add("Python");
        mySet.add("C++");
        mySet.add("Javascript");

        assertEquals(4,mySet.size());
        assertTrue(mySet.contains("Java"));
    }
    @Test
    public void list()
    {
        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("C++");
        myList.add("Javascript");

        myList.remove("Javascript");
        assertEquals(3,myList.size());
    }
    @Test
    public void collection()
    {
        Stack<String> stack =new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("Javascript");

        assertEquals(3,stack.lastIndexOf("Javascript"));
        System.out.println(stack);

    }
}