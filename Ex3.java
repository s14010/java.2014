class Ex3{

	public String ex3_0(int n){
          if(n>0){
	    return "その値は正です";
          }else{
            return "その値は０か負です";
          }

	}

	public int ex3_1(int n){
	  
		return Math.abs(n);

	}

	public String ex3_2(int a, int b){
          if(a % b == 0){
		return b + "は" + a + "の約数です";
          }else{
          return b + "は" + a + "の約数ではありません";
          }
	}

	public String ex3_3(int a, int b){
          if(a > b){
          return a + "の方が大きいです";
          }else if(a < b){
          return b + "の方が大きいです";
          }else{
          return "同じ値です";
          }
	  

	}

	public String ex3_4(int a){
          if(a < 0){
          return "正でない整数値です";
          }else if(a % 5 ==0){
          return "その値は5で割り切れます";
          }else{
          return "その値は5で割り切れません";
          }

	}

	public String ex3_5(int a){
          if(a % 10 ==0){
          return "その値は10の倍数です";
          }else if(a < 0){
          return "正でない整数値です";
          }else{
          return "その値は10の倍数ではありません";
          }
	}
	
	public String ex3_6(int a){
          if(a < 0){
          return "正でない整数値です";
          }else if(a % 3 ==0){
          return "その値は3で割り切れます";
          }else if(a % 3 == 1){
          return "その値を3で割った余りは1です";
          }else{
          return "その値を3で割った余りは2です";
          }
	}

	public String ex3_7(int a){
          if(a > 100){
          return "範囲(0～100)外の値です";
          }else if(a >= 80){
          return "優";
          }else if(a >= 70){
          return "良";
          }else if(a >= 60){
          return "可";
          }else if(a < 0){
          return "範囲(0～100)外の値です";
          }else{
          return "不可";
          }
	}

	public double ex3_8(double a, double b){
	 return Math.max(a,b);
	}

	public int ex3_9(int a, int b){
	  return Math.abs(a-b);
	}

	public String ex3_10(int a, int b){
	  if(Math.abs(a-b) >= 11){
          return "それらの差は11以上です";
          }else{
          return "それらの差は10以下です";
          }
	}

	public int ex3_11(int a, int b, int c){
          int d = Math.min(a,b);
          int e = Math.min(d,c);
          return e;
	}

	public int ex3_12(int a, int b, int c){
          if(a >= b){
            if(b > c){
              return b;
            }else if(a < c){
              return a;
            }else{
              return c;
            }
          }else if(b > c){
            return c;
          }else if(a > c){
            return a;
          }else{
            return b;
          }
        }

	public String ex3_13(int a){
          
          if((a <= 12) && (a > 1)){
            if((a == 12) || (a <= 2)){
              return "冬";
            }else if(a <= 5){
              return "春";
            }else if(a <= 8){
             return "夏";
            }else{
              return "秋";
            }
          }else{
            return "範囲(1～12)外の値です";
          }

         }
}

