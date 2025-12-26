import java.util.*;

public class UniquePairs {

    public static List<List<Integer>> twoSumUniquePairs(int[] nums, int target)
    {
        Set<Integer> seen=new HashSet<>();
        Set<String> usedPair=new HashSet<>();
        List<List<Integer>> result=new ArrayList<>();
        for(int num:nums)
        {
            int compliment=target-num;
            if(seen.contains(compliment))
            {
                int a=Math.min(num,compliment);
                int b=Math.max(num,compliment);
                String key=a +"," +b;
                if(!usedPair.contains(key))
                {
                    result.add( Arrays.asList(a,b));
//                    usedPair.add(key);
                }

            }
            seen.add(num);
        }
        return  result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 3};
        int target = 5;
        List<List<Integer>> pairs = twoSumUniquePairs(nums, target);
        System.out.println(pairs);

    }
}
