package lab10;

import java.util.Arrays;

public class Appliancetest {

	public static void main(String[] args) {
		Appliance appliances[] = new Appliance[40];
	       appliances[0] = new TV(60 , "Samsung", true, 450, "black", "Europe", 670);
	       appliances[1] = new TV(55, "panisonic", false, 540, "green", "USA", 780);
	       appliances[2] = new TV(24, "Lg", true, 120, "black", "Europe", 845);
	       appliances[3] = new TV(30, "Samsung", true, 510, "black", "indoneasia", 799);
	       appliances[4] = new TV(120, "panisonic", false, 400, "black", "China", 900);
	       appliances[5] = new Telephone(6, "Iphone", true, 840, "White", "China", 200);
	       appliances[6] = new Telephone(7, "droid", true, 400, "Red", "USA", 575);
	       appliances[7] = new Telephone(5,"moterola",false , 499, "Blue", "Europe", 900);
	       appliances[8] = new Telephone(8, "android", false, 720, "Green", "Europe", 500);
	       appliances[9] = new Telephone(5, "Iphone", true, 330, "White", "Europe", 550);
	       appliances[10] = new Toaster(134425,"KitchenAid",  true, 330, "White", "Europe", 34);
	       appliances[11] = new Toaster(683345,"Kohls",  true, 330, "White", "Europe", 42);
	       appliances[12] = new Toaster(235473,"Kitchenbrand", true, 330, "White", "Europe", 35);
	       appliances[13] = new Toaster(134673,"Toastrs", true, 330, "White", "Europe", 20);
	       appliances[14] = new TV(24 , "Lg", true, 450, "black", "Europe", 675);
	       appliances[15] = new TV(72, "panisonic", false, 540, "green", "USA", 783);
	       appliances[16] = new TV(32, "panisonic", true, 120, "black", "USA", 823);
	       appliances[17] = new TV(44, "Samsung", true, 510, "black", "japan", 789);
	       appliances[18] = new TV(17, "Lg", false, 400, "black", "China", 123);
	       appliances[19] = new TV(12, "watchnow", false, 400, "orange", "Europe", 99);
	       appliances[20] = new Telephone(5, "Iphone", true, 345, "White", "China", 287);
	       appliances[21] = new Telephone(8, "android", true, 420, "Red", "USA", 565);
	       appliances[22] = new Telephone(3,"moterola",false , 499, "pink", "Europe", 934);
	       appliances[23] = new Telephone(10, "droid", false, 610, "Green", "Europe", 582);
	       appliances[24] = new Telephone(7, "Iphone", true, 250, "blue", "korea", 542);
	       appliances[25] = new Toaster(832560,"Houzz",  true, 319, "blue", "Europe", 72);
	       appliances[26] = new Toaster(245806,"Kohls",  true, 330, "White", "Europe", 64);
	       appliances[27] = new Toaster(347032,"Kitchenbrand", true, 330, "black", "japan", 59);
	       appliances[28] = new Toaster(275285,"Houzz", true, 330, "green", "Europe", 27);
	       appliances[29] = new TV(32, "panisonic", true, 120, "black", "USA", 734);
	       appliances[30] = new TV(44, "Samsung", true, 510, "black", "japan", 722);
	       appliances[31] = new TV(17, "Lg", false, 400, "purple", "China", 893);
	       appliances[32] = new Telephone(8, "android", true, 420, "Red", "USA", 585);
	       appliances[33] = new Telephone(3,"moterola",false , 499, "white", "Europe", 632);
	       appliances[34] = new Telephone(10, "droid", false, 610, "Green", "USA", 882);
	       appliances[35] = new Telephone(7, "Iphone", true, 250, "blue", "USA", 821);
	       appliances[36] = new Telephone(6, "android", true, 330, "green", "korean", 443);
	       appliances[37] = new Toaster(832560,"Houzz",  true, 319, "blue", "Europe", 62);
	       appliances[38] = new Toaster(245806,"Kohls",  true, 330, "White", "Europe", 173);
	       appliances[39] = new Toaster(977834,"Houzz",  false, 280, "blue", "USA", 126);
	        Arrays.sort(appliances);
	        
	       for(Appliance app:appliances) {
	           System.out.println(app);
	       }
	     

	}

}
