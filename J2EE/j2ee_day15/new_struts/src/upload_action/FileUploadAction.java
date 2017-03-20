package upload_action;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;

public class FileUploadAction extends ActionSupport {
	private File snap;
	private String snapContentType;
	private String snapFileName;
	private String uploadFolder;
	public File getSnap() {
		return snap;
	}
	public void setSnap(File snap) {
		this.snap = snap;
	}
	public String getSnapContentType() {
		return snapContentType;
	}
	public void setSnapContentType(String snapContentType) {
		this.snapContentType = snapContentType;
	}
	public String getSnapFileName() {
		return snapFileName;
	}
	public void setSnapFileName(String snapFileName) {
		this.snapFileName = snapFileName;
	}
	
	public void setUploadFolder(String uploadFolder) {
		this.uploadFolder = uploadFolder;
	}
	@Override
	public String execute() throws Exception {
		if (snap != null)
		{
			System.out.println("upload folder "+uploadFolder);
			File f1=new File(uploadFolder,snapFileName);
			snap.renameTo(f1);
			return SUCCESS;
		}
		return INPUT;
	}
	
	

}
