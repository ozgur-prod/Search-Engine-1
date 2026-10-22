package pgdp.searchengine.pagerepository;

import pgdp.searchengine.util.Date;

public class Document {

    private int documentId;
    private String title;
    private String description;
    private String content;
    private Date releaseDate;
    private Author author;
    private Date lastUpdateDate;
    static int numberOfCreatedDocuments;



    public Document(String title, String description, String content, Date releaseDate, Author author) {
        this.title = title;
        this.description = description;
        this.content = content;
        this.releaseDate = releaseDate;
        this.author = author;

        documentId = numberOfCreatedDocuments();

        numberOfCreatedDocuments++;
    }


    public int getDocumentId() {
        return documentId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Author getAuthor() {
        return author;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }




    public boolean equals(Document document2){
        if (this.documentId == document2.getDocumentId()){
            return true;
        }
        else {
            return false;
        }

    }

    public String toString(){
        return title + ", " + releaseDate + ", " + author.toString();
    }


    public String toPrintText(){
        return title + "\n" + author.toString() + "\n" + description + "\n" + lastUpdateDate;
    }


    public static int numberOfCreatedDocuments(){
        return numberOfCreatedDocuments;
    }




}
