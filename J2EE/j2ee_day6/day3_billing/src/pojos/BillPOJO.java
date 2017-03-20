package pojos;

import java.io.Serializable;

public class BillPOJO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mobNo,custName;
	private int callDuration;
	private double billAmt;
	public BillPOJO(String mobNo, String custName, int callDuration,
			double billAmt) {
		super();
		this.mobNo = mobNo;
		this.custName = custName;
		this.callDuration = callDuration;
		this.billAmt = billAmt;
	}
	public BillPOJO() {
		// TODO Auto-generated constructor stub
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCallDuration() {
		return callDuration;
	}
	public void setCallDuration(int callDuration) {
		this.callDuration = callDuration;
	}
	public double getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}
	@Override
	public String toString() {
		return "Bill Details  [mobNo=" + mobNo + ", custName=" + custName
				+ ", callDuration=" + callDuration + ", billAmt=" + billAmt
				+ "]";
	}
	
	

}
