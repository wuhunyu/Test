package com.wuhunyu;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Receive {

    public static void main(String[] args) throws IOException {
        InetSocketAddress inetSocketAddress = new InetSocketAddress(8888);
        DatagramChannel datagramChannel = DatagramChannel.open();
        datagramChannel.bind(inetSocketAddress);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        while (true) {
            datagramChannel.receive(byteBuffer);
            byteBuffer.flip();
            System.out.println(StandardCharsets.UTF_8.decode(byteBuffer));
            byteBuffer.clear();
        }
    }

}
