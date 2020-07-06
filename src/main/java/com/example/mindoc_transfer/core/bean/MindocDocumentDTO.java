package com.example.mindoc_transfer.core.bean;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author moubin.mo
 * @date: 2020/7/5 21:48
 */

public class MindocDocumentDTO {

	private Integer   documentId;
	private String    documentName;
	private String    identify;
	private Integer   bookId;
	private Integer   parentId;
	private Integer   orderSort;
	private String    markdown;
	private String    release;
	private String    content;
	private Timestamp createTime;
	private Integer   memberId;
	private Timestamp modifyTime;
	private Integer   modifyAt;
	private Long      version;
	private List<MindocDocumentDTO> dtos;

	public Integer getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getIdentify() {
		return identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getOrderSort() {
		return orderSort;
	}

	public void setOrderSort(Integer orderSort) {
		this.orderSort = orderSort;
	}

	public String getMarkdown() {
		return markdown;
	}

	public void setMarkdown(String markdown) {
		this.markdown = markdown;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Integer getModifyAt() {
		return modifyAt;
	}

	public void setModifyAt(Integer modifyAt) {
		this.modifyAt = modifyAt;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public List<MindocDocumentDTO> getDtos() {
		return dtos;
	}

	public void setDtos(List<MindocDocumentDTO> dtos) {
		this.dtos = dtos;
	}
}
