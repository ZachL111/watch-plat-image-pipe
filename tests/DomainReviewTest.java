package io.portfolio;

public final class DomainReviewTest {
    public static void main(String[] args) {
        var item = new DomainReview.Item(49, 23, 28, 56);
        if (DomainReview.score(item) != 93) throw new AssertionError("domain score mismatch");
        if (!DomainReview.lane(item).equals("hold")) throw new AssertionError("domain lane mismatch");
    }
}
