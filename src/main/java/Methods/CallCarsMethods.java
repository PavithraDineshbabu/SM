package Methods;

public class CallCarsMethods {

	public static void main(String[] args) {
	Cars obj=new Cars();
	obj.MyCarDetails();
	Boolean Moreinfo= obj.IsMyCarInsured();
	System.out.println(Moreinfo);
	String InsuranceNo=obj.MyInsurance();
	System.out.println(InsuranceNo);
	}

}
