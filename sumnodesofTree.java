public class sumnodesofTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int sumnodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int ls=sumnodes(root.left);
        int rs=sumnodes(root.right);
        return ls+rs+root.data;
    }
      public static void main(String args[])
{
/*    1
     / \
    2   3
   / \ / \
  4   56  7
*/
Node root=new Node(1);
root.left=new Node(2);
root.right=new Node(3);
root.left.left=new Node(4);
root.left.right=new Node(5);
root.right.left=new Node(6);
System.out.println(sumnodes(root));
}
}
