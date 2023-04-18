package LeetCode.Easy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class IsomorphicStrings
{
	public static void main(String[] args)
	{
		String s = "bbbaaaba";
		String t = "aaabbbba";
		System.out.println(isIsomorphic(s,t));
	}

	private static boolean isIsomorphic(String s,
			String t)
	{
		Map<Character, Integer> sMap = new HashMap<>();
		Map<Character, Integer> tMap = new HashMap<>();
		for(Character ch: s.toCharArray())
		{
			sMap.merge(ch,
					1,
					Integer::sum);

		}

		for(Character ch: t.toCharArray())
		{
			tMap.merge(ch,
					1,
					Integer::sum);

		}

		List<Integer> sList = new ArrayList<>(sMap.values());
		Collections.sort(sList);

		List<Integer> tList = new ArrayList<>(tMap.values());
		Collections.sort(tList);

		if(sList.size() != tList.size())
			return false;

		for(int i = 0; i<sList.size();i++)
		{
			if(!sList.get(i).equals(tList.get(i)))
			{
				return false;
			}
		}

		return true;
	}
}
/* End of IsomorphicStrings.java */