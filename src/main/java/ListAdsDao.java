import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {
    private List<Ad> ads;

    @Override
    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
                1,
                1,
                "Nintendo Switch for sale",
                "Used a lot in really bad condition, asking for retail price"
        ));
        ads.add(new Ad(
                2,
                1,
                "Nintendo 64",
                "I just want to get rid of this"
        ));
        ads.add(new Ad(
                3,
                2,
                "Mouse",
                "Im not sure which mouse this is"
        ));
        ads.add(new Ad(
                4,
                2,
                "Monitor",
                "32in 144hz va panel"
        ));
        return ads;
    }
}