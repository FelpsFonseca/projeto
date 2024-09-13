import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente("Nome do Cliente", 12345678900L);

        int matricula = 1898;
        Computador[] promocoes = new Computador[3];

        // Promoção 1
        promocoes[0] = new Computador("Positivo", matricula);
        promocoes[0].addHardware(new HardwareBasico("Pentium Core i3", 2200));
        promocoes[0].addHardware(new HardwareBasico("Memória RAM", 8));
        promocoes[0].addHardware(new HardwareBasico("HD", 500));
        promocoes[0].setSistemaOperacional(new SistemaOperacional("Linux Ubuntu", 32));
        promocoes[0].addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        // Promoção 2
        promocoes[1] = new Computador("Acer", matricula + 1234);
        promocoes[1].addHardware(new HardwareBasico("Pentium Core i5", 3370));
        promocoes[1].addHardware(new HardwareBasico("Memória RAM", 16));
        promocoes[1].addHardware(new HardwareBasico("HD", 1000));
        promocoes[1].setSistemaOperacional(new SistemaOperacional("Windows 8", 64));
        promocoes[1].addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        // Promoção 3
        promocoes[2] = new Computador("Vaio", matricula + 5678);
        promocoes[2].addHardware(new HardwareBasico("Pentium Core i7", 4500));
        promocoes[2].addHardware(new HardwareBasico("Memória RAM", 32));
        promocoes[2].addHardware(new HardwareBasico("HD", 2000));
        promocoes[2].setSistemaOperacional(new SistemaOperacional("Windows 10", 64));
        promocoes[2].addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        while (true) {
            System.out.println("Digite o código da promoção (1, 2, 3) ou 0 para sair:");
            int codigo = scanner.nextInt();
            if (codigo == 0) {
                break;
            } else if (codigo >= 1 && codigo <= 3) {
                Computador pc = promocoes[codigo - 1];
                cliente.adicionaCompra(pc.getPreco());
                System.out.println("Você comprou:");
                pc.mostraPCConfigs();
            } else {
                System.out.println("Código inválido.");
            }
        }

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());
    }
}