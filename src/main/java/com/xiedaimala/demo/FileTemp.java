package com.xiedaimala.demo;

import java.io.*;
public class FileTemp {
    public static void main(String[] args) throws IOException {
        // 路径问题 https://www.cnblogs.com/acm-bingzi/p/mavenResources.html
        // 读取 resources下的文件
        // https://blog.csdn.net/sinat_26422099/article/details/78583392
        //src/main/resouces目录下的文件会编译在target\classes目录下
        String resources_path = FileTemp.class.getClassLoader().getResource("./").getPath();// 获取当前路径下类的编译路径
        System.out.println(resources_path);
        FileHelper.copy(new File(resources_path + "input.txt"), new File(resources_path + "output.txt"));
    }
}

