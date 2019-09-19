public class BubbleSort implements SortingAlgorithm
{
    public void sort(int [] a)
    {
	   int x = a.length;  
        int temp = 0;  
        for(int i=0; i < x; i++)
        {
    	   for(int y=1; y < (x-i); y++)
            {
    		  if(a[y-1] > a[y]){
                temp = a[y-1];
    			a[y-1] = a[y];
                a[y] = temp;
    		  }
    	   }
        }
    }
}