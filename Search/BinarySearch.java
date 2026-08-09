// Time Complexity of Linear Search : O(1)


public class Binary{
  public static void main(String args[]){
    int a[] = {5,7,9,11,13};
    int target = 5;
    int result = BinarySearch(a,target);
    if(result != 1){
      System.out.println("Elament is fount at index : " + result);
    }
    else{
      System.out.println("Element is not found.");
    }
  }
  public static int BinarySearch(int a[] , int target){
    int left = 0;
    int right = a.length - 1;
    while(left <= right){
      int mid = (left + right)/2;
      if(a[mid] == target){
        return mid;
      }
      else if(a[mid] < target){
        left = mid + 1;
      }
      else{
        right = mid - 1;
      }
    }
    return -1;
  }
}
