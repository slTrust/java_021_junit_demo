package com.xiedaimala.demo;

import java.io.*;

public class FileHelper{
    public static void copy(File f1, File f2) throws IOException {

        String path  = f1.getPath();
        String copyPath = f2.getPath();

        FileInputStream fileInputStream = new FileInputStream(path);
        InputStreamReader reader = new InputStreamReader(fileInputStream,"UTF-8");

        BufferedReader bufferedReader = new BufferedReader(reader);
        String context = "";
        String line = null;
        while(( line = bufferedReader.readLine()) != null){
            // 加 \n 是因为 拼接的时候去掉了
            context += line + "\n";
        }

        reader.close();
        fileInputStream.close();

        FileOutputStream output = new FileOutputStream(copyPath);
        OutputStreamWriter writer = new OutputStreamWriter(output,"UTF-8");
        PrintWriter printWriter = new PrintWriter(writer);

        printWriter.write(context);
        printWriter.close();
        output.close();
    }
}
