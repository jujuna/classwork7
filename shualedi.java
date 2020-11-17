import java.util.ArrayList;
import java.util.Random;

public class shualedi {
    public static int index_count(){
        Random rn = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<=100; i++){
            int r=rn.nextInt(100);
            arr.add(r);
        }
        int count=0;
        for (int i=0; i<=arr.size()-1; i++){
            if(arr.get(i)>i){
                count+=1;
            }
        }
        System.out.println(count);
        return 1;
    }
}
