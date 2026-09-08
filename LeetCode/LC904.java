import java.util.*;
public class LC904 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,2};
        int l=0;
        int r=arr.length-1;
        HashMap<Integer, Integer> map = new HashMap<>(2);
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            int n = map.size();
            while(n>2){
                map.put(arr[l], map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
                n = map.size();
            }
        }
        System.out.println(r-l+1);
    }
}

