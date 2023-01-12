package Sort;
public class bubbleSort {
    public void sort(int ar[], int n){
        int temp;
        int i,j;
        for(i=0; i<n-1; i++){
            for(j=0; j<n-i-1; j++){
                if(ar[j] > ar[j+1]){
                    temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
    }
}
