package com.hw5.model.dto;

import java.util.Objects;
import java.util.Set;

public class Chocolate {

	private String name; // 초콜릿 이름
	private int price; // 초콜릿 가격
	private String date; // 초콜릿 제조일
	private Set<String> materials; // 초콜릿 재료
	
	public Chocolate() {}

	public Chocolate(String name, int price, String date, Set<String> materials) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
		this.materials = materials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Set<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, materials, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chocolate other = (Chocolate) obj;
		return Objects.equals(date, other.date) && Objects.equals(materials, other.materials)
				&& Objects.equals(name, other.name) && price == other.price;
	}
	
	public String materialsAsString() {
		
		StringBuilder sb = new StringBuilder();
		
		if(materials.size() == 0) {
			return "등록된 재료가 없음.";
		}
		for(String mat : materials) {
			sb.append(mat).append(", ");
		}
		
		sb.setLength(sb.length() - 2); // 마지막 쉼표와 공백 제거.
		
		return sb.toString(); // sb를 String 형으로 변환.
	}

	@Override
	public String toString() {
		return "제품명 : " + name + " / 가격 : " + price + " / 제조일 : " + date + " / 재료 : " + materialsAsString();
	}
	
	
	
}
