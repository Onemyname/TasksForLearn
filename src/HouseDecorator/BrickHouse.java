public class BrickHouse  extends House{
    public BrickHouse(){
        info="Кирпичный дом";
    }

    @Override
    public int getPrice(){
        return 20_000;
    }
}
