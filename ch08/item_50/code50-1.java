// 코드 50-1 기간을 표현하는 클래스 - 불변식을 지키지 못했다.

public final class Period {
    private final Date start;
    private final Date end;

    /**
     * @param start 시작 시각
     * @param end 종료 시각, 시작 시간보다 뒤여야 한다.
     * @throws IllegalArgumentException 시작 시각이 종료 시각보다 높을 때 발생한다.
     * @throws NullPointerException start나 end가 null이면 발생한다.
     */
    public Period(Date start, Date end) {
	if (start.compareTo(end) > 0)
	    throw new IllegalArgumentException(
		start + " after " + end);
	this.start = start;
	this.end = end;
    }

    public Date start() {
	return start;
    }

    public Date end() {
	return end;
    }

    ... // 나머지 코드 생략
}
