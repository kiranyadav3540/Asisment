package myproject1;

public class QuestionNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 4,7, 6, 4, 7, 5, 9};
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("The Duplicate Element is : " +arr[j]);
				}
			}
		}
	}

}
