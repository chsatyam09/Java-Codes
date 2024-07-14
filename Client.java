import java.io.*; import java.net.*;

class Client1{
public static void main(String[] args) { System.out.println("Sahaj Verma 043");
try{
Socket socket = new Socket("localHost", 12345); System.out.println("Connection Established !!");

OutputStream outputStream = socket.getOutputStream(); FileInputStream fileInputStream = new
FileInputStream("file_to_send.txt");
byte[] buffer = new byte[1024]; int bytesRead;
while((bytesRead = fileInputStream.read(buffer)) != -1){ outputStream.write(buffer, 0, bytesRead);
}
System.out.println("File Sent Successfully"); fileInputStream.close();
socket.close();
}
catch(IOException e){ e.printStackTrace();
}
}}
