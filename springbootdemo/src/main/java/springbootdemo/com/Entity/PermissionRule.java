package springbootdemo.com.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PermissionRule implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	private int menuId;
	private int permissionsId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public int getPermissionsId() {
		return permissionsId;
	}
	public void setPermissionsId(int permissionsId) {
		this.permissionsId = permissionsId;
	}
	
}
