
public class SearchAlgo {

    static int lsearch(int[] a,int key){
        
        for (int i = 0; i < a.length; i++) {
            if(a[i]==key)
            return i;    
        }
        return -1;
    }

    static int bsearch(int[] a,int key,int l,int r){
        
        if(r>=l){
            int mid = (l+(r-l))/2;
            if(a[mid]==key)
            return mid;
            if(a[mid]>key)
            return bsearch(a,key,l,mid-1);
            else
            return bsearch(a,key,mid+1,r);
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7}; 
        int key=6;
        int n= arr.length;
        int lsearchResult = lsearch(arr,key);

        if (lsearchResult==-1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found!");
        }

        int bsearchResult = bsearch(arr,key,0,n-1);

        if (bsearchResult==-1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found!");
        }

    }
    
}
