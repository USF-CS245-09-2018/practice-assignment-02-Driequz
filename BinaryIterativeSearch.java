public class BinaryIterativeSearch implements Practice2Search {
	@Override
	public int search(int n[], int target)
	{
		int low = 0;
		int upper = n.length - 1;
		
		while (low < upper)
		{
			int mid = (low + upper) / 2;
			
			if(n[mid] == target)
			{
				return mid;
			} else if (n[mid] < target)
			{
				low = mid+1;
			} else
			{
				upper = mid -1;
			}
		}
			return -1;
	}

	public String searchName()
	{
		return "BinaryIterativeSearch";
	}
}
