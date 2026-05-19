public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        carro1.acelerar(50);
        System.out.println(carro1.retornarDados());

        carro1.frear(20);
        System.out.println(carro1.retornarDados());
    }
}
