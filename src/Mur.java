public class Mur extends Bloc {
    private boolean porteur;

    public Mur (final int longueur, final int largeur, final int hauteur, final boolean porteur){
        super(longueur, largeur, hauteur);
        this.porteur = porteur;
    }

   public boolean isTraversable(){
        return !porteur;
   }

    @Override
    public void afficageDescription() {
        System.out.println("je suis un mur!");

    }
}
