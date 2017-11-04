package cn.itcast_02;

import java.net.URL;

public class Type {
	public static void main(String[] args) {
//            System.out.println(Test.test instanceof Test);
		//getResult(1);
		URL resource = Type.class.getResource("/");
		
		System.out.println(Type.class.getResource("/").getPath());
		System.out.println(Type.class.getResource("/"));
		System.out.println(Type.class.getResource(""));
	}
	
	public static int getResult(int i){
		
		
	System.out.println(i);
		if (i<5000) {
			i*=2;
			getResult(i);
		}
		return i;
	}
}
