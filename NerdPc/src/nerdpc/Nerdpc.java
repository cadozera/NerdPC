
package nerdpc;

public class Nerdpc {
    private static Computador montarPC(String tipo){
        ComputadorFactory pc = null;
        switch(tipo){
            case "PCdeRICO":
                pc = new PCdeRICOFactory();
                break;
            case "PCdePROBRE":
                pc = new PCdePobreFactory();
                break;
        }
        
        Computador computador = new Computador();
        computador.setFonte(pc.colocarFonte());
        computador.setHarddisk(pc.colocarHardDisk());
        computador.setPlacamae(pc.colocarPlacaMae());
        computador.setProcessador(pc.colocarProcessador());
        computador.setRam(pc.colocarRam());
        computador.setVga(pc.colocarVga());
        return computador;
    }
    
    
    public static void main(String[] args) {
        Computador pc1 = montarPC("PCdeRICO");
        System.out.println("PC de Rico\n");
        System.out.println(pc1.getFonte());
        System.out.println(pc1.getHarddisk());
        System.out.println(pc1.getPlacamae());
        System.out.println(pc1.getProcessador());
        System.out.println(pc1.getRam());
        System.out.println(pc1.getVga());
        Computador pc2 = montarPC("PCdePobre");
        
        System.out.println("\n=============================================================");
        System.out.println("\nPC de Pobre");
        System.out.println(pc2.getFonte());
        System.out.println(pc2.getHarddisk());
        System.out.println(pc2.getPlacamae());
        System.out.println(pc2.getProcessador());
        System.out.println(pc2.getRam());
        System.out.println(pc2.getVga());
    }
    
}
