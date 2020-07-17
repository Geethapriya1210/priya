package com.xworkz.spring.calamities.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "calamities")
public class CalamityDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "C_ID")
	private int cId;
	@Column(name = "PALCE")
	private String place;
	@Column(name = "DATE")
	private String date;
	@Column(name = "CAPTURED_BY")
	private String capturedBy;
	@Column(name = "CALAMITY_TYPE")
	private String calamityType;
	@Column(name = "AREA")
	private String area;
	@Column(name = "AVG_LOSS")
	private double avgLoss;
	@Column(name = "DEATHS")
	private int deaths;
	@Column(name = "INJURED")
	private int injured;

	public CalamityDTO() {
		System.out.println("created CalamityEntity\t" + this.getClass().getSimpleName());
	}

	public CalamityDTO(String place, String date, String capturedBy, String calamityType, String area,
			double avgLoss, int deaths, int injured) {
		super();
		this.place = place;
		this.date = date;
		this.capturedBy = capturedBy;
		this.calamityType = calamityType;
		this.area = area;
		this.avgLoss = avgLoss;
		this.deaths = deaths;
		this.injured = injured;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCapturedBy() {
		return capturedBy;
	}

	public void setCapturedBy(String capturedBy) {
		this.capturedBy = capturedBy;
	}

	public String getCalamityType() {
		return calamityType;
	}

	public void setCalamityType(String calamityType) {
		this.calamityType = calamityType;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getAvgLoss() {
		return avgLoss;
	}

	public void setAvgLoss(double avgLoss) {
		this.avgLoss = avgLoss;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getInjured() {
		return injured;
	}

	public void setInjured(int injured) {
		this.injured = injured;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CalamityEntity [cId=" + cId + ", place=" + place + ", date=" + date + ", capturedBy=" + capturedBy
				+ ", calamityType=" + calamityType + ", area=" + area + ", avgLoss=" + avgLoss + ", deaths=" + deaths
				+ ", injured=" + injured + "]";
	}
}