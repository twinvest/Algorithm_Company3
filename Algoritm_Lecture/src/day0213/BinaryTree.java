package day0213;


public class BinaryTree {
	char[] tree;
	
	public BinaryTree(int maxLevel) {
		//maxLevel에 맞게 tree에 배열 할당
		tree = new char[ 1  << (maxLevel+1) ];
	}
	public void setData(char data, int node) {
		//노드 번호에 data를 할당
		tree[node] = data;
	}
	public void setLeft(char data, int parent) {
		//parent의 왼쪽노드에 data를 세팅
		tree[ parent * 2 ] = data;
	}
	public void setRight(char data, int parent) {
		//parent의 오른쪽노드에 data를 세팅
		tree[ parent * 2 + 1 ] = data;
	}
	public char getLeft(int parent) {
		return tree[parent * 2];
	}
	public char getRight(int parent) {
		return tree[parent * 2 + 1];
	}
	public char getParent(int node) {
		return tree[node / 2];
	}
	
	//node를 루트로 하는 서브트리를 전위순회
	public void preorder(int node) {
		//if(node <tree.length && tree[node] != '\0')
		System.out.println(tree[node]);
		if( node * 2 < tree.length && tree[node * 2] != '\0')
			preorder(node * 2);
		if( node * 2 + 1 < tree.length && tree[node * 2 + 1] != '\0')
			preorder(node * 2 + 1);
	}
	
	public void inorder(int node) {
		//if(node <tree.length && tree[node] != '\0')
		if( node * 2 < tree.length && tree[node * 2] != '\0')
			inorder(node * 2);
		System.out.println(tree[node]);
		if( node * 2 + 1 < tree.length && tree[node * 2 + 1] != '\0')
			inorder(node * 2 + 1);
	}
	
	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree(3);
		tree.setData('A', 1);//루트노드에 A를 지정
		tree.setLeft('B', 1); //1번 노드의 왼쪽 노드에 B
		tree.setRight('C', 1); //1번 노드의 오른쪽 노드에 C
		
		tree.setLeft('D', 2);
		tree.setRight('E', 2);
		
		tree.setLeft('F', 3);
		tree.setRight('G', 3);
		//tree.preorder(1);
		tree.inorder(1);
	}
}






















