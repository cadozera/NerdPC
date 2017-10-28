
package nerdpc;

public class Computador {
    PlacaMae placamae;
    Vga vga;
    Ram ram;
    Harddisk harddisk;
    Processador processador;

    public PlacaMae getPlacamae() {
        return placamae;
    }

    public void setPlacamae(PlacaMae placamae) {
        this.placamae = placamae;
    }

    public Vga getVga() {
        return vga;
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Harddisk getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(Harddisk harddisk) {
        this.harddisk = harddisk;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Fonte getFonte() {
        return fonte;
    }

    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }
    Fonte fonte;
}
