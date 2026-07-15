import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "HELLO";

        Map<Character,Integer> map=new HashMap<>();
        //map.getOrDefault()
        for(char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0 )+ 1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());

        }
    }
}
