import java.security.acl.Owner;
import java.util.Arrays;

import javax.naming.ldap.SortControl;

public class ArraysMain1 {

	public static void main(String[] args) {
		int[] intArray1 = { 1, 3, 5, 7, 9 };
		int[] intArray2 = { 1, 3, 5, 7, 9 };
		String[] strArray1 = { "one", "two", "three" };
		String[] strArray2 = { "one", "two", "three" };

		System.out.println("1. 배열의 내용 비교");
		Arrays.equals(intArray1, intArray2);
		boolean isSame = Arrays.equals(intArray1, intArray2);
		System.out.println(isSame);
		isSame = Arrays.equals(strArray1, strArray2);
		System.out.println(isSame);

		System.out.println("2. 배열의 원소 채우기(fill)");
		Arrays.fill(intArray1, 1); // 모두 1로 초기화 된다
		for (int e : intArray1) {
			System.out.print(e + " ");
		
		}
		
		System.out.println();
		System.out.println("3. 배열 복사");
		int[] intArray3 = Arrays.copyOf(intArray2, intArray2.length + 1); // ;length+1해서 늘리기
		for (int e : intArray3) {
			System.out.print(e + " ");
		}

		System.out.println();

		int[] scoreArray = { 90, 66, 79, 55, 40, 32, 11 };
		String[] nameArray = { "공경호", "홍경호", "JAMES", "김경호", "김경호" }; 
		
		Account[] accountArray= {
				new Account(2222, "KIM", 58900, 1.3),
				new Account(3333, "PARK", 78000, 3.3),
				new Account(4444, "CHOI", 90000, 5.3),
				new Account(5555, "SIM", 56000, 4.3),
				new Account(6666, "SOO", 23000, 2.3),
				new Account(7777, "SONG", 12900, 7.3),
				new Account(8888, "MIN", 23400, 6.3),
				new Account(9999, "JANG", 87200, 0.3)
		};
//		System.out.println("3. 배열복사 참조형");  ---------------------------------------> 다시보기!!!!!!!!!!!!!!
//		Account[] newAccountArray=Arrays.copyOf(accountArray, accountArray.length);
//		for(Account account:newAccountArray) {
////			System.out.println(account);
//			account.print();
//		}
//		Account[] destAccounts=new Account[accountArray.length+1]; //개수 늘리려면 
//		System.arraycopy(accountArray, 0, destAccounts, 0,accountArray.length);
		
		System.out.println("3. 참조형 배열 복사");
		Account[] newAccountArray=Arrays.copyOf(accountArray, accountArray.length+1);
		for(Account account: newAccountArray) {
			System.out.println(account);
		}
		System.out.println();
		Arrays.sort(nameArray);
		for(String name: nameArray) {
			System.out.println(name+" ");
		}
		
		
		System.out.println();
		Arrays.sort(nameArray);
		for(String name: nameArray) {
			System.out.println(name+" ");
		}
//		System.out.println("4. 기본타입, String 정렬[sort]");
//		int[]ScoreArrays.sort(scoreArray);
//		for(int score:scoreArray) {
//			System.out.print(score+" "); //오름차순
//		}
//		System.out.println();
//		Arrays.sort(nameArray);
//		for(String name:nameArray) {
//			System.out.print(name+" ");
//		}
//		//public int compareTo(String, anotherString)->앞쪽 문자열 유니코드 숫자-뒤쪽 문자열 유니코드 숫자의 결과를 반환한다.
//		
//		System.out.println();
//		int uniCodeGap="aaa".compareTo("aaa");
//		System.out.println(uniCodeGap);
//		uniCodeGap="aaa".compareTo("aab");
//		System.out.println(uniCodeGap);
//		String name1="aaa";
//		String name2="bbb";
//		if(name1.compareTo(name2)>0) {
//			System.out.println("name1, name2 교환된다[오름차순]");
		
//		System.out.println("5. sort[Account]");  //객체타입 sort
//		Arrays.sort(accountArray);

		System.out.println("4. sort->기본, String타입");
		int[] scoreArray1= {10,20,30,40,50,60};
		String[] nameArray1= {"김경호", "이경호","박경호","최경호"};//배열 선언, 초기화
		
		Arrays.sort(scoreArray1);
		for(int score:scoreArray) {
			System.out.print(score+" ");
		}
		System.out.println();
		Arrays.sort(nameArray1);
		for(String name: nameArray) {
			System.out.print(name+" ");
		}
		System.out.println();
//		System.out.println("5. sort[Account]");//객체를 sort하는 것
//		Arrays.sort(accountArray);
//		Account.headerPrint();
////		for(Account account: accountArray) {
////			if(account accountArray) {
////				return ;
////			}
////			account.print();
//		}
		
		/*compare to->인터페이스 구현해주고 비교하기
		 * comparable..?
		1. 첫번째 객체와 두번째 객체를 comparable 인터페이스 타입으로 형변환 해준다.
		-> 어떤 주소 객체를 넣던지 간에 오직 정렬에만 관심 있기 때문에
		2. A-B>0->자리 바꾸기
		3. A-B<0->자리 유지
		4. 오름차순, 내림차순 확인
		*/
		
		//잔고 오름차순??
		/****이름으로 오름차순[compare to를 사용한다]****/
		
		Arrays.sort(accountArray, new AccountBalanceDecComparator());
		for (Account account : accountArray) {
			account.print();
		}
		
		Arrays.sort(accountArray, new AccountOwnerAscComparator());
		for (Account account : accountArray) {
			account.print();
		}
		
		
		
	}
		
		
	}	
	


