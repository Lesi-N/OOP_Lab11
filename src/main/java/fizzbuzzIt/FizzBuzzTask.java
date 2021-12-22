package fizzbuzzIt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzTask {
    public List<String> fizzBuzzIt(int n){
        List<Integer> fizzlist = new ArrayList<>();
        for (int i = 1; i < n+1; i ++){
            fizzlist.add(i);
        }
        return fizzlist.stream().map(x -> {
            if (x % 3 == 0) {
                if (x % 5 == 0){
                    return "FizzBuzz";
                } else {
                    return "Fizz";
                }
            } else if (x % 5 == 0) {
                return "Buzz";
            } else {
                return x.toString();
            }
        }).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FizzBuzzTask fizzBuzzTask = new FizzBuzzTask();
        System.out.println(fizzBuzzTask.fizzBuzzIt(20));
    }
}
