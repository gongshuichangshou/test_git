package cn.itcast_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.management.InstanceAlreadyExistsException;

import org.w3c.dom.UserDataHandler;

public class Resource {

	public static void main(String[] args) {
		Map map = new HashMap<>();
		System.out.println(map);
		ArrayList list = new ArrayList<>();
		list.add(map);
		System.out.println(list);
		Set set = new HashSet<>();
		System.out.println(set);
		// System.out.println(name.INSTANCE);
		for (int i = 0; i < 10; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ":" + name.getInstance());
		}

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					String threadName = Thread.currentThread().getName();
					System.out.println(threadName + ":" + name.getInstance());
				}

			}
		});
		thread1.start();
	}
}

enum name {
	INSTANCE;
	private Resource instance;

	name() {
		instance = new Resource();
	}

	public static Resource getInstance() {
		return INSTANCE.instance;
	}
}
