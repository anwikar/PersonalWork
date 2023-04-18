package java;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. Class should be declared as final for it cant be extended
 * 2. All the members should be declared final, as their value can't be changed.
 * 3. Use a constrictor for creating the object. There will be no setters
 * 3. In the getters, do a deep copy before returning the object so that original object cant modified through reference
 * 4. Wrapper classes like Integer, Double, String are immutable in Java
 */

public final class ImmutableClass
{
	private final Integer data;
	private final Map<Integer, Integer> map = null;

	public ImmutableClass(Integer data, Map<Integer, Integer> map)
	{
		this.data = data;
		map = new HashMap();
		for (Map.Entry<Integer, Integer> entry :
				map.entrySet()) {
			map.put(entry.getKey(), entry.getValue());
		}
	}

	public Integer getData()
	{
		return data;
	}

	public Map<Integer, Integer> getMap()
	{
		Map<Integer, Integer> tempMap = new HashMap<>();

		for (Map.Entry<Integer, Integer> entry :
				this.map.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}
}
/* End of ImmutableClass.java */