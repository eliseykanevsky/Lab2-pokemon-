final class Sandslash extends Sandshrew {
    public Sandslash(String name, int level) {
        super(name, level);
        setStats(75, 100, 110, 45, 55, 65);
        addMove(new StoneEdge());
    }
}