
package nerdpc;

public class PCdePobreFactory extends ComputadorFactory {

    
    public Fonte colocarFonte() {
        return new Fonte600w();
    }

    
    public Harddisk colocarHardDisk() {
        return new Harddiskhdd();
    }

    
    public PlacaMae colocarPlacaMae() {
        return new PlacaMaeAsrock();
    }

    
    public Processador colocarProcessador() {
        return new ProcessadorI5();
    }

    
    public Ram colocarRam() {
        return new RamQuatrogigas();
    }

    
    public Vga colocarVga() {
        return new VgaRadeon();
    }
    
}
