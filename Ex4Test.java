import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Ex4Test {

	@Test
	public void ex4_1_1(){
		Ex4 ex4 = new Ex4();
		int[] expected = {-3, -2, -1, 0, 1, 2, 3};
		int[] test = {3, 2, 1, 0, -1, -2, -3};
		int[] actual = ex4.ex4_1(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_1_2(){
		Ex4 ex4 = new Ex4();
		int[] expected = {-6, -5, -4, -3, -2, -1, 0};
		int[] test = {0, -3, -1, -6, -5, -2, -4};
		int[] actual = ex4.ex4_1(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_1_3(){
		Ex4 ex4 = new Ex4();
		int[] expected = {0, 1, 2, 3, 4, 5, 6};
		int[] test = {0, 3, 1, 6, 5, 2, 4};
		int[] actual = ex4.ex4_1(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_1_4(){
		Ex4 ex4 = new Ex4();
		int[] expected = {-6, -6, -3, -3, -1, -1, 0};
		int[] test = {0, -3, -1, -6, -3, -1, -6};
		int[] actual = ex4.ex4_1(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_1_5(){
		Ex4 ex4 = new Ex4();
		int[] expected = {0, 2, 2, 4, 4, 5, 5};
		int[] test = {0, 4, 2, 5, 5, 2, 4};
		int[] actual = ex4.ex4_1(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_2_1(){
		Ex4 ex4 = new Ex4();
		int[] expected = {3, 2, 1, 0, -1, -2, -3};
		int[] test = {-3, -2, -1, 0, 1, 2, 3};
		int[] actual = ex4.ex4_2(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_2_2(){
		Ex4 ex4 = new Ex4();
		int[] expected = {0, -1, -2, -3, -4, -5, -6};
		int[] test = {0, -3, -1, -6, -5, -2, -4};
		int[] actual = ex4.ex4_2(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_2_3(){
		Ex4 ex4 = new Ex4();
		int[] expected = {6, 5, 4, 3, 2, 1, 0};
		int[] test = {0, 3, 1, 6, 5, 2, 4};
		int[] actual = ex4.ex4_2(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_2_4(){
		Ex4 ex4 = new Ex4();
		int[] expected = {0, -1, -1, -3, -3, -6, -6};
		int[] test = {0, -3, -1, -6, -3, -1, -6};
		int[] actual = ex4.ex4_2(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_2_5(){
		Ex4 ex4 = new Ex4();
		int[] expected = {5, 5, 4, 4, 2, 2, 0};
		int[] test = {0, 4, 2, 5, 5, 2, 4};
		int[] actual = ex4.ex4_2(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_3_1(){
		Ex4 ex4 = new Ex4();
		String[] expected = {"負", "負", "負", "零", "正", "正", "正"};
		int[] test = {-3, -2, -1, 0, 1, 2, 3};
		String[] actual = ex4.ex4_3(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_3_2(){
		Ex4 ex4 = new Ex4();
		String[] expected = {"零", "負", "負", "負", "負", "負", "負"};
		int[] test = {0, -3, -1, -6, -5, -2, -4};
		String[] actual = ex4.ex4_3(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_3_3(){
		Ex4 ex4 = new Ex4();
		String[] expected = {"零", "正", "正", "正", "正", "正", "正"};
		int[] test = {0, 3, 1, 6, 5, 2, 4};
		String[] actual = ex4.ex4_3(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_3_4(){
		Ex4 ex4 = new Ex4();
		String[] expected = {"零", "負", "正", "負", "正", "負", "正"};
		int[] test = {0, -3, 1, -6, 5, -2, 4};
		String[] actual = ex4.ex4_3(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_3_5(){
		Ex4 ex4 = new Ex4();
		String[] expected = {"零", "正", "負", "正", "負", "正", "負"};
		int[] test = {0, 3, -1, 6, -5, 2, -4};
		String[] actual = ex4.ex4_3(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_4_1(){
		Ex4 ex4 = new Ex4();
		int expected = 4;
		int test = 1254;
		int actual = ex4.ex4_4(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_4_2(){
		Ex4 ex4 = new Ex4();
		int expected = 6;
		int test = 111111;
		int actual = ex4.ex4_4(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_4_3(){
		Ex4 ex4 = new Ex4();
		int expected = 1;
		int test = 4;
		int actual = ex4.ex4_4(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_4_4(){
		Ex4 ex4 = new Ex4();
		int expected = 2;
		int test = 33;
		int actual = ex4.ex4_4(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_4_5(){
		Ex4 ex4 = new Ex4();
		int expected = 10;
		int test = 1234567890;
		int actual = ex4.ex4_4(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_5_1(){
		Ex4 ex4 = new Ex4();
		int expected = 55;
		int test = 10;
		int actual = ex4.ex4_5(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_5_2(){
		Ex4 ex4 = new Ex4();
		int expected = 4950;
		int test = 99;
		int actual = ex4.ex4_5(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_5_3(){
		Ex4 ex4 = new Ex4();
		int expected = 50015001;
		int test = 10001;
		int actual = ex4.ex4_5(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_5_4(){
		Ex4 ex4 = new Ex4();
		int expected = 50025003;
		int test = 10002;
		int actual = ex4.ex4_5(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex4_5_5(){
		Ex4 ex4 = new Ex4();
		int expected = 49995000;
		int test = 9999;
		int actual = ex4.ex4_5(test);
		assertThat(actual, is(expected));
	}

	// エントリーポイント
	public static void main(String[] args){
		org.junit.runner.JUnitCore.main(Ex4Test.class.getName());
	}
}
