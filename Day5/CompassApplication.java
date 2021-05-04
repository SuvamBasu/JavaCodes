enum Directions
{
	North(0), East(90), South(180), West(270), North_Again(360);
	private int degrees;
	Directions(int degrees)
    {
		this.degrees = degrees;
    }
	int getDegrees()
    {
		return this.degrees;
	}
}

class CompassCallibration{
	void getDirection()
    {
		System.out.println("Lost!!....No worries,keep calm & follow the instructions!");
		for(Directions ref : Directions.values())
        {
			System.out.println("To Head " + ref + " Turn " + ref.getDegrees() + " Degrees To Your Right");
		}	
	}
}

class CompassApplication{
	public static void main(String[] args) {
		new CompassCallibration().getDirection();
	}
}