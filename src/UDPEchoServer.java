//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPEchoServer {
    public UDPEchoServer() {
    }

    public static void main(String[] var0) {
        short var1 = 8000;
        DatagramSocket var2 = null;

        try {
            var2 = new DatagramSocket(var1);
            System.out.println("Created UDP Echo Server on port" + var1);
        } catch (IOException var7) {
            System.out.println(var7);
            System.exit(1);
        }

        try {
            byte[] var3 = new byte[1024];
            DatagramPacket var4 = new DatagramPacket(var3, var3.length);

            while(true) {
                var2.receive(var4);
                String var5 = new String(var4.getData(), 0, var4.getLength());
                System.out.println("Received from server: " + var5);
                var2.send(var4);
            }
        } catch (IOException var6) {
            System.out.println(var6);
        }
    }
}
