package day0213;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BinaryTree2 {
	char[] tree;
	
	public BinaryTree2(int maxLevel) {
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
		System.out.println(tree[node]);
		if( node * 2 < tree.length && tree[node * 2] != '\0')
			preorder(node * 2);
		if( node * 2 + 1 < tree.length && tree[node * 2 + 1] != '\0')
			preorder(node * 2 + 1);
	}
	public void	inorder(int node) {
		if( Character.isDigit(tree[node])) {
			//양쪽다 자식이 없어야됨
		}
		else {
			//양쪽다 자식이 있어야됨
		}
		
		if( node * 2 < tree.length && tree[node * 2] != '\0')
			inorder(node * 2);
		System.out.print(tree[node]);
		if( node * 2 + 1 < tree.length && tree[node * 2 + 1] != '\0')
			inorder(node * 2 + 1);
	}
	void levelorder(int node) {
		//큐를 만들고 처음 방문할 노드를 넣는다.
		Queue<Integer> queue = new LinkedList<>();
		queue.add(node);
		//큐가 빌때까지 반복하면서
		while(!queue.isEmpty()) {
			//하나 꺼내서 방문하고
			int n = queue.poll();
			System.out.println(tree[n]);
			//해당 노드에서 연결된 노드가 있다면 큐에 삽입
			if( n * 2 < tree.length && tree[n * 2] != '\0')
				queue.add(n * 2);
			if( node * 2 + 1 < tree.length && tree[n * 2 + 1] != '\0')
				queue.add(n * 2 + 1);
		}
	}
	static boolean isOk = true;
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		for(int tc = 1; tc <= 10; tc++) {
//			int N = Integer.parseInt(sc.nextLine());
//			BinaryTree tree = new BinaryTree(6);
//			for(int i = 0; i < N; i++) {
//				String line = sc.nextLine();
//				StringTokenizer st = new StringTokenizer(line);
//				int node = Integer.parseInt(st.nextToken());
//				char c = st.nextToken().charAt(0);
//				tree.setData(c, node);
//			}
//			System.out.print("#" + tc + " ");
//			tree.inorder(1);
//			System.out.println();
//		}
		BinaryTree tree= new BinaryTree(3);
		tree.setData('A', 1);//루트노드에 A를 지정
		tree.setLeft('B', 1); //1번 노드의 왼쪽 노드에 B
		tree.setRight('C', 1); //1번 노드의 오른쪽 노드에 C
		
		tree.setLeft('D', 2);
		tree.setRight('E', 2);
		
		tree.setLeft('F', 3);
		tree.setRight('G', 3);
		//깊이우선탐색
		tree.inorder(1);
		
		//너비우선탐색(레벨오더)
		tree.levelorder(1);
	}
}