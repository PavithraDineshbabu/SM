package Constructor;

public class LearnConstructor {
	
	/*int I;
	String s;
	boolean b;
	char c;
	float F;
	double D;
	long L;8 	*/
	LearnConstructor(int a,String b,boolean c,char d){
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	
		
	}
	
	LearnConstructor(float f,double d){
		
		
		System.out.println(f);
		System.out.println(d);

	
		
	}
	

	public static void main(String[] args) {
		
		LearnConstructor obj=new LearnConstructor(10,"pavi",true,'x');
		LearnConstructor obj1=new LearnConstructor(10,"Dinesh",true,'x');
		LearnConstructor obj2=new LearnConstructor(23,45);
	}

}
