

static void levelOrder(Node root){
    //Write your code here
    if (root == null)
          System.out.println("nothing to display");
      Queue<Node> q = new LinkedList<Node>();
      q.add(root);
      while (!q.isEmpty()) {
          Node node = (Node) q.poll();
          System.out.print(node.data + " ");
          if (node.left != null)
              q.add(node.left);
          if (node.right != null)
              q.add(node.right);
      }
  }

