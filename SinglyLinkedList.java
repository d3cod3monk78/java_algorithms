class SinglyLinkedList<E> {

	private static class Node<E> {
		private E element;
		private Node<E> next;

		Node(E element, Node<E> next) {
			this.element = element;
			this.next = next;
		}

		public E getElement() {
			return this.element;
		}

		public Node<E> getNext() {
			return this.next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}
	}


	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;

	SinglyLinkedList() {

	}

	public int getSize() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public E first() {
		if(this.size == 0) {
			return null;
		}
		else {
			return this.head.getElement();
		}
	}

	public E last() {
		if(this.size == 0) {
			return null;
		}
		else {
			return this.tail.getElement();
		}
	}

	public void addFirst(E element) {
		this.head = new Node<E>(element , this.head);
		if(this.size == 0) {
			this.tail = this.head;
		}
		this.size++
	}

	public void addLast(E element) {
		if(this.size == 0) {
			this.addFirst(element);
		}
		else {
			Node<E> newest = new Node<E>(element , null);
			this.tail.setNext(newest);
			this.tail = newest;
			this.size++;
		}
	}

	public E removeFirst() {
		if(this.size == 0) {
			return null;
		}

		E value = this.head.getElement();
		this.head = this.head.getNext();
		this.size--;
		if(this.size == 0) {
			this.tail = null;
		}
		return value;
	}

}