package one;

/**
 * Created at 2023-09-16
 * Site ->
 * Link ->
 * Level ->
 * Topic ->
 */
public class BubbleSort {

    public int[] sort(int[] a, int size){
        for(int i=1; i<size; i++){

            for(int j=0; j<size-i; j++){
                if(a[j] > a[j+1]){
                    this.swap(a, j, j+1);
                }
            }

        }

        return a;
    }

    private void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
