/**
*Bubble sort works as it takes in an array,
*than swaps the items with in it.
*It comapares the item adjacent to one another.
*Than swap them if they are in a wrong order. 
*/
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