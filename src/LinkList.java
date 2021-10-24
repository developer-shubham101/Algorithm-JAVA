public class LinkList {

	public Link currentList;

	public LinkList() {
		currentList = null;
	}

	public boolean isEmpty() {
		return currentList == null;
	}

	public void insertList(Link item) {
		item.next = currentList;
		currentList = item;
	}

	public void printLinkList() {
		Link theLink = currentList;
		while (theLink.next != null) {
			theLink.printLink();
			theLink = theLink.next;
		}
	}


	public void removeElement(String element) {
		Link theLink = currentList;
		while (theLink.next != null) {
			if (theLink.linkData.equals(element)){
				theLink = theLink.next.next;
				return;
			}else{
				theLink = theLink.next;
			}
		}

	}

}