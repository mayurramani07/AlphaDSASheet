package LOGICBUILDING1;

public class RemoveDuplicatedFromArray2 {
    public static int RemoveDuplicates(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }
        int k = 0;
        for(int i=0 ; i< arr.length ; i++) {
            if(k < 2 || arr[i] != arr[k-2]) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}
