import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
	
		String input="[()]{}{[()()]()}}";

		Stack<Character> st= new Stack<Character>();
		char c;
		boolean flag= true;
		for(int i=0; i<input.length(); i++)
		{
			c= input.charAt(i);
			if(isOpen(c))
			{
				st.push(c);
			}
			else if(!st.isEmpty() && isMatching(c, st.pop()))
						{
					
						}
			else {
				flag=false;
				break;
			}
				
			}
		if(flag==false)
			System.out.println("not matching");
		else
			System.out.println("matching");
			
		

	}
	
	
	private static boolean isMatching(char c, char pop) {

		if(pop=='(' && c==')')
return true;
else if(pop=='{' && c=='}')
			return true;
			else if(pop=='[' && c==']')
						return true;
						else	return false;
	}


	private static  boolean isOpen(char ch)
	{
		if(ch=='(' || ch=='{' || ch=='[')
		return true;
		else return false;
		
	}

}
