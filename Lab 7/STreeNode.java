


class STreeNode
{
	String item;
	STreeNode left;
	STreeNode right;
	
	public STreeNode(String str)
	{
		item=str;
		left=null;
		right=null;
	}

	public STreeNode(String str, STreeNode l, STreeNode r)
	{
		item=str;
		left=l;
		right=r;
	}
}