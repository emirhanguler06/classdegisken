package classdegisken;

public class Main {

	public static void main(String[] args) {
		produck urun = new produck();
		urun.name = "Lenovo xg458";
		urun.price = 148.47;
		System.out.println("Ürün Adý:" + urun.name);
		System.out.println("Ürün Fiyat:" + urun.price);
		
        Student ogrenci = new Student();
        ogrenci.name = "EMÝRHAN";
        ogrenci.surname = "GÜLER";
        ogrenci.age = 16;
        ogrenci.size = 1.79;
        ogrenci.weight = 60;
        ogrenci.glasses = false;
        System.out.println(ogrenci.name);
        System.out.println(ogrenci.surname);
        System.out.println(ogrenci.age);
        System.out.println(ogrenci.size);
        System.out.println(ogrenci.weight);
        System.out.println(ogrenci.glasses);
        
        Car araba = new Car();
        araba.name = "Tofaþ";
        araba.sherry = "Þahin";
        araba.model = "1.6";
        araba.year = 1993;
        araba.fuel = "Benzin&Lpg";
        araba.gear = "Manuel";
        araba.km = 150000;
        araba.colour = "Beyaz";
        System.out.println(araba.name);
        System.out.println(araba.sherry);
        System.out.println(araba.model);
        System.out.println(araba.year);
        System.out.println(araba.fuel);
        System.out.println(araba.gear);
        System.out.println(araba.km);
        System.out.println(araba.colour);
        
        
	}

}
