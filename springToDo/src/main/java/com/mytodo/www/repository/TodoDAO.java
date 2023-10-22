package com.mytodo.www.repository;

import java.util.List;

import com.mytodo.www.domain.TodoVO;
import com.mytodo.www.domain.TodoVOMod;

public interface TodoDAO {

	List<TodoVO> getList();

	int insert(TodoVO tvo);

	int delete(int tno);

	List<TodoVO> AllList();

	int restore(int tno);

	int modify(TodoVOMod tvoMod);
	
}
