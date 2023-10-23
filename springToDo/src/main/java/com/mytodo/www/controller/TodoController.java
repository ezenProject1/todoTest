package com.mytodo.www.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mytodo.www.domain.TodoVO;
import com.mytodo.www.domain.TodoVOMod;
import com.mytodo.www.service.TodoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/todo/*")
@RequiredArgsConstructor
public class TodoController {
	
	private final TodoService tsv;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<TodoVO> list = tsv.getList();
		model.addAttribute("list",list);
		return "/todo/list";
	}
	
	@PostMapping("/add")
	public String add(@ModelAttribute TodoVO tvo) {
		int isOk = tsv.insert(tvo);
		return "redirect:/todo/list";
	}
	
	@GetMapping("/remove")
	public String remove(@RequestParam("tno") int tno) {
		int isOk = tsv.delete(tno);
		return "redirect:/todo/list";
	}
	
	@PostMapping("modify")
	public String modify(@ModelAttribute("tvo") TodoVOMod tvoMod) {
		log.info("tvoMod = {}", tvoMod);
		int isOk = tsv.modify(tvoMod);
		return "redirect:/todo/list";
	}
	
	
	
	/***** 휴지통 컨트롤러 *****/
	
	@GetMapping("/recycle")
	public String recycleForm(Model model) {
		List<TodoVO> list = tsv.getAllList();
		model.addAttribute("list", list);
		return "/todo/recycle";
	}
	
	@GetMapping("/restore")
	public String restore(@RequestParam("tno")int tno) {
		int isOk = tsv.restore(tno);
		
		return "redirect:/todo/recycle";
	}
	
	public void test() {
		
	}
	public void test2() {
		
	}
	
	
}
