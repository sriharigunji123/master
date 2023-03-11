
import java.util.*;

class Students1{
	int rollno;
	String name;
	Students1(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
		
	}
}
public class CollectionsDemo {

	public static void main(String[] args) {
		Students1 s1= new Students1(1,"anil");
		Students1 s2= new Students1(52,"mano");
		Students1 s3= new Students1(25,"opal");
		Students1 s4= new Students1(64,"balil");
		Students1 s5= new Students1(19,"gona");
		List<Students1> stdList= new  Vector<Students1>();
		
		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		stdList.add(s4);
		stdList.add(s5);
		
		for(Students1 s: stdList)
		{
			System.out.println("Name :"+s.name+" Roll:  "+s.rollno);
		}
		
		//List<String> l = new ArrayList<String>();
		//List<String> l = new LinkedList<String>();
		//List<String> l = new Stack<String>();
		//List<String> l = new Vector<String>();
		//Queue<String> l = new PriorityQueue<String>();
		//Set<String> l = new HashSet<String>();
		Set<String> l = new LinkedHashSet<String>();

		
		for(String k :l) {
			System.out.println(k);	
		}
		
		
		
		
		
		

	}

}
