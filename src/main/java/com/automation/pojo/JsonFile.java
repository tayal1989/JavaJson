package com.automation.pojo;

import java.util.List;

public class JsonFile {

	private List<Result> results = null;
	private Info info;

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}
}
