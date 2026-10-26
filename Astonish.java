import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

final class Astonish extends PhysicalMove {
    public Astonish() {
        super(Type.GHOST, 30, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() <= 0.3) {
            Effect.flinch(target);
        }
    }
    @Override
    protected String describe() {
        return "использует Astonish";
    }
}