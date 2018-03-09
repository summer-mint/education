package springbootdemo.com.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Area implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	private long areaId;
	private long areaPrentId;
	private String areaName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAreaId() {
		return areaId;
	}
	public void setAreaId(long areaId) {
		this.areaId = areaId;
	}
	public long getAreaPrentId() {
		return areaPrentId;
	}
	public void setAreaPrentId(long areaPrentId) {
		this.areaPrentId = areaPrentId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
}
