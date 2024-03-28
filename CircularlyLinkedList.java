class CircularlyLinkedList<E> {

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

	private Node<E> tail = null;
	private int size = 0;

	CircularlyLinkedList() {

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

		return this.tail.getNext().getElement();
	}

	public E last() {
		if(this.size == 0) {
			return null;
		}

		return this.tail.getElement();
	}

	public void addFirst(E element) {
		if(this.size == 0) {
			this.tail = new Node<E>(element, null);
			this.tail.setNext(this.tail);
		}
		else {
			Node<E> newest = new Node<E>(element, this.tail.getNext());
			this.tail.setNext(newest);
		}
		this.size++;
	}

	public void addLast(E element) {
		this.addFirst(element);
		this.tail = this.tail.getNext();
	}

	public E removeFirst() {
		if(this.size == 0) {
			return null;
		}
		else {
			Node<E> head = this.tail.getNext();
			E value = head.getElement();
			this.size--;
			if(this.size == 0) {
				this.tail = null;
			}
			else {
				this.tail.setNext(head.getNext());
			}

			return value;
		}
	}
}