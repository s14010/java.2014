import java.util.Arrays;
class Ex4{

	public int [] ex4_1(int [] a){
                  Arrays.sort(a);
                  return a;
	}

	public int [] ex4_2(int [] a){
              Arrays.sort(a);
              int size = a.length;
              int[] b = new int[size];

              for(int i=0; size > 0; i++){
                b[i] = a[--size];
              }
            return b;
	}

	public String [] ex4_3(int [] a){
	      int len = a.length;
              String[] hantei = new String[len];
              for(int i = 0; i <= len - 1; i++){
                if(a[i] < 0){
                  hantei[i] = "負";
                }else if(a[i] > 0){
                  hantei[i] = "正";
                }else{
                  hantei[i] = "零";
                }
              }
		return hantei;
	}

	public int ex4_4(int a){
          String s = Integer.toString(a);
          int len = s.length();
		return len;

	}

	public int ex4_5(int a){
          int total = 0;
	    for(int i = 0; i <= a; i++){
              total += i;
            }
		return total;

	}
}
