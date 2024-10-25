import java.io.*;

public class DocFile {
    public static void main(String[] args) {
        try{   // tự tạo ra file int.txt
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("Int.txt"));
        int i = 100;
        dos.writeInt(i);
        dos.close();

        FileInputStream fis = new FileInputStream("Int.txt");
        DataInputStream dis = new DataInputStream(fis);
        int readValue = dis.readInt();
        System.out.println(i);
        dis.close();
        }
        catch(IOException e){
            System.out.println("Loi !!"); 
        } 

        
    }
}
