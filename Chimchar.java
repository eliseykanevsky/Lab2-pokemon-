import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

class Chimchar extends Pokemon {
    public Chimchar(String name, int level) {
        super(name, level);
        setType(Type.FIRE);
        setStats(44, 58, 44, 58, 44, 61);
        setMove(new Flamethrower(), new ShadowClaw());
    }
}