package cn.itcast.test;

import java.io.File;
import java.io.FilenameFilter;

/*class FinalClass {
	final int i = 0;
}
*/
interface A {
	int x = 0;
	void play();
}

interface B {
	int x = 1;
	void play();
}

interface C extends A,B{
	FinalClass finalClass =new FinalClass();
}

class FinalClass implements C {


	// int x=2;
	public static void main(String[] args) {
 new FilenameFilter() {
	
	@Override
	public boolean accept(File dir, String name) {
		return false;
	}
};
	}

	public void show() {
		FinalClass finalClass = new FinalClass();
		System.out.println(A.x);
	}

	@Override
	public void play() {
		//finalClass=new FinalClass();		
	}


}