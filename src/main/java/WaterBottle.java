public class WaterBottle {
    private int volume;
    public WaterBottle(){
        this.volume = 100;
    }

    public int drink(){
        if (volume >= 10) {
            return volume -= 10;
        } else {
            return volume = 0;
        }
    }

    public int empty(){
        return volume = 0;
    }

    public int fill(){
        return volume = 100;
    }

    public int getVolume() {
        return volume;
    }
}
