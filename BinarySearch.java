package mobile;

public class BinarySearch {
	public static void main (String[] args)
	{
		int [] search = {1,2,4,5,6,8,9,11,13};
		int number = 11;
		System.out.println(number);
		int start=0,end = search.length-1,mid=0;
		while(start <= end)
		{
			mid = (start+end)/2;
			if(search[mid] > number)
			{
				end = mid-1;
			}
			else if(search[mid] < number)
			{
				start = mid+1;
			}
			else
				break;
			
		}
		
		System.out.println(search[mid]);
	}

}
