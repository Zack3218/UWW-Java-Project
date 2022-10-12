public class TestListing{
    public static void main (String[] args){
        
    }
    
    public static void mergeSort(BatterListing[] a, int low, int high){
        if (low == high){
            return;
        }
        
        int mid = (low + high) / 2;
        mergeSort(a, low, mid);
        mergeSort(a,mid + 1, high);
        merge(a,low,mid,high);
    }
    
    public static void merge( BatterListing[] a, int low, int mid, int high){
        BatterListing[] temp = new BatterListing[high-low+1];
        int i = low, j = mid, n = 0;
        
        while(i <= mid || j <= high){
            if(i>mid){
                temp[n] = a[j];
                j++;
            }
            else if(j>high){
                temp[n] = a[i];
                i++;
            }
            else if(a[i].getAverage() < a[j].getAverage()){
                temp[n] = a[j];
                j++;
            }
            else{
                temp[n] = a[j];
                j++;
            }
            n++;
        }
        
    }
}
