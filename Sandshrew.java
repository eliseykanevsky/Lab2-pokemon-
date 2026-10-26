import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

class Sandshrew extends Pokemon {
    public Sandshrew(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        setStats(50, 75, 85, 20, 30, 40);
        setMove(new Swagger(), new FurySwipes(), new SwordsDance());
    }
}