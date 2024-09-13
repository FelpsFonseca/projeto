import java.util.ArrayList;
import java.util.List;

public class Computador {
    private String marca;
    private float preco;
    private List<HardwareBasico> hardwares;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
        this.hardwares = new ArrayList<>();
    }

    public void addHardware(HardwareBasico hardware) {
        this.hardwares.add(hardware);
    }

    public void setSistemaOperacional(SistemaOperacional sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void addMemoriaUSB(MemoriaUSB memoriaUSB) {
        this.memoriaUSB = memoriaUSB;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        for (HardwareBasico hardware : hardwares) {
            System.out.println(hardware.getNome() + ": " + hardware.getCapacidade());
        }
        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome() + " (" + sistemaOperacional.getTipo() + " bits)");
        if (memoriaUSB != null) {
            System.out.println("Memória USB: " + memoriaUSB.getNome() + " - " + memoriaUSB.getCapacidade() + "Gb");
        }
    }

    public float getPreco() {
        return preco;
    }
}
