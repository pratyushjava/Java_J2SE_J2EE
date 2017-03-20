package spel.model.collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean2")
public class Customer {
	
	private String abc="MapB";//currently hard-coded -- can be taken from user
	//key of the map can be hardcoded as 
	// @Value("#{testBean.map['MapB']}")
	// OR generated dyn. as 
	@Value("#{testBean.map[customerBean2.abc]}")
	private String mapA;

	@Value("#{testBean.list[1]}")
	private String list;

	public String getMapA() {
		return mapA;
	}

	public void setMapA(String mapA) {
		this.mapA = mapA;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}
	

	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}

	@Override
	public String toString() {
		return "Customer [mapA=" + mapA + ", list=" + list + "]";
	}

}
