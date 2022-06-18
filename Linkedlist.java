package DSA;

public class Linkedlist 
{
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
			next=null;
		}
	}
	
	public void push( int new_data)
	{
		Node new_node= new Node(new_data);
		new_node.next=head;
		head=new_node;
		
	}
	
	public void append(int new_data)
	{
		Node new_node = new Node(new_data);
		Node last = head;
		new_node.next=null;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=new_node;
		return;
		
	}
	
	public void delete(int new_data)
	{
		Node curr = head,prev=null;
		
		if(curr!=null && curr.data==new_data)
		{
			
			head=curr.next;
			curr=null;
			return;
		}
		
		while(curr!=null && curr.data!=new_data )
		{
			prev=curr;
			curr=curr.next;			
		}
		if(curr==null)
		{
			return;
		}
		prev.next=curr.next;
		curr=null;
		
	}
	
	public int count()
	{
		Node curr=head;
		int c = 0;
		while(curr!=null)
		{
			c++;
			curr=curr.next;
		}
		return c;
	}
	
	public void search(int key)
	{
		int flag=0,index=0;
		Node curr =head;
		while(curr!=null)
		{
			if(curr.data==key)
			{
				flag=1;
				break;
			}
			curr=curr.next;
			index++;
		}
		if(flag==1)
		{
			System.out.println("key found at "+ index);
		}
		else
		{
			System.out.println("key not found");
		}
		
	}
	
	
	public void printlist()
	{
		Node n =head;
		while(n!=null)
		{
			System.out.print(n.data+" " );
			 n=n.next;
		}
	}
	

	public static void main(String[] args) 
	{
		Linkedlist llist = new Linkedlist();
		llist.head= new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		llist.head.next=second;
		second.next=third;
		
		System.out.println("original list");
		llist.printlist();
		
		llist.append(4);
		llist.append(6);
		llist.append(7);
		llist.append(8);
		System.out.println("\nlist after append of 4,5,6,7,8");
		llist.printlist();
		
		llist.push(5);
		System.out.println("\nlist after push of 5");
		llist.printlist();
		
		llist.delete(4);
		System.out.println("\nlist after delete of 4");
		llist.printlist();
		
		System.out.println("\nlength of linked list");
		int x= llist.count();
		System.out.println(x);
		
		llist.search(6);
	}

}
