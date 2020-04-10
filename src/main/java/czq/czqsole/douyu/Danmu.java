package czq.czqsole.douyu;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * Author: BG366783
 * Date: 2019/1/28 1:32 AM
 */
public class Danmu {

    public static String DANMU_HOST = "openbarrage.douyutv.com";
    public static int DANMU_PORT = 8601;

    public void login() throws IOException {
        Socket socket = new Socket(DANMU_HOST, DANMU_PORT);
//        SocketAddress address = new InetSocketAddress(DANMU_HOST, DANMU_PORT);
//        socket.connect(address);
        //socket.c
    }

    public static void main(String[] args) {

    }
}
