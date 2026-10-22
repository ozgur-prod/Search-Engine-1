package pgdp.searchengine.pagerepository;

import pgdp.searchengine.util.Date;

public class Review {

    private int postId;
    private String title;
    private String content;
    private int rating;
    private Date postDate;
    private Author reviewer;
    private Document reviewedDocument;
    static int numberOfCreatedReviews;


    public Review(String title, String content, Date postDate,
                  Author reviewer, Document reviewedDocument, int rating){
        this.title = title;
        this.content = content;
        this.postDate = postDate;
        this.reviewer = reviewer;
        this.reviewedDocument = reviewedDocument;
        this.rating = rating;

        postId = numberOfCreatedReviews();

        numberOfCreatedReviews++;
    }

    public int getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getRating() {
        return rating;
    }

    public Date getPostDate() {
        return postDate;
    }

    public Author getReviewer() {
        return reviewer;
    }

    public Document getReviewedDocument() {
        return reviewedDocument;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public boolean equals(Review review2){
        if (this.postId == review2.getPostId()){
            return true;
        }
        else {
            return false;
        }

    }

    public String toString(){
        return title + ", " + rating + ", " + reviewedDocument.toString();
    }

    public String toPrintText(){
        return reviewedDocument.toString() + "\n" + rating + "\n" + title + "\n" + content + "\n" + postDate + "\n" + reviewer.toString();
    }

    public static int numberOfCreatedReviews(){
        return numberOfCreatedReviews;
    }







}
