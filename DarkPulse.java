import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

final class DarkPulse extends SpecialMove {
    public DarkPulse() {
        super(Type.DARK, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() <= 0.2) {
            Effect.flinch(target);
        }
    }
    @Override
    protected String describe() {
        return "использует Dark Pulse";
    }
}