import java.util.Stack;

public class ExprTree
{
	private TreeNode root;
	//create an empty tree
	public ExprTree()
	{
		root=null;
	}
	
	/** expression contains the mathematical expression in post fix format
	  process the string array and create a binary expression tree
	  throw InvalidExprException if there is an error in the expression
	*/
	public void build(String[] expression)throws InvalidExprException
	{
		Stack<TreeNode> s=new Stack<TreeNode>();
		double n=0;
		for (int i=0; i<expression.length; i++)
		{
			if(isNum(expression[i]))
			{
				s.push(new TreeNode(expression[i].trim()));
			}else if(isOperator(expression[i]))
			{
				if(s.empty())
					throw new InvalidExprException("Not enough operands.");
				TreeNode operand2=s.pop();
				if(s.empty())
					throw new InvalidExprException("Not enough operands.");
				TreeNode operand1=s.pop();
				TreeNode newNode=new TreeNode(expression[i].trim(),operand1,operand2);
				s.push(newNode);
			}else
			{
				throw new InvalidExprException("The string is not a number, nor an operator.");
			}
		}
		if(s.size()!=1)
			throw new InvalidExprException("Not enough operators.");
		root=s.pop();
	}
	
	//evaluate the expression tree and return the result
	public double evaluate() throws InvalidExprException
	{
		return evaluate(root);
	}
	
	//evaluate the sub expression tree rooted at node and return the result
	private double evaluate(TreeNode node)throws InvalidExprException
	{
		if(node==null || node.item.length()==0)
			throw new InvalidExprException("Invalid expression.");
		if (isNum(node.item))
			return convert(node.item);
		if(isOperator(node.item))
		{
			if(node.left==null||node.right==null)
				throw new InvalidExprException("Not enough operands.");
			double left=evaluate(node.left);
			double right=evaluate(node.right);
			char c=node.item.charAt(0);
			switch (c)
			{
				case '+':return left+right;
				case '-': return left-right;
				case '*': return left*right;
				case '/':
					if (right==0)
						throw new InvalidExprException("Divided by 0.");
					return left/right;
				default:
					throw new InvalidExprException("Invalidoperator: "+node.item);
			}
		}
		throw new InvalidExprException("Invalid expression.");
	}
	
	//return the string representation of the expression tree in inorder traversal
	public String toString()
	{
		return inorder(root);
	}
	
	//return the string representation of the expression tree in inorder traversal
	public String inorder()
	{
		return inorder(root);
	}
	
	//return the string representation of the sub expression tree rooted at node in inorder traversal
	private String inorder(TreeNode node)
	{
		if(node==null) return "";
		String str = inorder(node.left)+node.item+" "+inorder(node.right);
		char operator =node.item.charAt(0);
		if (node !=root && (operator=='+' || operator=='-'))
		str = "("+str+")";
		return str;
	}
	
	//convert the string object str to a double, throw an exception if there is an error
	private double convert(String str) throws InvalidExprException
	{
		return Double.parseDouble(str);
	}
	
	//return true if the string object str is a number, false otherwise
	private boolean isNum(String str)
	{
		try{
			Double.parseDouble(str);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	//return true if the string object str is an operator, false otherwise
	private boolean isOperator(String str)
	{
		str=str.trim();
		if(str.length()<1) return false;
		char c=str.charAt(0);
		switch (c)
		{
			case '+': case '-': case '*': case '/':return true;
		}
		return false;
	}
	
	//TreeNode for the expression tree, another way to define a TreeNode, better encapsulation
	private class TreeNode
	{
		String item;
		TreeNode left;
		TreeNode right;

		public TreeNode(String str)
		{
			item=str;
			left=null;
			right=null;
		}

		public TreeNode(String str, TreeNode l, TreeNode r)
		{
			item=str;
			left=l;
			right=r;
		}
	}
}