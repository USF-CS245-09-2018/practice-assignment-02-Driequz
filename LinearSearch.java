public class LinearSearch implements Practice2Search{
	@Override
	
	public int search(int n[], int target)
	{
	 for(int i = 0; i < n.length; i++)
	 {
		 if(n[i] == target)
		 {
			 return i;
		 }
		 
	 }
	 	return -1;
	}

	public String searchName()
	{
		return "LinearSearch";
	}
}
