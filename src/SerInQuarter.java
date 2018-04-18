
import java.io.*;
import java.beans.*;

public class SerInQuarter {

public static void main(String[] args) throws Exception {
int objectCount = 0;
XML object = null;
FileInputStream fis = new FileInputStream("JunkObjects.xml");
XMLDecoder decoder = new XMLDecoder(fis);
while (objectCount < 3) {
object = (XML)decoder.readObject();
objectCount++;
System.out.println("Object n°"+objectCount+": "+object);
}
decoder.close();
}
}