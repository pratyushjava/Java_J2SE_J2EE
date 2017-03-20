package pojos;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.*;

@Entity
@Table(name="questions")
public class Questions implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qid;
	@Column(name="q_text",length=40)
	private String qText;

	private String[] options;
	private String  ans;
	public Questions() {
		System.out.println("in que def constr");
	}
	public Questions(String qText, String[] options, String ans) {
		super();
		this.qText = qText;
		this.options = options;
		this.ans = ans;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getqText() {
		return qText;
	}
	public void setqText(String qText) {
		this.qText = qText;
	}
	public String[] getOptions() {
		System.out.println("in get options "+Arrays.toString(options));
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qText=" + qText + ", options="
				+ Arrays.toString(options) + ", ans=" + ans + "]";
	}
	
	
	
	
	

}
