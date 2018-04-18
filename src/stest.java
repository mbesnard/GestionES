import java.io.*;
	import java.util.Date;
	
public class stest {
	public static void main(String[] args) throws Exception {
	serialisation op1=new serialisation(1,new Date(), "CC1", "V", 40000);
	serialisation op2=new serialisation(2,new Date(), "CC1", "R", 6000);
	File f=new File("banque.txt");
	FileOutputStream fos=new FileOutputStream(f);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(op1);
	oos.writeObject(op2);
	oos.close();
	
	}

	}
