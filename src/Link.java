
public class Link {
	public String linkData;

	public Link next;

	Link(String element) {
		linkData = element;
	}

	public void printLink() {
		System.out.println(linkData);
	}

	public String toString() {
		return linkData;
	}

	public static void main(String[] args) {
		LinkList sampleLinkList = new LinkList();
		sampleLinkList.insertList(new Link("Shubham"));
		sampleLinkList.insertList(new Link("Amit"));
		sampleLinkList.insertList(new Link("Mayank"));
		sampleLinkList.insertList(new Link("Anil"));
		sampleLinkList.insertList(new Link("Harsh"));
		sampleLinkList.insertList(new Link("Gajraj"));

		sampleLinkList.printLinkList(); 
		System.out.println("----");
		
		sampleLinkList.removeElement("Amit");

		sampleLinkList.printLinkList();
		System.out.println("====");

	}
}
