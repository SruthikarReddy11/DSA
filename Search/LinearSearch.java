public class Search{
    public static void main(String args[]){
        int a[] = {5,7,9,11,13};
        int target = 11;
        int result = LinearSearch(a,target);
        if(result != 1){
            System.out.println("Element found at index :"+ result);
        }else{
            System.out.println("Element not found.");
        }
    }
    public static int LinearSearch(int a[] , int target){
        for(int i=0;i<a.length;i++){
            if(a[i] == target){
                return i;
            }
        }
        return -1;
    }
}
