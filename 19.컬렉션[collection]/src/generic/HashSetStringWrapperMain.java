package generic;

import java.util.HashSet;

public class HashSetStringWrapperMain {

	public static void main(String[] args) {
		System.out.println("==String==");
		HashSet<String> nameSet=new HashSet<String>();
		nameSet.add("KIM");
		nameSet.add("SIM");
		nameSet.add("DIM");
		nameSet.add("RIM");
		System.out.println(nameSet);
		
		boolean isAdd= nameSet.add("KIM");
		System.out.println("==추가여부==: "+isAdd);//false
		System.out.println(nameSet);
		
		System.out.println("==integer lotto뽑기==");
		HashSet<Integer>lottoSet=new HashSet<Integer>();
		while(lottoSet.size()<6) {
			lottoSet.add((int)(Math.random()*45)+1); //같은 값은 안들어감->5개 뽑힘                                                              
		}
//		lottoSet.add((int)(Math.random()*45)+1);
//		lottoSet.add((int)(Math.random()*45)+1);
//		lottoSet.add((int)(Math.random()*45)+1);
//		lottoSet.add((int)(Math.random()*45)+1);
//		lottoSet.add((int)(Math.random()*45)+1);
		System.out.println(lottoSet);
		
		
		
	}

}
