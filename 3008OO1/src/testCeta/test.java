package testCeta;

import cetaSistema.Rodado;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Rodado r= new Rodado(1, "FGH818", 574, "Nissan");
			System.out.println(r.getDominio());
		} catch(Exception e){
			e.printStackTrace();
		}
		try {
			Rodado r1= new Rodado(1, "AA789OO", 8524, "Toyota");
			System.out.println(r1.getDominio());
		} catch(Exception e){
			e.printStackTrace();
		}
		
		try {
			Rodado r2= new Rodado(1, "AA78PPO", 8524, "Kia");
			System.out.println(r2.getDominio());
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
