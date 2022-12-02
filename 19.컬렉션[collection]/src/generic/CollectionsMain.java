package generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMain { 

	public static void main(String[] args) {
		
		// *collections class->collection 객체들의 utility method 제공한다.
		// ->Arrays랑 비슷하다고 생각하면 될 듯
		
		List<Integer> intList= Arrays.asList(34,45,78,90,22,99,10,21); 
		// -> 얘가 반환하는게 collection이라서 Arrays 씀
		
		List<String> stringList=Arrays.asList("김경호", "이경호","박경호");
		System.out.println("==sort[int, String]==");
		Collections.sort(intList);
		Collections.sort(stringList);
		System.out.println(intList); 
		System.out.println(stringList);//정렬 완료
		System.out.println("==reverse[int, string]=="); 
		Collections.reverse(intList);
		Collections.reverse(stringList);
		System.out.println(intList);
		System.out.println(stringList);//거꾸로 정렬 완료
		
		System.out.println("==shuffle 전==");
		System.out.println(intList);
		System.out.println(stringList);
		System.out.println();
		System.out.println("==shuffle 후==");
		Collections.shuffle(intList);
		Collections.shuffle(stringList);
		System.out.println(intList);
		System.out.println(stringList);
		System.out.println();
		System.out.println("==Account==");
		
		
		List<Account> accountList=Arrays.asList(
				new Account(2222, "KIM", 58900, 1.3),
				new Account(3333, "PARK",78000, 3.3),
				new Account(4444, "CHOI",90000, 5.3),
				new Account(5555, "SIM", 56000, 4.3),
				new Account(6666, "SOO", 23000, 2.3),
				new Account(7777, "SONG",12900, 7.3),
				new Account(8888, "MIN", 23400, 6.3),
				new Account(9999, "JANG",87200, 0.3)
				);
		
		System.out.println(accountList);
		System.out.println("==reverse==");
		Collections.reverse(accountList);
		System.out.println(accountList);
		
		System.out.println("==shuffle==");
		Collections.shuffle(accountList);
		System.out.println(accountList);
		
		System.out.println("==sort[comparable]==");
//		Collections.sort(accountList); ->쓸 수 없음
		Collections.sort(accountList);
		System.out.println(accountList);
		
		System.out.println("==sort[comparator]==");
		
		System.out.println("balance Dsc");
		Collections.sort(accountList, new AccountBalanceDecComparator());
		System.out.println(accountList);
		
		System.out.println("owner Asc");
		Collections.sort(accountList, new AccountOwnerAscComparator());
		System.out.println(accountList);
		
		
		
		
	}

}
