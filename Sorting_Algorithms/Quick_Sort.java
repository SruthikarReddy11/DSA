//Time complexity of Quick Sort is : o(n log n);
//because we are partitioning the array for that  (log n).


public class Sorting{
    public static void main(String args[]){
        int arr[] = {5,3,1,4,2,6};
        System.out.println("Elements Before sorting:");
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("Elements After sorting:");
        quickSort(arr, 0 , arr.length-1);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void quickSort(int arr[] , int low, int high){
        if(low<high){
        int pi = partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
        }
    }
    private static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int temp = 0;
        int i = low - 1;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
