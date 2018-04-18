import java.io.*;
import java.util.zip.*;

public class Dezip {
	
	public static void main(String[] args)throws Exception {
	File f1=new File("/home/m-besnard/fichier2.zip");
	FileInputStream fis=new FileInputStream(f1);
	BufferedInputStream bis=new BufferedInputStream(fis);
	ZipInputStream zis=new ZipInputStream(bis);
	ZipEntry ze=zis.getNextEntry();
	File f2=new File(ze.getName());
	FileOutputStream fos=new FileOutputStream(f2);
	BufferedOutputStream bos=new BufferedOutputStream(fos);
	int c;
	while((c=zis.read())!=-1){
	bos.write(c);
	}
	zis.close(); bos.close();
	System.out.println("Capacite de "+f1.getName()+" est :"+f1.length());
	System.out.println("Capacite de "+f2.getName()+" est :"+f2.length());
	}
	}

