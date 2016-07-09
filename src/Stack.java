
public class Stack {

	int n;
	String[] arr;
	int p;
	
	public Stack(int k)
	{n=k;
		arr = new String[k];
		p=-1;
		
	}
	
	public void push(String c)
	{
		arr[++p]=c;
		
	}
	
	public String pop()
	{
		return arr[p--];
	}

	 public String
	 peek() {
	      return arr[p];
	   }


	 public boolean isEmpty() {
	      return (p == -1);
	   }
	   public boolean isFull() {
	      return (p == n- 1);
	   }
	 
}
