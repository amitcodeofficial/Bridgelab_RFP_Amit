import java.util.*;

public class Day8Employee {
	
	private int toCheck = random();
	private static final int wagePerHour=20;
	private static final int fullDay = 8;
	private static final int halfDay=4;
	private static final int workingDayInMonth=20;
	private int dailyWage;
	
	public static int random() {
		Random random = new Random();
		int condition=random.nextInt(2);
		return condition;
	}
	
//	Checking Employee present or not...(UC1)
	public static int presentOrNot() {
		Day8Employee check = new Day8Employee();
		if(check.toCheck==1) {
//			Returning 1 if present...
			return 1;
		}else {
//			Returning 0 if absent...
			return 0;
		}
	}
	
//	To calculate Daily wage...(UC2)
	public static int dailyWageCal() {
		int presentok=presentOrNot();
		Day8Employee d = new Day8Employee();
		if(presentok==1) {
			int fullOrHalf=random();
			if(fullOrHalf==1) {
				d.dailyWage=wagePerHour*fullDay;
			}else {
				d.dailyWage=wagePerHour*halfDay;
			}
		}else {
			return 0;
		}
		return d.dailyWage;
	}
	
//	To calculate wage for part time...(UC3)
	
	
//	To calculate wage for a 20 working days of a month
	public static void monthlyWage() {
		int[] arr = new int[workingDayInMonth];
		int pointer=0;
		int i=0;
		int sum=0;
		
		while(pointer != workingDayInMonth) {
			arr[i]=dailyWageCal();
			i++;
			pointer++;
		}
		for(int j=0;j<arr.length;j++) {
			sum=sum+arr[j];
		}
		System.out.println("Employee Work History for Month: "+Arrays.toString(arr));
		System.out.println("Employee Monthly Salary Based on History="+sum);
	}
	
//	To calculate wage for 20 days and 100 hours
	public static void hoursDefined() {
		int arr[] = new int[workingDayInMonth];
		int tHours=0;
		int pointer=0;
		int sum=0;
		int sum1=0;
		int sum2=0;
		
		int i=0;
		while(pointer != workingDayInMonth) {
			arr[i]=dailyWageCal();
			i++;
			pointer++;
		}
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==160) {
				sum1=sum1+8;
			}else if(arr[j]==80) {
				sum2=sum2+4;
			}
		}
		tHours=sum1+sum2;
		for(int j=0;j<arr.length;j++) {
			sum=sum+arr[j];
		}
		
		System.out.println("Employee Work History for Month: "+Arrays.toString(arr));
		System.out.println("Total Hours Worked in Month is:"+tHours);
		if(tHours>=100) {
			while(tHours != 100) {
				tHours--;
				sum=sum-20;
			}
		}
		System.out.println("Salary of this month= "+sum);
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to wage calculator");
		
		System.out.println("Choose an option:");
		System.out.println("(1).Calculate Wage for a month");
		System.out.println("(2).Calculate Wage for total hours");
		System.out.println();
		System.out.print("Enter the Choice=");
		int choice=scan.nextInt();
		
		
//		Using Switch Case Statement...(UC4)
		switch(choice){
		case 1:monthlyWage();
		break;
		
		case 2:hoursDefined();
		break;
		
		default:System.out.println("You have Entered a wrong choice...");
		break;
		}
	}

}
