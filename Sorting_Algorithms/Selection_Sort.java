//Time complexity is : o(n^2).

public class Sorting{
  public static void main(String args[]){
   int a[] = {8,6,9,2,4,5};
   int size = a.length;
   int temp = 0;
   int minIndex = -1;
   System.out.println("Elements before sorting:");
   for(int num : a){
       System.out.print(num + " ");
   }
   for(int i=0;i<size-1;i++){
       minIndex = i;
       for(int j=i+1;j<size;j++){
           if(a[minIndex] > a[j]){
               minIndex = j;
           }
       }
       temp = a[minIndex];
       a[minIndex] = a[i];
       a[i] = temp;
       
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
