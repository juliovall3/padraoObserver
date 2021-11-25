public class CarroTest {

    @Test
    void devenotificarCarro() {
        TanqueDeCombustivel tanqueDeCombustivel = new TanqueDeCombustivel(48, 3);
        Carro carro = new Carro("Palio");
        carro.abastecimento(tanqueDeCombustivel);
        tanqueDeCombustivel.contabilizarAbastecimento();
        assertEquals("Palio,o carro está abastecendo,3", carro.getNotificacao());
    }



}
