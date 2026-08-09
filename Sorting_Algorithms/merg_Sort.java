//Time complexity of merg sort is : O(n logn).
//Space complexity of merg sort is : O(n).

public class Sorting{
    public static void main(String args[]){
        int arr[] = {5,2,6,4,1,3};
        System.out.println("Before Sorting :");
        for(int a : arr){
            System.out.print(a+" ");
        }
        mergsort(arr,0,arr.length-1);
        
        System.out.println();
        System.out.println("After Sorting :");
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
    public static void mergsort(int arr[] , int l , int r){
        if(l<r){
            int mid = (l+r)/2;
            mergsort(arr,l,mid);
            mergsort(arr,mid+1,r);
            merg(arr,l,mid,r);
        }
    }
    public static void merg(int arr[],int l,int mid , int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];
        
        for(int x=0;x<n1;x++){
            lArr[x] = arr[l+x];
        }
        for(int x=0;x<n2;x++){
            rArr[x] = arr[mid+1+x];
        }
        int i = 0; int j = 0;
        int k = l;
        while(i<n1 && j<n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }else{
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
}
