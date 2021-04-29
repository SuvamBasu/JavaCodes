class PassFail{
	public static void main(String[] args) {
		int sub1= Integer.parseInt(args[0]);
		int sub2= Integer.parseInt(args[1]);
		int sub3= Integer.parseInt(args[2]);
		int result= sub1+sub2+sub3;
		System.out.println("Total Marks is:" + result);
		if(sub1<=40){
			System.out.println("Student is Failing!");
			return;
		}
		if(sub2<=40){
			System.out.println("Student is Failing!");
			return;
		}
		if(sub3<=40){
			System.out.println("Student is Failing!");
			return;
		}
		else{
			System.out.println("Student is Passing!");
		}
	}
}