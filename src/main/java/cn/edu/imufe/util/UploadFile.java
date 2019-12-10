package cn.edu.imufe.util;

import java.io.Serializable;

public class UploadFile implements Serializable {

	private static final long serialVersionUID = 1791647070095662154L;

	private String OriginalFileName;// 原始图片的名称IMG_0027.JPG
	private String newFileName;// 新做成的名称4e70e10ba5b2453c8b48b36cfcbe9765.JPG
	private String newFilePath;// 实际存放在服务器的路径E:\tomcat7028\webapps\newsimg\2018\31\3\4e70e10ba5b2453c8b48b36cfcbe9765.JPG
	private String newFileUrl;// http访问的路�??,也是�??要存入数据库的路�??
								// http://localhost:8080/newsimg\2018\31\3\4e70e10ba5b2453c8b48b36cfcbe9765.JPG
	private String fileType;// 文件类型image/jpeg
	private long fileSize;// 文件大小容量

	public UploadFile() {
		super();
	}

	public UploadFile(String originalFileName, String newFileName, String newFilePath, String newFileUrl,
			String fileType, long fileSize) {
		super();
		OriginalFileName = originalFileName;
		this.newFileName = newFileName;
		this.newFilePath = newFilePath;
		this.newFileUrl = newFileUrl;
		this.fileType = fileType;
		this.fileSize = fileSize;
	}

	public long getFileSize() {
		return fileSize;
	}

	public String getFileType() {
		return fileType;
	}

	public String getNewFileName() {
		return newFileName;
	}

	public String getNewFilePath() {
		return newFilePath;
	}

	public String getNewFileUrl() {
		return newFileUrl;
	}

	public String getOriginalFileName() {
		return OriginalFileName;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}

	public void setNewFilePath(String newFilePath) {
		this.newFilePath = newFilePath;
	}

	public void setNewFileUrl(String newFileUrl) {
		this.newFileUrl = newFileUrl;
	}

	public void setOriginalFileName(String originalFileName) {
		OriginalFileName = originalFileName;
	}

}
