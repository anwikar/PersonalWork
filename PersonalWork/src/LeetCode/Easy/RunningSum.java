package LeetCode.Easy;
public class RunningSum
{
	public static void main(String[] args)
	{
		int[] inp = {};
		int[] op = runningSum(inp);

		for (int data:op)
		{
			System.out.println(data);
		}
	}

	private static int[] runningSum(int[] inp)
	{
		if(inp.length <= 1)
			return inp;

		int[] op =new int[inp.length];
		op[0] = inp[0];
		for(int i = 1; i<inp.length;i++)
		{
			op[i] = op[i-1] + inp[i];
		}
		return op;
	}
}
/* End of RunningSum.java */