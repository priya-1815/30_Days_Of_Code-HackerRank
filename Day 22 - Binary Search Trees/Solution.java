

	public static int getHeight(Node root){
        //Write your code here
        return (root == null) ? -1 : Math.max(getHeight(root.left) + 1, getHeight(root.right) + 1);
      }
  
  