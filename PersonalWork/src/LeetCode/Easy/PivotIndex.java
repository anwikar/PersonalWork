package LeetCode.Easy;
import java.util.Arrays;
public class PivotIndex
{
	public static void main(String[] args)
	{
		int[] nums = {2,1,-1};
		System.out.println(pivotIndex(nums));
	}

	private static int pivotIndex(int[] nums)
	{
		if(nums.length == 0)
			return -1;

		if(nums.length == 1)
			return 0;

		int lSum = 0;
		int rSum = Arrays.stream(nums).sum();

		for(int i=0;i<nums.length;i++)
		{
			if(i>0)
				lSum +=nums[i-1];

			rSum -=nums[i];

			if(lSum == rSum)
				return i;

		}

		return -1;
	}
}
/* End of PivotIndex.java */