package generic;

import java.util.ArrayList;

public class ArrayLIstStringWrapperMain {

	public static void main(String[] args) {
		ArrayList<String> namelist=new ArrayList<String>();
		namelist.add("KIM");
		namelist.add("SIM");
		namelist.add("MIM");
		namelist.add("RIM");
		namelist.add("YIM");
		namelist.add(new String("KIM"));
		System.out.println(namelist);
		System.out.println("==remove method==");
		
		//remove method->첫번째 것만 지운다
		//다 지우려면 비교하면서 지워야함
		
		namelist.remove("KIM");
		System.out.println(namelist);
		System.out.println("==wrapper==");
		ArrayList<Integer> scoreList =new ArrayList<Integer>();
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(70);
		scoreList.add(60);
		scoreList.add(50);
		scoreList.add(40);
		scoreList.add(new Integer(90));// -> 굳이 이렇게 할 필요 없음. 자동으로 됨
		scoreList.add(new Integer(100));
		System.out.println(scoreList);
		
		System.out.println("==1. get==");
		int score1= scoreList.get(2);
		System.out.println(score1);
		int score2=scoreList.get(scoreList.size()-1);// -> size-1해야 마지막 data 나옴
		System.out.println(score2);
		
		System.out.println("==2. set==");
		scoreList.set(2, 99);//index 2번: 70점->99점으로 바꾸기
		System.out.println(scoreList);
		
		System.out.println("==3. remove==");
		scoreList.remove(2);
		scoreList.remove(new Integer(60));//9번 값을 가진 객체->인덱스 의미하는 것 아님/오버로드
		System.out.println(scoreList);
		
		
		
		
	}

}
