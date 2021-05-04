class IbmIndia{
	public static void main(String[] args) {
		AssociateSystemEngineer []ref = new AssociateSystemEngineer[3];
		ref[0] = new JavaFSD();
		ref[1]= new UiDesigner();
		ref[2] = new CloudComputing();

		for(AssociateSystemEngineer refASE: ref){
			refASE.skills();
			refASE.salaryPackage();
			if(refASE instanceof CloudComputing)
				((CloudComputing)refASE).service(); 
		}
	}
}