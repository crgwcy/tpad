package com.crg.tpad.socket;


import com.crg.tpad.model.bean.GsonHelper;
import com.crg.tpad.model.bean.TimerBean;
import com.crg.tpad.util.log.Mylog;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.*;

public class Client implements Cloneable{
    private static String TAG=Client.class.getSimpleName();
     public static void  clietTest()
    {
        try {
            Mylog.printf(TAG,"111");
            //1.创建客户端Socket，指定服务器地址和端口
            Socket socket=new Socket("192.168.8.1", 1688,null/*InetAddress.getLocalHost()*/,5008);
            Mylog.printf(TAG,"222");

            //2.获取输出流，向服务器端发送信息
            OutputStream os=socket.getOutputStream();//字节输出流
            InputStream is=socket.getInputStream();   //字节输入流

            PrintWriter pw=new PrintWriter(os);//将输出流包装为打印流
            //{"apples":"3kg","pastry":"2.4kg","bestEaten":"outdoors","sugar":"1kg"}

            for(int i=0;i<100;i++)
            {
                TimerBean t=new TimerBean(i,i,"good good study, day day up!!!");
                String s= GsonHelper.stringFromObjectNoPolicy(t);
                pw.write(s);
                pw.println();
            }
            pw.flush();
            socket.shutdownOutput();//关闭输出流c
            Mylog.printf(TAG,"333");

      /*
            synchronized (lockObj)
            {
                lockObj.wait(10000);
            }
        */
            //3.获取输入流，并读取服务器端的响应信息

            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String info=null;
            while((info=br.readLine())!=null){
            //    System.out.println("我是客户端，服务器说："+info);
                Mylog.printf(TAG,"来自服务端:%s",info);
            }
            //4.关闭资源
            br.close();
            is.close();
            pw.close();
            os.close();
            socket.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
