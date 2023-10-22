package com.mytodo.www.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TodoVO {

	private int tno;
	private String writer;
	private String content;
	private String regdate;
	private String moddate;
	private String isDel;
	private int hasfile;
	
}
