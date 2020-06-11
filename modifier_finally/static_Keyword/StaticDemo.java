//package static_Keyword;

class Emp {
		
		int eid;
		int salary;
		String boss;
		static String ceo;

		//initialize static variable ceo
		static{					// active: when you load a class 	#runs only once
			ceo = "Klausi";
		}

		// initialisze variables for Emp // #standart values for .. eid .. salary
		public Emp(){			// active: when you create an object
			eid = 1;
			salary = 3000;
		}
		

		public void show() {
		System.out.println(eid + " : " + salary + " : "+ boss +" : "+ ceo);
		}
}//end of class Emp



public class StaticDemo {
		 
	//static = we dont have to	use object name

	public static void main(String[] args) {

		Emp navin = new Emp();
		navin.eid = 8;
		navin.salary = 4000;
		navin.boss = "chian chu";
		//navin.ceo = "Mahesh";
		
		Emp klausi = new Emp();
		klausi.eid = 9;
		klausi.salary = 5000;
		klausi.boss = "chian chaaang";
		//klausi.ceo = "Eberhard";	//also possible to use object name

		Emp.ceo = "Ben";		// Best choice: use class name cause static value

		System.out.println("\n");
		navin.show();
		klausi.show();
		System.out.println("\n\n");

	}

} //end of class StaticDemo


