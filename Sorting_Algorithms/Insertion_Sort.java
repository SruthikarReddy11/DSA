//Time complexity of Insertion sort is : O(n).
//Space complexity of Insertion sort is : O(1).


public class Binary{
  public static void main(String args[]){
   int arr[] = {5,2,6,4,1,3};
   System.out.println("Elements Before Sorting :");
   for(int a : arr){
       System.out.print(a + " ");
   }
   
   for(int i=1;i<arr.length;i++){
       int key = arr[i];
       int j = i - 1;
       
       while(j >= 0 && arr[j] > key){
           arr[j+1] = arr[j];
           j--;
       }
       arr[j+1] = key;
          System.out.println();
       for(int a : arr){
       System.out.print(a + " ");
   }
   }
   System.out.println();
   System.out.println("Elements After Sorting");
   for(int a : arr){
       System.out.print(a + " ");
   }
  }
}
