package game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import game.common.file.FileManager;
import game.model.domain.Game;
import game.model.service.GameService;

@Controller
public class AdminController {
	@Autowired
	private GameService gameService;
	
	@Autowired
	private FileManager fileManager;
	
	@RequestMapping(value="/rest/regist", method=RequestMethod.POST)
	public String registGame(Game game) {
		gameService.insert(game);
		return null;
	}
}
