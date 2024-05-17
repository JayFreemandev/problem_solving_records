import java.util.ArrayList;
import java.util.Collections;

public class Max_Min {
    public static void main(String[] args) {
        String str = "1 2 3 4";
        System.out.println(solution(str));
    }

    public static String solution(String s) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        String[] stringArray = s.split(" ");

        for(int i=0; i < stringArray.length; i++) {
            arrayList.add(Integer.parseInt(stringArray[i]));
        }

        return ""+Collections.min(arrayList)+" "+ Collections.max(arrayList);
    }
}
