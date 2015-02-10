
public class ProjectEuler {
	public static void main(String[] args) {
		int stepper = 1;
		int sum = 0;
		int k = 0;
		int k2 = 0;
		
		while (stepper * 3 < 1000) {
			k = stepper * 3;
			sum = sum + k;
			stepper = stepper + 1;
		}
		stepper = 1;
		while (stepper * 5 < 1000) {
			k2 = stepper * 5;
			stepper = stepper + 1;
			if (k2 %3 == 0) {
				continue;
			}
			sum = sum + k2;
		}
		System.out.println(sum);	
	}
}
