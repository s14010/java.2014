import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}

class Ex2_0 extends Ex{
	void execute(){
		int x;
		int y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

class Ex2_1 extends Ex{
        void execute(){
                double x ;
                double y ;

                x = 63;
                y = 18;

                System.out.println("xの値は" + x + "です。");
                System.out.println("yの値は" + y + "です。");
                System.out.println("合計は" + (x + y) + "です。");
                System.out.println("平均は" + (x + y) / 2 + "です。");
        }
}

class Ex2_2 extends Ex{
        void execute(){
              int x ;
              int y ;
              int z ;

              x = 10;
              y = 20;
              z = 31;

              System.out.println("合計は" + (x + y + z) + "です。");
              System.out.println("平均は" + (x + y + z) / 3 + "です。");
        }
}
public class Ex2 {
	public static void main(String[] args){
		Ex a;
		a = new Ex2_0();
		a.execute();
                a = new Ex2_1();
                a.execute();
                a = new Ex2_2();
                a.execute();
	}
}
