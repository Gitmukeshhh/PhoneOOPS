public class Lnadline implements Phone{

    private  String  myphoneNo;
    private  boolean  isRinging;
    private boolean isPoweOn;

    public Lnadline(String myphoneNo) {
        this.myphoneNo = myphoneNo;
        isRinging=false;
        isPoweOn=true;
    }

    public String getMyphoneNo() {
        return myphoneNo;
    }

    public void setMyphoneNo(String myphoneNo) {
        this.myphoneNo = myphoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPoweOn() {
        return isPoweOn;
    }

    public void setPoweOn(boolean poweOn) {
        isPoweOn = poweOn;
    }

    @Override
    public void powerOn() {
         this.isPoweOn=true;
    }

    @Override
    public void callNo(String phoneNo) {

        if(isPoweOn==true){
            System.out.println("you are dilling A number"+phoneNo);

        }else{
            System.out.println("your mobile Not On");
        }

    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPoweOn==true && myphoneNo.equals(phoneNo)){
            this.isRinging=true;
            System.out.println("hey"+myphoneNo+"you are recive call");
        }else{
            System.out.println("call Not recive");
        }
    }

    @Override
    public boolean answer() {
        if(isRinging==true){
            System.out.println("call anewere");
            this.isRinging=false;
             return true;
        }
          return false;
    }

    @Override
    public boolean isRinging() {
         return isRinging;
    }
}
