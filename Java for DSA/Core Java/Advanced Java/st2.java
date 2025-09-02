import java.io.*;
import java.net.*;
import java.util.Scanner;
class st2{
	public static void main(String args[]){
		try{
			ServerSocket s1 = new ServerSocket(777);
			System.out.println("Server Staretd... Waiting for Client");
			Socket s = s1.accept();
			System.out.println("Client called");
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str1="";
			String str2="";
			while(!str1.equals("bye")&&!str2.equals("bye")){
				String str = (String) dis.readUTF();
				System.out.println("Client says: "+str);
				Scanner sc = new Scanner(System.in);
                System.out.println("Enter the message");
                str = sc.nextLine();
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			    dos.writeUTF(str);
            }
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
} 
