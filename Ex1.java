abstract class Ex {
	abstract void execute();
}

class Ex1_0 extends Ex {
	void execute(){
		System.out.println("Hello World!");
	}
}

class Ex1_2 extends Ex {
	void execute(){
		System.out.println("諸\n見\n里\n磨\n人");
	}
}

class Ex1_3 extends Ex {
        void  execute(){
                System.out.println("諸\n見\n里\n\n磨\n人");
        }
}
public class Ex1 {
	public static void main(String[] args){
		Ex a;
		a = new Ex1_0();
		a.execute();
		a = new Ex1_2();
		a.execute();
                a = new Ex1_3();
                a.execute();
	}
}
