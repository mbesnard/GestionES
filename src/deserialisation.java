import java.io.*;
	
public class deserialisation{

	public static void main(String[] args) throws Exception {
	File f=new File("banque.txt");
	FileInputStream fis=new FileInputStream(f);
	ObjectInputStream ois=new ObjectInputStream(fis);
	deserialisation op1=(deserialisation) ois.readObject();
	deserialisation op2=(deserialisation) ois.readObject();
	System.out.println("Num:"+op1.getNumeroOperation());
	System.out.println("Date:"+op1.getDateOperation());
	System.out.println("Compte:"+op1.getNumeroCompte());
	System.out.println("Type:"+op1.getTypeOperation());
	System.out.println("Montant:"+op1.getMontant());
	}
	}
