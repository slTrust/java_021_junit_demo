package com.xiedaimala;

import com.xiedaimala.demo.FileHelper;
import com.xiedaimala.demo.FileTemp;
import org.junit.Test;

import java.io.*;
import java.util.logging.FileHandler;

import static org.easymock.EasyMock.mock;
import static org.junit.Assert.assertEquals;

// file mock的操作 https://cloud.tencent.com/developer/ask/37726
public class FileHelperTest {
    @Test
    public void copyTest() throws IOException {
//        assertEquals(HttpStatus.OK, updateCartResponse.getStatusCode());
        String test_classPath = FileHelperTest.class.getClassLoader().getResource("./").getPath();// 获取当前路径下类的编译路径
        File testDir = new File(test_classPath);
        String resources_path = testDir.getParent() + "/classes/";
        String file1Path = resources_path + "input.txt";
        String file2Path = resources_path + "output.txt";
        File file1 = new File(file1Path);
        File file2 = new File(file2Path);
        FileHelper.copy(file1,file2);

        String content1 = "";
        String content2 = "";

        content1 = txt2String(file1);
        content2 = txt2String(file2);
        // 文件内容一致
        assertEquals(content1,content2);

    }

    public static String txt2String(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append( s );
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
}
