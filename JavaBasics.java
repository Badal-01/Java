import java.util.*;
public class JavaBasics {

    public static int binarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while(start<=end){
            int m = (start + end)/2;
            if(arr[m] == key){
                index = m;
                break;
            }
            else if(arr[m] > key){
                end = m - 1;
            }
            else if(arr[m] < key){
                start = m + 1;
            }
        }
        return index ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        int res = binarySearch(arr,element);
        System.out.println(res);
    }
}