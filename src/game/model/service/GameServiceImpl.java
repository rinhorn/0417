package game.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import game.model.domain.Game;
import game.model.repository.GameDAO;

@Service
public class GameServiceImpl implements GameService {
	@Autowired
	private GameDAO gameDAO;

	public int insert(Game game) {
		return gameDAO.insert(game);
	}

	public List selectAll() {
		return null;
	}

	public Game select(int game_id) {
		return null;
	}

	public void update(Game game) {

	}

	public void delete(int game_id) {

	}
}
