public class TestListing{
    public static void main (String[] args){
        BatterListing[] batters = new BatterListing[5];
        
        batters[0] = new BatterListing("John", .356);
        batters[1] = new BatterListing("Brad", .301);
        batters[2] = new BatterListing("Steve", .289);
        batters[3] = new BatterListing("Trayce", .439);
        batters[4] = new BatterListing("Andrew", .358);
        
        for(int i = 0; i<batters.length; i++)
            System.out.println( batters[i]);
            
        mergeSort(batters, 0, batters.length - 1);
        
        for(int i = 0; i<batters.length; i++)
            System.out.println( batters[i]);
        
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
        int i = low, j = mid + 1, n = 0;
        
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
                temp[n] = a[i];
                i++;
            }
            else{
                temp[n] = a[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++){
            a[k] = temp[k-low];
        }
        
    }
}
