
package nerdpc;

public class PCdeRICOFactory extends ComputadorFactory {
    public Fonte colocarFonte() {
        return new Fonte1200w();
    }

    
    public Harddisk colocarHardDisk() {
        return new Harddiskssd();
    }

    
    public PlacaMae colocarPlacaMae() {
        return new PlacaMaeAsus();
    }

    
    public Processador colocarProcessador() {
        return new ProcessadorI9();
    }

    
    public Ram colocarRam() {
        return new RamOitoGigas();
    }

    
    public Vga colocarVga() {
        return new VgaNvidia();
    }
}
