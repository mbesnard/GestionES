import java.io.*;import java.util.zip.*;
public class Zip {
	public static void main(String[] args) throws Exception {
	File f1=new File("/home/m-besnard/fichier2.txt");
	FileInputStream fis=new FileInputStream(f1);
	BufferedInputStream bis=new BufferedInputStream(fis);
	File f2=new File("/home/m-besnard/fichier2.zip");
	FileOutputStream fos=new FileOutputStream(f2);
	BufferedOutputStream bos=new BufferedOutputStream(fos);
	ZipOutputStream zos=new ZipOutputStream(bos);
	zos.setMethod(ZipOutputStream.DEFLATED);
	zos.putNextEntry(new ZipEntry(f1.getName()));
	int c;
	while((c=bis.read())!=-1){
	zos.write(c);
	}
	bis.close(); zos.close();
	System.out.println("Capacite de "+f1.getName()+" est :"+f1.length());
	System.out.println("Capacite de "+f2.getName()+" est :"+f2.length());
	}
	}