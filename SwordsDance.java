import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

final class SwordsDance extends StatusMove {
    public SwordsDance() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon itself) {
        itself.setMod(Stat.ATTACK, +2);
    }
    @Override
    protected String describe() {
        return "использует Swords Dance";
    }
}
