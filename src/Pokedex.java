import java.util.Scanner;

public class Pokedex {

	public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	String poke1, poke2;
	int hp1, hp2,nv1,nv2,atk1,atk2;
	poke1="Lucario";
	poke2="Tyranitar";
	hp1=100;
	hp2=90;
	nv1=23;
	nv2=21;
	atk1=31;
	atk2=32;
	System.out.println("Red lanza a: "+ poke1 + " Nivel:"+nv1 + " Hp:"+hp1+ " Ataque:"+ atk1 );
	System.out.println("Maynor lanza a:"+ poke2+" Nivel:"+ nv2 +  " Hp:"+hp2 +" Ataque:"+ atk2 );
	System.out.println("1=Puño Bala, 2= Esfera Aural, 3= Terremoto, 4= Abocajarro");
	System.out.println("Que ataque deberia usar Lucario 1,2,3,4");
	int ataque= S.nextInt();
	switch(ataque)
	{case 1:
		System.out.println("Lucario a usado Puño Bala");
		hp2-=10;
		break;
	case 2:
		System.out.println("Lucario a usado Esfera Aural");
		hp2-=25;
		break;
	case 3:
		System.out.println("Lucario a usado Terremoto");
		hp2-=15;
		break;
	case 4:
		System.out.println("Lucario a usado Abocajarro");
		hp2-=15;
		break;
	
	}
	
	System.out.println("Tyranitar a perdido Hp ");
	System.out.println(poke2 +" Hp:"+hp2);
	
	
	System.out.println("1=Triturar, 2= Roca Afilada, 3= Lanzallamas, 4= Danza Dragon");
	System.out.println("Que ataque deberia usar Tyranitar 1,2,3,4");
	int ataque2= S.nextInt();
	boolean flag=true;
		switch(ataque2)
	{case 1:
		System.out.println("Tyranitar a usado Triturar");
		hp1-=10;
		break;
	case 2:
		System.out.println("Tyranitar a usado Roca Afilada");
		hp1-=25;
		break;
	case 3:
		System.out.println("Tyranitar a usado Lanzallamas");
		hp1-=70;
		break;
	case 4:
		System.out.println("Tyranitar a usado Danza Dragon");
		atk2+=10;
		System.out.println("Tyranitar a aumentado su Ataque ");
		System.out.println(poke2 +" Hp:"+hp2+ "Ataque"+ atk2);
		flag=false;
		break;
	
	}
	
	if(flag)
		System.out.println("1=Puño Bala, 2= Esfera Aural, 3= Terremoto, 4= Abocajarro");
	System.out.println("Que ataque deberia usar Lucario 1,2,3,4");
	int ataque3= S.nextInt();
	switch(ataque3)
	{case 1:
		System.out.println("Lucario a usado Puño Bala");
		hp2-=10;
		break;
	case 2:
		System.out.println("Lucario a usado Esfera Aural");
		hp2-=25;
		break;
	case 3:
		System.out.println("Lucario a usado Terremoto");
		hp2-=15;
		break;
	case 4:
		System.out.println("Lucario a usado Abocajarro");
		hp2-=15;
		break;
	}	
		System.out.println("Tyranitar a perdido Hp ");
		System.out.println(poke2 +" Hp:"+hp2);
		
	
		System.out.println("1=Triturar, 2= Roca Afilada, 3= Lanzallamas, 4= Danza Dragon");
		System.out.println("Que ataque deberia usar Tyranitar 1,2,3,4");
		int ataque4= S.nextInt();
		switch(ataque4)
		{case 1:
			System.out.println("Tyranitar a usado Triturar");
			hp1-=20;
			break;
		case 2:
			System.out.println("Tyranitar a usado Roca Afilada");
			hp1-=35;
			break;
		case 3:
			System.out.println("Tyranitar a usado Lanzallamas");
			hp1-=80;
			break;
		case 4:
			System.out.println("Tyranitar a usado Danza Dragon");
			atk2+=10;
			System.out.println("Tyranitar a aumentado su Ataque ");
			System.out.println(poke2 +" Hp:"+hp2+ "Ataque"+ atk2);
			break;
			}
			{
		System.out.println("Lucario a perdido Hp ");
		System.out.println(poke1 +" Hp:"+hp1);
		System.out.println("Lucario se a debilitado.. a Red no le quedan pokemon's");
		System.out.println("Maynor a ganado el combate");
		System.out.println("Red a entregado medalla Solaris a Maynor");
	}
}
	
}
	
	
	


