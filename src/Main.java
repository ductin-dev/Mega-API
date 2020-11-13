import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            MegaHandler mh = new MegaHandler(Infomation.username, Infomation.password);
            mh.login();
            try {
                mh.download("https://mega.nz/file/xoBBDIqL#qbmYMiePg9x-AbYnzcI8BN3viB-YhwLljmcQvpMcAVc", "C:\\Users\\doand\\Desktop");
                //download displaying progress bar and speed information
                mh.download_verbose("https://mega.nz/file/xoBBDIqL#qbmYMiePg9x-AbYnzcI8BN3viB-YhwLljmcQvpMcAVc", "C:\\Users\\doand\\Desktop");
                //download in the active directory
                mh.download("https://mega.nz/file/xoBBDIqL#qbmYMiePg9x-AbYnzcI8BN3viB-YhwLljmcQvpMcAVc");

            } catch (InvalidAlgorithmParameterException e) {
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
