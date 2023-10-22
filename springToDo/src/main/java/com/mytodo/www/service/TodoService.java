package com.mytodo.www.service;

import java.util.List;

import com.mytodo.www.domain.TodoVO;
import com.mytodo.www.domain.TodoVOMod;

public interface TodoService {

	List<TodoVO> getList();

	int insert(TodoVO tvo);

	int delete(int tno);

	List<TodoVO> getAllList();

	int restore(int tno);

	int modify(TodoVOMod tvoMod);

}
