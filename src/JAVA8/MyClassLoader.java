package JAVA8;

import java.io.*;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2020-2-14:2020
 * Des:
 */
public class MyClassLoader extends  ClassLoader {
    private  String classPath;
    private  String LoaderName;

    public MyClassLoader(String classPath, String loaderName) {
        this.classPath = classPath;
        LoaderName = loaderName;
    }

    //定义findClass方法
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] b = loadClassData(name);
        return defineClass(b, 0, b.length);
    }

    private byte[] loadClassData(String name) {
        name  = classPath + name +".class";
        FileInputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            in = new FileInputStream(new File(name));
            out = new ByteArrayOutputStream();
            int i = 0;
            while ((i = in.read()) != -1){
                out.write(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return  out.toByteArray();
    }

}
