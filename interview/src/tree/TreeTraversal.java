package tree;

public class TreeTraversal {

	public void preOrder(TreeNode root){
		if(root == null)
			return;
		//遍历根
		System.out.print(root.getValue());
		//前序遍历遍历左子树
		preOrder(root.getLeft());
		//前序遍历遍历右子树
		preOrder(root.getRight());
	}
	
	
	public void inOrder(TreeNode root){
		if(root == null)
			return;
		//前序遍历遍历左子树
		preOrder(root.getLeft());
		//遍历根
		System.out.print(root.getValue());
		//前序遍历遍历右子树
		preOrder(root.getRight());
	}
	
	public void postOrder(TreeNode root){
		if(root == null)
			return;
		//前序遍历遍历左子树
		preOrder(root.getLeft());
		//前序遍历遍历右子树
		preOrder(root.getRight());
		//遍历根
		System.out.print(root.getValue());
	}
	
	public String postOrder(String preOrder,String inOrder){
		if(preOrder.isEmpty()){
			return "";
		}
		
		char rootValue = preOrder.charAt(0);
	    int rootIndex = inOrder.indexOf(rootValue);
	    
	    
	    //substring(begin,end) begin:inclusive,end:exclusive  [begin,end)
	    return 
	    		postOrder(
	    				preOrder.substring(1,rootIndex+1),
	    				inOrder.substring(0, rootIndex))+
	            postOrder(
	    				preOrder.substring(rootIndex+1),
	    				inOrder.substring(rootIndex+1))+
	            rootValue;
	    
	}
	

	//Test program
	public static void main(String[] args){
		treeCreator creator = new treeCreator();
		TreeTraversal traversal = new TreeTraversal();
		
		TreeNode sample = creator.createSampleTree();
		traversal.preOrder(sample);
		System.out.println();
		traversal.inOrder(sample);
		System.out.println();
		traversal.postOrder(sample);
		System.out.println();
		
		System.out.println("============");
		
		TreeNode res = creator.createTree("ABDEGCF", "BDEGACF");
		traversal.postOrder(res);
		System.out.println();
		TreeNode res1 = creator.createTree("", "");
		traversal.postOrder(res1);
		System.out.println();
		TreeNode res2 = creator.createTree("AB", "BA");
		traversal.postOrder(res2);
		System.out.println();
		
        System.out.println("============");
		System.out.println(
				traversal.postOrder("ABDEGCF", "BDEGACF"));
		System.out.println(
				traversal.postOrder("A", "A"));
		System.out.println(
				traversal.postOrder("AB", "BA"));
		System.out.println(
				traversal.postOrder("", ""));
		
		
	}
}
