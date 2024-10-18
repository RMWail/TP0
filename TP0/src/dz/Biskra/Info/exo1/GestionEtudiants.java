package dz.Biskra.Info.exo1;

import java.time.LocalDate;

public class GestionEtudiants {

	public static void main(String[] args) {
 
		
		Student lolo = new Student ("Remadna","Mohamed",LocalDate.of(2003,8, 30),"remadnamohamedwail@gmail.com","7000");
		
		Student toto = new Student ("Remadna","Mohamed",LocalDate.of(2003,8, 30),"remadnamohamedwail@gmail.com","7000");
		
		System.out.println("lolo before : "+lolo.toString());
		
		toto = lolo;
		
		if(lolo.equals(toto)) 
			System.out.println("yes");
		else 
			System.out.println("no");
		
		toto.setName("Omar");
		
       System.out.println("lolo after : "+lolo.toString());	 
       
		Student fifi = new Student ("Ali","Mostahpa",LocalDate.of(2003,4, 12),"mostahpa412@gmail.com","7005");
		
		Student riri = new Student ("Saadi","Karim",LocalDate.of(2003,8, 30),"karim830@gmail.com","7002");
       
		
		Departement monDepInfo  = new Departement("Computers and Informatics", "Biskra");
		
		
		monDepInfo.register(lolo); monDepInfo.register(fifi); monDepInfo.register(toto);  monDepInfo.register(riri);
		
		System.out.println("------- Before ------- : \n"+monDepInfo.toString());
		monDepInfo.unregister(toto);
		
		System.out.println("\n ------- After ------- : \n"+monDepInfo.toString());
	}

}
