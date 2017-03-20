package upload_actions;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private File img;// Uploaded file
	private String imgContentType;// uploaded file's content type
	private String imgFileName;// name of uploaded file
	private String folder_name;//not -to hard-code any upload folder names

	public String getImgContentType() {
		return imgContentType;
	}

	public void setImgContentType(String imgContentType) {
		this.imgContentType = imgContentType;
	}

	public String getImgFileName() {
		return imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public void setImg(File img) {
		this.img = img;
	}
	
	public void setFolder_name(String folder_name) {
		this.folder_name = folder_name;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if (img != null) {
			img.renameTo(new File(folder_name, imgFileName));
			return SUCCESS;
		}
		return ERROR;

	}

}
