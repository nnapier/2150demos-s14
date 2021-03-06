import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;


public class StackExample
{
	public static Stack<Integer> makeRandomStack(int size)
	{
		Random num = new Random();
		Stack<Integer> intStack = new Stack<Integer>();
		for(int i = 0; i < size; i++)
		{
			int randNum = num.nextInt(100);
			intStack.push(randNum);
		}
		return intStack;
	}
	
	public static void popStackAddToQueue(Stack<Integer> s, Queue<Integer> q)
	{
		while(!s.isEmpty())
		{
			q.add(s.pop());
		}
	}
	
	public static void removeQueuePushToStack(Stack<Integer> s, Queue<Integer> q)
	{
		while(!q.isEmpty())
		{
			s.push(q.remove());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		/*Stack<String> names = new Stack<String>();
		names.push("Dr.Napier");
		names.push("Allen");
		names.push("Dr.Seuss");
		names.push("Willy Wonka");
		names.push("Big Bird");
		while(!names.isEmpty())
		{
			System.out.println("The top of the stack is: " + names.pop());
		}*/
		
		Stack<Integer> testerStack = makeRandomStack(3);
		//System.out.println(testerStack);
		
		Queue<Integer> list = new LinkedList<Integer>();
		System.out.println("The stack before removing is: " + testerStack);
		popStackAddToQueue(testerStack, list);
		System.out.println("The stack after removing is: " + testerStack);
		System.out.println("The queue is: " + list);
		System.out.println("The queue before removing is: " + list);
		removeQueuePushToStack(testerStack, list);
		System.out.println("The queue after removing is: " + list);
		System.out.println("The stack is: " + testerStack);
	}

}
