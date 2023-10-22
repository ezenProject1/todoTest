package com.mytodo.www.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mytodo.www.domain.TodoVO;
import com.mytodo.www.domain.TodoVOMod;
import com.mytodo.www.repository.TodoDAO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{
	
	private final TodoDAO tdao;

	@Override
	public List<TodoVO> getList() {
		return tdao.getList();
	}

	@Override
	public int insert(TodoVO tvo) {
		return tdao.insert(tvo);
	}

	@Override
	public int delete(int tno) {
		return tdao.delete(tno);
	}

	@Override
	public List<TodoVO> getAllList() {
		return tdao.AllList();
	}

	@Override
	public int restore(int tno) {
		return tdao.restore(tno);
	}

	@Override
	public int modify(TodoVOMod tvoMod) {
		return tdao.modify(tvoMod);
	}
	
}
