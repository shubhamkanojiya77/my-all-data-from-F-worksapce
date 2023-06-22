package newbegining;
import java.util.LinkedList;
import java.util.Vector;
public class collection {

	public static void main(String[] args) {
	
LinkedList <Object> t=new LinkedList <Object>();

t.add(5);
t.add(10);
t.add(35);
t.add(55);
t.add(30);
t.add(25);	
t.add(25);
t.add(65);// index -7 , size -8

System.out.println("collection:" + t);
System.out.println(t.size());
    System.out.println("collection:" + t);	
   /* t.remove(3);
	System.out.println("collection:" + t);
	/*t.removeAll(t);
	System.out.println("collection:" + t);*/
	/*t.add(6,99);
	System.out.println("collection:" + t);
	/*t.addAll(7,t);
	System.out.println("collection:" + t);
	/*t.clear();
	System.out.println("collection:" + t);*/
    System.out.println(t.contains(3));
	System.out.println("collection:" + t);
	System.out.println(t.contains(35));
	System.out.println("collection:" + t);
	System.out.println(t.add(77));
	System.out.println("collection:" + t);
	System.out.println(t.retainAll(t));
	System.out.println("collection:" + t);
	
    System.out.println(t.set(3,100));
    System.out.println("collection:" + t);
	
/*t.Toarray(25)
System.out.println("collection:" + t);*/
    t.add(3,97);
	System.out.println("collection:" + t);
	t.remove(3);
	System.out.println("collection:" + t);
	t.set(5,1002);
	System.out.println("collection:" + t);
	System.out.println(t.get(7));
	System.out.println(t.getFirst());
	System.out.println(t.getLast());
	
	System.out.println(t.removeFirst());
	System.out.println("collection:" + t);
	System.out.println(t.removeLast());
	System.out.println("collection:" + t);
	
	/*System.out.println(t.AddFirst(200));
	System.out.println("collection:" + t);
	
	System.out.println(t.addLast(101));
	System.out.println("collection:" + t);*/
	System.out.println("from here vector collection:" );
	Vector<Object> obj=new Vector <Object>();
	
	obj.addElement(215);
	obj.addElement(231);
	obj.addElement(250);
	obj.addElement(281);
	obj.addElement(381);
	
	System.out.println("collection:" + obj);
	
	System.out.println(obj.elementAt(2));
	System.out.println(obj.remove(2));
	System.out.println("collection:" + obj);
	System.out.println(obj.firstElement());
	System.out.println(obj.lastElement());
	System.out.println(obj.capacity());
	System.out.println(obj.elements());
}
}