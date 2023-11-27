public class Rettangolo implements Forma {
    public int dimensione1;
    public int dimensione2;

    Rettangolo(int dimensione1, int dimensione2){
        this.dimensione1 = dimensione1;
        this.dimensione2 = dimensione2;
    }
    @Override
    public void calcolaArea() {
        System.out.println(dimensione1 * dimensione2);
    }

}
