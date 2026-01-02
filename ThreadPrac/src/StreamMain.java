import java.io.InputStream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMain {
    public static void main(String[] args) {
//        2,3,6,11,18,27
//        int res=2;
//        for(int i=0;i<7;i++)
//        {
//            System.out.println(res);
//            res +=2*i + 1;
//
//        }

//        int[]res={2};
//        int[]i={0};
//
//        IntStream.range(0,7).map(n->
//        {
//            int current=res[0];
//            res[0] +=2*i[0]+1;
//            i[0]++;
//            return current;
//        }).forEach(n-> System.out.println(n));


        String str="aaaabbsssccccddd";
        Map<Character,Long>  charCount=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCount);
        List<Long> countsDesc =charCount.values().stream().sorted(Comparator.reverseOrder()).distinct().toList();

        if (countsDesc.size() < 2) {
            System.out.println("No second most frequent character.");
            return;
        }

        long secondHighestCount = countsDesc.get(1);
        System.out.println(secondHighestCount);

        // Get all characters with the second highest count (distinct keys)
        List<Character> secondMostFreqChars = charCount.entrySet().stream()
                .filter(entry -> entry.getValue() == secondHighestCount)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Second most frequent character(s): " + secondMostFreqChars);
    }





}
