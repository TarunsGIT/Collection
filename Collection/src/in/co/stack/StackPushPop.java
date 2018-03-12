package in.co.stack;

import java.util.Stack;

public class StackPushPop {

	Stack<String> s1 = new Stack<String>();
	Stack<String> s2 = new Stack<String>();

	public void push() {

		s1.push("A");
		s1.push("B");
		s1.push("C");
		s1.push("D");
		s1.push("E");
	}

	/*
	 * public void pop() {
	 * 
	 * System.out.println("ELEMENTS POPPED OFF STACK 1 :"); while (!s1.empty())
	 * { System.out.println(s1.pop());
	 * 
	 * }
	 * 
	 * }
	 */

	public void pushIn() {

		System.out.println("PUSHING ELEMENTS IN STACK 2");

		while (!s1.empty()) {

			s2.push(s1.pop());

		}

	}

	public void popOff() {
		System.out.println("ELEMENTS POPPED OFF STACK 2");

		while (!s2.empty()) {
			System.out.println(s2.pop());

		}
	}

}
