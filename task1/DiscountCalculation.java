package task1;

public class DiscountCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s=958, d, f;
		if(s<500) {
			d=0;
		}else if((s>=500)&&(s<=1000)) {
			d=s*0.10;
		}else {
			d=s*0.20;
		}
		f=s-d;
        System.out.printf("Final Amount = %.2f",+f);
	}

}
