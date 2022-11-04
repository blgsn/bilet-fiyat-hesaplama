
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		int age,typeTravel=0;
		double KM,Price,travelSale=0.0,ageSale=0.0 ;
		double totalPrice=0;
		boolean isError=false;
		Scanner input=new Scanner(System.in);
		System.out.print("Mesafeyi Km cinsinden giriniz:");
		KM=input.nextDouble();
		
		System.out.print("Yaşınızı giriniz:");
		age=input.nextInt();
		
		System.out.print("Yolculuk tipini giriniz(1 => Tek Yön , 2 => Gidiş Dönüş:");
		typeTravel=input.nextInt();
		
		Price = KM * 0.10;
		if(age<0 || KM<0)  {
			System.out.println("Hatalı veri girdiniz!");
		}
		
		else {
			
		switch(typeTravel) {
		case 1:
		
			if(age<12) {
				ageSale = 0.50 * Price;
			totalPrice = Price-ageSale;
		}
		else if(12<=age && age<=24) {
			ageSale =  0.10 * Price;
			totalPrice = Price-ageSale;
		}
		else if(age>65) {
			ageSale =  0.30 * Price;
			totalPrice = Price-ageSale;
		}
		 
		else {
			totalPrice = Price;
		}
		
			break;
		case 2:
			
			if(age<12) {
				ageSale = 0.50 * Price;travelSale = 0.20 * (Price-ageSale);
				totalPrice = (Price-travelSale-ageSale)*2;
			}
			else if(12<=age && age<=24) {
				ageSale =  0.10 * Price;travelSale = 0.20 * (Price-ageSale);
				totalPrice = (Price-travelSale-ageSale)*2;
			}
			else if(age>65) {
				ageSale =  0.30 * Price;travelSale = 0.20 * (Price-ageSale);
				totalPrice = (Price-travelSale-ageSale)*2;
			}
			else {
				travelSale = 0.20 * Price;
				totalPrice = 2*(Price-travelSale);
			}
			break;
			default:
				 System.out.print("Hatalı veri girdiniz!");
				 }	
		if(typeTravel==1 || typeTravel==2 )
		System.out.println("Toplam tutar:" + totalPrice);
	}
		
		}
	
}
