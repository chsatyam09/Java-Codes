import java.io.*; import java.net.*; class Server1{
    public static void main(String[] args) { System.out.println("Rajeev Verma 051");
    try{
    try (ServerSocket serverSocket = new ServerSocket(12345)) { System.out.println("Waiting for Client on port 12345	");
    Socket clienSocket = serverSocket.accept(); System.out.println("Connection Established !!"); InputStream inputStream = clienSocket.getInputStream();
    FileOutputStream fileOutputStream = new FileOutputStream("received_file.txt");
    byte[] buffer = new byte[1024]; int bytesRead;
    while ((bytesRead = inputStream.read(buffer)) != -1){ fileOutputStream.write(buffer, 0, bytesRead);
    }
    System.out.println("File Received Successfully !!"); fileOutputStream.close();
    clienSocket.close();
    }
    }catch(IOException e){ e.printStackTrace();
    }
    }
    }
    