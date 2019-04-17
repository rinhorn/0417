package game.model.repository;

import java.util.List;

import game.model.domain.Event;

public class MybatisEventDAO implements EventDAO{

	public int insert(Event event) {
		return 0;
	}

	public List selectAll() {
		return null;
	}

	public Event select(int event_id) {
		return null;
	}

	public int update(Event event) {
		return 0;
	}

	public int delete(int event_id) {
		return 0;
	}
}
