package student;
import java.util.*;

public class lincked_list {

	public static void main(String[] args) {
		LinkedList<String> CourseName=new LinkedList<String>();
		CourseName.addFirst("Sap");
		CourseName.addLast("Sybase");
		CourseName.addFirst("java");
		CourseName.addFirst("java");
		CourseName.removeFirstOccurrence("java");
		CourseName.removeLastOccurrence("Java");
		CourseName.removeFirst();
		CourseName.removeLast();
		Object getFirst=CourseName.getFirst();
		System.out.println("getFirst:"+getFirst);
		Object getLast=CourseName.getLast();
		System.out.println("getLast:"+getLast);
		// TODO Auto-generated method stub

	}

}
