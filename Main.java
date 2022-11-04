
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		int age,typeTravel=0;
		double KM,Price,travelSale=0.0,ageSale=0.0 ;
		double totalPrice=0;
		//gets the values from the user
		Scanner input=new Scanner(System.in);
		System.out.print("Mesafeyi Km cinsinden giriniz:");
		KM=input.nextDouble();
		
		System.out.print("Yaşınızı giriniz:");
		age=input.nextInt();
		//gets the type of travel from the user
		System.out.print("Yolculuk tipini giriniz(1 => Tek Yön , 2 => Gidiş Dönüş:");
		typeTravel=input.nextInt();
		//calculates price
		Price = KM * 0.10;
		//entered age and km are negative
		if(age<0 || KM<0)  {
			System.out.println("Hatalı veri girdiniz!");
		}
		//entered values are positive 
		//when the user entered number different from 1 or 2 for types of travel,
		//it gives the error message
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
		//when the user entered the valid value 
		if(typeTravel==1 || typeTravel==2 )
		System.out.println("Toplam tutar:" + totalPrice);
	}
		
		}
	
}
