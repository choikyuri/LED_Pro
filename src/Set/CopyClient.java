package Set;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread{
   
   //���� ������ ���� ��ü��
   Socket s; //Ŭ���̾�Ʈ ����
   BufferedReader in;
   public PrintWriter out;
   ChatServer server;
   String ip;
   
   public CopyClient(Socket s, ChatServer server) {
      this.s=s; //Ŭ���̾�Ʈ
      this.server=server; //����
      
      try {
         
         in=new BufferedReader(new InputStreamReader(s.getInputStream()));
         out=new PrintWriter(s.getOutputStream(), true); //true : append(�߰�)
         ip=s.getInetAddress().getHostAddress(); //Ŭ���̾�Ʈ ip
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   @Override
   public void run() {
      while(true) {
         try {
            
            String msg=in.readLine();
            
            if(msg.equals("xx:~X")) {
               out.println("xx:~X");
               
               server.removeClient(this);
               break;
            }
            
            //������ - ���и�
            if(ip.equals("172.16.10.18")) {
               server.sendMessage("������ : " + msg);
            }else {
               server.sendMessage("�� : " + msg);
            }
               
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }
}