package cn.itcast.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestByhash {

	private int a = 0;
	private String b;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestByhash other = (TestByhash) obj;
		if (a != other.a)
			return false;
		
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Set set = new HashSet<>();
		Hash hash1 = new Hash();
		Hash hash2 = new Hash();
		hash1 = new Hash();
		set.add(hash1);
		boolean contains = set.contains(hash1);
		set.add(hash1);
		System.out.println(set.size());
	}
}
