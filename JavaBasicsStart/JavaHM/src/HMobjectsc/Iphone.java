package HMobjectsc;

public class Iphone {

	String model;
	String name;
	String color;
	int storage;
	double size;
	String number;
	
void siri() {
	 
	System.out.println("calling....bip....bip...bip");
}
void alarm() {
	System.out.println("ALAAAARM time to wake up");
}void picture(){
	System.out.println("10,9,8,7,6,5,4,3,2,1 cheeeees");
}

public static void main(String[] args) {
	Iphone apple=new Iphone();
	
	apple.model="12 Pro max";
	apple.name="Iphone";
	apple.color="Gold";
	apple.storage=256;
	apple.size=6.8;
	apple.number="8886455353";
	
	System.out.println("Hey siri! call "+apple.number);apple.siri();
	System.out.println("------------------");
	
	
	Iphone samsung=new Iphone();
	
	samsung.model="Note 20 Ultra";
	samsung.name="Samsung";
	samsung.color="space grey";
	samsung.storage=244;
	samsung.size=7.3;
	samsung.number="2445436565";
	
	System.out.println(samsung.name+" "+samsung.model+" in "+samsung.color+" color with "+samsung.size+" inch screen is the best phone on a market..."); samsung.alarm();
	System.out.println("------------------");

	Iphone pixel=new Iphone();
	
	pixel.model="6";
	pixel.name="Google Pixel";
	pixel.color="white";
	pixel.storage=128;
	pixel.size=6.4;
	pixel.number="2454335233";
	
	System.out.println(pixel.name+" "+pixel.model+" take a picture");pixel.picture();
	
}
}


