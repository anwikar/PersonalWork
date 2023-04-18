package LeetCode.Easy;
public class IsSubsequence
{
	public static void main(String[] args)
	{
		String s = "abc";
		String t = "ahbgdc";

		System.out.println(isSubsequence(s, t));

	}
	private static boolean isSubsequence(String s,
			String t)
	{
		if(s.isEmpty())
			return true;

		int start = 0;
		boolean isSubsquence = false;
		char[] sCharArray = s.toCharArray();
		char[] tCharArray = t.toCharArray();

		for(int i=0;i<sCharArray.length;i++)
		{
			isSubsquence = false;
			for(int j=start;j<tCharArray.length;j++)
			{
				if(tCharArray[j] == sCharArray[i])
				{
					start = j+1;
					isSubsquence = true;
					break;
				}
			}

			if(!isSubsquence)
			{
				return false;
			}
		}

		return isSubsquence;
	}
}
/* End of IsSubsequence.java */