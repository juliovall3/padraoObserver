import java.util.Observable;

public class TanqueDeCombustivel extends Observable {

    private float capacidade;
    private float reserva;

    public TanqueDeCombustivel(float capacidade, float reserva){
        this.capacidade = capacidade;
        this.reserva = reserva;
    }

    public void contabilizarAbastecimento() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "o carro está abastecendo" + reserva;
    }


}
