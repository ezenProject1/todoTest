package com.mytodo.www.service;

import org.springframework.stereotype.Service;

import com.mytodo.www.repository.TodoDAO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{
	
	private final TodoDAO tdao;
	
}
