/**
*Selection Sort works by taking in an array
*Than repeatily locating the lowest number and put 
*it the front. This should result in a sort in
*acending order.
*/
public class SelectionSort implements SortingAlgorithm
{
	public void sort(int [] a)
	{
       for (int i = 0; i < a.length - 1; i++)  
        {  
            int index = i;  
            for (int x = i + 1; x < a.length; x++)
            {  
                if (a[x] < a[index])
                {  
                    index = x;  
                }  
            }  
            int lesser = a[index];   
            a[index] = a[i];  
            a[i] = lesser;  
        }
	}
}