package game.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import game.common.file.FileManager;
import game.model.domain.Category;
import game.model.domain.Game;
import game.model.service.CategoryService;
import game.model.service.GameService;

@Controller
public class GameController {
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private GameService gameService;
	@Autowired
	private FileManager fileManager;
	
	@RequestMapping(value="/admin/game/category", method=RequestMethod.GET)
	@ResponseBody
	public String getCategory() {
		List<Category> ctList=categoryService.selectAll();
		
		JSONObject json=new JSONObject();
		for(int i=0;i<ctList.size();i++) {
			Category ct=ctList.get(i);
			json.put("ctName", ct.getCategory_name());
		}
		return json.toString();
	}
	
	@RequestMapping(value="/admin/game/regist", method=RequestMethod.POST)
	public String registGame(Game game) {
		gameService.insert(game);
		return null;
	}
}