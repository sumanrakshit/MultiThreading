import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFormatString {
    public static void main(String[] args) {
        String str="abbaca";
        Map<Character,Integer> countMap=new LinkedHashMap<>();
        StringBuilder sb=new StringBuilder();
        for(char c:str.toCharArray())
        {
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:countMap.entrySet())
        {
           sb.append(entry.getValue()).append(entry.getKey());
        }
        System.out.println(sb.toString());

    }
}
