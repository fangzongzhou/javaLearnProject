
package com.fzz.logging;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;




/**
 * @author fangzongzhou
 */
public class FileLogger implements Logger {

    private FileChannel fileChannel;


    FileLogger() throws IOException {
        File file = new File("log.log");
        long poi = file.length();

        fileChannel = new FileOutputStream(file,true).getChannel();
        fileChannel.position(poi);
    }




    @Override
    // TODO: 2019/8/14 异步刷缓存
    public void info(String info)  {

        LogInfo logInfo = Info.of(info);



        byte[] bytes = logInfo.getByteArr();

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(bytes.length);
        byteBuffer.put(bytes);
        byteBuffer.flip();
        try {
            fileChannel.write(byteBuffer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        byteBuffer.clear();

    }
}
