package com.rcb.stackImplementation;

public class MyStack {
	int top =-1;
	int[] stack;
	int capacity ;
	
	public MyStack(int capacity)
	{
		stack = new int[capacity];
		this.capacity= capacity;
	}
	
	public void push(int ele)
	{
		if(top==capacity-1)
		{
			System.out.println("Stack overflow");
			return;
		}
		
		stack[++top]=ele;
	}
	
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		return  stack[top--];
	}
	
	public int peek()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		return stack[top];
	}
	@Override
	public String toString()
	{
		String str ="[";
		for(int i =0 ; i<=top ; i++)
		{
			str+=stack[i];
			if(i<top)
			{
				str+=" , ";
			}
		}
		
		return str+"]";
	}
	
	public int size()
	{
		return top+1;
	}
	

}
