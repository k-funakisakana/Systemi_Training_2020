package Java_Training.unit_04.practice.no211;

public class Check2 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;

		while(i <= 100){
			sum += i;
			if(sum > 1000){
				break;
			}
			i++;
		}

		System.out.println("合計が1000をこえるのは、1~" + i + "を加算した時です");
	}
}

//→〇