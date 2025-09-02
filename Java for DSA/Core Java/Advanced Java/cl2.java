import java.net.*;
import java.util.Scanner;
import java.io.*;
class cl2{
	public static void main(String args[]){
		try{
			Socket s = new Socket("localhost",777);
			System.out.println("Client Started");
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            Scanner sc = new Scanner(System.in);
            String str="";
            String str1="";
            while(!str.equals("bye")&&!str1.equals("bye")){
            System.out.println("Enter the message");
            str = sc.nextLine();
            dos.writeUTF(str);
			DataInputStream dis = new DataInputStream(s.getInputStream());
			str1 = (String)dis.readUTF();
			System.out.println(str1);
            }
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}