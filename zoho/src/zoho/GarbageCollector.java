package zoho;

public class GarbageCollector {
	
	//invoke before
	public void finalize()
	{
		
		System.out.println("Garbage Collector is invoked");
	}
	
	public static void main(String[] args) {
		
		
		GarbageCollector gc = new GarbageCollector();
		GarbageCollector gc2 = new GarbageCollector();
		GarbageCollector gc3 = new GarbageCollector();
		
		gc=null;
		//nullify
		
		gc2=gc3;
		//changing ref to another obj
		
		//runtime method
		System.gc();
		System.out.println("done");
		
	}
	
	
}
