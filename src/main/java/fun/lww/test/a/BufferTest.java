package fun.lww.test.a;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferTest {

    public static void main(String[] args) throws IOException {

        ByteBuffer byteBuffer = ByteBuffer.allocate(48);

        RandomAccessFile randomAccessFile = new RandomAccessFile("C:\\Users\\liweiwei\\Desktop\\123.txt", "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();

        int bytesRead = fileChannel.read(byteBuffer);
        byteBuffer.put((byte) 9);

        while (bytesRead != -1) {
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                System.out.println(byteBuffer.get());
            }
            byteBuffer.clear();
            bytesRead = fileChannel.read(byteBuffer);
        }
        randomAccessFile.close();
    }
}
