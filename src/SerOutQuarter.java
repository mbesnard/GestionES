import java.io.*;
	import java.beans.*;
public class SerOutQuarter {

	

	public static void main(String[] args) throws Exception {
	XML obj1 = new XML("A",12);
	XML obj2 = new XML("B",13);
	XML obj3 = new XML("V",14);
	FileOutputStream fos = new FileOutputStream("JunkObjects.xml");
	XMLEncoder encoder = new XMLEncoder(fos);
	encoder.writeObject(obj1);
	encoder.writeObject(obj2);
	encoder.writeObject(obj3);
	System.out.println("obj1: " + obj1);
	System.out.println("obj2: " + obj2);
	System.out.println("obj3: " + obj3);
	encoder.close();
	fos.close();
	}
	}

