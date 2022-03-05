package domain;

public enum Item {
	MAGNIFICENT_CRIMSON_QUEEN_SOUL("위대한 블러디퀸의 소울"),
	MAGNIFICENT_CYGNUS_SOUL("위대한 시그너스의 소울"),
	MAGNIFICENT_MAGNUS_SOUL("위대한 매그너스의 소울"),
	MAGNIFICENT_VELLUM_SOUL("위대한 벨룸의 소울"),
	PRIMAL_ESSENCE("태초의 정수"),
	TENACIOUS_EXTREME_BELT("강인함의 익스트림 벨트"),
	TENACIOUS_EXTREME_BELT_RECIPE("강인함의 익스트림 벨트 제작 레시피"),
	;

	private final String name;

	Item(final String name) {
		this.name = name;
	}
}
