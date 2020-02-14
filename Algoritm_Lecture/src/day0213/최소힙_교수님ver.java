package day0213;


public class 최소힙_교수님ver {
	static class MyPriorityQueue{
		int[] tree = new int[1000];
		int size = 0;
		void swap(int a, int b) {
			int tmp = tree[a];
			tree[a] = tree[b];
			tree[b] = tmp;
		}
		void add(int data) {
			//일단 하나 늘어나는 거니까 size증가
			size++;
			//완전이진트리상의 맨 마지막 자리에 data를 추가
			int idx = size;
			tree[idx] = data;
			//부모가 나보다 크지 않을때까지 반복적으로 부모와 자기자신을 swap
			while( true ) {
				if( idx == 1 )
					break;
				int parent = idx / 2;
				if( tree[idx] >= tree[parent] )
					break;
				else {
					swap(idx, parent);
					idx = parent;
				}
			}
		}
		int poll() {
			int val = tree[1];
			tree[1] = tree[size];
			int idx = 1;
			while( true ) {
				//오른쪽 자식이 유효할때 ( 자식이 둘다 있을 때 )
				if( size >= idx *2 + 1) {
					//둘다 나보다 크면 그만해도됨
					if( tree[idx] < tree[idx*2] && tree[idx] < tree[idx*2+1])
						break;
					//오른쪽이 작으면 오른쪽과 변경
					else if( tree[idx*2] > tree[idx*2+1]) {
						swap(idx, idx*2+1);
						idx = idx*2+1;
					}
					//왼쪽이 작으면 왼쪽과 변경
					else
					{
						swap(idx, idx*2);
						idx = idx*2;
					}
				}
				//왼쪽 자식이 유효할때(오른쪽자식은 ㄴㄴ)
				else if( size >= idx * 2) {
					//왼쪽이 나보다 작으면 변경
					if( tree[idx] > tree[idx * 2])
					{
						swap(idx, idx*2);
						idx = idx*2;
					}
					//아니면 정상이므로 그만
					else
						break;
				}
				//자식이 없으므로 그만
				else {
					break;
				}
			}
			size--;
			return val;
		}
		int dequeue() {
			int idx = size;
			int result = tree[1];
			tree[1] = tree[--idx];
			int here = 1;
			while(here < idx) {
				int tmp = tree[here];
				if((tmp > tree[2*here] || tmp > tree[2*here+1]) && tree[2*here] != 0 && tree[2*here+1] != 0) {				
					if(tree[2*here] < tree[2*here+1]) {
						tree[here] = tree[2*here];
						tree[2*here] = tmp;
						here = 2*here;
					} else {
						tree[here] = tree[2*here+1];
						tree[2*here+1] = tmp;
						here = 2*here+1;
					}
					if(here > idx) {
						here = idx;
						break;
					}
					continue;
				}
				break;
			}
			return result;
		}
	}
	
	public static void main(String[] args) {
		MyPriorityQueue pq = new MyPriorityQueue();
		pq.add(30);
		pq.add(40);
		pq.add(20);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}

