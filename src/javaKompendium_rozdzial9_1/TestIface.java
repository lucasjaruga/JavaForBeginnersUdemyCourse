package javaKompendium_rozdzial9_1;

class TestIface implements Client.NestedIf {
	
	@Override
	public void nestedInterfaceMethod() {
		System.out.println("dziala!");
	}
	
	
	public static void main(String[] args) {
		Callback c = new Client();
		c.callback(42);
		
		
		AnotherClient ob = new AnotherClient();
		
		c = ob;
		ob.callback(42);
		
		Client.NestedIf x = new TestIface();
		
		x.nestedInterfaceMethod();
		
	}
	
	
}