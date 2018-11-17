package com.ru.oop.collections.map;

import org.junit.Assert;
import org.junit.Test;

import com.ru.collections.map.CachedProduct;
import com.ru.collections.map.LRUCache;
import com.ru.oop.collection.list.Product;

public class LRUCacheTest {

	@Test
	public void test() {
		CachedProduct p1 = new CachedProduct(new Product("мляко", 2.60, 2));
		CachedProduct p2 = new CachedProduct(new Product("месо", 5.60, 1));
		CachedProduct p3 = new CachedProduct(new Product("баница", 2.00, 5));
		LRUCache cache = new LRUCache(2);
		cache.add(p1);
		cache.add(p2);
		cache.get(p2);
		cache.add(p3);

		Assert.assertNull(cache.get(p1));
	}

}
