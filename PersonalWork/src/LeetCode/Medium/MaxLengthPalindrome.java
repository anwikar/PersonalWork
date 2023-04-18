package LeetCode.Medium;
import java.util.HashMap;
import java.util.Map;
public class MaxLengthPalindrome
{
	public static void main(String[] args)
	{
		String str = "aabccdd";
		System.out.println(maxLengthPalindrome(str));
	}

	private static int maxLengthPalindrome(String str)
	{
		Map<Character, Integer> characterIntegerMap = new HashMap<>();
		int odd = 0;

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			characterIntegerMap.put(ch, characterIntegerMap.getOrDefault(ch, 0) + 1);
		}

		for(Integer value: characterIntegerMap.values())
		{
			if(value%2==1)
				odd++;
		}

		return odd > 0? str.length() - odd + 1: str.length();

	}
}
/* End of MaxLengthPalindrome.java */