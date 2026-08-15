package sorting;
// bubble sort
public class bubble_sort {
    static  void bubble_sort(int[]arr){
        int n= arr.length;
        for (int i=0;i<n-1;i++){//rounds
            for (int j=0;j<n-1;j++){ //elements compare
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr [j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[]={6,4,7,2};
        bubble_sort(arr);
        System.out.println("printing the array: ");
        for (int value:arr){
            System.out.println(value  +" "   );
        }
    }
}
