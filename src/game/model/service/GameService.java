package game.model.service;

import java.util.List;

import game.model.domain.Game;

public interface GameService {
	public int insert(Game game);
	public List selectAll();
	public Game select(int game_id);
	public void update(Game game);
	public void delete(int game_id);
}
