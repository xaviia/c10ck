package com.example.mac.magiclock;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by bob on 2015/5/31.
 */
public class SocketClient {



    public String cnnct (String address, int port) {
        try {
            Log.d("happy", "0");
            Socket client = new Socket();
            InetSocketAddress isa = new InetSocketAddress(address, port);
            Log.d("happy", "1");
            client.connect(isa, 10000);
//            BufferedOutputStream out = new BufferedOutputStream(client.getOutputStream());
//            BufferedInputStream in = new BufferedInputStream(client.getInputStream());
//            int numByte = in.available();
//            byte[] buf = new byte[numByte];
//            in.read(buf, 2, 3);
//            for (byte b : buf) {
//                System.out.println((char)b+": " + b);
//            }
            Log.d("happy", "2");
//            // 送出字串
//            out.write((led_number).getBytes());
//            out.flush();
//            out.write("end".getBytes());
//            out.flush();
//            out.close();
//            out = null;
            client.close();
            client = null;
        } catch (java.io.IOException e) {
            System.out.println("Socket error");
            System.out.println("IOException :" + e.toString());
            return  "catch in socket";
        }

        return "hello client";
    }
}