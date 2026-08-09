//Time Complexity for Bubble Sort is : O(n^2).


public class Binary{
  public static void main(String args[]){
   int a[] = {8,6,9,2,4,5};
   int size = a.length;
   int temp = 0;
   System.out.println("Elements before sorting:");
   for(int num : a){
       System.out.print(num + " ");
   }
   for(int i=0;i<size;i++){
       for(int j=0;j<size-i-1;j++){ //We are using j<size-i-1 , because we dont want to repeat the sorted iterations.
           if(a[j] > a[j+1]){
               temp = a[j];
               a[j] = a[j+1];
               a[j+1] = temp;
           }
       }
       System.out.println();
       for(int num : a){
       System.out.print(num + " ");
   }
   }
   System.out.println();
   System.out.println("Elements after sorting:");
   for(int num : a){
       System.out.print(num + " ");
   }
  }
}
