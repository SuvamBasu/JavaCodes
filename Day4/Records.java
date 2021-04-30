class NewBornBaby{
    private int deliverySerialNo;
    private int mothersBedNo;
    private String gender;

    NewBornBaby(int deliverySerialNo, int mothersBedNo, String gender)
    {
        this.deliverySerialNo = deliverySerialNo;
        this.mothersBedNo = mothersBedNo;
        this.gender = gender;
    }

	public int getDeliverySerialNo(){
		return this.deliverySerialNo;
	}

	public void setDeliverySerialNo(int deliverySerialNo){
		this.deliverySerialNo = deliverySerialNo;
	}

	public int getMothersBedNo(){
		return this.mothersBedNo;
	}

	public void setMothersBedNo(int mothersBedNo){
		this.mothersBedNo = mothersBedNo;
	}

	public String getGender(){
		return this.gender;
	}

	public void setName(String gender){
		this.gender = gender;
	}
}
class Records {
    public static void main(String[] args) {
        NewBornBaby refOne = new NewBornBaby(5121, 45 , "Female");
        NewBornBaby refTwo = new NewBornBaby(5122, 23, "Male");

        System.out.println(refOne.getDeliverySerialNo() + "," + refOne.getMothersBedNo() + "," + refOne.getGender());
        System.out.println(refTwo.getDeliverySerialNo() + "," + refTwo.getMothersBedNo() + "," + refTwo.getGender());
    }
}
