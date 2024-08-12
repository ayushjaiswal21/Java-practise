
public class my_java{
    public static int partition(int[]arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swaping
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }


    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    
    public static void main(String[] args){
        int n[]={5,6,4,7,9};
        quicksort(n,0,n.length-1);
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
} 