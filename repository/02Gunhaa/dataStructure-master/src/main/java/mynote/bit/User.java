package mynote.bit;

public class User {

    public static final byte 출혈 = 1 << 0;
    public static final byte 중독 = 1 << 1;
    public static final byte 마비 = 1 << 2;
    public static final byte 저주 = 1 << 3;
    public static final byte 동결 = 1 << 4;
    public static final byte 석화 = 1 << 5;
    public static final byte 수면 = 1 << 6;

    private byte status;
    private String name;
    private int hp;

    public User(String name) {
        this.status = 0;
        this.name = name;
        this.hp = 100;
    }

    public void addStatus(byte flag){
//        status |= flag;
        status = (byte) (status | flag);
    }

    public void removeStatus(byte flag){
//        status &= (byte) ~flag;
        status = (byte) (status & ~flag);
    }

    public String printStatus(){
        return String.format("%7s", Integer.toBinaryString(status)).replace(' ', '0');
//        return String.format("%7s", Integer.toBinaryString(status));
        //        return Integer.toBinaryString(status);
    }

}
