package mobile;

public class bubblesort {
	public static void main(String[] args)
	{
		int[] number = {13,5,16,8,2};
		for(int n : number)
		{
			System.out.print(n);
			System.out.print(" ");
		}
		int temp;
		for(int i=0;i<number.length-1;i++)
		{
			for(int j=0;j<number.length-1-i;j++)
			{
				if(number[j] > number[j+1])//오름차순
				{
					temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}
		System.out.println();
		for(int s : number)
		{
			System.out.print(s);
			System.out.print(" ");
		}
		
		
		
		for(int i=0;i<number.length-1;i++)
		{
			for(int j=0;j<number.length-1-i;j++)
			{
				if(number[j] < number[j+1])//내림차순
				{
					temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}
		System.out.println();
		for(int s : number)
		{
			System.out.print(s);
			System.out.print(" ");
		}
	}

}
