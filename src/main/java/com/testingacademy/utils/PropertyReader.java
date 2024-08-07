package com.testingacademy.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public PropertyReader() {

            }

     public static String  readkey(String key) throws IOException {
//        to read propertyfile
         FileInputStream fileInputStream = null;
         Properties p = null; // it is preclass created it is used for read key

         try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/Data.property");  //file path of data.property
             p = new Properties();
             p.load(fileInputStream);
         }catch (Exception ex){
             ex.printStackTrace();
         } finally {
             try {
                 fileInputStream.close();
             }catch (Exception ex){
                 ex.printStackTrace();
             }

         }
//         in common to all when i have called property reader function then throwing io exception thats why i am add try catch here only

        return p.getProperty(key);
     }




}
