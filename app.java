//program to show the use of DataInputStream and DataOutputStream classes for reading and writing primitive data type
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;
class app
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("E:\\r.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(50000);
		dos.writeShort(2500);
		dos.writeByte(120);
		dos.writeChar(66);
		dos.close();
		
		FileInputStream fis=new FileInputStream("E:\\r.txt");
		DataInputStream dis=new DataInputStream(fis);
		System.out.println("Int :"+dis.readInt());
		System.out.println("Short :"+dis.readShort());
		System.out.println("Byte :"+dis.readByte());
		System.out.println("Char :"+dis.readChar());
		dis.close();
	}
}