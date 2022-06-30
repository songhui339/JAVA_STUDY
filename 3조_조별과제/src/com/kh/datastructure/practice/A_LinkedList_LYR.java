package com.kh.datastructure.practice;

public class A_LinkedList_LYR {
	/* 
	 * 연결 리스트, 링크드 리스트(linked list)는 각 노드가 데이터와 포인터를 가지고 
	 * 한 줄로 연결되어 있는 방식으로 데이터를 저장하는 자료 구조이다. 
	 * 이름에서 말하듯이 데이터를 담고 있는 노드들이 연결되어 있는데, 
	 * 노드의 포인터가 다음이나 이전의 노드와의 연결을 담당하게 된다.
     * 
     * 연결 리스트의 종류로는 단일 연결 리스트, 이중 연결 리스트 등이 있다
	 * 
	 * 헤드 노드는 첫번째 노드의 참조만 가지고 있으며 첫번째 노드는 두번째 노드,
	 * 두번째 노드는 세번째 노드를 가리키고 있으며 마지막 노드가 가리키는 참조값은 null이 된다.
	 * 즉 헤드노드가 가리키는 노드가 첫번째 노드이며 참조값이 null인 노드가 마지막 노드가 되는 것이다.
	 */
	private Node headNode; 
	private int size; 
	
	public A_LinkedList_LYR() { 
		// 생성시 Head Node 생성 
		// head 는 일반적으로 데이터를 저장하지 않음 
		// 첫번째 노드 주소를 가르키기 위한 용도 
		headNode = new Node(); // 첫번째 노드를 가리키는 변수
		size = 0; // 노드의 수
	}

    private class Node {
    	
    	private Node nextNode;
    	private Object data;
	
    	Node() { 
    	} 
	
    	Node(Object data) { 
    		// 새로 추가한 node의 next 초기값은 null 로 설정 
    		this.nextNode = null; 
    		this.data = data; 
		} 
	} 

	// 첫번째 노드에 데이터를 저장하기 위한 Method 
	public void addFirst(Object data) { 
		
		// 새로운 Node 생성 
		Node newNode = new Node(data);
		// 새로운 Node에 headNode의 next Node 주소값을 대입
		newNode.nextNode = headNode.nextNode; 
		// headNode의 nextNode에 새로운 Node의 주소값을 대입
		headNode.nextNode = newNode; 
		// size 증가 
		size++; 
	}
	
    //add Node, addLast 
    public void add(int index, Object data) { 
    	if(index <0 || index >= size) { 
    		throw new IndexOutOfBoundsException("index:" + index + " size:" + size); 
    	} 
    	
    	Node newNode = new Node(data); 
    	Node preNode = getNode(index-1); 
    	newNode.nextNode = preNode.nextNode; 
    	preNode.nextNode = newNode; 
    	size++; 
	} 
    public void addLast(Object data) { 
    	add(size-1, data); 
	} 
		
	//특정한 Node의 data값 가져오기 
    public Object get(int index) { 
    	return getNode(index).data; 
	}
    
    private Node getNode(int index) { 
    	if (index < 0 || index >= size) { 
    		throw new IndexOutOfBoundsException("index:" + index + " size:" + size); 
    	} else { 
    		Node node = headNode.nextNode; 
    		for(int i=0; i < index; i++) { 
    			node = node.nextNode; 
			} 
    		return node; 
		}
	}

    // 첫번째 Node 삭제 
    public Object removeFirst() {
    	Node node = headNode.nextNode;
    	headNode.nextNode = node.nextNode;
    	Object result = node.data; 
    	node = null; 
    	size--; 
    	return result;
    } 

    // 특정한 Node 삭제 
    public Object remove(int index) {
    	if(index < 0 || index >= size) { 
    		throw new IndexOutOfBoundsException("index:" + index + " size:" + size); 
		}
	
    	if(index == 0) { 
    		return removeFirst(); 
		}else { 
			Node preNode = getNode(index-1); 
			Node removeNode = preNode.nextNode; 
			Node postNode = removeNode.nextNode; 
			preNode.nextNode = postNode; 
			Object result = removeNode.data; 
			removeNode = null; 
			size--; 
			return result; 
		} 
	} 

    // size 가져오기
    public int size() { 
	return size; 
	} 

    // 모든 데이터 출력
    public String toString() { 
    	StringBuffer result = new StringBuffer("["); 
    	Node node = headNode.nextNode; 
    	if(node == null) { 
    		result.append("No Data");
    	}else{ 
    		result.append(node.data);
    		node = node.nextNode; 
    		while(node != null) {
    			result.append(", "); 
    			result.append(node.data); 
    			node = node.nextNode;
    		} 
    	} 
    	result.append("]");
    	return result.toString();
    }
}

