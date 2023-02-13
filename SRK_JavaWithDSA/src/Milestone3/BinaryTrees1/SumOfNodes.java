/*Sample Input 1:
2 3 4 6 -1 -1 -1 -1 -1
Sample Output 1:
 15
Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 2:
 28
 */
package Milestone3.BinaryTrees1;
import java.util.*;
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class SumOfNodes {

	public static int getSum(BinaryTreeNode<Integer> root) {
		//Your code goes here.
        if(root==null){
            return 0;
        }
        int leftSum=getSum(root.left);
        int rightSum=getSum(root.right);
        return root.data+leftSum+rightSum;
	}

}
class BinaryTree{
    int data;
    BinaryTree left;
    BinaryTree right;
    BinaryTree(int data){
        this.data=data;
    }
}
class BinaryTreeUse{
    public static BinaryTree takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data: ");
        int n = sc.nextInt();
        BinaryTree root = new BinaryTree(n);
        BinaryTree leftSide= takeInput();
        BinaryTree rightSide=takeInput();
        root.left=leftSide;
        root.right=rightSide;
        return root;
    }
    public static BinaryTree TakeInputBetter(boolean isRoot,boolean isLeft,int value){
        if(isRoot){
            System.out.println("Enter the data: ");
        }
        else{
            if(isLeft){
                System.out.println("Enter the left node of  "+ value);
            }
            else{
                System.out.println("Enter the right node of "+ value);
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BinaryTree root = new BinaryTree(n);
        BinaryTree leftSide=TakeInputBetter(false,true,n);
        BinaryTree rightSide=TakeInputBetter(false,false,n);
        root.left=leftSide;
        root.right=rightSide;
        return root;
    }
    public static int noOfNodes(BinaryTree root){
        if(root == null){
            return 0;
    }
    int leftSideNodes=noOfNodes(root.left);
    int rightSideNodes=noOfNodes(root.right);
    return 1+leftSideNodes+rightSideNodes;
  }
  public static int sumOfNodes(BinaryTree root){
      if(root==null){
          return 0;
      }
      int leftSideData=sumOfNodes(root.left);
      int rightSideData=sumOfNodes(root.right);
      return root.data+leftSideData+rightSideData;
  }
  public static void preOrderPrint(BinaryTree root){
      if(root==null){
          return;
      }
      System.out.print(root.data+" ");
      preOrderPrint(root.left);
      preOrderPrint(root.right);
  }
  public static void postOrderPrint(BinaryTree root){
      if(root ==null){
          return;
      }
      postOrderPrint(root.left);
      postOrderPrint(root.right);
      System.out.print(root.data+" ");
  }
  public static int nodeWithLargestData(BinaryTree root){
      if(root==null){
          return 0;
      }
      int leftSideData = nodeWithLargestData(root.left);
      int rightSideData= nodeWithLargestData(root.right);
      return Math.max(root.data,Math.max(leftSideData,rightSideData));
  }
  static int count=0;
  public static int nodesGreaterThanX(BinaryTree root,int x){
      if(root==null){
          return 0;
      }
      if(root.data>x){
          count++;
      }
      int leftSide=nodesGreaterThanX(root.left,x);
      int rightSide=nodesGreaterThanX(root.right,x);
      return count;
  }
  public static int height(BinaryTree root){
      if(root == null){
          return 0;
      }
      int leftHeight=height(root.left);
      int rightHeight=height(root.right);
      return Math.max(leftHeight,rightHeight)+1;
  }
  static int LeaveCount=0;
  public static int noOfLeaveNodes(BinaryTree root){
      if(root==null){
          return 0;
      }
      if(root.left==null && root.right==null){
          LeaveCount++;
      }
      int leftSide=noOfLeaveNodes(root.left);
      int righrSide=noOfLeaveNodes(root.right);
      return LeaveCount;
  }
  static boolean flag=false;
//  public static boolean isNodePresent(BinaryTree root,int i){
//      if(root==null){
//          return flag;
//      }
//      boolean leftSide=isNodePresent(root.left,i);
//      boolean rightSide=isNodePresent(root.right,i);
//      if(leftSide.data==i || rightSide.data==i){
//          flag=true;
//      }
//      return flag;
//      
//  }
//  public static int noOfLeaveNodes()
}
