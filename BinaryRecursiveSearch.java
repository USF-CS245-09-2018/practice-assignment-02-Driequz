public class BinaryRecursiveSearch implements Practice2Search {
@Override

public String searchName() 
{
	return "BinaryRecursiveSearch";
}

public int search(int array[], int target) 
{
	{
		return binsearch(array,target,0,array.length-1);
	}
}

public int binsearch(int n[], int target, int low, int upper)
{
	if(low < upper) 
	{
		return -1;
	}
	
	int mid = (low + upper) /2;
	
	if(n[mid] == target) 
	{
		return mid;
		
	} else if (target < n[mid]) 
		
	{
		return binsearch(n,target,low,mid-1);
	}else 
		
	{
		return binsearch(n,target, mid+1, upper);
		
	}
}

}
