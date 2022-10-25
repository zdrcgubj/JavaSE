package Exer;

/**
 * @author Liu
 * @create 2022-10-18-20:09
 * @description:
 */
import java.io.IOException;

class Super{

    public void ma() throws IOException{}

}

interface IA{

    void mb();

}

public class test_08 extends Super implements IA{

    public void ma() throws IOException{

    }//1\_\_\_\_\_\_{}

    public void mb() {

    }//2\_\_\_\_\_\_{}

}
