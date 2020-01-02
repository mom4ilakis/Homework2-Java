package bg.sofia.uni.fmi.mjt.authorship.detection;

import java.io.IOException;
import java.io.InputStream;

public class AuthorshipDetectorImpl implements AuthorshipDetector {

    private InputStream signaturesDataset;
    private Double[] weights;

    public AuthorshipDetectorImpl( InputStream signaturesDataset, Double[] weights) {
        this.weights = weights;
        this.signaturesDataset = signaturesDataset;
    }

    @Override
    public LinguisticSignature calculateSignature(InputStream mysteryText) {
        if(mysteryText == null) {
            throw new IllegalArgumentException("Mystery text is null in calculateSignature");
        }
        return null;
    }

    @Override
    public double calculateSimilarity(LinguisticSignature firstSignature, LinguisticSignature secondSignature) {
        if(firstSignature == null || secondSignature == null){
            throw new IllegalArgumentException("Signature is null");
        }
        return 0;
    }

    @Override
    public String findAuthor(InputStream mysteryText) {
        if(mysteryText == null) {
            throw new IllegalArgumentException("Mystery text is null in findAuthor");
        }
        return null;
    }
}
