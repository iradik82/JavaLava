package HMobjectsc;

public class Dogs {
	
	String breed;
	String color;
	int age;
	String nickName;
	
	
	void comandSeat() {
		System.out.println(breed+" is seating.....");
	}
	void comandBark() {
		System.out.println(breed+" is barking.....");
	}
	void comand3() {
		System.out.println(breed+" brings you drink....");
	}
	public static void main(String[] args) {
		
		Dogs dog1=new Dogs();
		dog1.breed="Husky";
		dog1.color="Grey";
		dog1.age=3;
		dog1.nickName="Barbos";
		
		System.out.println(dog1.age+" y.o. "+dog1.color+" "+dog1.breed+" "+dog1.nickName+" Seat!"); dog1.comandSeat();
		
		System.out.println("-----------------------------------------");
		
		Dogs dog2=new Dogs();
		dog2.breed="Golden Retriever";
		dog2.color="orange";
		dog2.age=7;
		dog2.nickName="Lucky";
		System.out.println(dog2.age+" y.o. "+dog2.color+" "+dog2.breed+" "+dog2.nickName+" I'm thirsty!"); dog2.comand3();
		System.out.println("-----------------------------------------");
		
		Dogs dog3=new Dogs();
		dog3.breed="Bulldog";
		dog3.color="Black";
		dog3.age=5;
		dog3.nickName="Killer";
		
		System.out.println(dog3.age+" y.o. "+dog3.color+" "+dog3.breed+" "+dog3.nickName+" who's outside?");dog3.comandBark();
		System.out.println("-----------------------------------------");
	}

}
