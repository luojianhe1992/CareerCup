package QueueWithTwoStacks;

public class Main {
	public static void main(String[] args){
		QueueWithTwoStacks<Integer> q = new QueueWithTwoStacks<Integer>();
		
		for(int i=10;i<20;i++){
			q.add(i);
		}
		
		System.out.println(q.peek());
		
		System.out.println("**********");
		
		for(int i=0;i<10;i++){
			System.out.print(q.remove()+" ");
		}
		
		System.out.println();
		
		System.out.println("**********");
		
		
		
	}
}
