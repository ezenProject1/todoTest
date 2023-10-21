package com.mytodo.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mytodo.www.service.TodoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/todo/*")
@RequiredArgsConstructor
public class TodoController {
	
	private final TodoService tsv;
	
	
	
}
