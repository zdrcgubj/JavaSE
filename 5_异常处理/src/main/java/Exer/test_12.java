package Exer;

/**
 * @author Liu
 * @create 2022-10-18-20:27
 * @description:
 */
import java.io.*;

class MySuper{

    public void m() throws IOException{}

}

class MySub extends MySuper{

    public void m() throws EOFException, FileNotFoundException {}

}

class MySub2 extends MySub {

    public void m() throws FileNotFoundException{}

}