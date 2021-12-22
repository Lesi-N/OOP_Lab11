package mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public List<Integer> mapping(List<String> beforeList){
        return beforeList.stream().filter(x -> x.matches("\\d+")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        MapTask mapTask = new MapTask();
        List<String> testList = Arrays.asList("1", "2", "a", "3");
        System.out.println(mapTask.mapping(testList));
    }
}
