package com.kagi.file;

import java.io.*;
import java.nio.charset.Charset;

public class SampleFileApi {

    public static void main(String[] args) {
        String dirPath = "C:/Users/user/Desktop";
        String fileName = "메모.txt";
        String charSet = "UTF-8";

        try {
            readFile(dirPath, fileName, charSet);
        } catch (Exception e) {}

    }

    public static void readFile(String dirPath, String fileName, String charSet) throws IOException {
        String fileFullPath = dirPath + "/" + fileName;
        FileInputStream fis = new FileInputStream(fileFullPath);
        InputStreamReader isr = new InputStreamReader(fis, Charset.forName(charSet));
        BufferedReader br = new BufferedReader(isr);

        String line = "";
        System.out.println("==== 파일 읽기 시작");
        while ( (line = br.readLine()) != null ) {
            System.out.println(line);
        }

        System.out.println("==== 파일 읽기 종료");

    }
}
