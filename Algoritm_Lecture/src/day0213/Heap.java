package day0213;
public class Heap {
	int[] heap;
	
	public Heap(int maxLevel) {
		//maxLevel에 맞게 tree에 배열 할당
		heap = new int[ 1  << (maxLevel+1) ];
	}
	public void setData(int data, int node) {
		//노드 번호에 data를 할당
		heap[node] = data;
	}
	public void setLeft(int data, int parent) {
		//parent의 왼쪽노드에 data를 세팅
		heap[ parent * 2 ] = data;
	}
	public void setRight(int data, int parent) {
		//parent의 오른쪽노드에 data를 세팅
		heap[ parent * 2 + 1 ] = data;
	}
	public int getLeft(int parent) {
		return heap[parent * 2];
	}
	public int getRight(int parent) {
		return heap[parent * 2 + 1];
	}
	public int getParent(int node) {
		return heap[node / 2];
	}
	
	//node를 루트로 하는 서브트리를 전위순회
	public void preorder(int node) {
		System.out.println(heap[node]);
		if( node * 2 < heap.length && heap[node * 2] != '\0')
			preorder(node * 2);
		if( node * 2 + 1 < heap.length && heap[node * 2 + 1] != '\0')
			preorder(node * 2 + 1);
	}
	
	public void inorder(int node) {
		//if(node <tree.length && tree[node] != '\0')
		if( node * 2 < heap.length && heap[node * 2] != '\0')
			inorder(node * 2);
		System.out.println(heap[node]);
		if( node * 2 + 1 < heap.length && heap[node * 2 + 1] != '\0')
			inorder(node * 2 + 1);
	}
	public void change(int rootindex, int leftindex, int rightindex, int limit)
	{
		if(limit == rootindex)
			return;
		int left = getLeft(rootindex);
		int right = getRight(rootindex);
		
		if(left < right)
		{
			int tmp = getParent(rootindex);
			setData(getLeft(rootindex), rootindex);
			setLeft(tmp, leftindex);
			change(leftindex, leftindex*2, leftindex*2+1, limit);
		}
		else
		{
			int tmp = getParent(rootindex);
			setData(getRight(rootindex), rootindex);
			setRight(tmp, rightindex);
			change(rightindex, rightindex*2, rightindex*2+1, limit);
		}
	}
	
	public void delete()
	{
		//루트를 삭제
		heap[1] = -1;
		int index = 1;
		while(true)
		{
			if(heap[index++] == 0)
				break;
		}
		index = index - 2;
		change(1, 1*2, 1*2+1, index);
	}
	
	
	public static void main(String[] args) {
		Heap heap= new Heap(3);
		heap.setData(8, 1);//루트노드에 A를 지정
		heap.setLeft(16, 1); //1번 노드의 왼쪽 노드에 B
		heap.setRight(20, 1); //1번 노드의 오른쪽 노드에 C
		
		heap.setLeft(26, 2);
		heap.setRight(29, 2);
		
		heap.setLeft(21, 3);
		heap.setRight(25, 3);
		
		heap.setLeft(37, 4);
		heap.setRight(33, 4);
		
		//tree.preorder(1);
		//tree.inorder(1);
		heap.inorder(1);
		heap.delete();
		heap.inorder(1);
		//System.out.println(res);
	}
}