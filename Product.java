package com.tka.june29;

public class Product {

		private int id;
		private String name;
		private int price;
		private int quantity;
		private String category;
		
		Product(int i,String n,int p, int q, String c){
			id =i;
			name=n;
			price =p;
			quantity=q;
			category=c;
		}
		public int getid() {
			return id;
		}
		public void setid(int i) {
			id=i;
		}
		public String getname() {
			return name;
		}
		public void setname(String n) {
			name=n;
		}
		public int getprice() {
			return price;
		}
		public void setprice(int p) {
			price =p;
		}
		public int getquantity() {
			return quantity;
		}
		public void setquantity(int q) {
			quantity=q;
		}
		public String getcategory() {
			return category;
		}
		public void setcategory(String c) {
			category =c;
		}

	}


