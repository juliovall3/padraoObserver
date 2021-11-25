import java.util.Observer;
import java.util.Observable;

public class Carro implements Observer {

        private String carro;
        private String notificacao;

        public Carro (String carro){
            this.carro = carro;
        }

        public String getNotificacao(){
            return this.notificacao;
        }

        public void abastecimento(TanqueDeCombustivel tanqueDeCombustivel){
            tanqueDeCombustivel.addObserver(this);
        }

        public void update(Observable tanque) {
        this.notificacao = this.carro + tanque.toString();
    }
}
