package com.zhongyangLi.pla;

public class PLA {

	public static void main(String[] args) {
		float[][] x = { { 3, 3 }, { 4, 3 }, { 1, 1 } };
		float[] y = { 1, 1, -1};
		plaOriginal(x, y);
	}

	public static void plaOriginal(float[][] x, float y[]) {
		float w[] = {0,0};
		float b = 0;
		float fl = 1f;
		int j=0;
		boolean flag=false;
		int i=0;
		while(true){
			System.out.println(j+"-->"+(y[j] * (tt(x[j], w) + b)));
//			for(float[] a:x){
//				for(float bb:a){
//					System.out.print(bb+" ");
//				}
//				System.out.println();
//			}
			
			if (y[j] * (tt(x[j], w) + b) <= 0) {
				w =vAdd(w,vIncr(x[j],fl*y[j]));
				b =b+ (fl * y[j]);
				System.out.println("迭代"+i+"次-->"+w[0]+","+w[1]+","+b);
				i++;
                flag=true;
			}
			if(flag){
				j=0;
				flag=false;
				continue;	
			}
			if(j==2){
				break;
			}
			j++;	
		}
	
				//System.out.println(w[0]+","+w[1]+","+b);
		
		
			
	
		
	}

	public static float[] vIncr(float[] v,float a){
		float []tmp=new float[v.length];
		for (int i = 0; i < v.length; i++) {
			tmp[i] = a*v[i];
		}
		return tmp;
	}
	public static float[] vAdd(float[] v1,float[] v2){
		for (int i = 0; i < v1.length; i++) {
			v1[i] =v1[i]+ v2[i];
		}
		return v1;
	}
	public static float duoCheng(int[] two, float one) {
		float sum = 0;
		for (int x : two) {
			sum += (x * one);
		}
		return sum;
	}
	
	public static float tt(float[] t1,float[] t2){
		float sum = 0;
		for (int i = 0; i < t2.length; i++) {
			sum+=(t1[i]*t2[i]);
		}
		return sum;
	}

}
