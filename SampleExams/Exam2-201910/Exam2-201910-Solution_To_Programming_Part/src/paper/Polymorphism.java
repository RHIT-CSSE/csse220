package paper;

public class Polymorphism {
	public static void main(String[] args ) { 
		
		Gamma gw = new Gamma("W");
		Beta  bx = new Gamma("X");
		Alpha ay  = new Gamma("Y");
		Wave  wz = new Gamma("Z");
		Wave  wa = new Alpha(); 
		Beta  bb = new Beta();
		
		
		wa.process();                             //1  A
		//Beta b = new Alpha();                   //2  compile error
		gw.process();                             //3  B
		//wa.dualProcess(new Alpha ());           //4  compile error
		((Alpha) bx).process();                   //5  B
		//((Gamma)bb).process();            	  //6  runtime error
		//gw.dualProcess( new Wave()  );          //7  compile error
		gw.dualProcess( new Alpha()  );           //8  WAAW
		//( (Beta)wa ).dualProcess(new Alpha() ); //9  run-time error 
		bb.dualProcess( bb );                     //10 BB
		ay.dualProcess( ay );                     //11 YBBY
		
		
	}	
}

class Alpha implements Wave {
	public void process() {
		System.out.print( "A" );
	}
	public void dualProcess(Wave w) {
		w.process();
		w.process();
	}
}

class Beta extends Alpha {
	public void process() {
		System.out.print( "B" );
	}
}

class Gamma extends Beta{
	private String woo;
	
	public Gamma(String woo) {
		this.woo =woo;
	}
	
	public void dualProcess(Wave w) {
		System.out.print(woo);
		super.dualProcess( w );
		System.out.print(woo);
	}
}

interface Wave {
	public void process();
}