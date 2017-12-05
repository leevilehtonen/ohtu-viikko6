package statistics.matcher;

import statistics.Player;

public class QueryBuilder {

    Matcher matcher;

    public QueryBuilder() {
        matcher = new And();
    }


    public QueryBuilder oneOf(Matcher... matchers) {
        matcher = new Or(matchers);
        return this;
    }
    public QueryBuilder allOf(Matcher... matchers) {
        matcher = new And(matchers);
        return this;
    }
    public QueryBuilder not() {
        matcher = new Not(matcher);
        return this;
    }
    public QueryBuilder hasAtLeast(int value, String category) {
        matcher = new And(matcher, new HasAtLeast(value, category));
        return this;
    }
    public QueryBuilder hasFewerThan(int value, String category) {
        matcher = new And(matcher, new HasFewerThan(value, category));
        return this;
    }
    public QueryBuilder playsIn(String team) {
        matcher = new And(matcher, new PlaysIn(team));
        return this;
    }
    public Matcher build() {
        Matcher m = matcher;
        matcher = new And();
        return m;
    }


}