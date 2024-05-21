import java.util.*;

public class oneToHundRecursive {
    public static void main(String[] args) {
        int sum = recursive(100);
        System.out.println(sum);
    }

    public static int recursive(int n){
        if(n==1){
            return 1;
        }else{
            return n + recursive(n-1);
        }
    }
}
