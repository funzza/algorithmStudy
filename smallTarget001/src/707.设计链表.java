/*
 * @lc app=leetcode.cn id=707 lang=java
 *
 * [707] 设计链表
 */

// @lc code=start
class MyLinkedList {

    // int size = 0;
    // Node head;

    // public MyLinkedList() {
    //     size = 0;
    //     head = new Node();
    // }
    
    // public int get(int index) {
    //     if (index < 0 || index >= size) {
    //         return -1;
    //     }

    //     Node currentNode = head;

    //     for ( int i = 0; i <= index; i++) {
    //         currentNode = currentNode.next;
    //     }

    //     return currentNode.val;
    // }
    
    // public void addAtHead(int val) {
    //     addAtIndex(0, val);
    // }
    
    // public void addAtTail(int val) {
    //     addAtIndex(size, val);
    // }
    
    // public void addAtIndex(int index, int val) {

    //     if ( index > size) {
    //         return;
    //     }
    //     if (index < 0) {
    //         index = 0;
    //     }

    //     size++;

    //     Node preNode = head;

    //     for (int i = 0; i < index; i++) {
    //         preNode = preNode.next;
    //     }

    //     Node toNode = new Node(val);
    //     toNode.next = preNode.next;
    //     preNode.next = toNode;
    // }
    
    // public void deleteAtIndex(int index) {
    //     if (index < 0 || index >= size) {
    //         return;
    //     }

    //     Node preNode = head;
    //     for (int i = 0; i < index; i++) {
    //         preNode = preNode.next;
    //     }
    //     preNode.next = preNode.next.next;
    //     size--;
    // }

    // class Node {
    //     int val;
    //     Node next;
    //     Node(){}
    //     Node(int val){
    //         this.val = val;
    //     }
    // }

    Node head;
    int size;

    MyLinkedList() {
        head = new Node();
        size = 0;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {

        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }

        Node preNode = head;

        for (int i = 0; i < index; i++) {
            preNode = preNode.next;
        }

        Node insertNode = new Node(val);
        insertNode.next = preNode.next;
        preNode.next = insertNode;
        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        Node preNode = head;

        for (int i = 0; i < index; i++) {
            preNode = preNode.next;
        }
        preNode.next = preNode.next.next;
        size--;
    }


    public int get(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }

        Node currentNode = head;

        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.val;
    }

    class Node {
        int val;
        Node next;

        public Node() {}

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

