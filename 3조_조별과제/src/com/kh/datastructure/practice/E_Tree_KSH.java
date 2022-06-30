package com.kh.datastructure.practice;

import javax.swing.tree.TreeNode;

/*
 * 트리(Tree)의 개념
 * - 트리는 노드로 이루어진 자료구조로 스택이나 큐와 같은 선형 구조가 아닌 비선형 자료구조이다. 
 * - 트리는 계층적 관계를 표현하는 자료구조이다. 
 * - 트리는 다음과 같은 특징들을 갖는다. 
 *
 * 1. 트리는 하나의 루트 노드를 갖는다.
 * 2. 루트 노드는 0개 이상의 자식 노드를 갖는다.
 * 3. 자식 노드 또한 0개 이상의 자식 노드를 갖는다.
 * 4. 노드(Node)들과 노드들을 연결하는 간선(Edge)들로 구성되어 있다.
 * 
 * 트리와 관련된 용어
 * - 루트 노드(root node) : 부모가 없는 노드로 트리는 단 하나의 루트 노드를 가진다.
 * - 단말 노드(leaf node) : 자식이 없는 노드로 terminal 노드라고도 부른다.
 * - 내부 노드(internal node) : 단말 노드가 아닌 노드
 * - 간선(edge) : 노드를 연결하는 선
 * - 형제(sibling) : 같은 부모 노드를 갖는 노드들 
 * - 노드의 깊이(depth) : 루트 노드에서 어떤 노드에 도달하기 위해 거쳐야 하는 간선의 수
 * - 노드의 레벨(level) : 트리의 특정 깊이를 가지는 노드의 집합
 * - 노드의 차수(degree) : 자식 노드의 개수 
 * - 트리의 차수(degree of tree) : 트리의 최대 차수 
 * 
 * 이진 트리: 이진트리는 각 노드가 최대 두 개의 자식을 갖는 트리를 뜻한다. 즉, 각 노드는 자식이 없거나 한 개 이거나 두 개만을 갖는 것이다.  
 */

public class E_Tree_KSH {
	
	private TreeNode left;
	private TreeNode right;
	private Object data;

	public void TreeNode(Object item){

		left = null;
		right = null;
		data = item;
	}

    // 자신과 왼쪽 자식 노드(sub)와 연결해주는 method
	public void makeLeftSubTree(TreeNode sub){
         if(this.left != null) this.left = null;
		 this.left = sub;

	}

    // 자신과 오른쪽 자식 노드(sub)와 연결해주는 method
	public void makeRightSubTree(TreeNode sub){
        if(this.right != null) this.right = null;
		this.right = sub;

	}

    // 자신의 data를 반환하는 함수
	public Object getData(){
           return this.data;
	}


    // 자신의 왼쪽 자식노드를 반환하는 함수
	public TreeNode getLeftSubTree(){
           return this.left;
	}


    // 자신의 오른쪽 자식노드를 반환하는 함수
	public TreeNode getRightSubTree(){
           return this.right;
	}


}
