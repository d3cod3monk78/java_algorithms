class DoublyLinkedList<E> {

	private static class Node<E> {
		private Node<E> prev;
		private Node<E> next;
		private E element;

		Node(E element, Node<E> prev, Node<E> next) {
			this.element = elementl;
			this.prev = prev;
			this.next = next;
		}

		public E getElement() {
			return this.element;
		}

		public Node<E> getPrev() {
			return this.pre;
		}

		public Node<E> getNext() {
			return this.next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}
	}

	private Node<E> header;
	private Node<E> tailer;
	private int size = 0;

	DoublyLinkedList() {
		this.header = new Node<E>(null, null, null);
		this.tailer = new Node<E>(null, this.header, null);
		this.header.setNext(this.tailer);
	}

	public int getSize() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public E first() {
		if(this.size == 0) return null;
		return this.header.getNext().getElement();
	}

	public E last() {
		if(this.size == 0) return null;
		return this.tailer.getPrev().getElement();
	}

	public void addBetween(E element, Node<E> predecessor, Node<E> successor) {
		Node<E> newest = new Node<E>(element, predecessor, successor);
		predecessor.setNext(newst);
		successor.setPrev(newest);
		this.size++;
	}

	public void addFirst(E element) {
		this.addBetween(element, this.header, this.header.getNext());
	}

	public void addLast(E element) {
		this.addBetween(element, this.tailer.getPrev(), this.tailer);
	}

	public E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		this.size--;
		return node.getElement();
	}

	public E removeFirst() {
		if(this.size == 0) return null;
		return this.remove(this.header.getNext());
	}

	public E removeLast() {
		if(this.size == 0) return null;
		return this.remove(this.tailer.getPrev());
	}
}