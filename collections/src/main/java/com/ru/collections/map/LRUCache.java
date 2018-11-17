package com.ru.collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class LRUCache {

	private int size;

	private Map<String, CachedProduct> cache;

	public LRUCache(int size) {
		cache = new HashMap<>(size);
		this.size = size;
	}

	public void add(CachedProduct p1) {
		if (cache.containsKey(p1.getId())) {
			throw new IllegalArgumentException(
					"The element is already contained.");
		}
		long count = cache.keySet().stream().count();
		if (count < size) {
			cache.put(p1.getId(), p1);
		} else {
			Comparator<Map.Entry<String, CachedProduct>> comp = (o1, o2) -> {
				return o1.getValue().getCount() - o2.getValue().getCount();
			};
			Optional<Map.Entry<String, CachedProduct>> result = cache
					.entrySet().stream().min(comp);
			String key = result.get().getKey();
			cache.remove(key);
			cache.put(p1.getId(), p1);
		}

	}

	public CachedProduct get(CachedProduct p2) {
		CachedProduct element = cache.get(p2.getId());
		if (element != null) {
			element.setCount(element.getCount() + 1);
			return element;
		}
		return element;
	}

}
