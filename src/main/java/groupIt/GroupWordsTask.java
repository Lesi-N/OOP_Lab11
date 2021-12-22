package groupIt;

import java.util.*;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Map<Character, Integer> groupIt(List<String> seq){
        Map<Character, List<String>> groups = seq.stream()
                                                    .collect(Collectors
                                                    .groupingBy(x -> x.charAt(0), HashMap::new,  Collectors.toList()));
        List<Map.Entry<Character, List<String>>> maplist = new ArrayList<>(groups.entrySet());
        return maplist.stream().collect(Collectors.toMap(Map.Entry::getKey, GroupWordsTask::countChars));
    }

    public static int countChars(Map.Entry<Character, List<String>> letter){
        int count = 0;
        List<String> groupels = letter.getValue();
        for (String seq : groupels) {
            for (int j = 0; j < seq.length(); j++) {
                if (seq.charAt(j) == letter.getKey()) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> testList = Arrays.asList("ABCA", "BCD", "ABC");
        System.out.println(groupIt(testList));
    }
}
