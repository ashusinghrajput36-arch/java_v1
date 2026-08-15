package sorting;

public class selection_sort {
    static void selection_sort(int []arr){
        int n= arr.length;
        for (int i=0;i<n-1;i++){
            int minindex=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
    }public static void main(String[] args) {
        int arr[]={6,4,7,2,76,90};
        selection_sort(arr);
        System.out.println("printing the array: ");
        for (int value:arr){
            System.out.println(value  +" "   );
        }
    }
}
