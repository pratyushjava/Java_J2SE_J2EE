package Pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SQSTORE")
public class SeqStorePojos {
	
	@Id
	@Column(name="SEQNO")
	private int seqno;
	
	public SeqStorePojos() {
		System.out.println("in seqstore def pojos");
	}

	public int getSeqno() {
		return seqno;
	}

	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}

	@Override
	public String toString() {
		return "SeqStorePojos [seqno=" + seqno + "]";
	}
	
	

}
