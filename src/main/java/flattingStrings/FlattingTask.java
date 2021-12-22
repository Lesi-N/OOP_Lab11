package flattingStrings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattingTask {
    public List<String> flattingStrings(List<String> arr){
        return arr.stream().flatMap(x -> Arrays.stream(x.split(""))).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FlattingTask flattingTask = new FlattingTask();
        List<String> testList = Arrays.asList("abc", "def", "ghj");
        System.out.println(flattingTask.flattingStrings(testList));
    }
}
