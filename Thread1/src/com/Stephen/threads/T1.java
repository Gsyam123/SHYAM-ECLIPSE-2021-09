package com.Stephen.threads;
class MyThread extends Thread{
	public void run (){
for(int i=1; i<=10; i++) {
		System.out.println(getName()+":"+i);
		}
	}

}
class T2{
	public static void main(String[] args) {
		Thread t1=new MyThread ();
		Thread t2=new MyThread();
		t1.setName("T1");
		t1.setName("T2");
		t1.start();
		t2.start(); 
			System.out.println(1000);	
	}
}