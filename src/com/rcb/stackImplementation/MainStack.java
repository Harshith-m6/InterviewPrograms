package com.rcb.stackImplementation;

public class MainStack {
	public static void main(String[] args) {
		MyStack ms = new MyStack(5);
		ms.push(1);
		ms.push(2);
		ms.push(3);
		System.out.println(ms);
		System.out.println(ms.peek());
		ms.pop();
		System.out.println(ms);
		ms.push(4);
		System.out.println(ms.peek());
		System.out.println(ms);
		System.out.println(ms.size());
		System.out.println(ms.capacity);
	}

}
