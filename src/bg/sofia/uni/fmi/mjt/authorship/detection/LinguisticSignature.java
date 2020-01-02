package bg.sofia.uni.fmi.mjt.authorship.detection;

import java.util.HashMap;
import java.util.Map;

public class LinguisticSignature {
    public Map<FeatureType, Double> getFeatures() {
        return features;
    }

    public void setFeatures(Map<FeatureType, Double> features) {
        if(features != null){
            this.features = features;
        }
        throw new IllegalArgumentException("Features are null in LinguisticSignature getter");
    }

    public LinguisticSignature(Map<FeatureType, Double> features) {
        setFeatures(features);
    }

    private Map<FeatureType, Double> features = new HashMap<>();
}
