interface AssociateSystemEngineer{
	void skills();
    void salaryPackage();
}

class JavaFSD implements AssociateSystemEngineer{
	@Override
	public void skills(){
		System.out.println("Skills of Java-FSD: Core Java,Advanced Java,HTML,CSS,Javascript,etc");
	}
    @Override
	public void salaryPackage(){
		System.out.println("Package of Java-FSD: 4 LPA");
	}
}

class UiDesigner implements AssociateSystemEngineer{
	@Override
	public void skills(){
		System.out.println("Skills of UI-Designer: Adobe Photoshop, InvisionStudio,etc");
	}
    @Override
	public void salaryPackage(){
		System.out.println("Package of UI-Designer: 4 LPA");
	}
}

class CloudComputing implements AssociateSystemEngineer{
	@Override
	public void skills(){
		System.out.println("Skills of Cloud_Computing: Networking, Web Security, DevOps, Linux,etc");
	}
    @Override
	public void salaryPackage(){
		System.out.println("Package of Cloud_Computing: 4 LPA");
	}

	void service(){
		System.out.println("Service used: Microsoft Azure");
	}
}

class IbmEmployees{
	public static void main(String[] args) {

		AssociateSystemEngineer ASE = new JavaFSD();
        ASE.skills();
		ASE.salaryPackage();
		ASE = new UiDesigner();
		ASE.skills();
		ASE.salaryPackage();
		ASE = new CloudComputing();
		ASE.skills();
		ASE.salaryPackage();
	}
}













