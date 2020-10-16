package com.test.sp.vo;

import org.springframework.web.multipart.MultipartFile;

public class TestVO {
	private String title;
	private String name;
	private MultipartFile file;
	@Override
	public String toString() {
		return "TestVO [title=" + title + ", name=" + name + ", file=" + file + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}

}
