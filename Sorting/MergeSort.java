import java.io.*;

class GFG {
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }
    static void merge(int l[],int r[],int arr[]){
        int nl=l.length;
        int nr=r.length;
        int i=0,j=0,k=0;
        while(i<nl && j<nr)
        {
            if(l[i]<=r[j])
            {
                arr[k++]=l[i++];
            }
            else
            {
                arr[k++]=r[j++];
            }
        }
        while(i<nl){
            arr[k++]=l[i++];
        }
        
        while(j<nr){
            arr[k++]=r[j++];
        }
    }
    
    static void sort(int arr[]){
        int n=arr.length;
        if(n<2)
        {
            System.out.println("end reached");
            return;
        }
        else{
            System.out.println("");
            int mid=n/2;
            int l[]=new int[mid];
            int r[]=new int[n-mid];
            int x;
            for(x=0;x<mid;x++)
            {
                System.out.println(arr[x]);
                l[x]=arr[x];
            }
            for(x=mid;x<n;x++)
            {
                System.out.println(arr[x]);
                r[x-mid]=arr[x];
            }
            sort(l);
            sort(r);
            merge(l,r,arr);
        }
    }
	public static void main (String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7,99 }; 
        System.out.println("Given Array");
        printArray(arr);
        sort(arr);
        System.out.println("After sorting");
        printArray(arr);
        
	}
}