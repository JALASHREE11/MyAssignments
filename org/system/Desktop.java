package org.system;

public class Desktop extends Computer { 
	public void desktopSize() { 
		System.out.print(" "+"4.3");
	}

	public static void main(String[] args) {
		Desktop d=new Desktop();  
		d.computerModel();
		d.desktopSize();

	}

}
