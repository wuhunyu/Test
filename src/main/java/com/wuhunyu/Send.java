package com.wuhunyu;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.charset.StandardCharsets;

public class Send {

    public static void main(String[] args) throws IOException {
        InetSocketAddress socketAddress = new InetSocketAddress("localhost", 8888);
        DatagramChannel datagramChannel = DatagramChannel.open();

        ByteBuffer buffer = ByteBuffer.wrap(new String("我是wuhunyu").getBytes(StandardCharsets.UTF_8));
        datagramChannel.send(buffer, socketAddress);
        buffer.clear();

        buffer = ByteBuffer.wrap(new String("我是wuhunyu2号呀").getBytes(StandardCharsets.UTF_8));
        datagramChannel.send(buffer, socketAddress);
        buffer.clear();
        datagramChannel.close();
    }

}
