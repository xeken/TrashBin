package kr.hs.dgsw.memop.Domain;

public class Memo {

    private int memoId;
    private String memoTitle;
    private String memoContent;
    private Long Date;

    public Memo(){}

    public Memo(String memoTitle, String memoContent){

        this.memoTitle = memoTitle;
        this.memoContent = memoContent;
        Date = System.currentTimeMillis();
    }

    public Long getDate() {
        return Date;
    }

    public void setDate(Long date) {
        Date = date;
    }

    public int getMemoId() {
        return memoId;
    }
    public void setMemoId(int memoId) {
        this.memoId = memoId;
    }
    public String getMemoTitle() {
        return memoTitle;
    }
    public void setMemoTitle(String memoTitle) {
        this.memoTitle = memoTitle;
    }
    public String getMemoContent() {
        return memoContent;
    }
    public void setMemoContent(String memoContent) {
        this.memoContent = memoContent;
    }
}
