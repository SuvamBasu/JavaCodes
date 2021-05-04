class Suv{
    final void seater(){
		System.out.println("SeatingCapacity: 7 Seater");
	}
	void fuel(){
		System.out.println("FuelType: Petrol");
	}
	void mileage(){
		System.out.println("Mileage: 10-15 KMPL");
	}
    void topSpeed(){
		System.out.println("MaxSpeed: 160 Km/hr");
	}
}

class Fortuner extends Suv{
	void fuel(){
		System.out.println("FuelType: Disel");
	}
    void topSpeed(){
        System.out.println("MaxSpeed 176 Km/hr");
    }
    void transmission(){
        System.out.println("TransmissionType: Automatic");
    }
}

class Innova extends Fortuner{
	void fuel(){
		System.out.println("FuelType: Petrol + Disel");
    }
}

class TeslaModelX extends Suv{
	void fuel(){
		System.out.println("FuelType: Electric Vehicle");
	}
	void topSpeed(){
		System.out.println("MaxSpeed: 100 Km/hr");
	}
    void mileage(){
		System.out.println("Mileage: 475 Km");
    }
}

class InheritanceExample {
    public static void main(String[] args) {
        Fortuner fortuner = new Fortuner();
        System.out.println("<<<...FORTUNER SPECIFICATIONS...>>>");
        fortuner.seater();
		fortuner.fuel();
		fortuner.mileage();
        fortuner.topSpeed();
        fortuner.transmission(); 

		Innova innova = new Innova();
        System.out.println("<<<...INNOVA SPECIFICATIONS...>>>");
		innova.seater();
        innova.fuel();
        innova.mileage();
        innova.topSpeed();
		innova.transmission();

		TeslaModelX tesla = new TeslaModelX();
        System.out.println("<<<...TESLA MODEL X SPECIFICATIONS...>>>");
		tesla.seater();
        tesla.fuel();
        tesla.mileage();
        tesla.topSpeed();
		new Fortuner().transmission();
    }
    
}
